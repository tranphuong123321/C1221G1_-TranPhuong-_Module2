package bai_12.bai_tap.luyen_tap_arlist_lklist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductService implements IProduct {
    ArrayList<Product> productList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public void addNewProduct() {

        System.out.println("Nhập sản phẩm: ");
        String name = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm: ");
        double prices = Double.parseDouble(scanner.nextLine());

        Product product = new Product(name, prices);
        productList.add(product);
    }

    @Override
    public void editProduct() {
        System.out.println("Nhập vào id muốn sửa: ");
        int idEdit = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == idEdit) {

                System.out.println("Sửa tên sản phẩm: ");
                String editNameProduct = scanner.nextLine();
                productList.get(i).setName(editNameProduct);

                System.out.println("Nhập giá tiền sản Phẩm: ");
                double editPriceProduct = Double.parseDouble(scanner.nextLine());
                productList.get(i).setPrice(editPriceProduct);
            } else {
                System.out.println("Không có sản phẩm này!");
            }
        }
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    @Override
    public void removeProduct() {
        System.out.println("Nhập id muốn xóa sản phẩm: ");
        int idRemove = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == idRemove) {
                productList.remove(productList.get(i));
                break;
            } else {
                System.out.println("Không có id cần xóa!");
                break;
            }
        }
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    @Override
    public void displayProduct() {
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    @Override
    public void searchProduct() {
        System.out.println("Nhập sản phẩm bạn cần tìm: ");
        String strProduct = scanner.nextLine();
        ArrayList<Product> arrayList = new ArrayList<>();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getName().toLowerCase().contains(strProduct.toLowerCase())) {
                arrayList.add(productList.get(i));
            }
        }
        if (arrayList.size() == 0) {
            System.out.println("Không có sản phẩm trong danh sách!");
        } else {
            for (Product product : arrayList) {
                System.out.println(product);
            }

        }

    }

    @Override
    public void increase() {
        Collections.sort(productList);

        for (Product product : productList) {
            System.out.println(product);
        }
    }

    @Override
    public void decrease() {
        Product newProduct = new Product();
        Collections.sort(productList, newProduct);

        for (Product product : productList) {
            System.out.println(product);
        }
    }

}

