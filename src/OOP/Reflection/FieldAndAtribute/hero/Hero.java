package OOP.Reflection.FieldAndAtribute.hero;

public abstract class Hero {
    private String name;
    private double health;

    public Hero(String name, double health) {
        this.name = name;
        this.health = health;
    }

    void display(){
        System.out.println("Name\t\t : " +this.name);
        System.out.println("Health\t\t : " +this.health);
    }
}
