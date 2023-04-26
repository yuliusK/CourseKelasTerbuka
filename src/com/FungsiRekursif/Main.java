package com.FungsiRekursif;

import java.util.Scanner;

public class Main {
    public static void main (String [] args){

        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan Nilai = " );
        int nilai = input.nextInt();
        System.out.println("Nilai yang anda masukkan = " +nilai);

        printNilai(nilai);
        int jumlah = jumlahNilai(nilai);
        System.out.println("jumlah Nilai = " +jumlah);

        int faktorial = hitungFaktorial(nilai);
        System.out.println("jumlah Faktorial = " +faktorial);
    }

    private static void printNilai (int parameter) {
        System.out.println("Nilai = " +parameter);

        if(parameter == 0) {
            return;
        }

        parameter--;
        printNilai(parameter);
        }

        private static int jumlahNilai (int parameter){
            System.out.println("Parameter = " +parameter);
            if (parameter == 0) {
                return parameter;
            }
            return parameter + jumlahNilai(parameter -1);
        }

        private static int hitungFaktorial(int parameter){
            System.out.println("parameter = "+parameter);

            if (parameter == 1){
                return parameter;
            }
            return parameter * hitungFaktorial(parameter -1);
        }
    }
