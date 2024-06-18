package Excercise2;


import java.util.*;

public class Program {
    private List<Student> studentList = new ArrayList<>();
    private Random random;

    private Scanner scanner = new Scanner(System.in);


    public void menu() {
        while (true) {
            System.out.println("Lựa chọn chức năng:");
            System.out.println("1. Tạo danh sách sinh viên:");
            System.out.println("2. Hiện thị ds sv trong lớp");
            System.out.println("3. Điểm danh lớp");
            System.out.println("4. Gọi nhóm 1 học bài:");
            System.out.println("5. Gọi nhóm 2 đi dọn vs");
            System.out.println("6. Thoát khỏi chương trình");

            int menu = Integer.parseInt(scanner.nextLine());
            if (menu == 1) {
                innitStudent();
                System.out.println("Tạo thành công 10 sinh viên");
            } else if (menu == 2) {
                for (Student student : studentList) {
                    System.out.println(student);
                }
            }
        }

    }

        }





