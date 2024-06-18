package Excercise2;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AddStudent {
    private Scanner scanner = new Scanner(System.in);
    private List<Student> nhom1 = new LinkedList<>();
    private List<Student> nhom2 = new LinkedList<>();
    private List<Student> nhom3 = new LinkedList<>();

    public void themStudent(){
        System.out.println("Nhập id học sinh:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập họ tên:");
        String name = scanner.nextLine();
        System.out.println("Nhập vào mã nhóm: ");
        System.out.println("1. Nhóm 1");
        System.out.println("2. Nhóm 2");
        System.out.println("3. Nhóm 3");
        int menu = Integer.parseInt(scanner.nextLine());
        if (menu == 1) {
            Student student =  new Student(id, name, group)
        }

    }
}
