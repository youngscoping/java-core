package excercise05;

import java.util.ArrayList;

public class CongNhan extends CanBo{


    private int bac;


    public CongNhan(String hoTen, int tuoi, GioiTinh gioiTinh, String diaChi, int Bac) {
        super(hoTen, tuoi, gioiTinh, diaChi);
    }

    @Override
    public String toString() {
        return "CongNhan{" +
                "diaChi='" + diaChi + '\'' +
                ", gioiTinh=" + gioiTinh +
                ", hoTen='" + hoTen + '\'' +
                ", tuoi=" + tuoi +
                ", Bac=" + bac +
                '}';
    }

    ArrayList<CanBo> listCanBo;

}
