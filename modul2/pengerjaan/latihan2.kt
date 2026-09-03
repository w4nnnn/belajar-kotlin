fun main(){
    val pilihanMenu = 4
    
    val namaHalaman = when (pilihanMenu) {
        1 -> "Beranda / Home"
        2 -> "Profil Pengguna"
        3 -> "Pengaturan"
        4,5 -> "Pusat Bantuan & FAQ"
        in 6..10 -> "Menu Experimental (Beta)"
        else -> "Menu Tidak Valid"
    }
    println("Membuka Halaman: $namaHalaman")
}