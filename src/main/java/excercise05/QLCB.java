package excercise05;

import java.util.Scanner;

public class QLCB {
        void addCanBo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Thêm họ và tên");
        String hoTen = scanner.nextLine();

        System.out.println("Nhập tuổi");
        int tuoi = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập vào giới tính:");
        GioiTinh gioiTinh = null;
        System.out.println("Nhập vào giới tính");
        System.out.println("1. NAM");
        System.out.println("2. NỮ");
        System.out.println("1. KHÁC");

        String menu = scanner.nextLine();
        switch (menu) {
            case "1":
                gioiTinh = GioiTinh.NAM;
                break;

            case "2":
                gioiTinh = GioiTinh.NU;
                break;

            case "3":
                gioiTinh = GioiTinh.KHAC;
                break;
        }
        System.out.println("Nhập vào địa chỉ:");
        String diaChi = scanner.nextLine();

        CanBo canBo = new CanBo(hoTen, tuoi, gioiTinh, diaChi);
    }
}
