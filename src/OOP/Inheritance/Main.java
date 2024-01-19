package OOP.Inheritance;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero();
        hero1.name = "Asta";
        hero1.display();

        Hero hero2 = new HeroStrength();
        hero2.name = "Yami";
        hero2.display();

        Hero hero3 = new HeroIntelligent();
        hero3.name = "Luck";
        hero3.display();
    }
}
