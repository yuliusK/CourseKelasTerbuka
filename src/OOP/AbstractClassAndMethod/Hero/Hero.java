package OOP.AbstractClassAndMethod.Hero;

public abstract class Hero {
    private String name;
    private int level;
    Hero(String name){
        this.name = name;
        this.level = 1;
    }

    public void setLevel(int deltaLevel) {
        this.level += deltaLevel;
    }

    public void display(){
        System.out.println("Aku adalah " +this.name );
        System.out.println("Level " +this.level);
    }

    //memaksa semua turunan Hero untuk menggunakan method ini
    public abstract void levelUp();

}
