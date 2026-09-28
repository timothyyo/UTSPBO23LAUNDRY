/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg23_laundry;

// Inheritance tipe Hierarchical
public class TreatmentSepatu extends LayananLaundry {

    public TreatmentSepatu() {
        super("Treatment Sepatu", 70000);
    }

    // Method Overriding
    @Override
    public void tampilkanLayanan() {
        System.out.println("Layanan : " + layanan);
        System.out.println("Harga   : Rp. " + harga);
        System.out.println("Keterangan: Perawatan khusus agar sepatu tetap terawat.");
    }
}
