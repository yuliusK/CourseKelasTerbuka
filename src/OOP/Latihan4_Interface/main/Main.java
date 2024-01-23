package OOP.Latihan4_Interface.main;

import OOP.Latihan4_Interface.hero.AttackMelee;
import OOP.Latihan4_Interface.hero.AttackRange;
import OOP.Latihan4_Interface.hero.HeroAgility;

public class Main {
    public static void main(String[] args) {
        HeroAgility hero = new HeroAgility("Rhya", 200);
        HeroAgility newHero = new HeroAgility("Licht", 1000);

        hero.setAttackSkill(new AttackMelee(100));
        newHero.setAttackSkill(new AttackRange(100, 20));

        hero.display();
        hero.attack(newHero);

        System.out.println();
        newHero.display();
        newHero.attack(hero);
    }
}
