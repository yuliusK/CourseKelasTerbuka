package com.LatihanKalkulator;

import java.util.Scanner;

public class SwitchCase {
    public static void main (String [] args) {
        float a, b, hasil;
        String operator;

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nilai a = ");
        a = input.nextFloat();
        System.out.print("Masukkan Operator Nilai = ");
        operator = input.next();
        System.out.print("Masukkan Nilai b = ");
        b = input.nextFloat();

        System.out.println("Input User = " + a + " " + operator + " " + b);

        switch (operator){
        case "+":
            hasil = a + b;
            System.out.println("Hasilnya adalah = " +hasil);
            break;
        case "-":
            hasil = a - b;
            System.out.println("Hasilnya adalah = " +hasil);
            break;
        case "/":
            hasil = a / b;
            System.out.println("Hasilnya adalah = " +hasil);
            break;
        case "*":
            hasil = a * b;
            System.out.println("Hasilnya adalah = " +hasil);
            break;
        default:
            System.out.println("TIDAK DITEMUKAN");
        }
    }
}

