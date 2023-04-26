package com.OperatorLogika;

public class Main {
    public static void main (String [] args){
        //Operator Logika adalah operasi yang bisa kita lakukan pada tipe data boolean
        // AND, OR, XOR, Negasi

        boolean a,b,c;
        // OR / atau )||)

        System.out.println("====== OR (||) ======");
        a = false;
        b = false;
        c = (a||b);
        System.out.println(a + " || " +b+ " = " +c);
        a = false;
        b = true;
        c = (a||b);
        System.out.println(a + " || " +b+ " = " +c);
        a = true;
        b = false;
        c = (a||b);
        System.out.println(a + " || " +b+ " = " +c);
        a = true;
        b = true;
        c = (a||b);
        System.out.println(a + " || " +b+ " = " +c);
        System.out.println("=====================");
        System.out.println();

        System.out.println("====== AND (&&) ======");
        a = false;
        b = false;
        c = (a&&b);
        System.out.println(a + " && " +b+ " = " +c);
        a = false;
        b = true;
        c = (a&&b);
        System.out.println(a + " && " +b+ " = " +c);
        a = true;
        b = false;
        c = (a&&b);
        System.out.println(a + " && " +b+ " = " +c);
        a = true;
        b = true;
        c = (a&&b);
        System.out.println(a + " && " +b+ " = " +c);
        System.out.println("=====================");
        System.out.println();

        System.out.println("====== XOR (^) ======");
        a = false;
        b = false;
        c = (a^b);
        System.out.println(a + " ^ " +b+ " = " +c);
        a = false;
        b = true;
        c = (a^b);
        System.out.println(a + " ^ " +b+ " = " +c);
        a = true;
        b = false;
        c = (a^b);
        System.out.println(a + " ^ " +b+ " = " +c);
        a = true;
        b = true;
        c = (a^b);
        System.out.println(a + " ^ " +b+ " = " +c);
        System.out.println("=====================");
        System.out.println();

        System.out.println("====== NEGASI (!) ======");
        a = false;
        c = !a;
        System.out.println(a + " = " +c);
        a = true;
        c = !a;
        System.out.println(a + " = " +c);
        System.out.println("=====================");
    }
}
