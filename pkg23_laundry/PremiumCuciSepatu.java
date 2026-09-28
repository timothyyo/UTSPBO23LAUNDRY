/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg23_laundry;

// Inheritance tipe Multilevel:
// LayananLaundry -> CuciSepatu -> PremiumCuciSepatu
public class PremiumCuciSepatu extends CuciSepatu {

    public PremiumCuciSepatu() {
        super();
        layanan = "Cuci Sepatu Premium";
        harga = 80000;
    }

    // Method Overriding lagi
    @Override
    public void tampilkanLayanan() {
        System.out.println("Layanan : " + layanan);
        System.out.println("Harga   : Rp. " + harga);
        System.out.println("Keterangan: Cuci sepatu premium dengan perawatan tambahan.");
    }
}

