package OOP.ArrayList.Operation;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Bakugo", 100);
        Hero hero2 = new Hero("Deku", 200);
        AgilityHero heroAgility = new AgilityHero("Crow", 200);
        IntelHero heroIntel = new IntelHero("Eagle", 300);

        //operasi 1 : menambah member dengan add
        ArrayList<Hero> listHero = new ArrayList<>();
        listHero.addAll(Arrays.asList(hero1, hero2, heroAgility, heroIntel));
        System.out.println(listHero +"\n");

        //operasi 2 : menambah member dengan set
        listHero.set(2, heroIntel);
        System.out.println(listHero +"\n");

        //operasi 3 : menghapus member dengan remove
        listHero.remove(3);
        System.out.println(listHero +"\n");

        //operasi 4 : mengakses member
        System.out.println(listHero +"\n");
        Hero getHero = listHero.get(0);
        getHero.display();

        //method pada ArrayList
        System.out.println("\nMethod");
        System.out.println("1. Size\t\t : " +listHero.size());
        System.out.println("2. isEmpty\t : " +listHero.isEmpty());
        System.out.println("3. Contains\t : " +listHero.contains(hero2));
        System.out.println("4. indexOf\t : " +listHero.indexOf(hero2));
    }
}
