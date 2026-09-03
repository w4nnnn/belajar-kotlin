fun tampilkanDialog(
    judul: String,
    pesan: String,
    teksTombolPositif: String = "OK",
    teksTombolNegatif: String = "Batal",
    bisaDibatalkan: Boolean = true,
) {
    println("====================================")
    println("[DIALOG]: [$judul]")
    println("Pesan: [$pesan]")
    println("Tombol: [[$teksTombolPositif]] | [[$teksTombolNegatif]]")
    println("Bisa Ditutup: [$bisaDibatalkan]")
    println("====================================")
}

fun main() {
    // Pemanggilan 1: hanya judul dan pesan (sisanya default)
    tampilkanDialog(
        judul = "Pemberitahuan",
        pesan = "Sesi login Anda telah berakhir."
    )

    // Pemanggilan 2: menggunakan named arguments sesuai soal
    tampilkanDialog(
        judul = "Konfirmasi Tindakan",
        pesan = "Data yang dihapus tidak dapat dipulihkan.",
        teksTombolPositif = "Hapus Akun",
        teksTombolNegatif = "Kembali",
        bisaDibatalkan = false
    )
}