package OOP.Reflection.MethodAndConstructor.main;

import OOP.Reflection.MethodAndConstructor.hero.HeroAgility;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        HeroAgility hero1 = new HeroAgility("Sekke", 100);
        System.out.println(">>>>> Memanggil private method ");
        hero1.displayAll();
        System.out.println(">>>>> Menjadi ");

        Method[] methodHero = hero1.getClass().getDeclaredMethods();
        for (Method method : methodHero){
            if(method.getName().equals("setHeroType")){
                method.setAccessible(true);

                try {
                    method.invoke(hero1, "intel");
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            }

            if(method.getName().equals("setNickname")){
                method.setAccessible(true);

                try {
                    method.invoke(hero1, "bu-hah");
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        hero1.displayAll();
        System.out.println("\nReflection Constructor ");

        //akses constructor
        Object newHero = new Object();
        Constructor<?>[] consHero = hero1.getClass().getConstructors();

        for (Constructor<?> cons : consHero){
            if(cons.getName().equals("OOP.Reflection.MethodAndConstructor.hero.HeroAgility")){
                Object[] obj = {"Finral", 200};
                try {
                    newHero = cons.newInstance(obj);
                } catch (InstantiationException e) {
                    throw new RuntimeException(e);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        HeroAgility hero2 = (HeroAgility) newHero;
        hero2.displayAll();
    }
}
