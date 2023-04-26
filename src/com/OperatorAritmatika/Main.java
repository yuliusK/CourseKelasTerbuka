package com.OperatorAritmatika;

public class Main {
    public static void main (String [] args){
        int a = 13;
        int b = 26;
        int hasil;

        //Penjumlahan
        hasil = a + b;
        System.out.println(a + " + " + b + " = " + hasil);

        //Pengurangan
        hasil = a - b;
        System.out.println(a + " - " + b + " = " + hasil);

        //Perkalian
        hasil = a * b;
        System.out.println(a + " x " + b + " = " + hasil);

        //Pembagian
        hasil = a / b;
        System.out.printf("%d / %d = %d \n", a, b, hasil);

        float x = 4;
        float y = 7;
        float hasilFloat = x / y;
        System.out.println(x + " / " + y + " = " + hasilFloat);

        //modulus
        hasil = a / b;
        System.out.printf("%d %% %d = %d \n", a, b, hasil);
    }
}
