package org.example;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class ClassicalMusic implements Music {
    @PostConstruct
    public void doMyInit() {
        System.out.println("doMyInit() метод вызван");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("doMyDestroy() метод вызван");
    }

    @Override
    public String getSong() {
        return "Bogemian Rapsody";
    }
}
