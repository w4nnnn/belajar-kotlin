fun main(){
    val hargaTeks = "25000"
    val ongkir = 5000

    val hargaInt = hargaTeks.toInt()
    val totalBayar = hargaInt + ongkir

    println("Harga Barang: $hargaInt")
    println("Ongkir: $ongkir")
    println("Total Bayar: $totalBayar")
}