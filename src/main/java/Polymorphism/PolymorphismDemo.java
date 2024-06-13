package Polymorphism;

import Abstraction.Circle;

public class PolymorphismDemo {
    public static void main(String[] args) {
        // tính đa hình
        // tính đa hình -> Person
        Student student = new Student("huy", 24);
        student.run();

        Person person = (Person) student;
        person.run();


        // InstanceOf
        if (person instanceof  Student) {
            Student s = (Student) person;
            s.study();
        }

    }
}
