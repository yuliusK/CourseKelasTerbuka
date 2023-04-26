package com.StreamIO;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //membaca Isi File dengan readAllLines
        try{
            List<String> lines = Files.readAllLines(Paths.get("input.txt"));
            for (String isi : lines){
                System.out.println(isi);
            }
        } catch (Exception ex){
            System.err.println(ex);
        }
    }
}
