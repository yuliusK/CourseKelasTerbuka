package OOP.Overriding;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero();
        hero1.name = "Saitama";
        hero1.display();

        HeroStrength hero2 = new HeroStrength();
        hero2.name = "Mt. Lady";
        hero2.defensePower = 100;
        hero2.display();
    }
}
