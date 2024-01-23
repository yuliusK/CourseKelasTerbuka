package OOP.Protected.main;

import OOP.Protected.hero.HeroStrength;

public class Main {
    public static void main(String[] args) {
        HeroStrength hero = new HeroStrength("Ucup");
        hero.display();
        hero.setName("Nemu");
        hero.display();

    }
}
