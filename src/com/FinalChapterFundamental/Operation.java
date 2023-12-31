package com.FinalChapterFundamental;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.stream.Stream;

import static com.FinalChapterFundamental.Util.*;


public class Operation {

    public static void showAllBooks() {
        System.out.println("\n| No |\tTahun |\tPenulis                |\tPenerbit               |\tJudul Buku");
        System.out.println("----------------------------------------------------------------------------------------------------------");

        try (Stream<String> lines = Files.lines(Paths.get("database.txt"))) {
            final int[] lineNumber = {1};
            lines.forEach(line -> {
                String[] values = line.split(",");
                if (values.length >= 5) {
                    System.out.printf("| %2d ", lineNumber[0]);
                    System.out.printf("|\t%4s  ", values[1]);
                    System.out.printf("|\t%-20s   ", values[2]);
                    System.out.printf("|\t%-20s   ", values[3]);
                    System.out.printf("|\t%s   ", values[4]);
                    System.out.print("\n");
                    lineNumber[0]++;
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("----------------------------------------------------------------------------------------------------------");
    }

    public static void searchBooks() {
        try {
            File file = new File("database.txt");
            if (!file.exists()) {
                System.err.println("Database tidak ditemukan");
                System.err.println("Silahkan tambah data terlebih dahulu");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        System.out.print("Masukkan kata kunci untuk mencari buku: ");
        String searchString = getUserInput();
        String[] keywords = searchString.split("\\s+");
        checkDatabase(keywords, true);
    }

    public static void addBook() throws IOException {
        FileWriter fileOutput = new FileWriter("database.txt", true);
        BufferedWriter bufferOutput = new BufferedWriter(fileOutput);
        Scanner userInput = new Scanner(System.in);

        System.out.print("Masukan nama penulis: ");
        String author = getUserInput();
        System.out.print("Masukan judul buku: ");
        String title = getUserInput();
        System.out.print("Masukan nama penerbit: ");
        String publisher = getUserInput();
        System.out.print("Masukan tahun terbit, format=(YYYY): ");
        String year = getYear();

        String[] keywords = {year, author, publisher, title};
        System.out.println(Arrays.toString(keywords));

        boolean bookExists = checkDatabase(keywords, false);

        if (!bookExists) {
            long entryNumber = getEntryPerYear(author, year) + 1;

            String authorNoSpace = author.replaceAll("\\s+", "");
            String primaryKey = authorNoSpace + "_" + year + "_" + entryNumber;
            System.out.println("\nData yang akan Anda masukkan adalah");
            System.out.println("----------------------------------------");
            System.out.println("Primary key  : " + primaryKey);
            System.out.println("Tahun terbit : " + year);
            System.out.println("Penulis      : " + author);
            System.out.println("Judul        : " + title);
            System.out.println("Penerbit     : " + publisher);

            boolean isAdd = getYesOrNo("Apakah Anda ingin menambah data tersebut? ");

            if (isAdd) {
                bufferOutput.write(primaryKey + "," + year + "," + author + "," + publisher + "," + title);
                bufferOutput.newLine();
                bufferOutput.flush();
            }
        } else {
            System.out.println("Buku yang Anda akan masukkan sudah tersedia di database dengan data berikut:");
            checkDatabase(keywords, true);
        }

        bufferOutput.close();
    }

    public static void updateBookData() throws IOException {
        File database = new File("database.txt");
        FileReader fileInput = new FileReader(database);
        BufferedReader bufferedInput = new BufferedReader(fileInput);

        File tempDB = new File("tempDB.txt");
        FileWriter fileOutput = new FileWriter(tempDB);
        BufferedWriter bufferedOutput = new BufferedWriter(fileOutput);

        System.out.println("List Buku");
        showAllBooks();

        System.out.print("\nMasukan nomor buku yang akan diupdate: ");
        int updateNum = Integer.parseInt(getUserInput());

        String data = bufferedInput.readLine();
        int entryCounts = 0;

        while (data != null) {
            entryCounts++;
            StringTokenizer st = new StringTokenizer(data, ",");

            if (updateNum == entryCounts) {
                System.out.println("\nData yang ingin anda update adalah:");
                System.out.println("---------------------------------------");
                String reference = st.nextToken();
                String year = st.nextToken();
                String author = st.nextToken();
                String publisher = st.nextToken();
                String title = st.nextToken();
                System.out.println("Referensi           : " + reference);
                System.out.println("Tahun               : " + year);
                System.out.println("Penulis             : " + author);
                System.out.println("Penerbit            : " + publisher);
                System.out.println("Judul               : " + title);

                String[] fields = {"tahun", "penulis", "penerbit", "judul"};
                String[] updatedData = new String[4];

                st = new StringTokenizer(data, ",");
                st.nextToken(); // Melewati referensi

                for (int i = 0; i < fields.length; i++) {
                    boolean isUpdate = getYesOrNo("Apakah anda ingin merubah " + fields[i]);
                    String originalData = st.nextToken();

                    if (isUpdate) {
                        if (fields[i].equalsIgnoreCase("tahun")) {
                            System.out.print("masukan tahun terbit, format=(YYYY): ");
                            updatedData[i] = getYear();
                        } else {
                            System.out.print("\nMasukan " + fields[i] + " baru: ");
                            updatedData[i] = getUserInput();
                        }
                    } else {
                        updatedData[i] = originalData;
                    }
                }

                st = new StringTokenizer(data, ",");
                st.nextToken(); // Melewati referensi
                System.out.println("\nData baru anda adalah ");
                System.out.println("---------------------------------------");
                System.out.println("Tahun               : " + st.nextToken() + " --> " + updatedData[0]);
                System.out.println("Penulis             : " + st.nextToken() + " --> " + updatedData[1]);
                System.out.println("Penerbit            : " + st.nextToken() + " --> " + updatedData[2]);
                System.out.println("Judul               : " + st.nextToken() + " --> " + updatedData[3]);

                boolean isUpdate = getYesOrNo("Apakah anda yakin ingin mengupdate data tersebut");

                if (isUpdate) {
                    boolean dataExists = checkDatabase(updatedData, false);

                    if (dataExists) {
                        System.err.println("Data buku sudah ada di database, proses update dibatalkan. Silahkan hapus data yang bersangkutan.");
                    } else {
                        String updatedYear = updatedData[0];
                        String updatedAuthor = updatedData[1];
                        String updatedPublisher = updatedData[2];
                        String updatedTitle = updatedData[3];

                        long entryNumber = getEntryPerYear(updatedAuthor, updatedYear) + 1;

                        String authorNoSpace = updatedAuthor.replaceAll("\\s+", "");
                        String primaryKey = authorNoSpace + "_" + updatedYear + "_" + entryNumber;
                        bufferedOutput.write(primaryKey + "," + updatedYear + "," + updatedAuthor + "," + updatedPublisher + "," + updatedTitle);
                    }
                } else {
                    bufferedOutput.write(data);
                }
            } else {
                bufferedOutput.write(data);
            }
            bufferedOutput.newLine();
            data = bufferedInput.readLine();
        }

        bufferedOutput.flush();
        bufferedOutput.close();
        fileInput.close();
        fileOutput.close();

        if (database.delete()) {
            Path tempDBPath = tempDB.toPath();
            Path databasePath = database.toPath();
            Files.move(tempDBPath, databasePath, StandardCopyOption.REPLACE_EXISTING);
        } else {
            System.err.println("Gagal mengedit file 'database.txt'");
        }
    }

    public static void deleteBook() throws IOException {
        File database = new File("database.txt");
        FileReader fileInput = new FileReader(database);
        BufferedReader bufferedInput = new BufferedReader(fileInput);

        File tempDB = new File("tempDB.txt");
        FileWriter fileOutput = new FileWriter(tempDB);
        BufferedWriter bufferedOutput = new BufferedWriter(fileOutput);

        System.out.println("List Buku");
        showAllBooks();

        System.out.print("\nMasukkan nomor buku yang akan dihapus: ");
        int deleteNum = Integer.parseInt(getUserInput());

        boolean dataFound = false;
        int entryCounts = 0;

        String data = bufferedInput.readLine();

        while (data != null) {
            entryCounts++;
            boolean isDelete = false;

            StringTokenizer st = new StringTokenizer(data, ",");

            if (deleteNum == entryCounts) {
                System.out.println("\nData yang ingin anda hapus adalah:");
                System.out.println("-----------------------------------");
                String reference = st.nextToken();
                String year = st.nextToken();
                String author = st.nextToken();
                String publisher = st.nextToken();
                String title = st.nextToken();
                System.out.println("Referensi       : " + reference);
                System.out.println("Tahun           : " + year);
                System.out.println("Penulis         : " + author);
                System.out.println("Penerbit        : " + publisher);
                System.out.println("Judul           : " + title);

                isDelete = getYesOrNo("Apakah anda yakin akan menghapus?");
                dataFound = true;
            }

            if (isDelete) {
                System.out.println("Data berhasil dihapus");
            } else {
                bufferedOutput.write(data);
                bufferedOutput.newLine();
            }
            data = bufferedInput.readLine();
        }

        if (!dataFound) {
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
}
