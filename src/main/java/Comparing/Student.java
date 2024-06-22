package Comparing;

public class Student implements Comparable<Student> {
    private int id;
    private String name;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public int compareTo(Student that) {
     //  return Integer.compare(this.id, that.id);


     //   return that.name.compareTo(this.name);
     int c1 = Integer.compare(this.id , that.id);

     if (c1 == 0) {
         return that.name.compareTo(this.name);
     } return c1;
    }


}
