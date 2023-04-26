package ProjectIseng;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class SuitJepang {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        String choice, suit;
        String comp, you;
        int compValue, guessValue, score;
        int chance = 0;
        compValue = random.nextInt(3);

        System.out.print("Apakah Anda ingin bermain (Ya/Tidak) ? ");
        choice = input.nextLine();
        if (choice.equalsIgnoreCase("ya")){
            countDown(3);
            while (chance < 3) {
                //Tebakan Angka Random
                System.out.println("\nMari kita bermain suit");
                System.out.println("#NOTES: \nangka '0' adalah Batu, \nangka '1' adalah Gunting, \nangka '2' adalah Kertas");
                System.out.print("Masukkan angka 0-2 untuk bermain : ");
                guessValue = input.nextInt();

                if(guessValue < 3){
                    comp = suit(compValue);
                    you = suit(guessValue);
                    chance++;
                    if (guessValue == compValue) {
                        draw(guessValue, compValue, chance);
                    }

                    if (chance == 1) {
                        playAgain(guessValue, compValue, chance);
                    } else if (chance == 2) {
                        playAgain(guessValue, compValue, chance);
                    } else if (chance == 3) {
                        gameOver(guessValue, compValue);
                    }

                    System.out.println();
                } else {
                    invalidInput();
                }
            }
        }

    }

    public static void playAgain(int guessValue, int compValue, int chance){
        System.out.println("Nilai tebakan anda = " + guessValue);
        System.out.println("Nilai yang benar adalah = " + compValue);
        System.out.println("KAMU SALAH!!!");
        System.out.println("KESEMPATAN KAMU TINGGAL " +(3-chance));
    }

    public static void invalidInput(){
        System.out.println("Nilai yang anda masukkan lebih dari 2");
        System.out.println("Silahkan masukkan angka lagi");
        System.out.println();
    }

    public static void gameOver(int guessValue, int compValue){
        System.out.println("Nilai tebakan anda = " + guessValue);
        System.out.println("Nilai yang benar adalah = " + compValue);
        System.out.println("KAMU SALAH!!!");
        System.out.println("KESEMPATAN KAMU SUDAH HABIS");
    }

    public static void draw(int guessValue, int compValue, int chance){
        String suit = null;
        if((guessValue == 0 || compValue == 0) || (guessValue == 0 && compValue == 0)){
            suit = "Batu";
        } else if ((guessValue == 1 || compValue == 1) || (guessValue == 1 && compValue == 1)){
            suit = "Gunting";
        } else {
            suit = "Kertas";
        }
        System.out.println("You         : " +suit);
        System.out.println("Computer    : " +suit);
        System.out.println("SERIII!!! COBA LAGI!!! KESEMPATAN KAMU TINGGAL " +(3-chance));
    }

    public static void countDown(int second){
        System.out.println("Loading...");
        while (second > 0){
            try {
                System.out.println(second);
                Thread.sleep(1000);
                second--;
            } catch (Exception ex){
                ex.printStackTrace();
            }
        }
    }

    public static List<String> suit(int guessValue, int compValue){
        List<String> results = new ArrayList<String>();

        if((guessValue == 0 || compValue == 0) || (guessValue == 0 && compValue == 0)){
            results.add(0, "Batu");
            results.add(1, "Batu");
        }
        if ((guessValue == 1 || compValue == 1) || (guessValue == 1 && compValue == 1)){
            results.add(0, "Gunting");
            results.add(1, "Gunting");
        }
        if ((guessValue == 2 || compValue == 2) || (guessValue == 2 && compValue == 2)){
            results.add(0, "Kertas");
            results.add(1, "Kertas");
        }
        return results;
    }

    public static String suit(int value){
        if(value == 0){
            return "Batu";
        } else if(value == 1){
            return "Gunting";
        } else {
            return "Kertas";
        }
    }
}
