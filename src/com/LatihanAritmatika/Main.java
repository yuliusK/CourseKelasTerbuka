package com.LatihanAritmatika;

import java.util.Scanner;

public class Main {
    public static void main (String [] args){

        // Latihan membuat perhitungan Luas Persegi Panjang
        int panjang = 13;
        int lebar = 26;
        int luas = panjang * lebar;
        System.out.println("Luas persegi panjang adalah (" +panjang+ " x " +lebar+ ") = " +luas);

        //Opsi kedua dalam membuat program perhitungan Luas ialah dengan menggunakan Scanner
        Scanner userInput = new Scanner(System.in); // new Scanner adalah Objek dari class Scanner
        int panjangPersegiPanjang, lebarPersegiPanjang, luasPersegiPanjang, tinggiPersegiPanjang, volumePersegiPanjang;

        System.out.print("Panjang = ");
        panjangPersegiPanjang = userInput.nextInt();

        System.out.print("Lebar = ");
        lebarPersegiPanjang = userInput.nextInt();

        luasPersegiPanjang = panjangPersegiPanjang * lebarPersegiPanjang;
        System.out.println("Luas Persegi Panjang = " +luasPersegiPanjang);

        System.out.print("Tinggi = ");
        tinggiPersegiPanjang = userInput.nextInt();

        volumePersegiPanjang = luasPersegiPanjang*tinggiPersegiPanjang;
        System.out.println("Volume Persegi Panjang = " +volumePersegiPanjang);
    }
}
