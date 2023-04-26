package com.StreamCharacter;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        //byte stream => FileInputReader
        FileInputStream byteFileInput = new FileInputStream("testCharFile.txt");
        FileOutputStream byteFileOutput = new FileOutputStream("outputByteFile.txt");
        //character stream => FileReader
        FileReader charFileInput = new FileReader("testCharFile.txt");
        FileWriter charFileOutput = new FileWriter("outputCharFile.txt");

        int buffer = byteFileInput.read();
        while(buffer != -1){
            System.out.print((char) buffer);
            byteFileOutput.write(buffer);
            buffer = byteFileInput.read();
        }

        System.out.println("\n");
        buffer = charFileInput.read();
        while(buffer != -1){
            System.out.print((char) buffer);
            charFileOutput.write(buffer);
            buffer = charFileInput.read();
        }

        byteFileInput.close();
        charFileInput.close();
        byteFileOutput.close();
        charFileOutput.close();
    }
}
