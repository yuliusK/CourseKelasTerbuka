package OOP.Reflection.MethodAndConstructor.hero;

public class HeroAgility extends Hero {
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

    private void setHeroType(String heroType){
        this.heroType = heroType;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
