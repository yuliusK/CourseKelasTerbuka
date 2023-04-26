package com.ExceptionMethod;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] arr = {0,1,2,3,4};
        Scanner userInput = new Scanner(System.in);
        System.out.print("Masukkan data: ");
        int indexInput = userInput.nextInt();

        try {
            int data = handler(arr, indexInput);
            System.out.println(data);
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }

    private static int handler(int[] arr, int idx) throws Exception{
        return arr[idx-1];
    }

}
