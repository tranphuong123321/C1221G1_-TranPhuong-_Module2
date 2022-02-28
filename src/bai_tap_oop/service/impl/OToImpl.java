package bai_tap_oop.service.impl;

import bai_tap_oop.models.OTo;
import bai_tap_oop.service.IOToService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OToImpl implements IOToService {
    static List<OTo> oToList = new ArrayList<>();

    public void write() {

        try {
            FileWriter fileWriter = new FileWriter("src/bai_tap_oop/data/OtoCsv");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (OTo oTo : oToList) {
                bufferedWriter.write(oTo.getBienKiemSoat() + "," + oTo.getTenHangSanXuat() + "," + oTo.getNamSanXuat() + "," + oTo.getChuSoHuu() + "," + oTo.getSoChoNgoi() + "," + oTo.getKieuXe());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void read(){
        try {
            FileReader fileReader=new FileReader("src/bai_tap_oop/data/OtoCsv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String[]    data;
            String line;
            OTo oTo;
            while ((line =bufferedReader.readLine())!=null){
                data =line.split(",");
                oTo=new OTo(data[0],data[1],Integer.parseInt(data[2]),data[3],Integer.parseInt(data[4]),data[5]);
                oToList.add(oTo);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void themMoiOTo() {
//        -	Biển kiểm soát.
//        -	Hãng sản xuất ( chọn từ Arraylist “hangSanXuat” có tạo sẵn dữ liệu).
//        -	Năm sản xuất.
//        -	Chủ sở hữu.
//        -	Tải trọng (nếu là xe tải).
//                -	Kiểu xe ( nếu là xe ôtô) .
//                -	 Số chỗ ngồi (nếu là ôtô).
//        -	Công suất (nếu là xe máy).

        Scanner scanner = new Scanner(System.in);
        System.out.println("hay nhap bien kiem soat");
        String bienKiemSoat = scanner.nextLine();
        while(!(bienKiemSoat.matches("[0-9]{2}[A-Z]{1}[-][0-9]{3}[.][0-9]{2}"))){
            System.out.println("Sai dinh dang,hay nhap lai");
            bienKiemSoat=scanner.nextLine();
        }
        System.out.println("hay nhap hang san xuat");
        String hangSanXuat = scanner.nextLine();
        System.out.println("hay nhap nam san xuat");
        int namSanXuat = Integer.parseInt(scanner.nextLine());
        System.out.println("hay nhap chu so huu");
        String chuSoHuu = scanner.nextLine();
        System.out.println("hay nhap kieu xe");
        String kieuXe = scanner.nextLine();
        System.out.println("hay nhap so cho ngoi");
        int soChoNgoi = Integer.parseInt(scanner.nextLine());
        OTo oto = new OTo(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu, soChoNgoi, kieuXe);
        oToList.add(oto);
        write();
    }

    @Override
    public void hienThiOTo() {
        for (OTo oTo : oToList) {
            System.out.println(oTo);
        }
    }

    @Override
    public void xoaOTo() {
        Scanner scanner = new Scanner(System.in);
        String xoaBienKiemSoat = scanner.nextLine();
        for (int i = 0; i < oToList.size(); i++) {
            if (oToList.get(i).getBienKiemSoat().equals(xoaBienKiemSoat)) {
                oToList.remove(i);

            }
        }
        write();
    }
}
