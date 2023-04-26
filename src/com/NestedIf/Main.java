package com.NestedIf;

import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        int a,b,c, pilih, pilih2;
        double hasil;

        Scanner input = new Scanner (System.in);

        System.out.println("Pilih salah satu");
        System.out.println("1. Segitiga");
        System.out.println("2. Persegi");
        System.out.println("3. Persegi Panjang");
        System.out.print("Pilihanmu adalah nomor = ");
        pilih=input.nextInt();

        if (pilih == 1){
            System.out.println();
            System.out.println("1. Hitung Luas Segitiga");
            System.out.println("2. Hitung Keliling Segitiga");
            System.out.print("Pilihanmu adalah nomor = ");
            pilih2 = input.nextInt();

            if (pilih2 == 1){
                System.out.println();
                System.out.println("Rumus Luas Segitiga adalah L = 0.5 x alas x tinggi");
                System.out.print("Tentukan panjang alas = ");
                a=input.nextInt();
                System.out.print("Tentukan tingginya = ");
                b=input.nextInt();
                hasil = 0.5*a*b;
                System.out.println("Hasil perhitungan luas segitiga adalah = " +hasil);
            }
            else if (pilih2 == 2){
                System.out.println();
                System.out.println("Rumus Keliling Segitiga adalah K = Panjang Sisi + Panjang Sisi + Panjang Sisi");
                System.out.print("Tentukan panjang sisi = ");
                c=input.nextInt();
                hasil = c+c+c;
                System.out.println("Hasil perhitungan keliling segitiga adalah = " +hasil);
            } else {
                System.out.println("Pilihanmu tidak terdaftar");
            }

        } else if (pilih == 2){
            System.out.println();
            System.out.println("1. Hitung Luas Persegi");
            System.out.println("2. Hitung Keliling Persegi");
            System.out.print("Pilihanmu adalah nomor = ");
            pilih2 = input.nextInt();
            if (pilih2 == 1){
                System.out.println();
                System.out.println("Rumus Luas Persegi adalah L = panjang sisi x panjang sisi");
                System.out.print("Masukkan Panjang Sisi Persegi = ");
                a = input.nextInt();
                hasil = a*a;
                System.out.println("Hasil perhitungan luas persegi adalah = " +hasil);
            }
            else if (pilih2 == 2){
                System.out.println();
                System.out.println("Rumus Keliling Persegi adalah K = 4 x panjang sisi");
                System.out.print("Masukkan Panjang Sisi Persegi = ");
                a = input.nextInt();
                hasil = 4*a;
                System.out.println("Hasil perhitungan keliling persegi adalah = " +hasil);
            }
            else {
                System.out.println("Pilihanmu tidak terdaftar");
            }
        } else if (pilih == 3) {
            System.out.println();
            System.out.println("1. Hitung Luas Persegi Panjang");
            System.out.println("2. Hitung Keliling Persegi Panjang");
            System.out.print("Pilihanmu adalah nomor = ");
            pilih2 = input.nextInt();
            if (pilih2 == 1) {
                System.out.println();
                System.out.println("Rumus Luas Persegi Panjang adalah L = panjang x lebar");
                System.out.print("Masukkan Panjang Persegi Panjang = ");
                a = input.nextInt();
                System.out.print("Masukkan Lebar Persegi Panjang = ");
                b = input.nextInt();
                hasil = a * b;
                System.out.println("Hasil perhitungan luas persegi adalah = " + hasil);
            } else if (pilih2 == 2) {
                System.out.println();
                System.out.println("Rumus Keliling Persegi Panjang adalah K = 2 x (panjang + lebar)");
                System.out.print("Masukkan Panjang Sisi Persegi = ");
                a = input.nextInt();
                System.out.print("Masukkan Lebar Persegi Panjang = ");
                b = input.nextInt();
                hasil = 2 * (a + b);
                System.out.println("Hasil perhitungan keliling persegi adalah = " + hasil);
            } else {
                System.out.println("Pilihanmu tidak terdaftar");
            }
        } else {
            System.out.println("PILIHAN ANDA NGACO!!!!");
        }
    }
}
