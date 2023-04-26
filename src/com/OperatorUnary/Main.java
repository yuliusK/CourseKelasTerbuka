package com.OperatorUnary;

public class Main {
    public static void main (String [] args){
        //unary = operasi yang dilakukan pada satu variable

        //unary + dan -
        int a = 10;
        System.out.printf("Unary '+', %d menjadi %d \n",a,+a);
        System.out.printf("Unary '-', %d menjadi %d \n",a,-a);

        //unary decrement (pengurangan 1 angka) dan increment (penambahan 1 angka)

        //increment
        int b = 7;
        b++;
        System.out.println("Nilai dengan '++' menjadi = " +b);

        //decrement
        int c = b;
        c--;
        System.out.println("Nilai dengan '--' menjadi = " +c);

        int d = 26;
        System.out.printf("Nilai dengan '++' prefix menjadi = %d \n", ++d);
        //nilai dieksekusi terlebih dahulu karena simbol '++' ada di depan, jadi nya 26+1=27

        int e = 13;
        System.out.printf("Nilai dengan '++' postfix menjadi = %d \n", e++);
        //nilai dieksekusi belakangan karena simbol '++' ada di belakang. Nilai akan berubah setelah pemanggilan nilai yang selanjutnya
        System.out.printf("Nilai hasil dari postfix = %d \n", e);

        boolean bolen = true;
        System.out.println("Nilai boolean = " +bolen);
        System.out.println("Nilai boolean = " +!bolen);
    }
}
