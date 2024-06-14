package Excercise01;

public abstract class ThiSinh {
    protected int soBaoDanh;
    protected String hoTen;
    protected String diaChi;
    protected int mucUuTien;

    public ThiSinh(int soBaoDanh, String diaChi, String hoTen, int mucUuTien) {
        this.diaChi = diaChi;
        this.hoTen = hoTen;
        this.mucUuTien = mucUuTien;
        this.soBaoDanh = soBaoDanh;
    }

    public abstract String monThi();
}
