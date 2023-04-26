package com.OperatorBitwise;

public class Main {
    public static void main (String [] args) {
        //operator Bitwise --> Operator untuk melakukan operasi pada nilai bit

        byte a = 3;
        byte b, c;
        String a_bits, b_bits, c_bits;

        //Operator Shift Left
        System.out.println("===== SHIFT LEFT (<<) =====");
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d \n", a_bits,a);
        b = (byte) (a<<2);
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ','0');
        System.out.printf("%s = %d \n", b_bits,b);

        //Operator Shift Right
        System.out.println();
        System.out.println("===== SHIFT RIGHT (>>) =====");
        a = 12;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d \n", a_bits,a);
        b = (byte) (a>>3);
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ','0');
        System.out.printf("%s = %d \n", b_bits,b);

        //Operator OR
        System.out.println();
        System.out.println("===== BITWISE OR (|) =====");
        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d \n", a_bits,a);
        b = 12;
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ','0');
        System.out.printf("%s = %d \n", b_bits,b);
        System.out.println("----------------------OR");
        c = (byte) (a|b);
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(' ','0');
        System.out.printf("%s = %d \n", c_bits,c);

        //Operator AND
        System.out.println();
        System.out.println("===== BITWISE AND (&) =====");
        a = 3;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d \n", a_bits,a);
        b = 7;
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ','0');
        System.out.printf("%s = %d \n", b_bits,b);
        System.out.println("---------------------AND");
        c = (byte) (a&b);
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(' ','0');
        System.out.printf("%s = %d \n", c_bits,c);

        //Operator XOR
        System.out.println();
        System.out.println("===== BITWISE XOR (^) =====");
        a = 1;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d \n", a_bits,a);
        b = 3;
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ','0');
        System.out.printf("%s = %d \n", b_bits,b);
        System.out.println("---------------------XOR");
        c = (byte) (a^b);
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(' ','0');
        System.out.printf("%s = %d \n", c_bits,c);

        //Operator Negasi / Not
        System.out.println();
        System.out.println("===== BITWISE NOT (~) =====");
        a = 24;
        b = (byte) (~a);
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d \n", a_bits,a);
        System.out.println("---------------------NOT");
        b_bits = String.format("%8s", Integer.toBinaryString(b)).substring(24);
        System.out.printf("%s = %d \n", b_bits,b);
    }
}

