package Excercise2;

public class Student implements IStudent {
    int id;
     String name;
     int group;

    public Student(int group, int id, String name) {
        this.group = group;
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "group=" + group +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }


    @Override
    public void diemDanh() {
        System.out.println(name + "điêm danh");
    }

    @Override
    public void hocBai() {
        System.out.println(name + "học bài");
    }

    @Override
    public void diDonVeSinh() {
        System.out.println(name + "đi dọn vệ sinh");
    }
}
