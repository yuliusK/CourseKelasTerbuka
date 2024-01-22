package OOP.Casting;

public class Main {
    public static void main(String[] args) {

        HeroIntel hero1 = new HeroIntel("Ucup", 100);
        hero1.display();

        //casting, ada field dan method yang hilang
        Hero heroUp = (Hero) hero1;
        heroUp.display();

        Hero heroReg = new Hero("Poco", 200);
        heroReg.display();

        //down casting dari superclass ke subclass tidak bisa dilakukan
//        HeroAgility heroDown = (HeroAgility) heroReg;
//        heroDown.display();

        HeroIntel hero2 = (HeroIntel) heroUp;

        //berhasil di down casting, dengan syarat bentuk awal sama
        // (bentuk awal adalah HeroIntel lalu di cast ke Hero. Hero tersebut bisa di downcast kembali ke HeroIntel
        hero2.display();
        System.out.println(hero2.type);
        hero2.castMagic();
    }
}
