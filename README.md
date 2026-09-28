# UTSPBO23LAUNDRY

# Sistem Laundry Sepatu

Program **Sistem Laundry Sepatu** adalah aplikasi Java berbasis console yang digunakan untuk melakukan simulasi transaksi layanan laundry/perawatan sepatu. Pengguna dapat memilih jenis layanan, memasukkan jumlah sepatu, menghitung total biaya, memeriksa kecukupan saldo, dan melihat invoice transaksi.

## Deskripsi Proyek

Program menyediakan 4 pilihan layanan:

| No. | Layanan | Harga per Sepatu |
|---|---|---:|
| 1 | Cuci Sepatu | Rp50.000 |
| 2 | Treatment Sepatu | Rp70.000 |
| 3 | Repair Sepatu | Rp100.000 |
| 4 | Cuci Sepatu Premium | Rp80.000 |

Saldo awal pengguna adalah **Rp200.000**. Setelah transaksi berhasil, saldo akan dikurangi sesuai total tagihan.

Program ini juga menerapkan konsep dasar Pemrograman Berorientasi Objek (OOP), yaitu:

- **Inheritance**: `CuciSepatu`, `TreatmentSepatu`, dan `RepairSepatu` mewarisi `LayananLaundry`.
- **Multilevel Inheritance**: `PremiumCuciSepatu` mewarisi `CuciSepatu`, yang sebelumnya mewarisi `LayananLaundry`.
- **Method Overriding**: setiap jenis layanan memiliki implementasi `tampilkanLayanan()` sendiri.
- **Method Overloading**: `getHarga()` dan `getHarga(int jumlah)` digunakan untuk kebutuhan perhitungan berbeda.
- **Polymorphism**: variabel bertipe `LayananLaundry` dapat menyimpan objek dari berbagai subclass.
- **Percabangan**: digunakan untuk memilih layanan dan memeriksa saldo/jumlah sepatu.
- **Looping**: digunakan agar pengguna dapat melakukan lebih dari satu transaksi.

## Struktur Proyek

```text
23_Laundry/
├── README.md
├── .gitignore
├── src/
│   └── pkg23_laundry/
│       ├── Main.java
│       ├── LayananLaundry.java
│       ├── CuciSepatu.java
│       ├── TreatmentSepatu.java
│       ├── RepairSepatu.java
│       └── PremiumCuciSepatu.java
└── docs/
    └── output.png
```

## Alur Program

1. Program dijalankan melalui class `Main`.
2. Program membuat saldo awal sebesar **Rp200.000**.
3. Program menampilkan daftar layanan laundry sepatu.
4. Pengguna memilih salah satu layanan:
   - `1` Cuci Sepatu
   - `2` Treatment Sepatu
   - `3` Repair Sepatu
   - `4` Cuci Sepatu Premium
5. Program meminta jumlah sepatu.
6. Program menghitung total tagihan dengan rumus:

   `total = harga layanan × jumlah sepatu`

7. Program memeriksa apakah saldo mencukupi.
8. Jika saldo mencukupi:
   - transaksi dinyatakan berhasil;
   - saldo dikurangi;
   - invoice ditampilkan.
9. Jika saldo tidak mencukupi:
   - transaksi dinyatakan gagal;
   - program menampilkan jumlah kekurangan saldo.
10. Program menanyakan apakah pengguna ingin memesan layanan lain.
11. Jika pengguna menjawab `ya`, proses kembali ke pemilihan layanan.
12. Jika pengguna menjawab selain `ya`, program selesai dan menampilkan saldo akhir.

### Cara Menjalankan

**Prasyarat:** Java JDK terpasang dan perintah `java` serta `javac` tersedia di terminal.

#### Melalui terminal

Masuk ke folder proyek, lalu compile:

```bash
javac -d out src/pkg23_laundry/*.java
```

Jalankan program:

```bash
java -cp out pkg23_laundry.Main
```

#### Melalui NetBeans

1. Buka project Java di NetBeans.
2. Pastikan class utama adalah `pkg23_laundry.Main`.
3. Jalankan project dengan **Run Project**.
4. Masukkan pilihan layanan dan jumlah sepatu melalui console.

## Contoh Alur Eksekusi

Contoh input:

```text
Pilihan layanan: 1
Masukkan jumlah sepatu: 2
Ingin memesan layanan lain? (ya/tidak): tidak
```

Hasilnya:

```text
Layanan : Cuci Sepatu
Harga   : Rp. 50000
Jumlah sepatu : 2
Total tagihan : Rp. 100000

Transaksi berhasil!

Saldo sebelum : Rp. 200000
Saldo setelah : Rp. 100000
```

## Penjelasan Gambar Output

![Screenshot output program](docs/output.png)

Gambar di atas menunjukkan contoh saat program dijalankan dengan memilih layanan **Cuci Sepatu** sebanyak **2 sepatu**.

Dari output tersebut:

- Saldo awal: **Rp200.000**
- Harga Cuci Sepatu: **Rp50.000 per sepatu**
- Jumlah sepatu: **2**
- Total tagihan: **Rp100.000**
- Saldo setelah transaksi: **Rp100.000**
- Status transaksi: **berhasil**

Output juga menampilkan invoice yang berisi nama layanan, jumlah sepatu, total tagihan, saldo sebelum transaksi, dan saldo setelah transaksi.

## Catatan GitHub

Repository untuk tugas ini sebaiknya dibuat dengan visibility **Public** agar dapat diakses oleh siapa pun. README ini ditempatkan di root repository sehingga otomatis menjadi dokumentasi utama yang terlihat pada halaman depan repository.

## Informasi Teknologi

- Bahasa: **Java**
- Jenis aplikasi: **Console Application**
- Konsep utama: **OOP / Inheritance / Polymorphism**
- IDE yang digunakan: **NetBeans**
