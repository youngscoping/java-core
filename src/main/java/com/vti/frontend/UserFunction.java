package com.vti.frontend;

import com.vti.controller.UserController;
import com.vti.entity.User;
import com.vti.util.ScannerUtil;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class UserFunction {

    private UserController controller;



 /**
  * @ShowMenu Chỗ này là method showMenu được public để người dùng ở Front End có thể gọi và sử dụng các chức năng.
  * Các chức năng khác được private để không cho người dùng tiếp cận và thay đổi method
  */

    public void showMenu()  {
        while (true) {
            System.out.println("1. Tìm kiếm employee theo project id");
            System.out.println("2. Hiện thị tất cả manager");
            System.out.println("3. Đăng nhập dành cho manager");
            System.out.println("4. Thoát chương trình");
            System.out.println("Mời bạn chọn chức năng:");
            int menu = ScannerUtil.intputInt();
            if (menu == 1) {
                findEmployeeByProjectId();
            }
            else if (menu == 2) {
                findAllManager();
            } else if (menu == 3) {
                findAdminByEmailAndPassword();
            } else if (menu == 4) {
                return;
            } else {
                System.err.println("Vui lòng chọn đúng chức năng");
            }
        }
    }




    private void findEmployeeByProjectId()  {
        System.out.println("Nhập vào project id");
        int projectId = ScannerUtil.intputInt();
        List<User> users = controller.findEmployeeByProjectId(projectId);

        System.out.println("+------+-------------------------+-------------------------+");
        System.out.printf("| %-4s | %-23s | %-23s |%n", "ID", "FULL NAME", "EMAIL");
        System.out.println("+------+-------------------------+-------------------------+");

        if (users.isEmpty()) {
            System.out.printf("| %-4s | %-23s | %-23s |%n", "NULL", "NULL", "NULL");
            System.out.println("+------+-------------------------+-------------------------+");
        } else  {
            for (User user : users) {
                System.out.printf(
                        "| %-4s | %-23s | %-23s |%n",
                        user.getId(), user.getFullName(), user.getEmail()
                );
                System.out.println("+------+-------------------------+-------------------------+");
            }

        }
    }

    private void findAllManager() {
        List<User> users = controller.findAllManager();

        System.out.println("+------+-------------------------+-------------------------+");
        System.out.printf("| %-4s | %-23s | %-23s |%n", "ID", "FULL NAME", "EMAIL");
        System.out.println("+------+-------------------------+-------------------------+");

        if (users.isEmpty()) {
            System.out.printf("| %-4s | %-23s | %-23s |%n", "NULL", "NULL", "NULL");
            System.out.println("+------+-------------------------+-------------------------+");
        } else  {
            for (User user : users) {
                System.out.printf(
                        "| %-4s | %-23s | %-23s |%n",
                        user.getId(), user.getFullName(), user.getEmail()
                );
                System.out.println("+------+-------------------------+-------------------------+");
            }

        }
    }




    private void findAdminByEmailAndPassword()  {
        System.out.println("Nhập vào email:");
        String email = ScannerUtil.inputEmail();
        System.out.println("Nhập vào password");
        String password = ScannerUtil.inputPassword();
        User user = controller.findManagerByEmailAndPassword(email, password);
        if (user == null) {
            System.err.println("Đăng nhập thất bại!");
        } else {
            User.Role role = user.getRole();
            System.out.printf("Đăng nhập thành công: %s-%s",
                    user.getFullName(), role);
            System.out.println();
        }
    }



}
