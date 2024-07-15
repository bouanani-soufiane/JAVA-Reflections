/*
 * This source file was generated by the Gradle 'init' task
 */
package com.bouanani;

import com.bouanani.classes.Bird;
import com.bouanani.classes.Cat;
import com.bouanani.classes.Goat;

import java.lang.reflect.*;
public class App {

    public static void main(String[] args) throws Exception {

        Object goat = new Goat("goat");
//        Class<?> clazz = goat.getClass();
//        System.out.println("here : "+clazz);


//        Class<?> goatClass = Class.forName("com.bouanani.classes.Goat");
//        Class<?> animalClass = Class.forName("com.bouanani.classes.Animal");
//
//        int goatMods = goatClass.getModifiers();
//        int animalMods = animalClass.getModifiers();

//        Class<?> goatClass = goat.getClass();
//        Package pkg = goatClass.getPackage();
//        Class<?> goatSuperClass = goatClass.getSuperclass();

//        System.out.println("here : "+goatSuperClass.getSimpleName());

        Class<?> birdClass = Class.forName("com.bouanani.classes.Bird");
        Constructor<?> cons1 = birdClass.getConstructor();
        Bird bird1 = (Bird) cons1.newInstance();

        System.out.println("here : " + bird1.getName());


        Cat myCat = new Cat("cat1" , 12);
        Field[] catField = myCat.getClass().getDeclaredFields();

        for(Field f : catField){
            if(f.getName().equals("name")){
                f.setAccessible(true);
                f.set(myCat,"catty");
            }
        }

        Method[] catMethods = myCat.getClass().getDeclaredMethods();
        for(Method m : catMethods){
            if(m.getName().equals("thisIsPrivateStaticMethod")){
                m.setAccessible(true);
                //m.invoke(null);
            }
            //System.out.println(m.getName());
        }
        //System.out.println(myCat.getName());

    }
}
