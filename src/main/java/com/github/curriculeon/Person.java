package com.github.curriculeon;

public class Person {
    public static int numberOfPersonsCreated = 0;

    public static void setNumberOfPersonsCreated(int numberOfPersonsCreated) {
        Person.numberOfPersonsCreated = numberOfPersonsCreated;
    }

    private Long id;
    private String name;

    public Person() {
        numberOfPersonsCreated++;
    }

    public Person(Long id, String name) {
        this.id = id;
        this.name = name;
        numberOfPersonsCreated++;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
