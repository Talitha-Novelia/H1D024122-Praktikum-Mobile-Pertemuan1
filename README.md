Laporan Praktikum Pemrograman Mobile
Nama  : Talitha Novelia Salsabila
NIM   : H1D024122
Shift : E

## Pertemuan 1

<table>
<tr>
<td><img width="220" alt="image" src="https://github.com/user-attachments/assets/1c5bcc66-200f-499f-9be8-6b8fa570a42f" /></td>
<td><img width="220" alt="image" src="https://github.com/user-attachments/assets/62223f62-45d2-483c-a4c8-c81e5d447d02" /></td>
<td><img width="220" alt="image" src="https://github.com/user-attachments/assets/d6a925f8-7f71-49f1-95a8-c2daad71a89d" /></td>
</tr>
</table>

Kesimpulan Pertemuan 1: Inisialisasi Project Android & Implementasi Function Sederhana
Transisi paradigma dari Imperative UI (berbasis XML) menuju Declarative UI menggunakan Jetpack Compose memberikan efisiensi yang signifikan dalam proses pengembangan aplikasi Android. Praktikan memahami bahwa Kotlin, dengan fitur bawaannya seperti null-safety dan struktur kode yang ringkas, berintegrasi secara mulus dengan Jetpack Compose untuk merender antarmuka aplikasi. Selain itu, pemahaman mendasar mengenai komponen layouting murni seperti Column, Row, dan Box, serta modifikasi atribut melalui Modifier, merupakan fondasi esensial yang harus dikuasai untuk menyusun hierarki visual antarmuka secara terstruktur, responsif, dan dinamis tanpa harus bergantung pada pengelolaan ID komponen (seperti findViewById) yang rentan terhadap boilerplate code.

## Pertemuan 2

<table>
<tr>
<td><img width="220" alt="image" src="https://github.com/user-attachments/assets/b535a872-a337-499f-bf29-08500e0a6ed4" /></td>
<td><img width="220" alt="image" src="https://github.com/user-attachments/assets/d4a37baf-99ad-408d-99ca-d7764218c7b0" /></td>
</tr>
</table>

Kesimpulan Pertemuan 2: Material Design 3, Components & FormsI
mplementasi standar desain visual sangat krusial dalam menciptakan User Experience (UX) yang konsisten dan intuitif. Melalui integrasi Material Design 3 (MD3), pengelolaan komponen desain seperti palet warna (Color.kt), tipografi (Type.kt), dan tema (Theme.kt) dapat dikendalikan secara terpusat, sehingga mempermudah skalabilitas proyek. Praktikan juga berhasil mengimplementasikan kerangka tata letak tingkat atas menggunakan Scaffold yang dipadukan dengan TopAppBar. Di samping itu, pengenalan sistem navigasi dasar menggunakan NavController dan komponen form interaktif (OutlinedTextField, Button, serta umpan balik berupa Snackbar) membuktikan bahwa Jetpack Compose mampu memfasilitasi pembuatan aplikasi interaktif dengan penulisan kode yang jauh lebih modular dan mudah dikelola dibandingkan metode tradisional.

## Pertemuan 3

<table>
<tr>
<td><img width="220" alt="image" src="https://github.com/user-attachments/assets/4fecabc2-548e-48ad-a85f-e740f8c55cce" /></td>
<td><img width="220" alt="image" src="https://github.com/user-attachments/assets/103a5dd6-1214-46ca-8d3f-5347af13c187" /></td>
<td><img width="220" alt="image" src="https://github.com/user-attachments/assets/69240d07-c3dd-401e-8769-0dbacb70372d" /></td>
</tr>
</table>

Kesimpulan Pertemuan 3: Dynamic Lists with Lazy Layouts
Pentingnya optimasi memori dan pengelolaan sumber daya saat menampilkan data dalam jumlah masif. Penggunaan komponen LazyRow dan LazyVerticalGrid terbukti menjadi solusi yang efisien untuk me-render daftar data yang panjang (dynamic lists) secara lazy, di mana sistem hanya memproses elemen yang terlihat pada layar (viewport). Lebih lanjut, praktikan menyadari bahwa penggunaan Data Class dan inisialisasi data buatan (dummy data) menggunakan pola Singleton merupakan pendekatan yang terstruktur untuk merepresentasikan model data secara rapi sebelum aplikasi benar-benar dihubungkan dengan sumber data asli dari backend. Pemisahan fungsionalitas UI ke dalam composable function yang spesifik (ProductItemCard dan CategoryItem) juga sangat mendidik praktikan perihal pentingnya reusabilitas kode (reusable components).

## Pertemuan 4

<table>
<tr>
<td><img width="220" alt="image" src="https://github.com/user-attachments/assets/f630529d-eaa7-46a5-bda5-9bedc517a483" /></td>
<td><img width="220" alt="image" src="https://github.com/user-attachments/assets/9ecb5850-375d-43d6-a197-eafe6cde3edf" /></td>
<td><img width="220" alt="image" src="https://github.com/user-attachments/assets/a375bb15-5b49-47bd-80b7-56b04508bee4" /></td>
</tr>
</table>

Kesimpulan Pertemuan 4: Recomposition dan UI Lifecycle
Manajemen State dan mekanisme Recomposition adalah inti dari paradigma Declarative UI. Dengan menerapkan konsep State Hoisting dan pola Unidirectional Data Flow (UDF), praktikan dapat merancang komponen yang stateless, menjadikannya lebih terisolasi, mudah diuji (testable), dan terbebas dari side-effect. Selain itu, integrasi komponen kompleks (seperti dropdown menu, checkbox, dan intent ke galeri melalui PhotoPicker yang memerlukan deklarasi Permissions), serta penanganan proses asinkron untuk simulasi loading menggunakan LaunchedEffect, memberikan gambaran nyata mengenai siklus hidup aplikasi (UI Lifecycle) dan penanganan interaksi pengguna yang kompleks tanpa memblokir Main Thread.

## Pertemuan 5

<table>
<tr>
<td><img width="220" alt="image" src="https://github.com/user-attachments/assets/fabd1ed9-25f0-473b-8dca-5174e3dfa49b" /></td>
<td><img width="220" alt="image" src="https://github.com/user-attachments/assets/7cf465da-ffbf-4132-80ec-1b76d345bf1c" /></td>
</tr>
</table>

Kesimpulan Pertemuan 5: Networking & Architecture
Arsitektur perangkat lunak yang baik merupakan prasyarat mutlak untuk membangun aplikasi berskala produksi. Penerapan pola arsitektur MVVM (Model-View-ViewModel) secara efektif mampu memisahkan antara logika bisnis (ViewModel), antarmuka (View), dan penyedia data (Model). Penggunaan library jaringan modern seperti Retrofit yang dipadukan dengan Kotlin Coroutines dan konsep StateFlow memungkinkan pengambilan data JSON dari REST API dilakukan secara asinkron (berjalan pada background thread). Representasi kondisi jaringan ke dalam bentuk Sealed Interface (Status Loading, Success, dan Error) tidak hanya mencegah aplikasi mengalami crash saat terjadi kegagalan jaringan, tetapi juga memastikan antarmuka tetap responsif dan informatif bagi pengguna. Integrasi library pemuat gambar Coil juga menjadi penutup yang komprehensif dalam merealisasikan aplikasi mobile yang dinamis, tangguh, dan terkoneksi penuh dengan peladen internet.
