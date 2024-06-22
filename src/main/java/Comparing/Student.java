package Comparing;

import java.time.LocalDate;
import java.util.Date;

public class Student implements Comparable<Student> {
    private int id;
    private String name;
    private LocalDate birthDay;
    private int mathScore;

    public Student(int id, String name, LocalDate birthDay, int mathScore) {
        this.id = id;
        this.name = name;
        this.birthDay = birthDay;
        this.mathScore = mathScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "birthDay=" + birthDay +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", mathScore=" + mathScore +
                '}';
    }

    @Override
    public int compareTo(Student that) {
        if (this.id < that.id) {
            return - 1;
        } else if (this.id > that.id) {
            return  1;
        } return 0;
    }


}
