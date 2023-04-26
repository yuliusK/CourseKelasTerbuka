package com.LoopingBersarang;

public class Main {
    public static void main (String [] args){

        System.out.println("BIKIN SEGITIGA KAYAK KULIAHAN");
        System.out.println();

        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                System.out.print(i+j+" ");
            }
            System.out.print("\n");
        }

        System.out.println();

        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        System.out.println();

        for (int i = 0; i < 5; i++){
            for (int j = 0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                System.out.print("* ");
                if (i+j == 4){
                    break;
                }
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){
                System.out.print("* ");

                if (i == j){
                    break;
                }

                if (i+j == 8){
                    break;
                }

            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                if (i+j < 4){
                    System.out.print(" ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                if (i>j){
                    System.out.print(" ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                if (i+j < 4){
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                if (i > j){
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){
                if ((i+j<4)||((i-j>=5)&&(i-j<=8))){
                    System.out.print("   ");
                }else if((j-5==i)||(i+j>12)){
                    break;
                }else {
                    System.out.print(" * ");
                }
            }
            System.out.println();

        }
    }
}
