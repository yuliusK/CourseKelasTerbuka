package OOP.Method;

class Mahasiswa{
    String nama;
    String NIM;

    // constructor
    Mahasiswa(String nama, String NIM){
        this.nama = nama;
        this.NIM = NIM;
    }

    void show(){
        System.out.println("Nama : " + this.nama);
        System.out.println("NIM  : " + this.NIM);
    }

    void setNama(String nama){
        this.nama = nama;
    }

    String getNama(){
        return this.nama;
    }

    String getNIM(){
        return this.NIM;
    }

    String sayHi(String message){
        return message + " juga, nama saya adalah " + this.nama;
    }
}

public class Main{
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("ucup","13305041");
        mahasiswa1.show();
        mahasiswa1.setNama("tutung");
        mahasiswa1.show();

        System.out.println(mahasiswa1.getNama());
        System.out.println(mahasiswa1.getNIM());

        String data = mahasiswa1.sayHi("ganteng");
        System.out.println(data);
    }
}
