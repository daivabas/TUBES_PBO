package com.example.tubes;
public class Harga implements Kalkulasi {
    protected int total;
    protected int jumlah, pilihan;
    static final String selamat = " ~> [Selamat Datang Di Aplikasi Pemesanan Tiket Kereta Api] <~";

    public int hitungTotal(int jumlahTiket) {
        int harga;
        switch (pilihan) {
            case 0:
                System.exit(0);
                break;
            case 1:
                harga = 50000; // Harga tiket ekonomi
                total = harga * jumlahTiket;
                break;
            case 2:
                harga = 100000; // Harga tiket bisnis
                total = harga * jumlahTiket;
                break;
            case 3:
                harga = 150000; // Harga tiket eksekutif
                total = harga * jumlahTiket;
                break;
            case 15:
                break;
            default:
                System.out.println("ERROR: Input yang anda masukkan salah !");
                break;
        }
        return total;
    }
}
