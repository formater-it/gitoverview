package ru.jskills.git;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {
    String str();
    int val();
}

public class Car {
    private Model model;

    @MyAnnotation(str = "MyAnnotation text", val = 100)
    public Model getModel() {
        return this.model;
    }

    public Car(Model model) {
        this.model = model;
    }
}
