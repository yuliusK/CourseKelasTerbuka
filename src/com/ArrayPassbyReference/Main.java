package com.ArrayPassbyReference;

import java.util.Arrays;

public class Main {
    public static void main (String [] args){
        int[] arrayAngka1 = {1,2,3,4,5};
        int[] arrayAngka2 = new int[5];

        System.out.println(arrayAngka1); //memori yang terdapat pada array angka 1
        System.out.println(arrayAngka2); //memori yang terdapat pada array angka 2

        arrayAngka2 = arrayAngka1; //array tersebut memiliki 2 lokasi/address akan tetapi saat di deklarasikan seperti disamping lokasi address tersebut tidak di copy melainkan address tersebut yang awalnya ada 2 berubah menjadi 1
        // dengan kata lain kedua array tersebut memilii 1 address

        System.out.println(arrayAngka1);
        System.out.println(arrayAngka2);

        System.out.println("array 1 -> " + Arrays.toString(arrayAngka1));
        System.out.println("array 2 -> " + Arrays.toString(arrayAngka2));

        arrayAngka1[0] = 100;
        arrayAngka2[4] = 400;

        System.out.println("array 1 -> " + Arrays.toString(arrayAngka1));
        System.out.println("array 2 -> " + Arrays.toString(arrayAngka2));

        ubahArray(arrayAngka1);
        System.out.println("array 1 -> " + Arrays.toString(arrayAngka1));
        System.out.println("array 2 -> " + Arrays.toString(arrayAngka2));
    }

    //method yang argument nya adalah reference, pass by reference
    //bukan pass by value. pass by value = variabel biasa

    private static void ubahArray(int[] dataArray){
        dataArray[0] = 125;
    }
}
