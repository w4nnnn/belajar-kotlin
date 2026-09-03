# Modul 3: Functions (Fungsi Modern & Ekspresif di Kotlin)

Selamat datang di Modul 3! Di modul ini kita akan mendalami **Functions (Fungsi)** di Kotlin.

Karena kamu sudah terbiasa membuat fungsi di Python (`def`) dan JavaScript (`function` / arrow function `() => {}`), kamu akan melihat bahwa Kotlin memadukan keamanan tipe data dengan sintaks yang sangat ringkas dan elegan.

---

## 1. Anatomi Dasar Fungsi di Kotlin

Fungsi di Kotlin dideklarasikan menggunakan kata kunci **`fun`**.

```kotlin
fun sapaPengguna(nama: String): String {
    return "Halo, $nama! Selamat belajar."
}

fun main() {
    val pesan = sapaPengguna("Irwan")
    println(pesan)
}
```

### Aturan Parameter & Return Type:
1. **Parameter selalu bertipe `val`**: Di Kotlin, parameter yang masuk ke dalam fungsi bersifat *read-only* (tidak bisa diubah-ubah nilainya di dalam fungsi).
2. **Penulisan Tipe**: Formatnya selalu `namaParameter: TipeData`.
3. **Return Type**: Ditulis setelah tanda kurung tutup `: TipeReturn`.

---

## 2. Fungsi Tanpa Return Value: Tipe `Unit`

Di Python ada `None`, di JavaScript/C/Java ada `void`. Di Kotlin, tipe kembalian "kosong" disebut **`Unit`**.

Penulisan `: Unit` bersifat **opsional** (boleh tidak ditulis):

```kotlin
// Kedua fungsi ini sama persis
fun cetakPeringatan(pesan: String): Unit {
    println("[PERINGATAN]: $pesan")
}

fun cetakInfo(pesan: String) {
    println("[INFO]: $pesan")
}
```

---

## 3. Single-Expression Functions (Fungsi 1 Baris)

Jika sebuah fungsi hanya berisi satu baris ekspresi (langsung me-return hasil), kamu tidak perlu kurung kurawal `{ }` dan kata kunci `return`. Cukup gunakan tanda **`=`**.

*Tipe kembalian juga bisa ditebak otomatis oleh Kotlin (Type Inference)!*

### Perbandingan:
```kotlin
// Cara Biasa (Block Body):
fun tambahBiasa(a: Int, b: Int): Int {
    return a + b
}

// Cara Ringkas (Single-Expression):
fun tambahRingkas(a: Int, b: Int): Int = a + b

// Contoh lain dengan perbandingan (mirip arrow function di JS):
fun isDewasa(umur: Int): Boolean = umur >= 17
fun maks(a: Int, b: Int) = if (a > b) a else b
```

---

## 4. Default Arguments (Nilai Default Parameter)

Di Kotlin, kamu bisa memberikan nilai default pada parameter fungsi. Ini membuat fungsi menjadi sangat fleksibel tanpa perlu membuat banyak fungsi dengan nama sama (*function overloading*).

```kotlin
fun kirimNotifikasi(pesan: String, pengirim: String = "Sistem", prioritas: String = "Normal") {
    println("[$prioritas] Dari $pengirim: $pesan")
}

fun main() {
    kirimNotifikasi("Server sedang maintenance") 
    // Output: [Normal] Dari Sistem: Server sedang maintenance

    kirimNotifikasi("Ada promo baru!", "Marketing")
    // Output: [Normal] Dari Marketing: Ada promo baru!
}
```

---

## 5. Named Arguments (Argumen Bernama)

Saat memanggil fungsi dengan banyak parameter, kamu bisa menyebutkan nama parameternya secara eksplisit. Fitur ini:
- Membuat kode sangat mudah dibaca.
- Memungkinkan kamu mengubah urutan argumen.
- Memungkinkan kamu hanya mengisi parameter tertentu jika parameter lainnya punya default value.

```kotlin
fun main() {
    // Memanggil dengan Named Arguments
    kirimNotifikasi(
        pesan = "Baterai Lemah",
        prioritas = "PENTING" // pengirim dilewati, otomatis pakai "Sistem"
    )
    
    // Urutan boleh diacak jika menyebutkan namanya
    kirimNotifikasi(
        prioritas = "Rendah",
        pesan = "Update tersedia",
        pengirim = "Play Store"
    )
}
```

> 📱 **Penting untuk Android (Jetpack Compose)**: Di Android modern, UI dibuat menggunakan fungsi dengan puluhan Named Arguments dan Default Arguments. Memahami konsep ini adalah kunci utama menguasai Jetpack Compose!

---

## 6. `vararg` (Variable Number of Arguments)

Jika kamu ingin fungsi bisa menerima jumlah argumen yang dinamis (bisa 1, 2, 5, atau berapa saja angka yang dimasukkan), gunakan kata kunci **`vararg`** (mirip `*args` di Python atau `...rest` di JavaScript).

```kotlin
fun hitungTotal(vararg daftarAngka: Int): Int {
    var total = 0
    for (angka in daftarAngka) {
        total += angka
    }
    return total
}

fun main() {
    println(hitungTotal(10, 20))             // Output: 30
    println(hitungTotal(5, 15, 25, 35, 40))  // Output: 120
    println(hitungTotal())                   // Output: 0
}
```

---

## Rangkuman Inti Modul 3
1. Deklarasi fungsi menggunakan `fun namaFungsi(param: Tipe): TipeReturn`.
2. Jika tidak mengembalikan nilai, tipenya adalah `Unit` (opsional ditulis).
3. Gunakan **Single-Expression Functions** (`fun f(x) = x * 2`) untuk fungsi 1 baris yang ringkas.
4. Gunakan **Default Arguments** (`param: String = "Default"`) agar parameter opsional.
5. Gunakan **Named Arguments** (`fungsi(param = nilai)`) untuk kejelasan pembacaan kode (sangat krusial untuk Android Jetpack Compose).
6. Gunakan **`vararg`** jika fungsi menerima banyak argumen dinamis.
