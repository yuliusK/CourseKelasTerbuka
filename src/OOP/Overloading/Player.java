package OOP.Overloading;

public class Player {
    private String name;
    private static int jumlahPlayer;

    //Overloading Constructor
    //opsi1
    Player(String name){
        Player.jumlahPlayer++;
        this.name = name;
    }

    //opsi2
    Player(){
        Player.jumlahPlayer++;
        this.name = "player " + Player.jumlahPlayer;
    }

    void show(){
        System.out.println("Name : " +this.name);
    }
}
