# Soal Latihan: Modul 1 (Fondasi Dasar Kotlin & Variabel)

Waktunya menguji dan mempraktikkan pemahamanmu tentang dasar sintaks Kotlin, `val`/`var`, tipe data, dan string template!

---

### Petunjuk Pengerjaan:
1. Buat sebuah file bernama `latihan1.kt` di dalam folder `modul1/` (atau kamu bisa langsung menuliskan kodenya di terminal/editor).
2. Tulis solusi kode Kotlin lengkap dengan fungsi `fun main()`.
3. Jalankan dan uji apakah outputnya sudah sesuai dengan yang diminta.

---

## Soal 1: Profil Pengembang Aplikasi Android
Buatlah variabel untuk menyimpan data profil seorang pengembang aplikasi:
- `namaLengkap` (Teks tetap / tidak berubah): isi dengan nama kamu.
- `targetTahun` (Tahun target selesai belajar, bilangan bulat tetap).
- `sudahPernahCoding` (Boolean tetap): `true`.
- `jumlahAplikasiDibuat` (Bilangan bulat yang nilainya akan bertambah / bisa berubah): inisialisasi awal dengan nilai `0`.

**Tugas:**
1. Gunakan kata kunci `val` atau `var` yang tepat untuk masing-masing variabel di atas.
2. Tambahkan nilai `jumlahAplikasiDibuat` sebanyak 1 (simulasi telah membuat 1 aplikasi).
3. Cetak informasi profil menggunakan **String Template** dalam 1 atau 2 baris `println`.

---

## Soal 2: Kalkulator Diskon Belanja App
Sebuah aplikasi e-commerce sederhana memiliki data produk berikut:
- Nama barang: `"Headset Gaming"`
- Harga asli: `450000` (Tipe `Int`)
- Persentase diskon: `15` (Tipe `Int`, artinya diskon 15%)

**Tugas:**
1. Hitung nominal potongan harga (diskon) dalam bentuk desimal (`Double`). *Petunjuk: konversi harga atau diskon ke Double terlebih dahulu agar perhitungannya akurat.*
2. Hitung harga akhir yang harus dibayar pembeli (Harga Asli - Potongan Harga).
3. Cetak hasil perhitungannya menggunakan string template dengan format:
   ```text
   Barang: [Nama Barang]
   Harga Asli: Rp [Harga Asli]
   Diskon: [Diskon]%
   Potongan Harga: Rp [Nominal Potongan]
   Total Bayar: Rp [Harga Akhir]
   ```

---

## Soal 3: Eksplorasi Logika & Tipe Data
Jawablah pertanyaan singkat berikut (bisa kamu jawab langsung saat diskusi):
1. Mengapa di Kotlin kita sangat disarankan menggunakan `val` dibandingkan `var` jika variabel tersebut tidak perlu diubah?
2. Jika kita memiliki kode:
   ```kotlin
   val hargaTeks = "25000"
   val ongkir = 5000
   ```
   Bagaimana cara menjumlahkan keduanya agar menghasilkan total `30000`? Tuliskan satu baris kodenya.

---

Selamat mencoba! Jika sudah selesai atau ada bagian yang ingin ditanyakan/dibahas, kabari ya!
