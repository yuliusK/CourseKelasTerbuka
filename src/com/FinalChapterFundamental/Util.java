package com.FinalChapterFundamental;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Year;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Util {

    public static long getEntryPerYear(String author, String year) {
        try (FileReader fileInput = new FileReader("database.txt");
             BufferedReader bufferInput = new BufferedReader(fileInput)) {

            long entry = 0;
            String data = bufferInput.readLine();

            while (data != null) {
                Scanner dataScanner = new Scanner(data);
                dataScanner.useDelimiter(",");
                String primaryKey = dataScanner.next();
                Scanner primaryKeyScanner = new Scanner(primaryKey);
                primaryKeyScanner.useDelimiter("_");

                author = author.replaceAll("\\s+", "");

                if (author.equalsIgnoreCase(dataScanner.next()) && year.equalsIgnoreCase(dataScanner.next())) {
                    entry = dataScanner.nextInt();
                }

                data = bufferInput.readLine();
            }
            return entry;
        } catch (IOException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static String getYear() {
        boolean yearIsValid = false;
        Scanner terminalInput = new Scanner(System.in);
        String yearInput;

        do {
            System.out.print("Masukan tahun terbit, format=(YYYY): ");
            yearInput = getUserInput();
            try {
                Year.parse(yearInput);
                yearIsValid = true;
            } catch (Exception e) {
                System.out.println("Format tahun yang anda masukan salah.");
            }
        } while (!yearIsValid);

        return yearInput;
    }

    public static boolean checkDatabase(String[] keywords, boolean isDisplay) {
        boolean dataExists = false;

        try (FileReader fileInput = new FileReader("database.txt");
             BufferedReader bufferInput = new BufferedReader(fileInput)) {

            String data = bufferInput.readLine();
            int dataNumber = 0;

            if (isDisplay) {
                System.out.println("\n| No |\tTahun |\tPenulis                |\tPenerbit               |\tJudul Buku");
                System.out.println("----------------------------------------------------------------------------------------------------------");
            }

            while (data != null) {
                dataExists = checkKeywordsInLine(data, keywords);

                if (dataExists) {
                    if (isDisplay) {
                        showData(++dataNumber, data);
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

        return dataExists;
    }

    public static boolean checkKeywordsInLine(String data, String[] keywords) {
        boolean dataExists = true;
        for (String keyword : keywords) {
            dataExists = dataExists && data.toLowerCase().contains(keyword.toLowerCase());
        }
        return dataExists;
    }

    public static void showData(int dataNumber, String data) {
        StringTokenizer stringToken = new StringTokenizer(data, ",");
        stringToken.nextToken();
        System.out.printf("| %2d ", dataNumber);
        System.out.printf("|\t%4s  ", stringToken.nextToken());
        System.out.printf("|\t%-20s   ", stringToken.nextToken());
        System.out.printf("|\t%-20s   ", stringToken.nextToken());
        System.out.printf("|\t%s   ", stringToken.nextToken());
        System.out.print("\n");
    }

    public static boolean getYesOrNo(String message) {
        Scanner userInput = new Scanner(System.in);
        String option;
        do {
            System.out.print("\n" + message + " (y/n) : ");
            option = userInput.next();
        } while (!option.equalsIgnoreCase("y") && !option.equalsIgnoreCase("n"));
        return option.equalsIgnoreCase("y");
    }

    public static void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            System.err.println("Tidak bisa membersihkan layar.");
        }
    }

    public static String getUserInput() {
        Scanner userInput = new Scanner(System.in);
        return userInput.nextLine();
    }
}
