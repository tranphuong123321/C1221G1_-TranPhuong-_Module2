package bai_15.bai_tap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (true) {
            System.out.println(" moi nhap vao canh a");
            int a = scanner.nextInt();
            System.out.println(" moi nhap vao canh b");
            int b = scanner.nextInt();
            System.out.println(" moi nhap vao canh c");
            int c = scanner.nextInt();
            try {
                Triagle triagle = new Triagle(a, b, c);
                System.out.println(" tam giac hop le");
                break;
            } catch (ExceptionRectangle exceptionRectangle) {
                exceptionRectangle.printStackTrace();
            }
        }

    }
}
