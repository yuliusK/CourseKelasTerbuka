package OOP.ObjectTheSuperClass;

public class Hero{
    String name;
    public Hero (String name){
        this.name = name;
    }

    public void display(){
        System.out.println("Name : " +this.name);
    }

    @Override
    public boolean equals(Object object){
        if (this == object){
            System.out.println("Object dengan reference sama");
            return true;
        } else if (this.getClass() == object.getClass()){
            System.out.println("Object dengan class sama");
            System.out.println("Reference berbeda");

            Hero other = (Hero) object;
            if(this.name == other.name){
                System.out.println("Namanya sama");
                return true;
            } else {
                System.out.println("Namanya beda");
                return false;
            }

        } else{
            return false;
        }
    }
}
