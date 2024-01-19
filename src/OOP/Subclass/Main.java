package OOP.Subclass;


public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Esmeralda", 100); //ini memakai constructor superclass
        hero1.display();

        HeroStrength hero2 = new HeroStrength("Dyroth", 100); //
        hero2.display();

        HeroStrength hero3 = new HeroStrength("Zilong"); //
        hero3.display();
    }
}
