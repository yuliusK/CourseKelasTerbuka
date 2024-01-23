package OOP.Reflection.FieldAndAtribute.hero;

public class HeroAgility extends Hero{
    public String nickname;
    private String heroType;
    public HeroAgility(String name, double health) {
        super(name, health);
        this.heroType = "Agility";
    }

    public void displayAll(){
        this.display();
        System.out.println("Nickname\t : " +this.nickname);
        System.out.println("Hero Type\t : " +this.heroType);
    }

}
