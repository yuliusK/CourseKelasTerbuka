package OOP.AbstractClassAndMethod.Hero;

public class HeroIntel extends Hero{
    public HeroIntel(String name) {
        super(name);
    }

    public void levelUp(){
        this.setLevel(2);
    }
}
