package com.StreamByte;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        File file = null;
        System.out.println(file);

        FileReader read = new FileReader("input.txt");
        br = new BufferedReader(read);
        String text = null;
        while ((text = br.readLine()) != null){
            System.out.println(text);
            br.close();
            read.close();

            read = new FileReader("input_2.txt");
            br = new BufferedReader(read);
            System.out.println(br.readLine());
        }

        //cara lain untuk read text, dibuat dengan read satupercatu (menggunakan char karena yang diread berupa int)
        System.out.println("\nCara kedua untuk read file");
        FileInputStream fileInput = new FileInputStream("inputKetiga.txt");
        int check = fileInput.read();
        while (check != -1){
            System.out.print((char)check);
            check = fileInput.read();
        }

        try (FileInputStream in = new FileInputStream("input.txt")){
            FileOutputStream fileOutput = new FileOutputStream("output.txt");
            int buffer = in.read();
            fileOutput.write(buffer);
        }
    }
}
