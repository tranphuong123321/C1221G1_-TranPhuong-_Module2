package bai_1_introduction_to_java.bai_tap.chuyen_doi_tien_te;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        System.out.print("nhap USD: ");
        int usd = new Scanner(System.in).nextInt();
        int vnd = usd * 23000;
        System.out.println(usd + "USD" + "=" + vnd + "VND");
    }
}
