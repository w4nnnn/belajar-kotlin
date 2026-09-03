fun main(){
    val namaBarang = "Headset Gaming"
    val hargaAsli = 450000
    val persentaseDiskon = 15
    val hargaDiskon = hargaAsli * persentaseDiskon / 100
    val hargaSetelahDiskon = hargaAsli - hargaDiskon

    println("Nama Barang: $namaBarang")
    println("Harga Asli: $hargaAsli")
    println("Diskon: $persentaseDiskon%")
    println("Potongan Harga: $hargaDiskon")
    println("Total Bayar: $hargaSetelahDiskon")
}