package Excercise2;


import java.util.*;

public class MenuCreating {
    private List<Student> studentList = new ArrayList<>();
    private Random random = new Random();

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
            } else if (menu == 3) {
                System.out.println("Cả lớp điểm danh");
                for (Student student : studentList) {
                    student.diemDanh();
                }
            } else if (menu == 4) {
                System.out.println("Nhóm 1 đi học bài");
                for (Student student : studentList) {
                    if (student.getGroup() == 1) {
                        student.hocBai();
                    }
                }

            } else if (menu == 5) {
                System.out.println("Nhóm 2 đi dọn vệ sinh");
                for (Student student : studentList) {
                    if (student.getGroup() ==2 ) {
                        student.diDonVeSinh();
                    }
                }
            } else if (menu == 6) {
                System.out.println("Đã thoát khỏi chương trình");
                return;
            } else {
                System.out.println("Vui lòng chọn đúng!");

            }        }

    }

        private void innitStudent(){
            for (int i =0; i < 10; i++) {
                Student student = new Student( "Student" + (i+1), random.nextInt(3)+1);
                studentList.add(student);
            }
         }

}





