package OOP.Interface.main;

import OOP.Interface.hero.Hero;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Yami", 2000);
        Hero hero2 = new Hero("William", 5000);
        hero1.attack(hero2);
    }
}
