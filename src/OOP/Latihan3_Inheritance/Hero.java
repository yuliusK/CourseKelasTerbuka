package OOP.Latihan3_Inheritance;

public class Hero {
    String name;
    double attackPower, health;

    Hero (String name, double attackInput, double healthInput){
        this.name = name;
        this.attackPower = attackInput;
        this.health = healthInput;
    }

    void attack(Hero enemy){
        System.out.println("\n" + this.name + " attack " +enemy.name);
        enemy.takeDamage(this.attackPower);
    }

    void takeDamage(double damage){
        System.out.println(this.name + " receive damage " +damage);
        this.health -= damage;
    }

    void display(){
        System.out.println("\nNama\t\t : " +this.name);
        System.out.println("Health\t\t : " +this.health);
        System.out.println("Attack Power : " +this.attackPower);
    }
}
