package case_study.service.impl;

import case_study.models.Customer;
import case_study.models.Person;
import case_study.service.IServiceCustomer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerImpl implements IServiceCustomer {
    static List<Customer> customerList = new ArrayList<>();

    @Override
    public void addNew() {
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        while (check) {

            System.out.println("hay nhap ma khach hang");
            int id = Integer.parseInt(scanner.nextLine());
            System.out.println("hay nhap ho va ten");
            String name = scanner.nextLine();
            System.out.println("hay nhap ngay sinh");
            int birthDay = Integer.parseInt(scanner.nextLine());
            System.out.println("hay nhap gioi tinh");
            System.out.println("1. Nam");
            System.out.println("2. Nu");
            System.out.println("3. LGBT");
            String gender = " ";
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    gender = " Nam";
                    break;
                case 2:
                    gender = "Nu";
                    break;
                case 3:
                    gender = "LGBT";
                    break;
            }
            System.out.println("hay nhap so CMND");
            int idCard = Integer.parseInt(scanner.nextLine());
            System.out.println("hay nhap so dien thoai");
            int numberPhone = Integer.parseInt(scanner.nextLine());
            System.out.println("hay nhap email");
            String email = scanner.nextLine();
            System.out.println("hay nhap loai khach hang");
            System.out.println("1.Diamond");
            System.out.println("2.Platinium");
            System.out.println("3.Gold");
            System.out.println("4.Silver");
            System.out.println("5.Member");
            String typeOfGuest = " ";
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    typeOfGuest = "Diamond";
                    break;
                case 2:
                    typeOfGuest = "Platinium";
                    break;
                case 3:
                    typeOfGuest = "Gold";
                    break;
                case 4:
                    typeOfGuest = "Silver";
                    break;
                case 5:
                    typeOfGuest = "Member";
                    break;
            }
            System.out.println("hay nhap dia chi");
            String address = scanner.nextLine();
            Customer customer = new Customer(id, name, birthDay, gender, idCard, numberPhone, email, typeOfGuest, address);
            customerList.add(customer);
            break;
        }

    }


    @Override
    public void edit() {
        // int id, String name, String birthDay, String gender, int idCard, int numberPhone, String email, String typeOfGuest, String address
        Scanner scanner = new Scanner(System.in);
        System.out.println("hay nhap id muon sua");
        int idEdit = Integer.parseInt(scanner.nextLine());
        boolean check = false;
        for (Customer customer : customerList) {
            System.out.println(customer.getId());
            if (customer.getId() == idEdit) {
                check = true;
                System.out.println("Ban muon sua cai gi");
                System.out.println("1. sua ten");
                System.out.println("2. sua ngay sinh");
                System.out.println("3. sua gioi tinh");
                System.out.println("4. sua CMND");
                System.out.println("5. sua so dien thoai");
                System.out.println("6. sua email");
                System.out.println("7. sua loai khach");
                System.out.println("8. sua dia chi");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("sua ten");
                        String fixName = scanner.nextLine();
                        customer.setName(fixName);
                        break;
                    case 2:
                        System.out.println("sua ngay sinh");
                        int fixBirth = Integer.parseInt(scanner.nextLine());
                        customer.setBirthDay(fixBirth);
                        break;
                    case 3:
                        System.out.println("sua gioi tinh");
                        String fixGender = scanner.nextLine();
                        customer.setGender(fixGender);
                        break;
                    case 4:
                        System.out.println("sua CMND");
                        int fixIdCard = Integer.parseInt(scanner.nextLine());
                        customer.setIdCard(fixIdCard);
                        break;
                    case 5:
                        System.out.println("sua so dien thoai");
                        int fixNumberPhone = Integer.parseInt(scanner.nextLine());
                        customer.setId(fixNumberPhone);
                        break;
                    case 6:
                        System.out.println("sua email");
                        String fixEmail = scanner.nextLine();
                        customer.setEmail(fixEmail);
                        break;
                    case 7:
                        System.out.println("sua loai khach");
                        String fixTypeOfGuest = scanner.nextLine();
                        customer.setTypeOfGuest(fixTypeOfGuest);
                        break;
                    case 8:
                        System.out.println("sua dia chi");
                        String fixAddress = scanner.nextLine();
                        customer.setAddress(fixAddress);


                }
            }
        }
    }


    @Override
    public void disPlay() {
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }
}
