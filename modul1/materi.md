# Modul 1: Fondasi Dasar Kotlin & Sistem Variabel

Selamat datang di Modul 1! Karena kamu sudah memiliki pengalaman dengan **Python** dan **JavaScript**, kamu akan merasa familiar dengan banyak konsep di Kotlin. Namun, ada perbedaan mendasar yang sangat penting: **Kotlin adalah bahasa statically-typed (bertipe statis)** yang modern, ringkas, dan aman (*safe*).

---

## 1. Titik Masuk Program: Fungsi `main`

Setiap program Kotlin yang dapat dijalankan secara mandiri dimulai dari fungsi `main`.

```kotlin
fun main() {
    println("Halo, Kotlin!")
}
```

### Perbandingan:
- **Python**: Menulis kode langsung di top-level atau menggunakan `if __name__ == "__main__":`.
- **JavaScript**: Menjalankan script langsung dari atas ke bawah.
- **Kotlin**: Menggunakan kata kunci `fun` dan membutuhkan fungsi pembuka bernama `main()`.

> **Catatan Sintaks**: 
> - Tidak perlu titik koma (`;`) di akhir baris (opsional seperti di JS/Python).
> - Fungsi `println()` otomatis menambahkan baris baru (*new line*), mirip `print()` di Python atau `console.log()` di JS.

---

## 2. Deklarasi Variabel: `val` vs `var`

Kotlin sangat menekankan konsep *immutability* (nilai yang tidak dapat diubah setelah diinisialisasi).

Ada dua kata kunci utama:

1. **`val` (Value / Read-only)**:
   - Nilainya **tidak bisa diubah** setelah diisi pertama kali.
   - Mirip dengan `const` di JavaScript.
   - *Best Practice di Kotlin*: Selalu gunakan `val` secara default kecuali variabel tersebut memang butuh diubah nilainya.

2. **`var` (Variable / Mutable)**:
   - Nilainya **bisa diubah-ubah** (*reassignable*).
   - Mirip dengan `let` di JavaScript atau variabel biasa di Python.

```kotlin
fun main() {
    val namaAplikasi = "MyChatApp"
    // namaAplikasi = "SuperApp" // ❌ ERROR! val tidak bisa diubah

    var versi = 1
    versi = 2 // ✅ BISA! var boleh diubah nilainya
}
```

---

## 3. Tipe Data & *Type Inference*

Kotlin memiliki fitur **Type Inference** (bisa menebak tipe data secara otomatis dari nilai yang diberikan), mirip dengan cara kerja penulisan variabel di Python/JS. 

Namun, sekali sebuah variabel memiliki tipe data, tipenya **terkunci permanen** (tidak bisa diisi tipe lain).

### Tipe Data Primitif Utama:
| Tipe Data | Keterangan | Contoh Nilai |
|---|---|---|
| `Int` | Bilangan bulat standar (32-bit) | `42`, `-10` |
| `Long` | Bilangan bulat besar (64-bit) | `10000000000L` (pakai akhiran `L`) |
| `Double` | Desimal presisi tinggi | `3.14`, `0.05` |
| `Float` | Desimal standar | `3.14f` (pakai akhiran `f`) |
| `Boolean` | Nilai kebenaran | `true`, `false` |
| `Char` | Karakter tunggal (tanda petik tunggal `' '`) | `'A'`, `'9'` |
| `String` | Teks / kalimat (tanda petik ganda `" "`) | `"Belajar Android"` |

### Contoh Deklarasi:
```kotlin
fun main() {
    // 1. Menggunakan Type Inference (tipe ditentukan otomatis)
    val skor = 100            // Tipe otomatis Int
    val pi = 3.14             // Tipe otomatis Double
    val isActive = true       // Tipe otomatis Boolean

    // 2. Deklarasi Tipe Eksplisit (ditulis manual)
    val nama: String = "Budi"
    var saldo: Double = 50000.0
    val idPengguna: Long = 9876543210L

    // ❌ ERROR TIPE:
    // var umur = 25       // tipe Int
    // umur = "Dua puluh"  // ERROR! Tidak bisa ganti tipe dari Int ke String
}
```

---

## 4. String Templates (Interpolasi String)

Di Python ada `f"Halo {nama}"` dan di JavaScript ada `` `Halo ${nama}` ``.
Di Kotlin, kita menggunakan **String Templates** dengan simbol `$`:

1. **Variabel sederhana**: Gunakan `$namaVariabel`
2. **Ekspresi / Perhitungan / Method call**: Gunakan `${ekspresi}`

```kotlin
fun main() {
    val nama = "Andi"
    val umur = 20

    // Variabel biasa
    println("Halo, nama saya $nama dan umur saya $umur tahun.")

    // Menggunakan ekspresi ${ ... }
    println("Tahun depan umur saya adalah ${umur + 1} tahun.")
    println("Panjang nama saya: ${nama.length} karakter.")
}
```

---

## 5. Konversi Tipe Data (*Type Casting / Conversion*)

Di Kotlin, bilangan angka **tidak otomatis** dikonversi jika berbeda tipe (misal dari `Int` ke `Double`). Kita harus melakukan konversi secara eksplisit menggunakan fungsi helper bawaan:

- `.toInt()`
- `.toDouble()`
- `.toLong()`
- `.toString()`

```kotlin
fun main() {
    val angkaBulat: Int = 10
    // val angkaDesimal: Double = angkaBulat // ❌ ERROR! Tidak ada auto-widening

    val angkaDesimal: Double = angkaBulat.toDouble() // ✅ Benar
    val teksAngka: String = "150"
    val hasilKonversi: Int = teksAngka.toInt()

    println("Desimal: $angkaDesimal, Hasil: $hasilKonversi")
}
```

---

## 6. Cara Menjalankan Kode Kotlin di Terminal

Kamu bisa membuat file dengan ekstensi `.kt` (misalnya `main.kt`), lalu menjalankan langkah berikut di terminal:

```bash
# Kompilasi ke file .jar
kotlinc main.kt -include-runtime -d main.jar

# Jalankan dengan Java
java -jar main.jar
```

Atau untuk script sederhana / belajar cepat:
```bash
kotlinc -script main.kts
```

---

## Rangkuman Inti Modul 1
1. Fungsi pembuka program selalu `fun main() { ... }`.
2. Gunakan `val` untuk variabel tetap (*immutable* / `const`), dan `var` untuk variabel yang bisa diubah (*mutable* / `let`).
3. Tipe data statis (*statically typed*): sekali bertipe `Int`, tidak bisa diisi `String`.
4. String template menggunakan `$variabel` atau `${ekspresi}`.
5. Konversi tipe data numerik harus eksplisit (`.toInt()`, `.toDouble()`).
