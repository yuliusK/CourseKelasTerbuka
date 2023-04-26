package com.LatihanFibonacci;

import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        int a = 1;
        int b = 0;
        int c = 0;
        int n = 5;

        //0,1,1,2,3,5,8,13
        for (int i = 1; i <= n; i++){
            System.out.println("Nilai ke - " +i+ " adalah " +c); //0, 1, 1,
            c = a + b; //1 + 0, 0 + 1, 1 + 1,
            a = b;  //0, 1, 1
            b = c;  //1, 1, 2

        }


        //0, 1, 1, 2, 3, 5
        /*

            System.out.println();
            System.out.println("Ini adalah Latihan Fibonacci menggunakan Do While");
            int i=1;
            do {
                System.out.println("Nilai ke - " +i+ " adalah " +c);
                c=a+b;
                a = b;
                b = c;
                i++;
             } while (i<=n);

            System.out.println();
            System.out.println("Ini adalah Latihan Fibonacci menggunakan While");
            while (i<=n){
                System.out.println("Nilai ke - " +i+ " adalah " +c);
                c=a+b;
                a = b;
                b = c;
                i++;
            }

         */
    }
}
