package Excercise01;

public class ThiSinhKhoiA extends ThiSinh{
    public ThiSinhKhoiA(int soBaoDanh, String diaChi, String hoTen, int mucUuTien) {
        super(soBaoDanh, diaChi, hoTen, mucUuTien );
    }

    @Override
    public String monThi() {
        return "Toán, Lý Hoá";
    }

}
