package com.StringFormat;

import java.util.Formatter;

public class main {
    public static void main(String[] args) {
        String nama = "Udin";
        int umur = 17;

        //String Format
        // note :
        // s = String, f = floating point, d = Integer, c = Character, b = boolean
        System.out.printf("Nama saya adalah %s, umur saya adalah %d", nama, umur);

        //Struktur format = %[argumen_index$][flags][width][.precision]conversion
        //%[argumen_index$]
        System.out.println("\n\nargumen_index ");
        System.out.printf("%1$s, wahai %1$s, kemana saja kamu %1$s?\n", nama);
        System.out.printf("\numur %1$s berapa?, %1$s menjawab: %2$d\n", nama, umur);

        //[flags]
        System.out.println("\n[flags]");
        int a = 5;
        int b = 8;
        int hasil = a + b;
        System.out.printf("%d + %d = %+d",a, b, hasil);

        //[width]
        System.out.println("\n\n[width]"); //jumlah karakter akan bertambah sesuai yang ditentukan,

        int c = 1000;
        System.out.printf("%d\n", c);
        System.out.printf("%5d\n", c); // jika tidak ada, maka akan rata kanan
        System.out.printf("%-5d\n", c); // jika ada simbol (-), akan rata kiri
        System.out.printf("%+5d\n", c); // jika ada simbol (+), flags akan mengambil slot di dalam format
        System.out.printf("%+-6d\n", c); // flags bisa digabungkan
        System.out.printf("%010d\n", c); //flags = 0, menambahkan leading 0
        int d = 1000000000;
        System.out.printf("%-,15d\n", d); //flags = ",", menandakan delimeter atau menambahkan "," di dalam angka

        System.out.println("\nFloating Point");
        float f = 1.5432f;
        System.out.printf("%f\n", f);
        System.out.printf("%10f\n", f);

        //[.precision]
        System.out.println("\n\n[.precision]");
        float f2 = 15.567f;
        System.out.printf("%f\n", f2);
        System.out.printf("%.1f\n", f2);
        System.out.printf("%.2f\n", f2);
        System.out.printf("%8.2f\n", f2);

        String namaBaru = "Ucup";
        float IPK = 3.7835953f;
        System.out.printf("\nIPK %1$s berapa ? \n%1$s : %2$+5.2f", namaBaru, IPK);

        //Kesimpulan
        //save format ke dalam variabel
        String info = String.format("\nNama : %s, IPK : %2$+5.2f", namaBaru, IPK);
        System.out.println("\nString Format " + info);

        //save ke dalam String Builder
        StringBuilder builder_info = new StringBuilder();
        Formatter formatBuilder = new Formatter(builder_info);
        formatBuilder.format(info);
        System.out.println("Builder format " +builder_info);
    }
}
