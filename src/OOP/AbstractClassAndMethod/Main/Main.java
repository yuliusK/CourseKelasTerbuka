package OOP.AbstractClassAndMethod.Main;

import OOP.AbstractClassAndMethod.Hero.HeroIntel;

public class Main {
    public static void main(String[] args) {
        HeroIntel hero1 = new HeroIntel("Ucup");
        hero1.display();
        hero1.levelUp();
        hero1.display();

        //tidak bisa membuat object ketika class tersebut adalah abstract
//        Hero hero2 = new Hero("Marlo");
    }
}
