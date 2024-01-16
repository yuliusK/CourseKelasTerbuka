package OOP.Latihan1;

//player
class Player{
    String name;
    double health;

    Weapon weapon;
    Armor armor;

    Player(String name, double health) {
        this.name = name;
        this.health = health;
    }

    void attack(Player opponent){
        double attackPower = this.weapon.attackPower;

        System.out.println(this.name + " attacking " + opponent.name + " with power " + attackPower);
        opponent.defense(attackPower);
    }

    void defense(double attackPower){
        double damage;
        damage = this.armor.defencePower < attackPower ? attackPower - this.armor.defencePower : 0;

        this.health -= damage;
        System.out.println(this.name + " gets damage " + damage);
    }

    void equipWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    void equipArmor(Armor armor){
        this.armor = armor;
    }

    void display() {
        System.out.println("\nName : " +this.name);
        System.out.println("Health : " +this.health+ " hp");
        this.weapon.display();
        this.armor.display();
    }
}

//weapon
class Weapon{
    double attackPower;
    String name;

    Weapon(String name, double attackPower){
        this.name = name;
        this.attackPower = attackPower;
    }

    void display(){
        System.out.println("Weapon : " +this.name+ ", Attack : " +this.attackPower);
    }
}

//armor
class Armor{
    double defencePower;
    String name;

    Armor(String name, double defencePower){
        this.name = name;
        this.defencePower = defencePower;
    }

    void display(){
        System.out.println("Armor  : " +this.name+ ", Defense : " +this.defencePower);
    }
}


public class Main {
    public static void main(String[] args) throws Exception {
        //membuat object player
        Player player1 = new Player("ucup", 100);
        Player player2 = new Player("Alex", 200);

        //membuat object weapon
        Weapon sword = new Weapon("Sword",15);
        Weapon sword2 = new Weapon("Axe",30);

        //membuat object armor
        Armor armor = new Armor("Armor", 10);
        Armor armor2 = new Armor("Armor", 30);

        //equip weapon and armor
        player1.equipWeapon(sword);
        player1.equipArmor(armor);
        player1.display();

        player2.equipWeapon(sword2);
        player2.equipArmor(armor2);
        player2.display();

        System.out.println("FIGHT!!");
        System.out.println("\nEpisode - 1\n");
        player1.attack(player2);
        player1.display();
        player2.display();

        System.out.println("\nEpisode - 2\n");
        player2.attack(player1);
        player1.display();
        player2.display();
    }
}
