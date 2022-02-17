package bai_2_vong_lap_trong_java.thuc_hanh.tim_uoc_chung_lon_nhat;

import java.util.Scanner;

public class Divisor {
    public static void main(String[] args) {
        System.out.print("nhap so a: ");
        int a = new Scanner(System.in).nextInt();
        a = Math.abs(a);
        System.out.print("nhap so b: ");
        int b = new Scanner(System.in).nextInt();
        b = Math.abs(b);
        if (a == 0 && b == 0) {
            System.out.println("khong co UCLN");
        } else if (a == 0 && b != 0) {
            System.out.println("UCLN la: " + b);
        } else if (a != 0 && b == 0) {
            System.out.println("UCLN la: " + a);
        } else {
            if(a>b && a%b==0){
                System.out.println(b+" la UCLN");
            }
            else if(a<b && b%a==0){
                System.out.println(a+" la UCLN");
            }else {
                System.out.println("khong co UCLN");
            }
        }
    }
}
