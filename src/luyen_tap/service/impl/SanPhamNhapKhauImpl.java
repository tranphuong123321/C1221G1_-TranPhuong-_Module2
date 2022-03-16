package luyen_tap.service.impl;

import luyen_tap.controllers.QuanLy;
import luyen_tap.models.SanPhamNhapKhau;
import luyen_tap.service.IServiceSanPhamNhapKhau;
import luyen_tap.until.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SanPhamNhapKhauImpl implements IServiceSanPhamNhapKhau {
    List<SanPhamNhapKhau> sanPhamNhapKhauList = new ArrayList<>();
    ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
    //idSanPham, String maSanPham, String tenSanPham, int giaBan, int soLuong, String nhaSanXuat, int giaNhapKhau, String tinhThanhNhapKhau, int thueNhapKhau
    @Override
    public void themSanPhamNhapKhau() {
        Scanner scanner=new Scanner(System.in);
        int id;
        if (sanPhamNhapKhauList.size()==0) {
            id=1;
        }else {
            id =sanPhamNhapKhauList.get(sanPhamNhapKhauList.size()-1).getIdSanPham()+1;
        }
        System.out.println("hay nhap ma san pham");
        String maSanPham=scanner.nextLine();
        System.out.println("hay nhap ten san pham");
        String tenSanPham= scanner.nextLine();
        System.out.println("hay nhap gia ban");
        int giaBan=Integer.parseInt(scanner.nextLine());
        System.out.println("hay nhap so luong");
        int soLuong=Integer.parseInt(scanner.nextLine());
        System.out.println("hay nhap nha san xuat");
        String nhaSanXuat=scanner.nextLine();
        System.out.println("hay nhap gia nhap khau");
        int giaNhapKhau=Integer.parseInt(scanner.nextLine());
        System.out.println("hay nhap tinh thanh nhap  khau");
        String tinhThanhNhapKhau=scanner.nextLine();
        System.out.println("hay nhap thue");
        int thueNhapKhau=Integer.parseInt(scanner.nextLine());
        SanPhamNhapKhau sanPhamNhapKhau =new SanPhamNhapKhau(id,maSanPham,tenSanPham,giaBan,soLuong,nhaSanXuat,giaNhapKhau,tinhThanhNhapKhau,thueNhapKhau);
        sanPhamNhapKhauList.add(sanPhamNhapKhau);
        readAndWriteFile.writeSanPhamNhapKhauToCSV("src/luyen_tap/data/nhapkhau.csv",sanPhamNhapKhauList,false);
        readAndWriteFile.readSanPhamNhapKhauFromCsv("src/luyen_tap/data/nhapkhau.csv");
    }

    @Override
    public void timKiemSanPhamNhapKhau() {
        Scanner scanner= new Scanner(System.in);
        System.out.println("hay nhap ten san pham");
        String searchSanPham=scanner.nextLine();
        for(int i=0;i<sanPhamNhapKhauList.size();i++){
            if(searchSanPham.contains(sanPhamNhapKhauList.get(i).getTenSanPham())){
                System.out.println(sanPhamNhapKhauList.get(i));
            }
        }
    }

    @Override
    public void xoaSanPhamNhapKhau() {
        QuanLy quanLy= new QuanLy();
        Scanner scanner= new Scanner(System.in);
        System.out.println("hay nhap ma san pham muon xoa");
        String maSanPhamXoa=scanner.nextLine();
        System.out.println("ban co muon xoa");
        System.out.println("1.co");
        System.out.println("2.khong");
        int choice= Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                for(int i=0;i<sanPhamNhapKhauList.size();i++){
                    if(maSanPhamXoa.contains(sanPhamNhapKhauList.get(i).getMaSanPham())){
                        sanPhamNhapKhauList.remove(sanPhamNhapKhauList.get(i));
                    }
                }
                break;
            case 2:
                quanLy.showMenuChinh();
                break;
        }
    }

    @Override
    public void hienThiSanPhamNhapKhau() {
        for(SanPhamNhapKhau sanPhamNhapKhau:sanPhamNhapKhauList){
            System.out.println(sanPhamNhapKhau);
        }
    }
}
