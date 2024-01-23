package OOP.Reflection.FieldAndAtribute.main;

import OOP.Reflection.FieldAndAtribute.hero.HeroAgility;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        HeroAgility hero1 = new HeroAgility("Mimosa", 100);

        //access modifier
        hero1.nickname = "Mimo";
        hero1.displayAll();
//        hero1.heroType = "Intel"; //tidak bisa dilakukan karena private
//        hero1.name = "Noelle"

        //Reflection
        Class<?> classHero1 = hero1.getClass();
        Class<?> parentClassHero1 = hero1.getClass().getSuperclass();
        System.out.println("\nClass : " +classHero1.getName());
        System.out.println("Parent Class : " +parentClassHero1);

        //cek atribut dari object hero 1
        System.out.println("\natribut dari object hero1");
        Field[] hero1Fields = classHero1.getFields();
        System.out.println("Jumlah atribut adalah : " +hero1Fields.length);
        System.out.println("Atribut : "+ hero1Fields[0].getName());//cek atribut dari object hero 1

        //cek semua atribut dari object hero 1
        System.out.println("\nsemua atribut dari parent object");
        Field[] heroAllFields = classHero1.getDeclaredFields();
        System.out.println("Jumlah atribut adalah : " +heroAllFields.length);

        for (Field field : heroAllFields){
            System.out.println("Atribut : "+ field.getName());
        }

        //cek semua atribut dari parent hero 1
        System.out.println("\nsemua atribut dari object hero1");
        Field[] parentHeroFields = parentClassHero1.getDeclaredFields();
        System.out.println("Jumlah atribut adalah : " +parentHeroFields.length);

        for (Field field : parentHeroFields){
            System.out.println("Atribut : "+ field.getName());
        }

        //ubah nilai dengan reflection
        System.out.println("\n>>>>> ubah");
        hero1.displayAll();
        System.out.println(">>>>> menjadi");
        try {
            //merubah public biasa
            heroAllFields[0].set(hero1, "Momo");

            //merubah private
            heroAllFields[1].setAccessible(true);
            heroAllFields[1].set(hero1, "Strength");
//            hero1.heroType = "intel"; //tidak bisa digunakan. hanya bisa digunakan menggunakan class Reflection

            parentHeroFields[0].setAccessible(true);
            parentHeroFields[0].set(hero1, "Noelle");
            hero1.displayAll();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
