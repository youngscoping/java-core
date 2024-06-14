package Excercise01;

public class ThiSinhKhoiB extends ThiSinh{
    public ThiSinhKhoiB(int soBaoDanh, String diaChi, String hoTen, int mucUuTien) {
        super(soBaoDanh, diaChi, hoTen, mucUuTien );
    }

    @Override
    public String monThi() {
        return "Toán , Hoá, Sinh";
    }
}
