package com.KonversiData;

public class Main {
    public static void main (String [] args) {
        //program untuk konversi data

        int NilaiInt = 256;
        System.out.println("Nilai int = " +NilaiInt);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Byte.MAX_VALUE);

        //memperluas rentang ke tipe data yang lebih besar
        long nilaiLong = NilaiInt;
        System.out.println("Nilai Long = "+nilaiLong);

        //memperkecil rentang ke tipe data yang lebih kecil
        byte nilaiByte = (byte) NilaiInt; //jika mau memperkecil rentang harus melakukan casting = "(tipedatayanglebihkecil)"
        System.out.println("Nilai Byte = " +nilaiByte);

        /*
            memperkecil rentang akan menghilangkan nilai asli
            jika nilai yang di konversi melebih nilai maximal
            contoh: nilai maximal int = 2147483647 nilai tersebut lebih besar dari nilai maximum byte = 127
            jika nilai yang ditentukan adalah 256 (integer) maka nilai tersebut jika dikonversi ke tipe data byte akan berubah menjadi 0
            karena nilai tersebut akan melakukan perulangan kembali (Muter)
        */

        //casting pembagian
        int a = 5;
        int b = 2;
        float c = a/b;

        System.out.printf("%d / %d = %f \n",a,b,c);

        /*
            jika ingin melakukan pembagian seperti diatas maka cara yang tepat adalah
            mengubah salah satu variabel (antara variabel a dan b) menjadi float
        */

        float j = 10;
        int k = 3;
        float l = j/k;

        System.out.printf("%f / %d = %f \n",j,k,l);

        // atau bisa juga menggunakan casting seperti dibawah ini

        int x = 13;
        int y = 26;
        float z = (float) x/y;

        System.out.printf("%d / %d = %f \n",x,y,z);
    }
}
