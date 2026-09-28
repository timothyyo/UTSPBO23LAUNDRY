package pkg23_laundry;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);

        // Polymorphism: referensi parent dapat menunjuk objek subclass
        LayananLaundry layanan;

        int saldo = 200000;
        boolean ulang = true;

        System.out.println("====================================");
        System.out.println("       SISTEM LAUNDRY SEPATU");
        System.out.println("====================================");

        // Looping: program dapat menerima beberapa transaksi
        while (ulang) {
            System.out.println("\nSaldo Anda saat ini: Rp. " + saldo);
            System.out.println("------------------------------------");
            System.out.println("1. Cuci Sepatu          (Rp. 50.000)");
            System.out.println("2. Treatment Sepatu     (Rp. 70.000)");
            System.out.println("3. Repair Sepatu        (Rp. 100.000)");
            System.out.println("4. Cuci Sepatu Premium  (Rp. 80.000)");
            System.out.println("------------------------------------");
            System.out.print("Pilih layanan: ");

            int pilihan = masuk.nextInt();

            // Condition / if-else
            if (pilihan == 1) {
                layanan = new CuciSepatu();
            } else if (pilihan == 2) {
                layanan = new TreatmentSepatu();
            } else if (pilihan == 3) {
                layanan = new RepairSepatu();
            } else if (pilihan == 4) {
                layanan = new PremiumCuciSepatu();
            } else {
                System.out.println("Pilihan tidak valid.");
                continue;
            }

            System.out.print("Masukkan jumlah sepatu: ");
            int jumlah = masuk.nextInt();

            // Condition tambahan
            if (jumlah <= 0) {
                System.out.println("Jumlah sepatu harus lebih dari 0.");
                continue;
            }

            // Polymorphism: method yang dipanggil menyesuaikan objek subclass
            layanan.tampilkanLayanan();

            // Method Overloading:
            // getHarga() untuk 1 item, getHarga(jumlah) untuk beberapa item
            int totalHarga = layanan.getHarga(jumlah);

            System.out.println("Jumlah sepatu : " + jumlah);
            System.out.println("Total tagihan : Rp. " + totalHarga);

            if (saldo >= totalHarga) {
                int saldoSebelum = saldo;
                saldo -= totalHarga;

                System.out.println("------------------------------------");
                System.out.println("             INVOICE");
                System.out.println("------------------------------------");
                System.out.println("Layanan              : " + layanan.getLayanan());
                System.out.println("Jumlah sepatu        : " + jumlah);
                System.out.println("Total tagihan        : Rp. " + totalHarga);
                System.out.println("Saldo sebelum        : Rp. " + saldoSebelum);
                System.out.println("Saldo setelah        : Rp. " + saldo);
                System.out.println("------------------------------------");
                System.out.println("Transaksi berhasil!");

            } else {
                System.out.println("Transaksi gagal.");
                System.out.println("Saldo tidak mencukupi.");
                System.out.println("Kekurangan            : Rp. " + (totalHarga - saldo));
            }

            System.out.print("\nIngin memesan layanan lain? (ya/tidak): ");
            String jawaban = masuk.next();

            if (!jawaban.equalsIgnoreCase("ya")) {
                ulang = false;
            }
        }

        System.out.println("\n====================================");
        System.out.println("Terima kasih telah menggunakan");
        System.out.println("SISTEM LAUNDRY SEPATU");
        System.out.println("Saldo akhir: Rp. " + saldo);
        System.out.println("====================================");

        masuk.close();
    }
}








