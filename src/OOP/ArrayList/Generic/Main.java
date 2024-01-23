package OOP.ArrayList.Generic;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Mimosa", 100);
        Hero hero2 = new Hero("Noelle", 200);
        AgilityHero agilityHero = new AgilityHero("Yuuno", 300);
        IntelHero intelHero = new IntelHero("Asta", 400);
        Hero[] Heroes = new Hero[] {hero1, hero2, agilityHero, intelHero};

        for (Hero hero : Heroes){
            hero.display();
        }

        //ArrayList
        ArrayList<Hero> listHero = new ArrayList<>();
        listHero.addAll(Arrays.asList(hero1, hero2, agilityHero, intelHero));
        System.out.println("\nArray list\n");
        for (Hero hero : Heroes){
            hero.display();
        }
    }
}
