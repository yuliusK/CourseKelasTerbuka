package OOP.HierarkiPackage.package1;

import OOP.HierarkiPackage.package2.Console;

//visibility default
public class Player {
    private String name;

    Player(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }

    void show(){
        Console.log("Menggunakan Console");
        Console.log("Player name " + this.name);
    }
}
