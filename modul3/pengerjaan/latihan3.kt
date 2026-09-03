fun hitungRataRata(vararg daftarNilai: Double): Double {
    if (daftarNilai.isEmpty()) return 0.0

    var total = 0.0
    for (nilai in daftarNilai) {
        total += nilai
    }
    return total / daftarNilai.size
}

fun main() {
    println(hitungRataRata(80.0, 90.0, 100.0))
    println(hitungRataRata(75.5, 82.0, 91.5, 68.0, 88.0))
    println(hitungRataRata())
}