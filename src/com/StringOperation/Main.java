package com.StringOperation;

import java.util.Locale;
import java.util.Scanner;
import java.lang.String;

public class Main {
    public static void main(String[] args) {
        String kalimat = "Saya suka makan pisang";

        //mengambil komponen dari string
        System.out.println(kalimat.charAt(5));

        //Substring
        String kata = kalimat.substring(10,15); //masuk ke memori heap
        System.out.println(kata);

        //concatenation (concat)
        String kalimat2 = kata + " bakwan";
        System.out.println(kalimat2);

        kata = kata + " cireng";
        System.out.println(kata); //masuk ke memori String Pool

        //concat dengan non string
        int jumlah = 20;
        String kalimatLagi = kalimat2 + " " +jumlah; //casting
        System.out.println(kalimatLagi);

        //lowercase dan uppercase
        System.out.println("\n" + kalimat.toUpperCase());
        System.out.println(kalimat.toLowerCase());

        //replace
        String kalimat3 = kalimat.replace("pisang", "combro");
        System.out.println(kalimat3);

        //equality (persamaan)
        String kataInput = "test";
        // String kataInput = new String ("test"); //ini bukan string literal dan tidak berada di string pool
        String kataTest = "test";
        System.out.println("\nPersamaan pada lokasi string pool");
        if (kataInput == kataTest){
            System.out.println("Sama");
        } else {
            System.out.println("Tidak Sama");
        }

        Scanner userInput = new Scanner(System.in);
        System.out.print("\nmengambil input string dari user: ");
        kataInput = userInput.next(); //tidak di string pool
        System.out.println("ini adalah input user: "+kataInput);

        if (kataInput.equals(kataTest)){
            System.out.println("Sama");
        } else {
            System.out.println("Tidak Sama");
        }

        //compare (berdasarkan urutan alfabet
        String motor1 ="royal enfield himalayan";
        String motor2 ="kawasaki w175";
        System.out.println(motor1.compareTo(motor2));
        System.out.println(motor2.compareTo(motor1));

        String gorengan1 ="bakwan";
        String gorengan2 ="bala-bala";
        System.out.println(gorengan1.compareTo(gorengan2));
        System.out.println(gorengan2.compareTo(gorengan1));

    }
}
