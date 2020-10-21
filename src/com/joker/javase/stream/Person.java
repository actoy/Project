package com.joker.javase.stream;

/**
 *  * 实例Person
 *  *
 *  * @version 1.0
 *  
 */
public class Person {
    private String name;

    public Person() {

    }

    public Person(String name) {
        this.setName(name);
    }

    public static Person build(String name) {
        Person person = new Person();
        person.setName(name);
        return person;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

}
