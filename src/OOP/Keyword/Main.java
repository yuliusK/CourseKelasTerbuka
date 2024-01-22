package OOP.Keyword;

public class Main {

    public static void main(String[] args) {
        System.out.println("Test");

        Hero hero1 = new Hero("Ucup", 100);
        IntelHero hero2 = new IntelHero("Cupu", 200);

        hero1.display();
        hero2.display();

        System.out.println(hero1.getHealth());
        System.out.println(hero2.getHealth());

        hero1.setHealth(120);
        hero2.setHealth(80);

        hero1.display();
        hero2.display();

        System.out.println(hero1.getHealth());
        System.out.println(hero2.getHealth());
    }
}
