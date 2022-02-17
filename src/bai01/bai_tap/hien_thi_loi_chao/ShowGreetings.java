package bai_1_introduction_to_java.bai_tap.hien_thi_loi_chao;

import java.util.Scanner;

public class ShowGreetings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name =input.nextLine();
        System.out.println("Hello "+name);


    }
}
