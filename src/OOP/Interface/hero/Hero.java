package OOP.Interface.hero;

public class Hero implements iAttack{
    private String name;
    private double health;

    public Hero(String name, double health) {
        this.name = name;
        this.health = health;
    }

    //memaksa class ini untuk mengimplementasikan method attack
    public void attack(Hero enemy){
        System.out.println(this.name + " attacks " +enemy.name);
    }
    public void display(){
        System.out.println("Name\t : " +this.name);
        System.out.println("Health\t : " +this.health);
    }
}
