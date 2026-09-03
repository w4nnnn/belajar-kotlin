# Soal Latihan: Modul 3 (Functions di Kotlin)

Saatnya mempraktikkan pembuatan fungsi yang bersih, modular, dan idiomatik di Kotlin!

---

### Petunjuk:
1. Buat file jawaban di dalam direktori `modul3/pengerjaan/` (misalnya `latihan1.kt`, `latihan2.kt`, `latihan3.kt`).
2. Kompilasi dan jalankan kodenya untuk memastikan fungsinya bekerja dengan benar.

---

## Soal 1: Single-Expression Functions (Kalkulator Sederhana)
Buatlah 3 buah fungsi dengan gaya **Single-Expression Function** (menggunakan tanda `=`) di luar `fun main()`:
1. `konversiCelciusKeFahrenheit(celsius: Double): Double`
   - *Rumus:* `(celsius * 9.0 / 5.0) + 32.0`
2. `hitungDiskon(harga: Double, persenDiskon: Double): Double`
   - *Rumus:* `harga * (persenDiskon / 100.0)`
3. `isBilanganGenap(angka: Int): Boolean`
   - Mengembalikan `true` jika angka habis dibagi 2, selain itu `false`.

**Di dalam `fun main()`:**
Panggil ketiga fungsi tersebut dengan nilai uji bebas dan cetak hasilnya.

---

## Soal 2: Komponen Dialog UI Android (Default & Named Arguments)
Dalam pengembangan aplikasi Android, kita sering membuat komponen UI (seperti Alert Dialog / Modal Popup) dengan parameter yang fleksibel.

Buat sebuah fungsi bernama:
`tampilkanDialog(judul: String, pesan: String, teksTombolPositif: String = "OK", teksTombolNegatif: String = "Batal", bisaDibatalkan: Boolean = true)`

Fungsi ini bertipe `Unit` (hanya mencetak tampilan dialog ke terminal) dengan format:
```text
====================================
[DIALOG]: [judul]
Pesan: [pesan]
Tombol: [[teksTombolPositif]] | [[teksTombolNegatif]]
Bisa Ditutup: [bisaDibatalkan]
====================================
```

**Di dalam `fun main()`:**
1. Panggil `tampilkanDialog` hanya dengan mengisi `judul` dan `pesan` (biarkan parameter lainnya memakai nilai default).
2. Panggil `tampilkanDialog` kedua kalinya menggunakan **Named Arguments** untuk mengubah `teksTombolPositif = "Hapus Akun"`, `teksTombolNegatif = "Kembali"`, dan `bisaDibatalkan = false`.

---

## Soal 3: Fungsi Agregasi Skor (`vararg`)
Buat sebuah fungsi bernama `hitungRataRata(vararg daftarNilai: Double): Double` yang menghitung nilai rata-rata dari seluruh nilai yang dimasukkan.
- *Catatan:* Jika tidak ada nilai yang dimasukkan (`daftarNilai.isEmpty()`), kembalikan nilai `0.0`.

**Di dalam `fun main()`:**
1. Panggil `hitungRataRata(80.0, 90.0, 100.0)` dan cetak hasilnya.
2. Panggil `hitungRataRata(75.5, 82.0, 91.5, 68.0, 88.0)` dan cetak hasilnya.
3. Panggil `hitungRataRata()` tanpa argumen dan cetak hasilnya.

---

Selamat mencoba! Jika ada konsep yang ingin didiskusikan, tanyakan saja ya!
