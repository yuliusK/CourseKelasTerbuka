package com.LatihanOperatorLogika;

import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        int nilaiBenar, nilaiTebakan;
        boolean hasil;
        nilaiBenar = (int) (Math.random() *10);

        //Tebakan Angka Random
        System.out.println("| Tebak angka dari 1 - 10!!! |");
        System.out.print("| Nilai tebakan anda adalah ");
        nilaiTebakan = input.nextInt();

        if (nilaiTebakan > 10){
            System.out.println("Nilai yang anda masukkan lebih dari 10");
        }
        else {
            hasil = (nilaiBenar == nilaiTebakan);
            System.out.println("| Nilai tebakan anda = " +hasil);
            System.out.println("| Nilai yang benar adalah = " +nilaiBenar);
        }

        //Operasi Aljabar boolean (AND + OR)
        System.out.println("| Masukkan angka antara 5 sampai 14 |");
        System.out.print("| Masukkan Nilai = ");
        nilaiTebakan = input.nextInt();
        hasil = (nilaiTebakan >= 5) && (nilaiTebakan <= 14);

        if (nilaiTebakan >= 5 && nilaiTebakan <= 14){
            System.out.println("| Nilai yang anda masukkan = " +hasil);
        }
        else {
            System.out.println("| Nilai yang anda masukkan = " +hasil);
            System.out.println("Nilai yang anda masukkan tidak sesuai");

        }
    }
}
