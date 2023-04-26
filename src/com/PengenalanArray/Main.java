package com.PengenalanArray;

import java.util.Arrays;
//library diatas untuk membantu mengubah Array menjadi String atau helper class

public class Main {
    public static void main (String [] args) {
        //assignment
        //tipedata [] nama = {Komponen, komponen}

        //          INDEX   =  0,1,2,3
        //                     | | | |
        int [] arrayInteger = {1,2,3,4};
        arrayInteger[0] = 11;

        System.out.println("Assignment Array = " + Arrays.toString(arrayInteger));

        System.out.println(arrayInteger[0]);
        System.out.println(arrayInteger[1]);
        System.out.println(arrayInteger[2]);
        System.out.println(arrayInteger[3]);

        System.out.println();

        //Deklarasi
        //tipedata [] nama = new int [JumlahArray];

        float [] arrayFloat = new float[5];
        arrayFloat[1] = 11.6f;
        arrayFloat[3] = 13;

        System.out.println("Deklarasi Array = " + Arrays.toString(arrayFloat));

        System.out.println(arrayFloat[0]);
        System.out.println(arrayFloat[1]);
        System.out.println(arrayFloat[2]);
        System.out.println(arrayFloat[3]);
        System.out.println(arrayFloat[4]);
    }
}
