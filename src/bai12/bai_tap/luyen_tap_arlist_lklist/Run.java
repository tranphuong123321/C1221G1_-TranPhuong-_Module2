package bai12.bai_tap.luyen_tap_arlist_lklist;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        ProductImpl product=new ProductImpl();
        Scanner scanner=new Scanner(System.in);
        int choice;
        do{
            System.out.println("Menu");
            System.out.println("1.Thêm sản phẩm");
            System.out.println("2.Sửa thông tin sản phẩm theo id");
            System.out.println("3.Xoá sản phẩm theo id");
            System.out.println("4.Hiển thị danh sách sản phẩm");
            System.out.println("5.Tìm kiếm sản phẩm theo tên");
            System.out.println("6.Sắp xếp sản phẩm tăng dần, giảm dần theo giá");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    product.addNew();
                    break;
                case 2:
                    product.edit();
                    break;
                case 3:
                    product.delete();
                    break;
                case 4:
                    product.showList();
                    break;
                case 5:
                    product.search();
                    break;
                case 6:
                    Sort sort = new Sort();
                    product.productList.sort(sort);
                    break;

            }
        }while (choice!=7);
    }
}
