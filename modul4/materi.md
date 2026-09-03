# Modul 4: Collections & Functional Operations di Kotlin

Selamat datang di Modul 4! Di modul ini kita akan mempelajari bagaimana Kotlin mengelola kumpulan data (**Collections**) serta memanipulasinya secara deklaratif menggunakan operasi fungsional (**Functional Operations**).

Jika di Python kamu terbiasa dengan `list`, `dict`, `set`, dan *list comprehension*, serta di JavaScript terbiasa dengan Array methods seperti `.map()`, `.filter()`, `.reduce()`, kamu akan merasa sangat nyaman di sini. Kotlin membawa operasi tersebut ke tingkat yang lebih aman (*type-safe*) dan ekspresif.

---

## 1. Konsep Inti Collections di Kotlin: Immutable vs Mutable

Salah satu filosofi terpenting Kotlin adalah memisahkan koleksi menjadi dua jenis:
1. **Read-Only / Immutable** (Default & Direkomendasikan): Koleksi yang tidak bisa ditambah, dihapus, atau diubah isinya setelah dibuat.
2. **Mutable**: Koleksi yang isinya bisa dimodifikasi (`add`, `remove`, `clear`).

| Tipe Koleksi | Read-Only (Immutable) | Mutable (Bisa Dimodifikasi) |
|---|---|---|
| **List** (Urutan berindeks) | `listOf(...)` | `mutableListOf(...)` |
| **Set** (Nilai unik, tanpa duplikat) | `setOf(...)` | `mutableSetOf(...)` |
| **Map** (Pasangan Key-Value) | `mapOf(k to v)` | `mutableMapOf(k to v)` |

### Contoh Penggunaan:
```kotlin
fun main() {
    // 1. Read-Only List
    val buah = listOf("Apel", "Jeruk", "Mangga")
    // buah.add("Pisang") // ERROR! Tidak ada method add() pada read-only list

    // 2. Mutable List
    val angka = mutableListOf(1, 2, 3)
    angka.add(4)
    angka.remove(2)
    println(angka) // Output: [1, 3, 4]

    // 3. Map (Key to Value)
    val hargaBarang = mapOf(
        "Kopi" to 15000,
        "Teh" to 8000,
        "Roti" to 12000
    )
    println("Harga kopi: ${hargaBarang["Kopi"]}")
}
```

> 💡 **Best Practice di Android**: Selalu gunakan read-only collection (`listOf`, dll.) kecuali kamu benar-benar butuh mengubah isinya secara dinamis. Ini mencegah bug akibat modifikasi data yang tidak disengaja.

---

## 2. Pengenalan Lambda Expression

Sebelum masuk ke manipulasi data, kita perlu mengenal **Lambda** di Kotlin.
Lambda adalah fungsi anonim (tanpa nama) yang bisa kita simpan dalam variabel atau kita oper sebagai argumen fungsi.

Sintaks dasar: `{ parameter: Tipe -> tubuh_fungsi }`

```kotlin
// Lambda sederhana
val salam = { nama: String -> "Halo, $nama!" }
println(salam("Budi"))

// Jika hanya ada 1 parameter, Kotlin menyediakan keyword implisit: `it`
val kuadrat: (Int) -> Int = { it * it }
println(kuadrat(5)) // Output: 25
```

---

## 3. Operasi Koleksi Fungsional (Transformasi & Filter)

Kekuatan utama koleksi Kotlin terletak pada fungsi bawaannya yang memungkinkan kita mengolah data tanpa loop `for` manual.

### a. `filter` (Menyaring Elemen)
Mirip `.filter()` di JS atau `[x for x in data if kondisi]` di Python.

```kotlin
val daftarAngka = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

// Ambil hanya angka genap
val genap = daftarAngka.filter { it % 2 == 0 }
println(genap) // Output: [2, 4, 6, 8, 10]
```

### b. `map` (Mentransformasi Setiap Elemen)
Mirip `.map()` di JS atau `[f(x) for x in data]` di Python.

```kotlin
val hargaAsli = listOf(10000, 20000, 30000)

// Naikkan setiap harga sebesar 10%
val hargaBaru = hargaAsli.map { it * 1.1 }
println(hargaBaru) // Output: [11000.0, 22000.0, 33000.0]
```

### c. `forEach` (Iterasi Sederhana)
Menjalankan aksi untuk setiap elemen tanpa mengembalikan list baru:
```kotlin
val namaPengguna = listOf("Alice", "Bob", "Charlie")
namaPengguna.forEach { nama ->
    println("User: $nama")
}
```

---

## 4. Operasi Agregasi & Pencarian Populer

Kotlin menyediakan banyak fungsi agregasi bawaan yang sangat intuitif:

```kotlin
val nilaiSiswa = listOf(75, 88, 92, 60, 85)

println(nilaiSiswa.sum())         // Jumlah total: 400
println(nilaiSiswa.average())     // Nilai rata-rata: 80.0
println(nilaiSiswa.maxOrNull())   // Nilai tertinggi: 92
println(nilaiSiswa.minOrNull())   // Nilai terendah: 60
println(nilaiSiswa.count { it >= 80 }) // Jumlah siswa nilai >= 80: 3

// Mencari elemen pertama yang cocok
val pertamaLulus = nilaiSiswa.firstOrNull { it >= 90 }
println(pertamaLulus) // Output: 92
```

---

## 5. Chaining Operations (Menggabungkan Beberapa Operasi)

Kamu bisa menyambungkan fungsi-fungsi ini menjadi rantai pemrosesan data yang bersih dan mudah dibaca:

```kotlin
val produk = listOf("Laptop", "Mouse", "Keyboard", "Monitor", "Mic")

val hasil = produk
    .filter { it.length > 5 }       // 1. Ambil yang panjang namanya > 5
    .map { it.uppercase() }         // 2. Ubah jadi huruf besar
    .sorted()                       // 3. Urutkan berdasarkan abjad

println(hasil) // Output: [KEYBOARD, LAPTOP, MONITOR]
```

---

## Rangkuman Inti Modul 4
1. **Immutable by default**: Gunakan `listOf()`, `setOf()`, `mapOf()` untuk data tetap, dan gunakan versi `mutable...` jika butuh modifikasi (`add`/`remove`).
2. Gunakan **`filter { ... }`** untuk menyaring data berdasarkan kondisi boolean.
3. Gunakan **`map { ... }`** untuk mengubah bentuk atau nilai elemen menjadi bentuk baru.
4. Manfaatkan keyword implisit **`it`** untuk merujuk pada elemen tunggal saat ini di dalam lambda.
5. Gunakan fungsi agregasi seperti `.sum()`, `.average()`, `.count { ... }`, `.sorted()`.
