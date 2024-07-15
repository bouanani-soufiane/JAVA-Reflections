/*
 * This source file was generated by the Gradle 'init' task
 */
package com.bouanani;

import com.bouanani.classes.Goat;
import com.bouanani.classes.Person;
import org.junit.Test;

import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void givenObject_whenGetsFieldNamesAtRuntime_thenCorrect() {
        Object person = new Person();
        Field[] fields = person.getClass().getDeclaredFields();

        assertTrue(Arrays.asList("name", "age")
                .containsAll(getFieldNames(fields)));
    }
    private static List<String> getFieldNames(Field[] fields) {
        List<String> fieldNames = new ArrayList<>();
        for (Field field : fields)
            fieldNames.add(field.getName());
        return fieldNames;
    }
    @Test
    public void givenObject_whenGetsClassName_thenCorrect() {
        Object goat = new Goat("goat");
        Class<?> clazz = goat.getClass();

        assertEquals("Goat", clazz.getSimpleName());
        assertEquals("com.bouanani.classes.Goat", clazz.getName());
        assertEquals("com.bouanani.classes.Goat", clazz.getCanonicalName());
    }
    @Test
    public void givenClassName_whenCreatesObject_thenCorrect() throws ClassNotFoundException {
        Class<?> clazz = Class.forName("com.bouanani.classes.Goat");

        assertEquals("Goat", clazz.getSimpleName());
        assertEquals("com.bouanani.classes.Goat", clazz.getName());
        assertEquals("com.bouanani.classes.Goat", clazz.getCanonicalName());
    }

    @Test
    public void givenClass_whenRecognisesModifiers_thenCorrect() throws ClassNotFoundException {
        Class<?> goatClass = Class.forName("com.bouanani.classes.Goat");
        Class<?> animalClass = Class.forName("com.bouanani.classes.Animal");

        int goatMods = goatClass.getModifiers();
        int animalMods = animalClass.getModifiers();

        assertTrue(Modifier.isPublic(goatMods));
        assertTrue(Modifier.isAbstract(animalMods));
        assertTrue(Modifier.isPublic(animalMods));
    }

    @Test
    public void givenClass_whenGetsPackageInfo_thenCorrect() {
        Goat goat = new Goat("goat");
        Class<?> goatClass = goat.getClass();
        Package pkg = goatClass.getPackage();

        assertEquals("com.bouanani.classes", pkg.getName());
    }
}
