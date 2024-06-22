package Excericise01;



public class Student {
    private static int count = 0;
    private int id ;
    private String name ;

    public int getId() {
        return id;
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}
