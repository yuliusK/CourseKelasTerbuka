package com.LatihanKalkulator;

import java.util.Scanner;

public class IfElse {
    public static void main (String [] args) {
        float a, b, hasil;
        char operator;

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nilai a = ");
        a = input.nextFloat();
        System.out.print("Masukkan Operator Nilai = ");
        operator = input.next().charAt(0);
        System.out.print("Masukkan Nilai b = ");
        b = input.nextFloat();

        System.out.println("Input User = " + a + " " + operator + " " + b);

        if (operator == '+') {
            hasil = a + b;
            System.out.println("Hasilnya adalah = " +hasil);
        }
        else if (operator == '-') {
            hasil = a - b;
            System.out.println("Hasilnya adalah = " +hasil);
        }
        else if (operator == '/' || operator == ':') {
            hasil = a / b;
            System.out.println("Hasilnya adalah = " +hasil);
        }
        else if (operator == 'x' || operator == '*') {
            hasil = a * b;
            System.out.println("Hasilnya adalah = " +hasil);
        } else {
            System.out.println("TIDAK DITEMUKAN");
        }
    }
}

