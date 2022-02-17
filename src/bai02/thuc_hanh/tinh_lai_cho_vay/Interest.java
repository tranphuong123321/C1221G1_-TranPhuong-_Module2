package bai_2_vong_lap_trong_java.thuc_hanh.tinh_lai_cho_vay;
import java.util.Scanner;
public class Interest {
    static double interest (double money,int month,double interestRate ){
        return money*(interestRate/100)/12*month;
    }
    public static void main(String[] args) {
        System.out.print("Nhap so tien: ");
        double money=new Scanner(System.in).nextDouble();
        System.out.print("Nhap so thang: ");
        int month=new Scanner(System.in).nextInt();
        System.out.print("Nhap lai suat: ");
        double interestRate= new Scanner(System.in).nextDouble();
        System.out.println("Tong so tien lai la: "+interest( money, month, interestRate));
    }
}
