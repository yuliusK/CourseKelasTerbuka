package com.BreakContinueReturn;

public class Main {
    public static void main (String [] args){
        int a=0;
        while (true){
            a++;
            if (a==10){
                break; // ini adalah keyword untuk memaksa keluar dari looping
            } else if (a == 5) {
                continue; // ini adalah keyword untuk memaksa aksi dari awal
            } else if (a == 7) {
                return; // ini adalah keyword untuk memaksa program berakhir
            }
            System.out.println("looping ke - "+a);
        }
        System.out.println("Ini adalah akhir program");
    }
}
