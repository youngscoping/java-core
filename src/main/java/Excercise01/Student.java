package Excercise01;

public class Student {
    int id;
    String name;
    static String college = "Đại học bách khoa";
    static int moneyGroup ;

    public static void changeCollege() {
        college = "Đại học công nghệ";
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' + college +
                '}' ;
    }
}
