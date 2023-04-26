package com.TipeData;

public class Main {
    public static void main (String [] args) {
        /*
        tipe data primitve di Java:
        byte, short, integer, long, double, float, char, boolean

        tipe data primitive = nilai maximum dan minimumnya  sudah di tentukan dari sistem
         */

        //SATUAN BYTE
        byte b = 10;
        System.out.println();
        System.out.println("nilai b = " +(b+1));
        System.out.println("nilai maksimal byte = " +Byte.MAX_VALUE);
        System.out.println("nilai minimum byte = " +Byte.MIN_VALUE);
        System.out.println("Besar nilai byte = "+Byte.BYTES+ " bytes");
        System.out.println("Besar nilai byte = "+Byte.SIZE+ " bit");

        //SATUAN SHORT
        short s = 10;
        System.out.println();
        System.out.println("nilai s = " +(s+1));
        System.out.println("nilai maksimal short = " +Short.MAX_VALUE);
        System.out.println("nilai minimum short = " +Short.MIN_VALUE);
        System.out.println("Besar nilai short = "+Short.BYTES+ " bytes");
        System.out.println("Besar nilai short = "+Short.SIZE+ " bit");

        //SATUAN INTEGER
        int i = 2147483647;
        System.out.println("nilai i = " +(i+1));
        System.out.println("nilai maksimal integer = " +Integer.MAX_VALUE);
        System.out.println("nilai minimum integer = " +Integer.MIN_VALUE);
        System.out.println("Besar nilai integer = "+Integer.BYTES+ "bytes");
        System.out.println("Besar nilai integer = "+Integer.SIZE+ "bit");

        //jika nilai di dalam variable lebih besar dari nilai maksimal maka nilai tersebut akan mengulang kembali ke nilai minimum

        //SATUAN LONG
        long l = 10L; //huruf L untuk membedakan bahwa nilai tersebut adalah tipe data long
        System.out.println();
        System.out.println("nilai l = " +(l+1));
        System.out.println("nilai maksimal long = " +Long.MAX_VALUE);
        System.out.println("nilai minimum long = " +Long.MIN_VALUE);
        System.out.println("Besar nilai long = "+Long.BYTES+ " bytes");
        System.out.println("Besar nilai long = "+Long.SIZE+ " bit");

        //Double (bilangan Real)
        double d = 10.5d; //huruf d untuk membedakan bahwa nilai tersebut adalah tipe data double
        System.out.println();
        System.out.println("nilai d = " +(d+1));
        System.out.println("nilai maksimal double = " +Double.MAX_VALUE);
        System.out.println("nilai minimum double = " +Double.MIN_VALUE);
        System.out.println("Besar nilai double = "+Double.BYTES+ " bytes");
        System.out.println("Besar nilai double = "+Double.SIZE+ " bit");

        //Float (bilangan Real)
        float f = 10.7f; //huruf f untuk membedakan bahwa nilai tersebut adalah tipe data float
        System.out.println();
        System.out.println("nilai f = " +(f+1));
        System.out.println("nilai maksimal float = " +Float.MAX_VALUE);
        System.out.println("nilai minimum float = " +Float.MIN_VALUE);
        System.out.println("Besar nilai float = "+Float.BYTES+ " bytes");
        System.out.println("Besar nilai float = "+Float.SIZE+ " bit");

        //Char (karakter ASCII)
        char c = 'c';
        System.out.println();
        System.out.println("nilai c = " +(c));
        System.out.println("nilai maksimal char = " +Character.MAX_VALUE);
        System.out.println("nilai minimum char = " +Character.MIN_VALUE);
        System.out.println("Besar nilai char = "+Character.BYTES+ " bytes");
        System.out.println("Besar nilai char = "+Character.SIZE+ " bit");

        //boolean (Nilai true atau false)
        boolean bl = true;
        System.out.println();
        System.out.println("nilai boolean = " +(bl));

        /*
        boolean tidak memiliki nilai maksimal ataupun nilai minimal karena nilai boolean hanya "true" dan "false"
        boolean hanya memiliki besaran 1 bit

        System.out.println("nilai maksimal boolean = " +Boolean.MAX_VALUE);
        System.out.println("nilai minimum boolean = " +Boolean.MIN_VALUE);
        System.out.println("Besar nilai boolean = "+Boolean.BYTES+ " bytes");
        System.out.println("Besar nilai boolean = "+Boolean.SIZE+ " bit");
         */



    }
}
