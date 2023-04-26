package com.LatihanArrayMultidimensi;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /*
        penjumlahan di dalam Aray JAVA, nilai matrix atau nilai dari kedua buah Array harus sama jumlah nya. contoh:
        matrix atau array pertama memiliki 3 baris dan 3 kolom (3*3),
        matrix atau array kedua harus memiliki 3 baris dan 3 kolom juga (3*3).
         */

        int [][] matrix_a = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };

        int [][] matrix_b = {
                {11,12,13},
                {14,15,16},
                {17,18,19},
        };

        System.out.println("MATRIX A ");
        printArray(matrix_a);
        System.out.print("\n");
        System.out.println("MATRIX B");
        printArray(matrix_b);
        System.out.println("HASIL PENJUMLAHAN MATRIX A DAN B ADALAH");

        int[][] hasilTambah = tambah(matrix_a,matrix_b);
        printArray(hasilTambah);

        //perkalian array dua dimensi
        int baris_a = matrix_a.length;
        int kolom_a = matrix_a[0].length;

        int baris_b = matrix_b.length;
        int kolom_b = matrix_b[0].length;

        int [][] hasilPerkalian = new int[baris_a][kolom_b];

        int buffer;
        for (int i = 0; i<baris_a; i++) {
            for (int j = 0; j < kolom_b; j++) {
                buffer = 0;
                for (int k = 0; k < kolom_a; k++) {
                    buffer += matrix_a[i][k] * matrix_b[k][j];
                }
                hasilPerkalian[i][j] = buffer;
            }
        }
        printArray(hasilPerkalian);
    }

    private static int [][] tambah(int[][] matrix_1, int[][] matrix_2){
        int baris_a = matrix_1.length;
        int kolom_a = matrix_1[0].length;

        int baris_b = matrix_2.length;
        int kolom_b = matrix_2[0].length;

        int[][] hasil = new int[baris_a][kolom_a];

        if (baris_a == baris_b && kolom_a == kolom_b){
            for(int i=0; i<baris_a; i++){
                for(int j=0; j<kolom_a; j++){
                    hasil[i][j] = matrix_1[i][j] + matrix_2[i][j];
                }
            }
        } else {
            System.out.println("Jumlah baris atau kolom tidak sama");
        }
        return hasil;
    }

    private static void printArray (int [][] dataArray){
        int baris = dataArray.length;
        int kolom = dataArray[0].length;

        for (int i=0; i<baris; i++){
            System.out.print("[");
            for (int j=0; j<kolom; j++){
                System.out.print(dataArray[i][j]);
                    if (j < (kolom-1)){
                        System.out.print(",");
                    }
                    else {
                        System.out.print("]");
                    }
            }
                System.out.print("\n");
        }
        System.out.print("\n");
    }
}

//tugas nya cari info tentang perkalian array dua dimensi
