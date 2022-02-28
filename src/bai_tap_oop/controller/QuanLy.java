package bai_tap_oop.controller;

import bai_tap_oop.models.OTo;
import bai_tap_oop.service.impl.OToImpl;
import bai_tap_oop.service.impl.XeMayImpl;
import bai_tap_oop.service.impl.XeTaiImpl;

import java.util.Scanner;

public class QuanLy {
    public static void main(String[] args) {
        QuanLy quanLy = new QuanLy();
        quanLy.disPlayMenuChinh();

    }

    public void disPlayMenuChinh() {
        OToImpl oTo = new OToImpl();
        XeMayImpl xeMay = new XeMayImpl();
        XeTaiImpl xeTai = new XeTaiImpl();
        boolean check = true;
        while (check) {
            System.out.println("1. Thêm mới phương tiện.");
            System.out.println("2. Hiện thị phương tiện");
            System.out.println("3. Xóa phương tiện");
            System.out.println("4. Thoát");
            Scanner scanner = new Scanner(System.in);
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    themMoiPhuongTien();
                    break;
                case 2:
                    hienThiPhuongTien();
                    break;
                case 3:
                    xoaPhuongTien();
                    break;

            }
        }
    }
    public void themMoiPhuongTien(){
        OToImpl oTo =new OToImpl();
        XeMayImpl xeMay=new XeMayImpl();
        XeTaiImpl xeTai=new XeTaiImpl();

        System.out.println("1.Them moi oto");
        System.out.println("2.Them moi xemay");
        System.out.println("3.Them moi xetai");
        Scanner scanner=new Scanner(System.in);
        int choice=Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                oTo.themMoiOTo();
                break;
            case 2:
                xeMay.themMoiXeMay();
                break;
            case  3:
                xeTai.themMoiXeTai();
                break;
        }
    }
    public  void hienThiPhuongTien(){
        OToImpl oTo = new OToImpl();
        XeMayImpl xeMay = new XeMayImpl();
        XeTaiImpl xeTai = new XeTaiImpl();
        System.out.println("1. Hien thi oto");
        System.out.println("2. Hien thi xe may");
        System.out.println("3. Hien thi xe tai");
        Scanner scanner=new Scanner(System.in);
        int choice=Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                oTo.hienThiOTo();
                break;
            case 2:
                xeMay.hienThiXeMay();
                break;
            case 3:
                xeTai.hienThiXeTai();
                break;
        }
    }
    public  void xoaPhuongTien(){
        OToImpl oTo = new OToImpl();
        XeMayImpl xeMay = new XeMayImpl();
        XeTaiImpl xeTai = new XeTaiImpl();
        System.out.println("1. Xoa oto");
        System.out.println("2. Xoa xe may");
        System.out.println("3. Xoa xe tai");
        Scanner scanner=new Scanner(System.in);
        int choice =Integer.parseInt( scanner.nextLine());
        switch (choice){
            case 1:
                oTo.xoaOTo();
                break;
            case 2:
                xeMay.xoaXeMay();
                break;
            case 3:
                xeTai.xoaXeTai();
                break;
        }
    }
}


