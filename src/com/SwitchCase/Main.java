package com.SwitchCase;

import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        //ekspresi di dalam switch case hanya berupa satuan = byte, short, integer, long, dan String atau enum

        String nama;
        Scanner input = new Scanner(System.in);

        System.out.print("Panggil Nama = ");
        nama = input.next();

        switch (nama) {
            case "marco":
                System.out.println("Saya " + nama + " dan saya hadir");
                break;
            case "izo":
                System.out.println("Saya " + nama + " dan saya hadir");
                break;
            default:
                System.out.println(nama + "tidak hadir");
        }
        System.out.println("SELESAI PROGRAM");
    }
}
