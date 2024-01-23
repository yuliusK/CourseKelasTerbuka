package OOP.ArrayList.Generic;

public class Hero {
    private String name;
    private double health;

    public Hero(String name, double health) {
        this.name = name;
        this.health = health;
    }

    public void setName(String name) {
        this.name = name;
    }

    void display(){
        System.out.println("Name : " +this.name+", Health : "+this.health);
    }
}
