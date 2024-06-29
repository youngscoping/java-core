package com.vti.frontend;

import com.vti.entity.Department;
import com.vti.repository.DepartmentRepository;
import com.vti.ulti.ScannerUlti;
import lombok.AllArgsConstructor;

import java.sql.SQLException;
import java.util.List;

@AllArgsConstructor
public class DepartmentFunction {
    private DepartmentRepository repository;

    public void showMenu() throws SQLException {
        while (true) {
            System.out.println("1. Hiện thị danh sách phòng ban");
            System.out.println("2. Tìm phòng ban theo ID");
            System.out.println("3. Tạo phòng ban mới");
            System.out.println("4. Thoát khỏi chương trình");
            int menu = ScannerUlti.inputInt();
            if (menu == 1) {
                findAll();
            } else if (menu == 2) {
                findById();
            } else if (menu == 3) {
                create();
            } else if (menu == 4) {
                System.out.println("Cảm ơn đã sử dụng chương trình");
                return;
            } else {
                System.err.println("Vui lòng chọn đúng");
            }
        }
    }


    public void findAll() throws SQLException {
        List<Department> departments = repository.findAll();

        System.out.println("+------+-------------------------+");
        System.out.printf("| %-4s | %-23s |%n", "ID", "NAME");
        System.out.println("+------+-------------------------+");
        if (departments.isEmpty()) {
            System.out.printf("| %-4s | %-23s |%n", "NULL", "NULL");
            System.out.println("+------+-------------------------+");
        } else {
            for (Department department : departments) {
                System.out.printf("| %-4s | %-23s |%n",
                        department.getId(), department.getName());
            }
            System.out.println("+------+-------------------------+");
        }
    }

    public void findById() throws SQLException {
        System.out.println("Mời bạn nhập vào ID");
        int id = ScannerUlti.inputInt();
        Department department = repository.findById(id);
        System.out.println("+------+-------------------------+");
        System.out.printf("| %-4s | %-23s |%n", "ID", "NAME");
        System.out.println("+------+-------------------------+");
        if (department == null) {
            System.out.printf("| %-4s | %-23s |%n", "NULL", "NULL");
            System.out.println("+------+-------------------------+");
        } else {
            System.out.printf("| %-4s | %-23s |%n",
                    department.getId(), department.getName());
        } System.out.println("+------+-------------------------+");
    }

    public void create() throws SQLException {
        System.out.println("Mời bạn nhập vào tên phòng ban");
        String name = ScannerUlti.inputString();
        int result = repository.create(name);
        System.out.printf("Đã tạo thành công phòng ban:" + name);
    }
}
