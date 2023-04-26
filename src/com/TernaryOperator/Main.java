package com.TernaryOperator;
import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        int a, nilai;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nilai: ");
        nilai = input.nextInt();

        // variable a = (nilai == 10) ? (nilai x nilai (true) ) : (nilai / 2 (false) ) => TERNARY OPERATOR

        a = (nilai == 10) ? (nilai*nilai) : (nilai / 2);

        /*
            Jika memakai if
            if (nilai == 10){
                a = nilai * nilai;
            } else {
                a = nilai / 2;
            }
         */

        System.out.println("Hasilnya = " +a);
    }
}
