package Comparing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Huy", 7));
        students.add(new Student("Long", 5));
        students.add(new Student("An", 3));
        students.add(new Student("Duy", 2));
        students.add(new Student("Phong", 1));
        students.add(new Student("Quang", 7));

        Collections.sort(students);
        for (Student student : students) {
            System.out.println(student);
        }

    }


}
