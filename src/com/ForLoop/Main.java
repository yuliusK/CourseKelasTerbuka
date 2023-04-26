package com.ForLoop;

public class Main {
    public static void main (String [] args){

        // syarat menggunakan for looping adalah harus memiliki kondisi
        System.out.println("Ini adalah looping pertama");
        for (int a = 0; a<=10; a++){
            System.out.println("Perulangan ke - " +a);
        }

        System.out.println();
        System.out.println("Ini adalah looping kedua");
        for (int a = 10; a>=5; a--){
            System.out.println("Perulangan ke - " +a);
        }

        System.out.println();
        System.out.println("Ini adalah looping ketiga");
        int a = 0;
        for (; a<=10; ){ //akan melakukan looping terus menerus karena tidak ada nilai increment ataupun decrement
            System.out.println("Perulangan ke - " +a);
        }

    }
}
