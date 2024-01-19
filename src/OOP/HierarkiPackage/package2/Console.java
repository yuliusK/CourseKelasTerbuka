package OOP.HierarkiPackage.package2;

//visibilitas untuk semuanya
public class Console {
    public static void log(String message){
        System.out.println(message);
    }
}

//ini hanya akan bisa diakses dari package2
class Terminal {
    public static void log(String message){
        System.out.println(message);
    }
}
