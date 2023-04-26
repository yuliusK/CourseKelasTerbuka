package com.WhileLoop;

public class Main {
    public static void main (String [] args) {
        int a = 0;
        boolean kondisi = true;

        System.out.println("Ini adalah awal program");
        while(kondisi){
            System.out.println("While loop ke-" +a);
            a++;
            if (a==10){
                kondisi = false;
            }
        }
        System.out.println("ini adalah akhir program ");
    }
}
