package com.Exception;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        Scanner userInput = new Scanner(System.in);
        System.out.print("Nilai array ke: ");
        int index = userInput.nextInt();
        FileInputStream fis = null;

        try {
            System.out.printf("index ke-%d, adalah %d", index, arr[index]);
            fis = new FileInputStream("coba.txt");
        } catch (ArrayIndexOutOfBoundsException arrEx){
            System.err.println("Index yang anda masukkan tidak sesuai dengan jumlah array");
        } catch (IOException ex){
            System.err.println(ex);
        } finally {
            System.out.println("Akhir dari program");
        }

    }
}
