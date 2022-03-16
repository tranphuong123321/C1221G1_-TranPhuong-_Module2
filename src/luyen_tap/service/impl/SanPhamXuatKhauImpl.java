package luyen_tap.service.impl;

import luyen_tap.controllers.QuanLy;
import luyen_tap.models.SanPhamXuatKhau;
import luyen_tap.service.IServiceSanPhamXuatKhau;
import luyen_tap.until.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SanPhamXuatKhauImpl implements IServiceSanPhamXuatKhau {
    List<SanPhamXuatKhau> sanPhamXuatKhauList= new ArrayList<>();
    ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
    @Override
    public void themSanPhamXuatKhau() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("hay nhap id san pham");
        int id= Integer.parseInt(scanner.nextLine());

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

        System.out.println("hay nhap gia xuat khau");
        int giaXuatKhau= Integer.parseInt(scanner.nextLine());

        System.out.println("hay nhap quoc gia nhap san pham");
        String quocGiaNhapSanPham= scanner.nextLine();


        SanPhamXuatKhau sanPhamXuatKhau= new SanPhamXuatKhau(id,maSanPham,tenSanPham,giaBan,soLuong,nhaSanXuat,giaXuatKhau,quocGiaNhapSanPham);
        sanPhamXuatKhauList.add(sanPhamXuatKhau);
        readAndWriteFile.writeSanPhamXuatKhauToCSV("src/luyen_tap/data/xuatkhau.csv",sanPhamXuatKhauList,false);
        readAndWriteFile.readSanPhamXuatKhauFromCsv("src/luyen_tap/data/xuatkhau.csv");
    }

    @Override
    public void timKiemSanPhamXuatKhau() {
        Scanner scanner= new Scanner(System.in);
        System.out.println("hay nhap ten san pham");
        String searchSanPham=scanner.nextLine();
        for(int i=0;i<sanPhamXuatKhauList.size();i++){
            if(searchSanPham.contains(sanPhamXuatKhauList.get(i).getTenSanPham())){
                System.out.println(sanPhamXuatKhauList.get(i));
            }
        }
    }

    @Override
    public void xoaSanPhamXuatKhau() {
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
                for(int i=0;i<sanPhamXuatKhauList.size();i++){
                    if(maSanPhamXoa.contains(sanPhamXuatKhauList.get(i).getMaSanPham())){
                        sanPhamXuatKhauList.remove(sanPhamXuatKhauList.get(i));
                    }
                }
                break;
            case 2:
                quanLy.showMenuChinh();
                break;
        }
    }

    @Override
    public void hienThiSanPhamXuatKhau() {
        for(SanPhamXuatKhau sanPhamXuatKhau:sanPhamXuatKhauList){
            System.out.println(sanPhamXuatKhau);
        }

    }
}
