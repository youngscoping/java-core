package excercise05;

public class NhanVien extends CanBo{


    private String congViec;

    public NhanVien(String hoTen, int tuoi, GioiTinh gioiTinh, String diaChi, String congViec) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.congViec = congViec;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "gioiTinh=" + gioiTinh +
                ", congViec='" + congViec + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", tuoi=" + tuoi +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }


}