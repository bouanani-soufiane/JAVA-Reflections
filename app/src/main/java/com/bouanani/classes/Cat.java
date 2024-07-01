package com.bouanani.classes;

public class Cat {
    private final String name;
    private int age;
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void meow(){
        System.out.println("meow");
    }
    private void heyThisisPrivateMethod(){
        System.out.println("how did u call this ");
    }
    public static void thisIsPublicStaticMethod(){
        System.out.println("this is public static method");
    }
    private static void thisIsPrivateStaticMethod(){
        System.out.println("this is private static method");
    }

}
