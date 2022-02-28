package bai_tap_oop.models;

public class XeTai extends PhuongTienGiaoThong {
    private int taiTrong;

    public XeTai() {
    }

    public XeTai(int taiTrong) {
        this.taiTrong = taiTrong;
    }

    public XeTai(String bienKiemSoat, String tenHangSanXuat, int namSanXuat, String chuSoHuu, int taiTrong) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.taiTrong = taiTrong;
    }

    public int getTaiTrong() {
        return taiTrong;
    }

    public void setTaiTrong(int taiTrong) {
        this.taiTrong = taiTrong;
    }

    @Override
    public String toString() {
        return "XeTai{" +
                "bienKiemSoat='" + getBienKiemSoat() + '\'' +
                ", tenHangSanXuat='" + getTenHangSanXuat() + '\'' +
                ", namSanXuat=" + getNamSanXuat() +
                ", chuSoHuu='" + getChuSoHuu() + '\'' +
                ", taiTrong=" + taiTrong +
                '}';
    }
}
