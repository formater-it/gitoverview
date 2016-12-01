package ru.jskills.git;

import java.lang.reflect.Method;

public class Program {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // enums study
        for (Model m : Model.values()) {
            System.out.println(m.ordinal() + ". " + m.toString() + " costs $" + m.getPrice());
        }

        // annotation study
        try {
            Class<?> c = new Car(Model.Tahoe).getClass();
            Method m = c.getMethod("getModel");
            //Method m = c.getMethod("getModel", String.class, int.class); - доп. параметры для поиска метода с аргументами, если они есть
            MyAnnotation myAnnotation = m.getAnnotation(MyAnnotation.class);
            System.out.println("str = " + myAnnotation.str() + " val = " + myAnnotation.val());
        } catch (NoSuchMethodException e) {
            System.out.println("Method not found.");
        }
    }
}
