package ru.sber.person;

public class Person {
    private final String name;

    public Person(String name){
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello, I'm" + name + " ");
    }


}


