package OOP.HierarkiPackage.package1;

//import class console
import OOP.HierarkiPackage.package2.Console;

//import static method dari console
import static OOP.HierarkiPackage.package2.Console.log;
public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Otong");
        player1.show();

        Console.log("Menampilkan data dengan console.log");
        Console.log(player1.getName());

        log("Menampilkan data dengan log saja");
        log(player1.getName());
    }
}
