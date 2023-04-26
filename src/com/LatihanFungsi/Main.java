package com.LatihanFungsi;

import java.util.Scanner;

public class Main {
    public static void main (String [] args) {

        Scanner userInput = new Scanner (System.in);

        System.out.print("Panjang = ");
        int inputPanjang = userInput.nextInt();
        System.out.print("Lebar = ");
        int inputLebar = userInput.nextInt();

        gambar(inputPanjang, inputLebar);

        tampilkanKelilingdanLuas(inputPanjang,inputLebar);
    }

    private static void tampilkanKelilingdanLuas (int panjang, int lebar){
        System.out.println("luas = " +luas(panjang,lebar));
        System.out.println("keliling = " +keliling(panjang,lebar));
    }

    private static int luas (int panjang, int lebar) {
        int hasil = panjang*lebar;
        return hasil;
    }

    private static int keliling (int panjang, int lebar) {
        int hasil = (panjang+lebar)*2;
        return hasil;
    }

    private static void gambar (int panjang, int lebar) {
        for (int i = 0; i < lebar; i++){
            for (int j = 0; j < panjang; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
