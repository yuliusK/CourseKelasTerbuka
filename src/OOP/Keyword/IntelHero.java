package OOP.Keyword;

//public akan terbuka untuk semuanya
public class IntelHero extends Hero{

    IntelHero(String name, double health){
        super(name, health);
//        System.out.println(this.health); //tidak bisa diakses karena private
    }

    //override getHealth();
    //karena di superclass method public, maka di subclass harus public

    //override setHealth(); //tidak bisa diubah lagi karena sudah final. jadi hanya bisa di class tersebut
//    final void setHealth(double newHealth){
//        System.out.println("Mencoba memasukkan health = " +newHealth);
//    }


//    double getHealth(){
//        return this.health; //tidak bisa karena disuperclassnya private
//    }

    //visibility harus sama dengan superclass
    public void display(){
        System.out.println(this.name + " mempunyai : " +this.getHealth());
    }
}
