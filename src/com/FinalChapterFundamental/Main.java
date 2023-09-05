package com.FinalChapterFundamental;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner userInput = new Scanner(System.in);
        String option;
        boolean retry = true;

        while(retry){
            clearScreen();
            System.out.println("Database Perpustakaan\n");
            System.out.println("1. Lihat seluruh buku");
            System.out.println("2. Cari data buku");
            System.out.println("3. Tambah data buku");
            System.out.println("4. Ubah data buku");
            System.out.println("5. Hapus data buku");

            System.out.print("Pilihan Anda : ");
            option = userInput.next();

            switch (option) {
                case "1" -> {
                    System.out.println("\n=================");
                    System.out.println("LIST SELURUH BUKU");
                    System.out.println("=================");
                    tampilkanData();
                }
                case "2" -> {
                    System.out.println("\n=========");
                    System.out.println("CARI BUKU");
                    System.out.println("=========");
                }
                case "3" -> {
                    System.out.println("\n================");
                    System.out.println("TAMBAH DATA BUKU");
                    System.out.println("================");
                }
                case "4" -> {
                    System.out.println("\n==============");
                    System.out.println("UBAH DATA BUKU");
                    System.out.println("==============");
                }
                case "5" -> {
                    System.out.println("\n===============");
                    System.out.println("HAPUS DATA BUKU");
                    System.out.println("===============");
                }
                default -> System.err.println("\n Input Anda tidak ditemukan \n Silahkan pilih [1-5]");
            }

            retry = getYesorNo("Apakah Anda ingin melanjutkan");

        }

    }

    private static void tampilkanData() throws IOException {
        System.out.print("\nBerikut ini adalah data yang sudah terinput : ");
        boolean isAdd = getYesorNo("Apakah Anda ingin menambah data? ");
    }

    private static boolean getYesorNo (String message) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("\n" + message + "(y/n) : ");
        String option = userInput.next();

        while(!option.equalsIgnoreCase("y") && !option.equalsIgnoreCase("n")){
            System.err.println("Pilihan Anda bukan 'y' atau 'n'");
            System.out.println("\n" + message + "(y/n)");
            option = userInput.next();
        }
        return option.equalsIgnoreCase("y");
    }

    private static void clearScreen(){
        try {
            if(System.getProperty("os.name").contains("Windows")){
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e){
            System.err.println("tidak bisa clear screen");
        }
    }
}
