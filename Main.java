package com.example.tubes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            boolean ulang = true;
            char pilih;

            Menu tampilan = new Menu();

            while (ulang) {
                System.out.println();
                tampilan.inputDataDiri();
                tampilan.menu();

                System.out.println("Apakah anda ingin kembali ke menu sebelumnya?");
                System.out.print("Silahkan klik [Y] kembali atau [T] berhenti : ");
                pilih = input.next().charAt(0);

                if (pilih == 'T') {
                    ulang = false;
                }
            }
        }
    }
}
