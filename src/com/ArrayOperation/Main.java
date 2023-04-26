package com.ArrayOperation;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        int[] arrayAngka1 = {1,2,3,4,5};
        //merubah array menjadi String
        System.out.println("Merubah Array menjadi String");
        printArray(arrayAngka1);

        //mengkopi array
        System.out.println("\nMengkopi Array");
        int[] arrayAngka2 = new int[5];
        printArray(arrayAngka1);
        printArray(arrayAngka2);

        System.out.println("\nMengkopi Array dengan Loop");
        for(int i = 0; i < arrayAngka1.length; i++){
            arrayAngka2[i] = arrayAngka1[i];
        }

        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka2);
        System.out.println(arrayAngka2);

        System.out.println("\nMengkopi dengan CopyOf");
        int[] arrayAngka3 = Arrays.copyOf(arrayAngka1,3);
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka3);
        System.out.println(arrayAngka3);

        System.out.println("\nMengkopi dengan CopyOfRange");
        int[] arrayAngka4 = Arrays.copyOfRange(arrayAngka1,2,5);
        /*
        angka 2 diatas menunjukan index (Index Array pada Java dimulai dari angka 0)
        angka 5 merupakan batas angka
         */
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka4);
        System.out.println(arrayAngka4);

        //fill Array
        System.out.println("\nFill Array");
        int[] arrayAngka5 = new int[100];
        printArray(arrayAngka5);
        Arrays.fill(arrayAngka5,7);
        printArray(arrayAngka5);

        /*
        komparasi Array ada 3 jenis:
        1. Equals = menyamakan dua buah Array
        2. Compare = Mengecek mana Array yang lebih besar
        3. Mismatch = Mengecek mana Index Array yang berbeda
         */
        System.out.println("\nKomparasi Array");
        int[] arrayAngka6 = {1,2,5,4,5};
        int[] arrayAngka7 = {1,2,3,5,5};

        printArray(arrayAngka6);
        printArray(arrayAngka7);
        //untuk menyamakan array menggunakan equals
        System.out.println("Hasil Komparasi Array = "+Arrays.equals(arrayAngka6,arrayAngka7));

        //jika menggunakan if then else maka akan menghasilkan false karena hal tersebut melihat berdasarkan address di dalam Array
        if (arrayAngka6 == arrayAngka7){
            System.out.println("Membandingkan dua buah Array dengan if then else (arrayAngka6 == arrayAngka7), maka hasilnya = Array ini sama");
        } else {
            System.out.println("Membandingkan dua buah Array dengan if then else (arrayAngka6 == arrayAngka7), maka hasilnya = Array ini beda");
        }

        System.out.println("\nMengecek Mana Array yang lebih besar");
        /*
        jika nilai nya 0 berarti sama besar
        jika nilai nya 1 berarti nilai yang lebih besar adalah array yang pertama
        jika nilai nya -1 berarti nilai yang lebih besar adalah array yang kedua
         */
        System.out.println(Arrays.compare(arrayAngka6,arrayAngka7));

        System.out.println("\nMengecek mana Index yang berbeda");
        //jika nilai nya -1 berarti tidak ada index yang berbeda
        System.out.println(Arrays.mismatch(arrayAngka6,arrayAngka7));

        //sort Array
        System.out.println("\nSort Array");
        int[] arrayAngka8 = {1,4,2,3,6,4,3,9,6};
        printArray(arrayAngka8);
        Arrays.sort(arrayAngka8);
        printArray(arrayAngka8);

        //search Array
        System.out.println("\nSearch Array");
        int angka = 3;
        int posisi = Arrays.binarySearch(arrayAngka8, angka); //untuk menggunakan binarySearch harus di sorting dulu
        System.out.println("angka " +angka+ " ada di index " +posisi);

        /*
        tugas:
        1. Bikin sort terbalik
        2. Bikin Aritmatika Array
        3. Menggabungkan dua buah Array
         */

        System.out.println("\n===================================");
        Integer[] arrayAngka9 = {1,9,4,5,2,1,7,4,5,2};
        System.out.println("INI TUGASNYA");
        System.out.println("\n1. Sort Terbalik");
        System.out.println("Array yang dicari = "+Arrays.toString(arrayAngka9));
        Arrays.sort(arrayAngka9);
        System.out.println("Array = " +Arrays.toString(arrayAngka9));
        Arrays.sort(arrayAngka9,Collections.reverseOrder());
        System.out.println("Array = " +Arrays.toString(arrayAngka9));

        System.out.println("\n2. Aritmatika Array");
        int[] arrayAngka10 = {1,3,2,5,7,3,4,2,3,5,5};
        int[] arrayAngka11 = {2,5,1,2,5,7,8,3,5,6,3};
        Arrays.sort(arrayAngka10);
        printArray(arrayAngka10);
        Arrays.sort(arrayAngka11);
        printArray(arrayAngka11);
        int[] arrayAngka12 = Arrays.copyOf(arrayAngka10,11);
        for (int i=0; i<arrayAngka12.length; i++){
            arrayAngka12[i] = arrayAngka10[i] + arrayAngka11[i];
        }
        System.out.println("Hasil Penjumlahan dari kedua Array tersebut = \n" +Arrays.toString(arrayAngka12));

        System.out.println("\n3. Menggabungkan 2 buah Array");
        int[] arrayAngka13 = {5,1,2,4,6,3,4,8,9,6};
        int[] arrayAngka14 = {9,3,1,0,7,5,3,6,3,1};
        Arrays.sort(arrayAngka13);
        printArray(arrayAngka13);
        Arrays.sort(arrayAngka14);
        printArray(arrayAngka14);
        int[] arrayAngka15 = new int[arrayAngka13.length + arrayAngka14.length];

        for (int i=0; i<arrayAngka13.length; i++){
            arrayAngka15[i] = arrayAngka13[i];
        }
            for (int j=0; j<arrayAngka14.length; j++){
                arrayAngka15[j + arrayAngka13.length] = arrayAngka14[j];
            }
        System.out.println("Hasil Penggabungan 2 buah Array \n" +Arrays.toString((arrayAngka15)));
    }

    private static void printArray(int[] dataArray){
        System.out.println("Array = " +Arrays.toString(dataArray));
    }
}
