package com.OperatorKomparasi;

public class Main {
    public static void main (String [] args){
        //operator komparasi . . . ini akan menghasilkan nilai dalam bentuk boolean
        int a,b;
        boolean hasilKomparasi;
        //operator equal atau persamaan
        a = 5;
        b = 10;
        hasilKomparasi = (a==b);
        System.out.println("Persamaan");
        System.out.printf("%d apakah sama dengan %d = %s \n",a,b,hasilKomparasi);

        //operator not equal atau pertidaksamaan
        System.out.println();
        System.out.println("Pertidaksamaan");
        boolean hasilKomparasiBaru = (a!=b);
        System.out.printf("%d != %d ---> %s \n",a,b,hasilKomparasiBaru);

        //operator greater than atau lebih dari
        System.out.println();
        System.out.println("Lebih dari");
        boolean hasilKomparasiBaruBanget = (a>b);
        System.out.printf("%d > %d ---> %s \n",a,b,hasilKomparasiBaruBanget);

        //operator less than atau kurang dari
        System.out.println();
        System.out.println("Kurang dari");
        boolean hasilKomparasiBaruBangetNih = (a<b);
        System.out.printf("%d < %d ---> %s \n",a,b,hasilKomparasiBaruBangetNih);
    }
}
