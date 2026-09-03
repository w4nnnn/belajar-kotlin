fun main() {
    val poin = 750
    
    val levelPengguna = if (poin >= 1000) {
        "Master Developer"
    } else if (poin >= 500) {
        "Pro Developer"
    } else if (poin >= 100) {
        "Junior Developer"
    } else {
        "Newbie"
    }
    
    println("Poin: $poin -> Level Pengguna: $levelPengguna")
}
