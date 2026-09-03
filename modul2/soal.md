# Soal Latihan: Modul 2 (Control Flow: if, when, loops)

Saatnya melatih kemampuan logika percabangan dan perulangan menggunakan fitur-fitur modern Kotlin!

---

### Petunjuk:
1. Buat file jawaban di dalam direktori `modul2/pengerjaan/` (misalnya `latihan1.kt`, `latihan2.kt`, `latihan3.kt`).
2. Kompilasi dan jalankan untuk memverifikasi hasilnya.

---

## Soal 1: Penentu Kategori Level Pengguna (if-else expression)
Dalam sebuah aplikasi, pengguna memiliki level akun berdasarkan jumlah poin:
- Poin `>= 1000`: `"Master Developer"`
- Poin `500..999`: `"Pro Developer"`
- Poin `100..499`: `"Junior Developer"`
- Poin `< 100`: `"Newbie"`

**Tugas:**
1. Buat variabel `val poin = 750` (atau nilai bebas untuk uji coba).
2. Tentukan kategori level pengguna menggunakan **`if-else` sebagai expression** (simpan hasilnya langsung ke `val levelPengguna = if (...) ... else ...`).
3. Cetak hasilnya: `"Poin: [poin] -> Level: [levelPengguna]"`.

---

## Soal 2: Sistem Navigasi Menu Aplikasi (when expression)
Sebuah aplikasi Android memiliki sistem menu dengan opsi tombol berikut:
- Menu `1`: `"Beranda / Home"`
- Menu `2`: `"Profil Pengguna"`
- Menu `3`: `"Pengaturan"`
- Menu `4` atau `5`: `"Pusat Bantuan & FAQ"`
- Rentang `6..10`: `"Menu Eksperimental (Beta)"`
- Angka lainnya: `"Menu tidak valid"`

**Tugas:**
1. Buat variabel `val pilihanMenu = 4`.
2. Gunakan **`when` expression** untuk menentukan nama halaman yang dipilih berdasarkan daftar di atas.
3. Cetak output navigasi: `"Membuka halaman: [namaHalaman]"`.

---

## Soal 3: Pola Bintang & Deret Bilangan (Perulangan for & Ranges)
Buatlah fungsi `main()` yang menghasilkan output 2 bagian berikut:

**Bagian A (Deret Angka Ganjil Mundur):**
Cetak deret angka ganjil dari `15` mundur sampai `1` dalam satu baris (dipisah spasi).
*Contoh output:* `15 13 11 9 7 5 3 1`

**Bagian B (Tangga Bintang Segitiga Siku-siku):**
Gunakan nested loop `for` untuk mencetak segitiga siku-siku dengan tinggi 5 baris:
```text
*
**
***
****
*****
```

---

Selamat mengerjakan! Jika ada materi yang ingin ditanyakan terlebih dahulu atau jika sudah selesai, silakan kabari ya.
