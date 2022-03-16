package luyen_tap.models;

public class SanPhamNhapKhau extends Product{
    //Giá nhập khẩu, Tỉnh thành nhập, Thuế nhập khẩu.
    private int giaNhapKhau;
    private String tinhThanhNhapKhau;
    private int thueNhapKhau;

    public SanPhamNhapKhau() {
    }

    public SanPhamNhapKhau(int giaNhapKhau, String tinhThanhNhapKhau, int thueNhapKhau) {
        this.giaNhapKhau = giaNhapKhau;
        this.tinhThanhNhapKhau = tinhThanhNhapKhau;
        this.thueNhapKhau = thueNhapKhau;
    }

    public SanPhamNhapKhau(int idSanPham, String maSanPham, String tenSanPham, int giaBan, int soLuong, String nhaSanXuat, int giaNhapKhau, String tinhThanhNhapKhau, int thueNhapKhau) {
        super(idSanPham, maSanPham, tenSanPham, giaBan, soLuong, nhaSanXuat);
        this.giaNhapKhau = giaNhapKhau;
        this.tinhThanhNhapKhau = tinhThanhNhapKhau;
        this.thueNhapKhau = thueNhapKhau;
    }

    public int getGiaNhapKhau() {
        return giaNhapKhau;
    }

    public void setGiaNhapKhau(int giaNhapKhau) {
        this.giaNhapKhau = giaNhapKhau;
    }

    public String getTinhThanhNhapKhau() {
        return tinhThanhNhapKhau;
    }

    public void setTinhThanhNhapKhau(String tinhThanhNhapKhau) {
        this.tinhThanhNhapKhau = tinhThanhNhapKhau;
    }

    public int getThueNhapKhau() {
        return thueNhapKhau;
    }

    public void setThueNhapKhau(int thueNhapKhau) {
        this.thueNhapKhau = thueNhapKhau;
    }

    @Override
    public String toString() {
        return "SanPhamNhapKhau{" +
                "idSanPham=" + getIdSanPham() +
                ", maSanPham='" + getMaSanPham() + '\'' +
                ", tenSanPham='" + getTenSanPham() + '\'' +
                ", giaBan=" + getGiaBan() +
                ", soLuong=" + getSoLuong() +
                ", nhaSanXuat='" + getNhaSanXuat() + '\'' +
                "giaNhapKhau=" + giaNhapKhau +
                ", tinhThanhNhapKhau='" + tinhThanhNhapKhau + '\'' +
                ", thueNhapKhau=" + thueNhapKhau +
                '}';
    }

    public String writeToCSV(){
        return  getIdSanPham()+","+
                getMaSanPham()+","+
                getTenSanPham()+","+
                getGiaBan()+","+
                getSoLuong()+","+
                getNhaSanXuat()+","+
                giaNhapKhau+","+
                tinhThanhNhapKhau+","+
                thueNhapKhau;
    }
}
