package OOP.Polymorphism;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Ucup");
        HeroStrength hero2 = new HeroStrength("Pucu");
        hero1.display();
        hero2.display();

        //Polymorphic
        HeroAgility hero3 = new HeroAgility("Maria");
        hero3.display();
        hero3.showOff();

        HeroIntel hero4 = new HeroIntel("Mahmud");
        hero4.display();

        //Array list
        Hero[] listHero = new Hero[4];
        listHero[0] = hero1;
        listHero[1] = hero2;
        listHero[2] = hero3; //casting
        listHero[3] = hero4;

        listHero[2].display();

        //method calls
//        listHero[2].showoff(); //ini tidak bisa

        //aplikasi
        hero4.attack(hero2);
    }
}
