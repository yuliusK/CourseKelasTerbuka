package com.FinalChapterFundamental;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.time.Year;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner userInput = new Scanner(System.in);
        String option;
        boolean retry = true;

        while(retry){
//            clearScreen();
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
                    showData();
                }
                case "2" -> {
                    System.out.println("\n=========");
                    System.out.println("CARI BUKU");
                    System.out.println("=========");
                    search();
                }
                case "3" -> {
                    System.out.println("\n================");
                    System.out.println("TAMBAH DATA BUKU");
                    System.out.println("================");
                    add();
                    showData();
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
                    deleteData();
                }
                default -> System.err.println("\n Input Anda tidak ditemukan \n Silahkan pilih [1-5]");
            }

            retry = getYesorNo("Apakah Anda ingin melanjutkan");

        }

    }

    private static void showData(){

        System.out.println("\n| No |\tTahun |\tPenulis                |\tPenerbit               |\tJudul Buku");
        System.out.println("----------------------------------------------------------------------------------------------------------");
        try (Stream<String> lines = Files.lines(Paths.get("database.txt"))) {
            final int[] lineNumber = {1};
            lines.forEach(line -> {
                String[] values = line.split(",");
                if (values.length >= 5) {
                    System.out.printf("| %2d ", lineNumber[0]++);
                    System.out.printf("|\t%4s  ", values[1]);
                    System.out.printf("|\t%-20s   ", values[2]);
                    System.out.printf("|\t%-20s   ", values[3]);
                    System.out.printf("|\t%s   ", values[4]);
                    System.out.print("\n");
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("----------------------------------------------------------------------------------------------------------");
    }

    private static void search(){
        try {
            File file = new File("database.txt");
            if(!file.exists()){
                System.err.println("Database tidak ditemukan");
                System.err.println("Silahkan tambah data terlebih dahulu");
            }
        } catch (Exception e){
            e.printStackTrace();
            return;
        }

        Scanner terminalInput = new Scanner(System.in);
        System.out.println("Masukkan kata kunci untuk mencari buku:");
        String cariString = terminalInput.nextLine();
        String[] keywords = cariString.split("\\s+");
        checkDatabase(keywords,true);
    }

    private static void add() throws IOException{

        FileWriter fileOutput = new FileWriter("database.txt",true);
        BufferedWriter bufferOutput = new BufferedWriter(fileOutput);

        // mengambil input dari user
        Scanner terminalInput = new Scanner(System.in);
        String penulis, judul, penerbit, tahun;

        System.out.print("Masukan nama penulis: ");
        penulis = terminalInput.nextLine();
        System.out.print("Masukan judul buku: ");
        judul = terminalInput.nextLine();
        System.out.print("Masukan nama penerbit: ");
        penerbit = terminalInput.nextLine();
        System.out.print("Masukan tahun terbit, format=(YYYY): ");
        tahun = getYear();

        // cek buku di database
        String[] keywords = {tahun+","+penulis+","+penerbit+","+judul};
        System.out.println(Arrays.toString(keywords));

        boolean isExist = checkDatabase(keywords,false);

        // menulis buku di databse
        if (!isExist){
            long nomorEntry = ambilEntryPerTahun(penulis, tahun) + 1;

            String penulisTanpaSpasi = penulis.replaceAll("\\s+", "");
            String primaryKey = penulisTanpaSpasi + "_" + tahun + "_" + nomorEntry;
            System.out.println("\nData yang akan Anda masukkan adalah");
            System.out.println("----------------------------------------");
            System.out.println("Primary key  : " + primaryKey);
            System.out.println("Tahun terbit : " + tahun);
            System.out.println("Penulis      : " + penulis);
            System.out.println("Judul        : " + judul);
            System.out.println("Penerbit     : " + penerbit);

            boolean isTambah = getYesorNo("Apakah Anda ingin menambah data tersebut? ");

            if (isTambah) {
                bufferOutput.write(primaryKey + "," + tahun + "," + penulis + "," + penerbit + "," + judul);
                bufferOutput.newLine();
                bufferOutput.flush();
            }
        } else {
            System.out.println("Buku yang Anda akan masukkan sudah tersedia di database dengan data berikut:");
            checkDatabase(keywords, true);
        }
        bufferOutput.close();
    }

    private static long ambilEntryPerTahun(String penulis, String tahun) {
        try(FileReader fileInput = new FileReader("database.txt");
            BufferedReader bufferInput = new BufferedReader(fileInput)) {

            long entry = 0;
            String data = bufferInput.readLine();

            while (data != null) {
                Scanner dataScanner = new Scanner(data);
                dataScanner.useDelimiter(",");
                String primaryKey = dataScanner.next();
                Scanner primaryKeyScanner = new Scanner(primaryKey);
                primaryKeyScanner.useDelimiter("_");

                penulis = penulis.replaceAll("\\s+", "");

                if (penulis.equalsIgnoreCase(dataScanner.next()) && tahun.equalsIgnoreCase(dataScanner.next())) {
                    entry = dataScanner.nextInt();
                }

                data = bufferInput.readLine();
            }
            return entry;
        } catch (IOException e){
            e.printStackTrace();
            return 0;
        }
    }

    private static String getYear(){
        boolean yearIsValid = false;
        Scanner terminalInput = new Scanner(System.in);
        String yearInput = terminalInput.nextLine();
        while(!yearIsValid) {
            try {
                Year.parse(yearInput);
                yearIsValid = true;
            } catch (Exception e) {
                System.out.println("Format tahun yang anda masukan salah, format=(YYYY)");
                System.out.print("silahkan masukan tahun terbit lagi: ");
                yearIsValid = false;
                yearInput = terminalInput.nextLine();
            }
        }

        return yearInput;
    }

    private static boolean checkDatabase(String[] keywords, boolean isDisplay) {
        boolean isExist = false;

        try(FileReader fileInput = new FileReader("database.txt");
        BufferedReader bufferInput = new BufferedReader(fileInput)) {

            String data = bufferInput.readLine();
            int nomorData = 0;

            if(isDisplay){
                System.out.println("\n| No |\tTahun |\tPenulis                |\tPenerbit               |\tJudul Buku");
                System.out.println("----------------------------------------------------------------------------------------------------------");
            }

            while (data != null) {
                isExist = checkKeywordsInLine(data, keywords);

                if (isExist) {
                    if (isDisplay) {
                        showData(++nomorData, data);
                    } else {
                        break;
                    }
                }

                data = bufferInput.readLine();
            }
            if (isDisplay) {
                System.out.println("----------------------------------------------------------------------------------------------------------");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return isExist;
    }

    private static void deleteData() throws IOException {
        File database = new File("database.txt");
        FileReader fileInput = new FileReader(database);
        BufferedReader bufferedInput = new BufferedReader(fileInput);

        File tempDB = new File("tempDB.txt");
        FileWriter fileOutput = new FileWriter(tempDB);
        BufferedWriter bufferedOutput = new BufferedWriter(fileOutput);

        System.out.println("List Buku");
        showData();

        Scanner terminalInput = new Scanner(System.in);
        System.out.print("\nMasukkan nomor buku yang akan dihapus: ");
        int deleteNum = terminalInput.nextInt();

        boolean isFound = false;
        int entryCounts = 0;

        String data = bufferedInput.readLine();

        while (data != null) {
            entryCounts++;
            boolean isDelete = false;

            StringTokenizer st = new StringTokenizer(data, ",");

            if (deleteNum == entryCounts) {
                System.out.println("\nData yang ingin anda hapus adalah:");
                System.out.println("-----------------------------------");
                System.out.println("Referensi       : " + st.nextToken());
                System.out.println("Tahun           : " + st.nextToken());
                System.out.println("Penulis         : " + st.nextToken());
                System.out.println("Penerbit        : " + st.nextToken());
                System.out.println("Judul           : " + st.nextToken());

                isDelete = getYesorNo("Apakah anda yakin akan menghapus?");
                isFound = true;
            }

            if (isDelete) {
                System.out.println("Data berhasil dihapus");
            } else {
                bufferedOutput.write(data);
                bufferedOutput.newLine();
            }
            data = bufferedInput.readLine();
        }

        if (!isFound) {
            System.err.println("Buku tidak ditemukan");
        }

        bufferedOutput.close();
        fileInput.close();
        fileOutput.close();

        if (database.delete()) {
            Path tempDBPath = tempDB.toPath();
            Path databasePath = database.toPath();
            Files.move(tempDBPath, databasePath, StandardCopyOption.REPLACE_EXISTING);
        } else {
            System.err.println("Gagal menghapus file 'database.txt'");
        }

    }

    private static boolean checkKeywordsInLine(String data, String[] keywords) {
        boolean isExist = true;
        for (String keyword : keywords) {
            isExist = isExist && data.toLowerCase().contains(keyword.toLowerCase());
        }
        return isExist;
    }

    private static void showData(int nomorData, String data) {
        StringTokenizer stringToken = new StringTokenizer(data, ",");
        stringToken.nextToken();
        System.out.printf("| %2d ", nomorData);
        System.out.printf("|\t%4s  ", stringToken.nextToken());
        System.out.printf("|\t%-20s   ", stringToken.nextToken());
        System.out.printf("|\t%-20s   ", stringToken.nextToken());
        System.out.printf("|\t%s   ", stringToken.nextToken());
        System.out.print("\n");
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
