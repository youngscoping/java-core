package statics;

public class Student {
    private int id;
    private String name;

    private static int count;

    public Student(int id, String name) {
        if (count >= 2) {
            throw  new IllegalStateException("Tối đa 5 học sinh");
        }
        this.id = ++count;
        this.name = name;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static class StaticDemo {
        public static void main(String[] args) {
            // static property
            try {
                Student student1 = new Student(1, "Long");
                System.out.println("student1 = " + student1);
                Student student2 = new Student(2, "Quân");
                System.out.println("student2 = " + student2);
                Student student3 = new Student(3, "Linh");
                System.out.println("student3 = " + student3);

            } catch (IllegalStateException exception) {
                System.out.println(exception.getMessage());
            } finally {
                System.out.println("Số lượng học sinh: " + getCount());
            }

            // static method


        }
    }
}
