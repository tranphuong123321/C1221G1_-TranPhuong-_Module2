package bai_2_vong_lap_trong_java.bai_tap.hien_thi_cac_loai_hinh;

import java.util.Scanner;

public class Figure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choose = -1;
        do{
            System.out.println("\nChoose your menu: ");
            System.out.println("1. Print Rectangle ");
            System.out.println("2. Print the square triangle ");
            System.out.println("3. Print isosceles triangle ");
            System.out.println("4. Exit ");
            System.out.println("Your Choice : ");
            choose = Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1:
                    System.out.println("Rectangle");rectangle();break;
                case 2: System.out.println("First");squareTriangle();
                    System.out.println("Second");triangle();
                    System.out.println("Third");bottomLeftTriangle();
                    System.out.println("Four");bottomRightTriangle();break;
                case 3:
                    System.out.println("Isosceles Triangle");isoscelesTriangle();break;
                default: choose = 0;
            }
        }while(choose != 0);

    }
    private static void rectangle(){
        for(int i = 0; i<4;i++){

            for(int j = 0; j<6;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    //top right
    private static void triangle(){
        for(int i = 0; i<6;i++){

            for(int j = 0; j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    //top left
    private static void squareTriangle(){
        for(int i = 0; i<6;i++){

            for(int k = i;k<6;k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    //
    private static void bottomLeftTriangle(){
        for(int i = 0; i<6;i++){
            for(int k = 0 ; k<i;k++){
                System.out.print(" ");
            }
            for(int j = i; j<6;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    private static void bottomRightTriangle(){
        for(int i = 0; i<6;i++){

            for(int k = i+1;k<6;k++){
                System.out.print(" ");
            }
            for(int k = 0;k<=i;k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void isoscelesTriangle(){

        for(int i = 0;i<6;i++){
            for(int k=6;k>i;k--){
                System.out.print("  ");
            }
            for(int k=0 ; k<i;k++){
                System.out.print(" *");
            }
            for(int k=0 ; k<=i;k++){
                System.out.print(" *");
            }

            System.out.println("");
        }
    }
}