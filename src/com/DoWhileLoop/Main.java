package com.DoWhileLoop;

public class Main {
    public static void main (String [] args) {
        int a = 0;
        boolean kondisi = true;

        System.out.println("Ini adalah awal program");
        do {
            a++;
            System.out.println("Ini kondisi ke - " +a);

            if (a == 10) {
                kondisi = false;
            }
        } while (kondisi) ;
        System.out.println("Ini adalah akhir program ");
    }
}
