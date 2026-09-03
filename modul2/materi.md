# Modul 2: Control Flow (Percabangan & Perulangan Modern di Kotlin)

Selamat datang di Modul 2! Di modul ini kita akan mempelajari bagaimana mengatur alur logika program (*Control Flow*).

Kotlin memiliki pendekatan kontrol alur yang sangat ekspresif dan modern jika dibandingkan dengan Python atau JavaScript.

---

## 1. `if-else` sebagai Ekspresi (Expression)

Di Python dan JavaScript, `if` adalah sebuah *statement* (pernyataan yang mengeksekusi blok kode, tapi tidak menghasilkan nilai langsung). Di Kotlin, `if-else` bisa bertindak sebagai **Expression** (menghasilkan nilai kembalian).

### Cara Biasa (Statement):
```kotlin
fun main() {
    val umur = 18
    if (umur >= 17) {
        println("Boleh membuat SIM")
    } else {
        println("Belum cukup umur")
    }
}
```

### Cara Kotlin Idiomatik (Expression - Pengganti Ternary Operator):
> 💡 *Kotlin tidak memiliki ternary operator (`kondisi ? a : b`) seperti di JS.* Sebagai gantinya, gunakan `if-else` langsung pada variabel:

```kotlin
fun main() {
    val nilaiUjian = 85
    
    // if-else langsung mengembalikan nilai ke variabel status
    val status = if (nilaiUjian >= 75) "Lulus" else "Tidak Lulus"
    println("Status: $status")

    // Jika blok memiliki banyak baris, nilai baris terakhir adalah nilai kembaliannya:
    val pesan = if (nilaiUjian >= 90) {
        println("Kerja bagus!")
        "Predikat A" // baris terakhir dikembalikan
    } else {
        "Predikat B/C"
    }
}
```

---

## 2. Percabangan Serbaguna: `when`

Di JavaScript ada `switch-case`. Di Python ada `match-case`.
Di Kotlin, kita menggunakan **`when`**, yang jauh lebih fleksibel, aman, dan tanpa perlu menuliskan kata kunci `break;`.

### 2.1. `when` Dasar:
```kotlin
fun main() {
    val statusKode = 200

    when (statusKode) {
        200 -> println("OK: Permintaan berhasil")
        404 -> println("Not Found: Halaman tidak ditemukan")
        500 -> println("Internal Server Error")
        else -> println("Status kode tidak dikenal") // else wajib jika sebagai expression
    }
}
```

### 2.2. `when` sebagai Expression (Mengembalikan Nilai):
```kotlin
fun main() {
    val hari = 3
    val namaHari = when (hari) {
        1 -> "Senin"
        2 -> "Selasa"
        3 -> "Rabu"
        4, 5 -> "Kamis atau Jumat" // beberapa nilai dipisah koma
        in 6..7 -> "Akhir Pekan"    // menggunakan rentang (range)
        else -> "Hari tidak valid"
    }
    println("Hari ke-$hari adalah $namaHari")
}
```

### 2.3. `when` tanpa Argumen (Pengganti `if-else if-else` yang bersih):
```kotlin
fun main() {
    val skor = 82

    val grade = when {
        skor >= 90 -> "A"
        skor >= 80 -> "B"
        skor >= 70 -> "C"
        else -> "D"
    }
    println("Grade kamu: $grade")
}
```

---

## 3. Ranges & Progression (Rentang Nilai)

Kotlin memiliki operator `..` (*range*) yang sangat intuitif:

- `1..5` : Menghasilkan 1, 2, 3, 4, 5 (inklusif).
- `1 until 5` : Menghasilkan 1, 2, 3, 4 (5 tidak termasuk / eksklusif, mirip `range(1, 5)` di Python).
- `5 downTo 1` : Menghitung mundur: 5, 4, 3, 2, 1.
- `step 2` : Melompat setiap 2 angka (misal `1..10 step 2` -> 1, 3, 5, 7, 9).

---

## 4. Perulangan (Loops)

### 4.1. `for` Loop
Kotlin menggunakan perulangan bergaya iterator `for (item in collection/range)`.

```kotlin
fun main() {
    // Loop dalam rentang angka
    for (i in 1..3) {
        println("Iterasi ke-$i")
    }

    // Loop mundur dengan step
    for (i in 6 downTo 0 step 2) {
        print("$i ") // Output: 6 4 2 0 
    }
    println()

    // Loop elemen teks (Char)
    val teks = "KOTLIN"
    for (huruf in teks) {
        print("$huruf-") // Output: K-O-T-L-I-N-
    }
    println()
}
```

### 4.2. `while` & `do-while`
Sintaks `while` dan `do-while` persis sama dengan JavaScript:

```kotlin
fun main() {
    var baterai = 100
    while (baterai > 80) {
        println("Baterai masih cukup: $baterai%")
        baterai -= 10
    }
}
```

---

## 5. `break` dan `continue`
- `break`: Menghentikan paksa perulangan.
- `continue`: Melewati iterasi saat ini dan lanjut ke iterasi berikutnya.

```kotlin
fun main() {
    for (i in 1..10) {
        if (i % 2 == 0) continue // Lewati bilangan genap
        if (i > 7) break         // Berhenti jika lebih dari 7
        print("$i ")             // Output: 1 3 5 7
    }
    println()
}
```

---

## Rangkuman Inti Modul 2
1. `if-else` adalah sebuah *expression*, bisa mengembalikan nilai dan menggantikan *ternary operator*.
2. `when` adalah pengganti `switch-case` yang powerful, bisa menerima single value, multi value (koma), `in range`, atau kondisi boolean.
3. Rentang (*Ranges*): `..` (inklusif), `until` (eksklusif), `downTo` (mundur), `step` (kelipatan).
4. `for` loop menggunakan kata kunci `in`.
