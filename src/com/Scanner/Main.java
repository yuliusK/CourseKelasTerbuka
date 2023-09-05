package com.Scanner;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("input.txt");
        BufferedReader br = new BufferedReader(reader);

        Scanner inputUser = new Scanner(br);
        System.out.println(inputUser.nextLine());

        reader = new FileReader("testFileScanner.txt");
        br = new BufferedReader(reader);
        br.mark(200);
        br.reset();

        inputUser = new Scanner(br);
        inputUser.useDelimiter(",");

        while(inputUser.hasNext()){
            System.out.print(inputUser.next() + " ");
        }

        br.reset();
        System.out.println("\n\nRead text File using String Tokenizer");
        //jika ada dua baris dan ingin membaca baris pertama saja, gunakan StringTokenizer
        StringTokenizer token = new StringTokenizer(br.readLine(), ",");
        while(token.hasMoreTokens()){
            System.out.print(token.nextToken() + " ");
        }

    }
}
