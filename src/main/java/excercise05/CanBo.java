package excercise05;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CanBo {

    protected   String hoTen;
    protected int tuoi;
    protected GioiTinh gioiTinh;
    protected String diaChi;

    public CanBo(String hoTen, int tuoi, GioiTinh gioiTinh, String diaChi) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    ArrayList<CanBo>  listCanBo;
}
