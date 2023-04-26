package ProjectIseng;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        Scanner input = new Scanner(System.in);
        String choice;
        int nilaiBenar, nilaiTebakan, count;
        nilaiBenar = random.nextInt(3);
        int kesempatan = 0;

        System.out.println("Apakah Anda ingin bermain? (Ya/Tidak)");
        choice = input.nextLine();

        if(choice.equalsIgnoreCase("YA")){
            count = 3;
            while (count > 0){
                try {
                    System.out.println(count);
                    Thread.sleep(1000);
                    count--;
                } catch (Exception ex){
                    ex.printStackTrace();
                }
            }
            while (kesempatan < 3) {
                //Tebakan Angka Random
                System.out.println("Tebak angka dari 0 - 2!!!");
                System.out.print("Nilai tebakan anda adalah ");
                nilaiTebakan = input.nextInt();

                boolean hasil= nilaiBenar == nilaiTebakan;
                kesempatan++;
                if(nilaiTebakan <= 2){
                    if (nilaiBenar == nilaiTebakan) {
                        System.out.println("Nilai tebakan anda = " + hasil);
                        System.out.println("Nilai yang benar adalah = " + nilaiBenar);
                        System.out.println("KAMU MENANG!!!");
                        break;
                    }

                    if (kesempatan == 1) {
                        System.out.println("Nilai tebakan anda = " + hasil);
                        System.out.println("Nilai yang benar adalah = " + nilaiBenar);
                        System.out.println("KAMU SALAH!!!");
                        System.out.println("KESEMPATAN KAMU TINGGAL " +(3-kesempatan));
                    }

                    if (kesempatan == 2) {
                        System.out.println("Nilai tebakan anda = " + hasil);
                        System.out.println("Nilai yang benar adalah = " + nilaiBenar);
                        System.out.println("KAMU SALAH!!!");
                        System.out.println("KESEMPATAN KAMU TINGGAL " +(3-kesempatan));
                    }

                        if (kesempatan == 3) {
                            System.out.println("Nilai tebakan anda = " + hasil);
                            System.out.println("Nilai yang benar adalah = " + nilaiBenar);
                            System.out.println("KAMU SALAH!!!");
                            System.out.println("KESEMPATAN KAMU SUDAH HABIS");
                        }

                        System.out.println();
                    } else {
                        System.out.println("Nilai yang anda masukkan lebih dari 2");
                    }
                }
            }
    }
}
