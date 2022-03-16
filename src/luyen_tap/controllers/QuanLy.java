package luyen_tap.controllers;

import com.sun.org.apache.xerces.internal.impl.xs.XSAnnotationImpl;
import luyen_tap.models.SanPhamNhapKhau;
import luyen_tap.models.SanPhamXuatKhau;
import luyen_tap.service.impl.SanPhamNhapKhauImpl;
import luyen_tap.service.impl.SanPhamXuatKhauImpl;

import java.util.Scanner;

public class QuanLy {
    SanPhamNhapKhauImpl sanPhamNhapKhau = new SanPhamNhapKhauImpl();
    SanPhamXuatKhauImpl sanPhamXuatKhau = new SanPhamXuatKhauImpl();

    public static void main(String[] args) {

        QuanLy quanLy = new QuanLy();
        quanLy.showMenuChinh();
    }

    public void showMenuChinh() {
        boolean check = true;
        while (check) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1.Thêm mới");
            System.out.println("2.Xóa");
            System.out.println("3.Xem danh sách các sản phẩm");
            System.out.println("4.Tìm kiếm");
            System.out.println("5.Thoát");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    themMoi();
                    break;
                case 2:
                    xoa();
                    break;
                case 3:
                    hienThi();
                    break;
                case 4:
                    timKiem();
                    break;
                case 5:
                    showMenuChinh();
                    break;
            }
        }
    }

    public void themMoi() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Them moi san pham nhap khau");
        System.out.println("2.Them moi san pham xuat khau");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                sanPhamNhapKhau.themSanPhamNhapKhau();
                break;
            case 2:
                sanPhamXuatKhau.themSanPhamXuatKhau();
                break;
        }

    }

    public void xoa() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Xoa san pham nhap khau");
        System.out.println("2.Xoa san pham xuat khau");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                sanPhamNhapKhau.xoaSanPhamNhapKhau();
                break;
            case 2:
                sanPhamXuatKhau.xoaSanPhamXuatKhau();
                break;
        }
    }

    public void hienThi() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Hien thi san pham nhap khau");
        System.out.println("2.Hien thi san pham xuat khau");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                sanPhamNhapKhau.hienThiSanPhamNhapKhau();
                break;
            case 2:
                sanPhamXuatKhau.hienThiSanPhamXuatKhau();
                break;

        }
    }

    public void timKiem() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Tim kiem san pham nhap khau");
        System.out.println("2.Tim kiem san pham xuat khau");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                sanPhamNhapKhau.timKiemSanPhamNhapKhau();
                break;
            case 2:
                sanPhamXuatKhau.timKiemSanPhamXuatKhau();
                break;

        }
    }
}
