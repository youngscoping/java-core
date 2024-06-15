package Excercise01;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TuyenSinh implements ITuyenSinh{
    Scanner scanner = new Scanner(System.in);
    private List<ThiSinh> thiSinhList = new LinkedList<>();

    public void showMenu() {


        while (true) {
            System.out.println("1. Thêm thí sinh");
            System.out.println("2. Hiện thị DSTS");
            System.out.println("3. Tìm kiếm theo SBD");
            System.out.println("4. Thoát chương trình");
            System.out.println("Mời bạn chọn chức năng:");

            int menu = Integer.parseInt(scanner.nextLine());
            if (menu == 1) {
                themThiSinh();
            } else if (menu == 2) {
                hienThiDSTS();
            } else if (menu == 3) {
                timKiemThiSinhTheoSBD();
            } else if (menu == 4) {
                return;
            } else {
                System.out.println("Vui lòng chọn đúng chức năng");
            }
        }

    }

    @Override
    public void themThiSinh() {
        System.out.println("Nhập vào SBD:");
        int soBaoDanh = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập họ tên:");
        String hoTen = scanner.nextLine();
        System.out.println("Địa chỉ:");
        String diaChi = scanner.nextLine();
        System.out.println("Mức ưu tiên:");
        int mucUuTien = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào khối thi:");
        String khoiThi = scanner.nextLine();

        ThiSinh thiSinh;
        if (khoiThi.equals("A")) {
            thiSinh = new ThiSinhKhoiA(soBaoDanh, hoTen, diaChi, mucUuTien);
        } else if (khoiThi.equals("B")) {
            thiSinh = new ThiSinhKhoiB(soBaoDanh, hoTen, diaChi, mucUuTien);
        } else {
            thiSinh = new ThiSinhKhoiC(soBaoDanh, hoTen, diaChi, mucUuTien);
        }
        thiSinhList.add(thiSinh);
    }

    @Override
    public void hienThiDSTS() {
        System.out.println("+------+--------------------+--------------------+------+--------------------+");
        System.out.println("| SBD  |       HO TEN       |       DIA CHI      | MUT  |       MON THI      |");
        System.out.println("+------+--------------------+--------------------+------+--------------------+");
        for (ThiSinh thiSinh : thiSinhList) {
            System.out.printf("| %-4s | %-18s | %-18s | %-4s | %-18s |%n",
                    thiSinh.soBaoDanh, thiSinh.hoTen, thiSinh.diaChi, thiSinh.soBaoDanh, thiSinh.monThi());
        }
    }

    @Override
    public void timKiemThiSinhTheoSBD() {
        System.out.printf("Nhập vào SBD");
        int soBaoDanh = Integer.parseInt(scanner.nextLine());

        System.out.println("+------+--------------------+--------------------+------+--------------------+");
        System.out.println("| SBD  |       HO TEN       |       DIA CHI      | MUT  |       MON THI      |");
        System.out.println("+------+--------------------+--------------------+------+--------------------+");
        for (ThiSinh thiSinh : thiSinhList) {
            if(thiSinh.soBaoDanh != soBaoDanh) {
                System.out.printf("| %-4s | %-18s | %-18s | %-4s | %-18s |%n",
                        thiSinh.soBaoDanh, thiSinh.hoTen, thiSinh.diaChi, thiSinh.soBaoDanh, thiSinh.monThi());
            }
        }
    }
}
