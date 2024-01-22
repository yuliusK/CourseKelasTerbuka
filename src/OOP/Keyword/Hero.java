package OOP.Keyword;

/*
    visibility
    1. PUBLIC : Jika method atau atribut dalam public secara explisit,maka subclass tidak boleh mengurangi visibility
    2. PRIVATE : Jika method atau atribut dalam private secara explisit, maka subclass tidak dapat mengakses
    3. FINAL : Jika method atau atribut dengan Final keyword akan diwariskan, tapi tidak bisa di override dalam class yang sama
*/

public class Hero {
    public String name;
    private double health;

    Hero(String name, double health){
        this.name = name;
        this.health = health;
    }

    //getter
    double getHealth(){
        return this.health;
    }

    final void setHealth(double newHealth){
        this.health = newHealth;
    }

    //overload
    void setHealth(String mode){
        if(mode.equals("reset")){
            this.health = 100;
        }
    }

    public void display(){
        System.out.println(this.name + " mempunyai health : " +this.health);
    }
}
