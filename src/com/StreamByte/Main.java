package com.StreamByte;

import java.io.*;
import java.nio.Buffer;
import java.util.Arrays;

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

        //cara lain untuk read text, dibuat dengan read satupersatu (menggunakan char karena yang diread berupa int)
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

        // test read data in array
        FileReader readFile = new FileReader("input.txt");
        BufferedReader buffer = new BufferedReader( readFile);
        buffer.mark(255);
        char[] dataChar = new char[22];
        buffer.read(dataChar, 0, 22);
        System.out.println("\n\nRead data using array");
        System.out.println("=> "+ Arrays.toString(dataChar));

        //untuk mengulang text yang di read dari awal
        buffer.reset();

        FileWriter write = new FileWriter("testingWriter.txt");
        BufferedWriter bw = new BufferedWriter(write);
        String textWrite = buffer.readLine();
        bw.newLine();
        bw.write(textWrite, 0, textWrite.length());
        bw.flush();
    }
}
