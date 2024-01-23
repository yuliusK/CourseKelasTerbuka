package OOP.Latihan4_Interface.hero;

public class AttackMelee implements IAttackSkill {
    private double power;

    public AttackMelee(double power){
        this.power = power;
    }

    @Override
    public void attack(Hero enemy) {
        System.out.println("Attack " +enemy.getName() + " with melee " +this.power);
    }
}
