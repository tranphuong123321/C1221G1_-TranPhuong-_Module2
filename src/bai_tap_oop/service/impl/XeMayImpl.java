package bai_tap_oop.service.impl;

import bai_tap_oop.models.OTo;
import bai_tap_oop.models.XeMay;
import bai_tap_oop.service.IXeMayService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XeMayImpl implements IXeMayService {
    static List<XeMay> xeMayList = new ArrayList<>();

    @Override
    public void themMoiXeMay() {


        Scanner scanner = new Scanner(System.in);
        System.out.println("hay nhap bien kiem soat");
        String bienKiemSoat = scanner.nextLine();
        while(!(bienKiemSoat.matches("[0-9]{2}[A-Z]{1}[-][0-9]{3}[.][0-9]{2}"))) {
            System.out.println("Sai dinh dang,hay nhap lai");
            bienKiemSoat = scanner.nextLine();
        }
        System.out.println("hay nhap hang san xuat");
        String hangSanXuat = scanner.nextLine();
        System.out.println("hay nhap nam san xuat");
        int namSanXuat = Integer.parseInt(scanner.nextLine());
        System.out.println("hay nhap chu so huu");
        String chuSoHuu = scanner.nextLine();
        System.out.println("hay nhap cong suat");
        int congSuat = Integer.parseInt(scanner.nextLine());

        XeMay xeMay = new XeMay(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu, congSuat);
        xeMayList.add(xeMay);

    }

    @Override
    public void hienThiXeMay() {
        for (XeMay xeMay : xeMayList) {
            System.out.println(xeMay);
        }

    }

    @Override
    public void xoaXeMay() {
        Scanner scanner = new Scanner(System.in);
        String xoaBienKiemSoat = scanner.nextLine();
        for (int i = 0; i < xeMayList.size(); i++) {
            if (xeMayList.get(i).getBienKiemSoat().equals(xoaBienKiemSoat)) {
                xeMayList.remove(i);
            }

        }
    }
}
