package OOP.Overloading;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Saitama");
        Player player2 = new Player();
        Player player3 = new Player();
        Player player4 = new Player("Asta");

        player1.show();
        player2.show();
        player3.show();
        player4.show();

        //overloading methods
        int a = Matematika.tambah(1, 19);
        System.out.println("\nHasil penjumlahan = " +a);

        double b = Matematika.tambah(1, 10.5d);
        System.out.println("Hasil penjumlahan = " +b);
    }
}
