package com.example.tubes;

import java.util.Scanner;

public class Menu extends SistemKembalian {
    Scanner input = new Scanner(System.in);
    private int pilihan;
    private int jumlah;

    public void menu() {
        System.out.println("Selamat Datang di Aplikasi Pemesanan Tiket KAI Daiva");
        System.out.println("===================================================");
        do {
            System.out.println("| No Kereta |     Jenis Tiket      |     Harga     |");
            System.out.println("|-----------|----------------------|---------------|");
            System.out.println("|     0     | Ekonomi              | Rp.50.000     |");
            System.out.println("|    002    | Bisnis               | Rp.100.000    |");
            System.out.println("|    018    | Eksekutif            | Rp.200.000    |");
            System.out.println("|==================================================|");
            System.out.println("| 4. | Pembayaran                                  |");
            System.out.println("|==================================================|");
            System.out.print("Masukkan Pilihan  : ");
            pilihan = input.nextInt();
            input.nextLine(); // Consuming the newline character

            if (pilihan >= 1 && pilihan <= 3) {
                System.out.print("Masukkan Jumlah Tiket yang Dipesan : ");
                jumlah = input.nextInt();
                input.nextLine(); // Consuming the newline character
                hitungTotal(jumlah);
                viewTotal();

            }
        } while (pilihan != 0);

        viewTotal();
    }

    public void inputDataDiri() {
        String nama, alamat, noTelp;
        System.out.println();
        System.out.println("Selamat Datang");
        System.out.println("Silahkan isi biodata di bawah");
        System.out.print("Nama: ");
        nama = input.nextLine();
        System.out.print("Alamat: ");
        alamat = input.nextLine();
        System.out.print("Nomor Telepon: ");
        noTelp = input.nextLine();
        setNomorHp(noTelp);
        System.out.println();
        System.out.println("Data Pemesan");
        System.out.println("Nama : " + nama);
        System.out.println("Alamat : " + alamat);
        System.out.println("Nomor Telepon : " + getNomorHp());
    }
}
