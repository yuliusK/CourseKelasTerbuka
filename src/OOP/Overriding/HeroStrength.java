package OOP.Overriding;

public class HeroStrength extends Hero{
    double defensePower;

    void display() {
        System.out.println("\nHero Strength");
        System.out.println("Hero Name\t\t : " +this.name);
        System.out.println("Defense Power\t : " +this.defensePower);
    }
}
