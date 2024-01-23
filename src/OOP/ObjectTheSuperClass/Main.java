package OOP.ObjectTheSuperClass;

public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero("Ucup");
        hero.display();

        //class Object adalah superclass yang ada di Java
        Object hero1 = hero;
        System.out.println(hero1.toString());
        System.out.println(hero.toString().equals(hero1.toString()));

        Hero hero2 = new Hero("Asta");
        Hero hero3 = new Hero("Yuno");

        System.out.println(hero2.toString().equals(hero3.toString()));

        Jagoan hero4 = new Jagoan("Asta");
        hero4.display();
        System.out.println(hero2.equals(hero4));
    }
}
