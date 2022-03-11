package bai12.bai_tap.luyen_tap_arlist_lklist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductImpl implements IService {
    static Scanner scanner=new Scanner(System.in);
    List<Product> productList=new ArrayList<>();
    @Override
    public void addNew() {

        System.out.println("hay nhap id san pham");
        int id= Integer.parseInt(scanner.nextLine());
        System.out.println("hay nhap ten san pham");
        String name= scanner.nextLine();
        System.out.println("hay nhap chi phi");
        int cost=Integer.parseInt(scanner.nextLine());
        //productList.add(new Product(id,name,cost));
        Product product=new Product(id,name,cost);
        productList.add(product);

    }

    @Override
    public void edit() {
        System.out.println("hay nhap id muon sua");
        int checkId=Integer.parseInt(scanner.nextLine());
        for(Product product:productList){
            if(checkId==product.getId()){
                System.out.println("ban muon sua cai gi");
                System.out.println("1.Sua ten");
                System.out.println("2.Sua chi phi");
                int choice=Integer.parseInt(scanner.nextLine());
                switch (choice){
                    case 1:
                        System.out.println("nhap noi dung muon sua");
                        String fixName=scanner.nextLine();
                        product.setName(fixName);
                        break;
                    case 2:
                        System.out.println("nhap noi dung muon sua");
                        int fixCost=Integer.parseInt(scanner.nextLine());
                        product.setCost(fixCost);
                        break;
                }
            }
        }
    }

    @Override
    public void delete() {
        System.out.println("hay nhap id muon xoa");
        int checkId=Integer.parseInt(scanner.nextLine());
        for (int i=0;i<productList.size();i++) {


//        for(Product product:productList){
            if(checkId==productList.get(i).getId()){
                System.out.println("ban co chac chan muon xoa");
                System.out.println("1.co");
                System.out.println("2.khong");
                int choice =Integer.parseInt(scanner.nextLine());
                if((choice==1 )){
                    productList.remove(productList.get(i));
                }else if(choice==2){
                    showList();
                }else System.out.println("sai dinh dang, moi nhap lai");
            }
        }
    }

    @Override
    public void showList() {
        for(Product product:productList){
            System.out.println(product);
        }
    }
    public void search(){
        System.out.println("ban hay nhap ten can tim");
        String checkName=scanner.nextLine();
        for(Product product:productList){
            if(product.getName().contains(checkName)){
                System.out.println("ten can tim la: "+product.getName());
            }
        }
    }
}
