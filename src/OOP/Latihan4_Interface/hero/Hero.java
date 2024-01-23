package OOP.Latihan4_Interface.hero;

public abstract class Hero {
    private String name;
    private double health;
    private IAttackSkill attackSkill;

    public Hero(String name, double health) {
        this.name = name;
        this.health = health;
    }

    public IAttackSkill getAttackSkill() {
        return attackSkill;
    }

    public void attack(Hero enemy){
        this.attackSkill.attack(enemy);
    }

    public void setAttackSkill(IAttackSkill attackSkill) {
        this.attackSkill = attackSkill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public void display() {
        System.out.println("Name\t : " +this.name);
        System.out.println("Health\t : " +this.health);
    }
}
