package OOP.Casting;

public class Hero {
    private String name;
    private double health;

    public Hero(String name, double health) {
        this.name = name;
        this.health = health;
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

    public void display(){
        System.out.println(this.name + " is a regular Hero");
    }
}
