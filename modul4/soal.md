# Soal Latihan: Modul 4 (Collections & Functional Operations)

Saatnya melatih kemampuan pengolahan data dengan gaya fungsional yang bersih dan deklaratif di Kotlin!

---

### Petunjuk:
1. Buat file jawaban di dalam direktori `modul4/pengerjaan/` (misalnya `latihan1.kt`, `latihan2.kt`, `latihan3.kt`).
2. Hindari menggunakan loop `for` manual jika tugas tersebut bisa diselesaikan dengan fungsi koleksi bawaan seperti `filter`, `map`, `sum`, `count`, dll.
3. Kompilasi dan jalankan kodenya untuk memastikan hasilnya sesuai.

---

## Soal 1: Filter & Transformasi Produk E-Commerce
Di sebuah aplikasi toko online, kamu memiliki daftar harga produk (dalam rupiah):
`val daftarHarga = listOf(150000, 45000, 250000, 80000, 120000, 30000, 500000)`

Buat alur pemrosesan data dengan ketentuan:
1. **Filter**: Ambil hanya produk yang harganya **di atas Rp 50.000**.
2. **Transformasi (`map`)**: Berikan diskon 10% untuk setiap produk yang lolos filter (rumus harga baru: `it * 0.9`).
3. Cetak list harga baru tersebut ke terminal.
4. Hitung dan cetak **total harga** dari semua produk setelah didiskon tersebut.

---

## Soal 2: Agregasi Data Nilai Mahasiswa
Diberikan sebuah `Map` berisi nama mahasiswa dan nilai akhirnya:
```kotlin
val dataNilai = mapOf(
    "Andi" to 85,
    "Budi" to 58,
    "Citra" to 92,
    "Dewi" to 70,
    "Eko" to 45,
    "Fani" to 88
)
```

Selesaikan tugas berikut menggunakan operasi fungsional koleksi Kotlin:
1. Hitung dan cetak **rata-rata nilai** seluruh mahasiswa.
2. Cari dan cetak **nilai tertinggi** dan **nilai terendah**.
3. Ambil daftar **nama mahasiswa yang lulus** (kriteria lulus: nilai $\ge$ 70), lalu urutkan namanya sesuai abjad.
4. Hitung **jumlah mahasiswa yang tidak lulus** (nilai < 70).

---

## Soal 3: Manajemen Antrean Pasien (Mutable Collection & Operasi Dasar)
Sebuah klinik ingin mencatat antrean nama pasien secara dinamis:

1. Buat sebuah `MutableList` dengan nama awal: `"Rina"`, `"Dodi"`, `"Siti"`.
2. Lakukan simulasi berikut secara berurutan:
   - Pasien baru datang dan mendaftar: tambahkan `"Budi"` ke dalam antrean.
   - Pasien bernama `"Dodi"` membatalkan antrean: hapus `"Dodi"` dari list.
   - Pasien pertama (`"Rina"`) selesai dipanggil dan dilayani: hapus pasien yang berada di indeks pertama.
   - Pasien darurat datang: sisipkan `"Hendra"` ke urutan paling depan (indeks `0`).
3. Cetak daftar akhir antrean pasien dengan format bernomor (misalnya):
   ```text
   Daftar Antrean Saat Ini:
   1. Hendra
   2. Siti
   3. Budi
   ```
   *(Petunjuk: Kamu bisa gunakan `.forEachIndexed { index, nama -> ... }`)*.

---

Selamat mencoba! Jika ada konsep yang membingungkan, silakan tanyakan langsung!
