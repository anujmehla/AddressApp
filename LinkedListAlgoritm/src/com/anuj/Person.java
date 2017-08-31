package com.anuj;

public class Person {
    private String name;
    private String rollNo;

    public Person(String name, String rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "name "+this.name+" rollNo "+this.rollNo;
    }
}
