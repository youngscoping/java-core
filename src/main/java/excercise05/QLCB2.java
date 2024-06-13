package excercise05;

import java.util.ArrayList;
import java.util.Scanner;

public class QLCB2 {
    public ArrayList<CanBo> listCanBo;
    public void taoCanBo() {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Chọn loại cán bộ bạn muốn thêm");
        System.out.println("1. Kỹ sư");
        System.out.println("2. Công nhân");
        System.out.println("3.Nhân viên");

        String loaiCanBo = scanner.nextLine();

        switch (loaiCanBo) {
            case "1":
                System.out.println("Nhập vào tên Kỹ sư");
                String tenKySu = scanner.nextLine();
                System.out.println("Nhập tuổi kỹ sư:");
                int tuoiKySu = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập giới tính - 1. Nam, 2. Nữ, 3. Khác");
                GioiTinh gioiTinh = null;

                String nhapGioiTinh = scanner.nextLine();

                switch (nhapGioiTinh) {
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

                System.out.println(" Nhập vào địa chỉ");
                String diaChiKySu = scanner.nextLine();

                System.out.println("Nhập ngành đào tạo");
                String nganhDaoTao = scanner.nextLine();

                KySu kySu = new KySu(tenKySu, tuoiKySu, gioiTinh, diaChiKySu, nganhDaoTao);

                break;


                case "2":
                    System.out.println("Nhập vào tên Công nhân");
                    String hoTenCongNhan = scanner.nextLine();
                    System.out.println("Nhập tuổi kỹ sư:");
                    int tuoiCongNhan = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập giới tính - 1. Nam, 2. Nữ, 3. Khác");
                    GioiTinh gioiTinhCongNhan = null;

                    String nhapGioiTinhCongNhan = scanner.nextLine();

                    switch (nhapGioiTinhCongNhan) {
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

                    System.out.println(" Nhập vào địa chỉ");
                    String diaChiCongNhan = scanner.nextLine();

                    System.out.println("Nhập bậc công nhân");
                    int bacCongNhan = scanner.nextInt();


                    CongNhan congNhan = new CongNhan(hoTenCongNhan, tuoiCongNhan, gioiTinhCongNhan, diaChiCongNhan, bacCongNhan);

                    break;



            case "3":
                System.out.println("Nhập vào tên Nhân viên");
                String hoTenNhanVien = scanner.nextLine();
                System.out.println("Nhập tuổi kỹ sư:");
                int tuoiNhanVien = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập giới tính - 1. Nam, 2. Nữ, 3. Khác");
                GioiTinh gioiTinhNhanVien = null;

                String nhapGioiTinhNhanVien = scanner.nextLine();

                switch (nhapGioiTinhNhanVien) {
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

                System.out.println(" Nhập vào địa chỉ");
                String diaChiNhanVien = scanner.nextLine();

                System.out.println("Nhập công việc nhân viên");
                String congViecNhanVien = scanner.nextLine();


                NhanVien nhanVien = new NhanVien(hoTenNhanVien, tuoiNhanVien, gioiTinhNhanVien, diaChiNhanVien, congViecNhanVien);
                break;

            default:
                break;
            }
        }


    }
