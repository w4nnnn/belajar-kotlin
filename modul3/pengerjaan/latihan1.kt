fun konversiCelciusKeFahrenheit(celsius: Double): Double = (celsius * 9.0 / 5.0) + 32.0

fun hitungDiskon(harga: Double, persenDiskon: Double): Double = harga * (persenDiskon / 100.0)

fun isBilanganGenap(angka: Int): Boolean = angka % 2 == 0

fun main() {
    println(konversiCelciusKeFahrenheit(90.4))
    println(hitungDiskon(100000.0, 20.0))
    println(isBilanganGenap(10))
}