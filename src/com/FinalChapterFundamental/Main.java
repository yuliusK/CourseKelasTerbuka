package com.FinalChapterFundamental;

import java.io.*;
import static com.FinalChapterFundamental.Operation.*;
import static com.FinalChapterFundamental.Util.*;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        boolean retry = true;

        while (retry) {
            clearScreen();
            System.out.println("Database Perpustakaan\n");
            System.out.println("1. Lihat seluruh buku");
            System.out.println("2. Cari data buku");
            System.out.println("3. Tambah data buku");
            System.out.println("4. Ubah data buku");
            System.out.println("5. Hapus data buku");

            System.out.print("Pilihan Anda : ");
            String option = getUserInput();

            switch (option) {
                case "1":
                    showAllBooks();
                    break;
                case "2":
                    searchBooks();
                    break;
                case "3":
                    addBook();
                    break;
                case "4":
                    updateBookData();
                    break;
                case "5":
                    deleteBook();
                    break;
                default:
                    System.err.println("\nInput Anda tidak ditemukan. Silahkan pilih [1-5]");
            }

            retry = getYesOrNo("Apakah Anda ingin melanjutkan");
        }
    }

}