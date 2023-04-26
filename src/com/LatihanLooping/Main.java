package com.LatihanLooping;

import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        int nilaiAwal, nilaiAkhir, hasil;

        Scanner input = new Scanner(System.in);

        /*System.out.print("Masukkan nilai awal = ");
        nilaiAwal = input.nextInt();
        System.out.print("Masukkan nilai akhir = ");
        nilaiAkhir = input.nextInt(); */

        nilaiAwal = 10;

        hasil = 1;

        for (int a = 1; a<=nilaiAwal; a++){
            hasil *= a;
            System.out.println("hasil penjumlahan pola ke - "+a+" adalah = "+hasil);
        }

        /*
            System.out.println();
            System.out.println("Perulangan versi do while");
            do {
                hasil = hasil + nilaiAwal;

                System.out.println("hasil penjumlahan pola ke - "+nilaiAwal+" adalah = "+hasil);
                nilaiAwal++;

            } while (nilaiAwal<=nilaiAkhir);

            System.out.println();
            System.out.println("Perulangan versi while");
            while (nilaiAwal<=nilaiAkhir);
                hasil = hasil + nilaiAwal;

                System.out.println("hasil penjumlahan pola ke - "+nilaiAwal+" adalah = "+hasil);
                nilaiAwal++;
        */

    }
}
