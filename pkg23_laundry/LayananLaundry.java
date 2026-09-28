/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg23_laundry;

public class LayananLaundry {
    protected String layanan;
    protected int harga;

    public LayananLaundry(String layanan, int harga) {
        this.layanan = layanan;
        this.harga = harga;
    }

    public void tampilkanLayanan() {
        System.out.println("Layanan : " + layanan);
        System.out.println("Harga   : Rp. " + harga);
    }

    public int getHarga() {
        return harga;
    }

    // Method Overloading
    public int getHarga(int jumlah) {
        return harga * jumlah;
    }

    public String getLayanan() {
        return layanan;
    }
}