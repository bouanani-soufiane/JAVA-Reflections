/*
 * This source file was generated by the Gradle 'init' task
 */
package com.bouanani;

import com.bouanani.classes.Cat;
import com.bouanani.classes.Goat;

import java.lang.reflect.*;
public class App {

    public static void main(String[] args) throws Exception {

//        Object goat = new Goat("goat");
//        Class<?> clazz = goat.getClass();
//        System.out.println("here : "+clazz);


        Class<?> goatClass = Class.forName("com.bouanani.classes.Goat");
        Class<?> animalClass = Class.forName("com.bouanani.classes.Animal");

        int goatMods = goatClass.getModifiers();
        int animalMods = animalClass.getModifiers();

        System.out.println("here : "+animalMods);

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
