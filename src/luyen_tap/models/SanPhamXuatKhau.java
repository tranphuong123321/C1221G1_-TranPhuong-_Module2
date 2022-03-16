package luyen_tap.models;

public class SanPhamXuatKhau extends Product{
    //: Giá xuất khẩu, Quốc gia nhập sản phẩm
    private int giaXuatKhau;
    private String quocGiaNhapSanPham;

    public SanPhamXuatKhau() {
    }

    public SanPhamXuatKhau(int giaXuatKhau, String quocGiaNhapSanPham) {
        this.giaXuatKhau = giaXuatKhau;
        this.quocGiaNhapSanPham = quocGiaNhapSanPham;
    }

    public SanPhamXuatKhau(int idSanPham, String maSanPham, String tenSanPham, int giaBan, int soLuong, String nhaSanXuat, int giaXuatKhau, String quocGiaNhapSanPham) {
        super(idSanPham, maSanPham, tenSanPham, giaBan, soLuong, nhaSanXuat);
        this.giaXuatKhau = giaXuatKhau;
        this.quocGiaNhapSanPham = quocGiaNhapSanPham;
    }

    public int getGiaXuatKhau() {
        return giaXuatKhau;
    }

    public void setGiaXuatKhau(int giaXuatKhau) {
        this.giaXuatKhau = giaXuatKhau;
    }

    public String getQuocGiaNhapSanPham() {
        return quocGiaNhapSanPham;
    }

    public void setQuocGiaNhapSanPham(String quocGiaNhapSanPham) {
        this.quocGiaNhapSanPham = quocGiaNhapSanPham;
    }

    @Override
    public String toString() {
        return "SanPhamXuatKhau{" +
                "idSanPham=" + getIdSanPham() +
                ", maSanPham='" + getMaSanPham() + '\'' +
                ", tenSanPham='" + getTenSanPham() + '\'' +
                ", giaBan=" + getGiaBan() +
                ", soLuong=" + getSoLuong() +
                ", nhaSanXuat='" + getNhaSanXuat() + '\'' +
                "giaXuatKhau=" + giaXuatKhau +
                ", quocGiaNhapSanPham='" + quocGiaNhapSanPham + '\'' +
                '}';
    }
    public String writeToCSV(){
        return  getIdSanPham()+","+
                getMaSanPham()+","+
                getTenSanPham()+","+
                getGiaBan()+","+
                getSoLuong()+","+
                getNhaSanXuat()+","+
                giaXuatKhau+","+
                quocGiaNhapSanPham;
    }
}
