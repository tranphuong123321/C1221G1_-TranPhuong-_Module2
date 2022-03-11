package bai17.bai_tap.quan_ly_san_pham;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductImpl implements IService {

    static Scanner scanner = new Scanner(System.in);
    List<Product> productList = new ArrayList<>();


    @Override
    public void addNew() {
        System.out.println("hay nhap ma san pham");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("hay nhap ten san pham");
        String name = scanner.nextLine();
        System.out.println("hay nhap hang san xuat");
        String manufacturer = scanner.nextLine();
        System.out.println("hay nhap gia tien");
        int cost = Integer.parseInt(scanner.nextLine());
        System.out.println("hay nhap cac mo ta khac");
        String otherDescriptions = scanner.nextLine();
        Product product = new Product(id, name, manufacturer, cost, otherDescriptions);
      //  productList = readProduct();
        productList.add(product);
        writeProduct(productList);
    }


    @Override
    public void show() {
        List<Product> productList=readProduct();
        for(Product product:productList){
            System.out.println(product);
        }
    }

    @Override
    public void search() {
        System.out.println("hay nhap ten san pham muon tim");
        String checkName = scanner.nextLine();
        for (Product product : productList) {
            if (product.getProductName().contains(checkName)) {
                System.out.println("san pham can tim la" + product);
            }
        }
    }

    public List<Product> readProduct() {
        List<Product> productList = new ArrayList<>();
        File file = new File("D:\\code gym\\C1221G1_TranPhuong_Module2\\src\\bai17\\bai_tap\\quan_ly_san_pham\\ReadAndWrite.dat");
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            if (file.length() > 0) {
                fileInputStream = new FileInputStream(file);
                objectInputStream = new ObjectInputStream(fileInputStream);
                productList = (List<Product>) objectInputStream.readObject();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileInputStream != null)
                    objectInputStream.close();
                fileInputStream.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return productList;
    }

    public void writeProduct(List<Product> productList) {
        File file = new File("D:\\code gym\\C1221G1_TranPhuong_Module2\\src\\bai17\\bai_tap\\quan_ly_san_pham\\ReadAndWrite.dat");
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(productList);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
                objectOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}



