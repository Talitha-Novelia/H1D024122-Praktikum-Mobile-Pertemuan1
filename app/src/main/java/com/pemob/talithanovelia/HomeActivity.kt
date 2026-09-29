package com.pemob.talithanovelia

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.pemob.talithanovelia.ui.screen.DaftarProdukScreen
import com.pemob.talithanovelia.ui.screen.DetailProductScreen
import com.pemob.talithanovelia.ui.screen.HubungiKamiScreen
import com.pemob.talithanovelia.ui.theme.JualanTheme

class HomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JualanTheme {
                val navController = rememberNavController()

                NavHost(
                    navController = navController,
                    startDestination = "daftar_produk"
                ) {
                    // Rute 1: halaman daftar produk
                    composable("daftar_produk") {
                        DaftarProdukScreen(navController = navController)
                    }

                    // Rute 2: halaman detail produk (menerima productId)
                    composable(
                        route = "detail/{productId}",
                        arguments = listOf(
                            navArgument("productId") {
                                type = NavType.IntType
                            }
                        )
                    ) { backStackEntry ->
                        val productId = backStackEntry.arguments?.getInt("productId") ?: 0
                        DetailProductScreen(
                            productId = productId,
                            navController = navController
                        )
                    }

                    // Rute 3: halaman hubungi kami
                    composable("hubungi_kami") {
                        HubungiKamiScreen(navController = navController)
                    }
                }
            }
        }
    }
}