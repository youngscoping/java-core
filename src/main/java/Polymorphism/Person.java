package Polymorphism;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public void run() {
        System.out.println("Person is running....");
    }
}
