package com.pemob.talithanovelia.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pemob.talithanovelia.data.model.Category
import com.pemob.talithanovelia.data.model.Product
import com.pemob.talithanovelia.network.ApiClient
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

sealed interface ProductUiState {
    object Loading : ProductUiState
    data class Success(val categories: List<Category>, val products: List<Product>) : ProductUiState
    data class Error(val message: String) : ProductUiState
}

class ProductViewModel : ViewModel() {
    private val _uiState = MutableStateFlow<ProductUiState>(ProductUiState.Loading)
    val uiState: StateFlow<ProductUiState> = _uiState.asStateFlow()

    init {
        fetchData()
    }

    private fun fetchData() {
        viewModelScope.launch {
            _uiState.value = ProductUiState.Loading
            try {
                val categoriesResponse = ApiClient.instance.getCategories()
                val productsResponse = ApiClient.instance.getProducts()

                val mappedProducts = productsResponse.map { product ->
                    val matchedCategory = categoriesResponse.find { it.id == product.category_id }
                    product.copy(category = matchedCategory)
                }

                _uiState.value = ProductUiState.Success(
                    categories = categoriesResponse,
                    products = mappedProducts
                )
            } catch (e: Exception) {
                _uiState.value = ProductUiState.Error(
                    message = e.localizedMessage ?: "Unknown Error"
                )
            }
        }
    }
}
