package bai17.bai_tap.quan_ly_san_pham;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        ProductImpl product = new ProductImpl();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Menu");
            System.out.println("1.Thêm moi");
            System.out.println("2.Hien thi");
            System.out.println("3.Tim kiem");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    product.addNew();
                    break;
                case 2:
                    product.show();
                    break;
                case 3:
                    product.search();
                    break;

                default:
                    System.out.println("Hay nhap tu 1 den 3");
            }
        }
    }
}
