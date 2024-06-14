package Excercise01;

public class ThiSinhKhoiC extends ThiSinh{
    public ThiSinhKhoiC(int soBaoDanh, String diaChi, String hoTen, int mucUuTien) {
        super(soBaoDanh, diaChi, hoTen, mucUuTien );
    }

    @Override
    public String monThi() {
        return "Văn, Sử, Địa";
    }
}
