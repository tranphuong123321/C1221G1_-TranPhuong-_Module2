package case_study.service.impl;

import case_study.models.Customer;
import case_study.models.Person;
import case_study.service.CustomerService;
import case_study.until.RegexData;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    private static List<Customer> customerList = new LinkedList<>();
    private Scanner scanner = new Scanner(System.in);
    private static final String BIRTHDAY_REGEX = "^(((0[1-9]|[12][0-9]|30)[-\\/](0[13-9]|1[012])|31[-\\/](0[13578]|1[02])|(0[1-9]|1[0-9]|2[0-8])[-\\/]02)" +
            "[-\\/](19[0-9]{2}|200[012])|29[-\\/]02[-\\/]" +
            "([0-9]{2}(([2468][048]|[02468][48])|[13579][26])|([13579][26]|[02468][048]|0[0-9]|1[0-6])00))$";
    private static final String EY_IDCARD = "^[0-9]{9}$";
    private static final String EY_NUMPHONE = "^09[0-9]{7}$";
    private static final String EY_EMAIL = "^[A-Za-z0-9]+[A-Za-z0-9]*@gmail.com$";

    static {
        ReaderCustomer();
    }

    public static void ReaderCustomer() {
        try {
            FileReader fileReader = new FileReader(new File("src/case_study/data/customer"));
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String Data;
            String[] temp;
            Customer customer;
            while ((Data = bufferedReader.readLine()) != null) {
                temp = Data.split(",");
                customer = new Customer(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7], temp[8]);
                customerList.add(customer);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void write() {
        try {
            FileWriter fileWriter = new FileWriter(new File("src/case_study/data/customer"));
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Customer customer : customerList) {

                bufferedWriter.write(customer.getId()
                        + "," + customer.getName()
                        + "," + customer.getAge()
                        + "," + customer.getSex()
                        + "," + customer.getIdCard()
                        + "," + customer.getNumBerPhone()
                        + "," + customer.getEmail()
                        + "," + customer.getTypeCustomer()
                        + "," + customer.getAddress()
                        + "\n");
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void display() {
        if (customerList.size() == 0) {
            System.out.println("Hiện tại chưa có danh sách khách hàng");
        } else {
            for (Customer customer : customerList) {
                System.out.println(customer.toString());
            }
        }
    }

    @Override
    public void addNew() {
        boolean check;
        int choose;
        String sex = "";
        String typeCustomer = "";

        String id = "KH-" + randomId() + randomId();

        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();

        System.out.println("Nhập ngày sinh dạng (dd/MM/yyy): ");
        String age = inputEYBirthDay();

        do {
            check = false;
            System.out.println("--Giới Tính--");
            System.out.println("1. Nam.");
            System.out.println("2. Nữ");
            System.out.println("3. 3D");
            try {
                choose = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Bạn đã nhập sai vui lòng nhập lại");
                check = true;
                continue;
            }
            switch (choose) {
                case 1:
                    sex = "Nam";
                    break;
                case 2:
                    sex = "Nữ";
                    break;
                case 3:
                    sex = "3D";
                    break;
                default:
                    check = true;
                    break;
            }
        } while (check);

        System.out.println("Nhập chứng minh: ");
        String idCard = inputEYIDCard();

        System.out.println("Nhập số điện thoại: ");
        String numberphone = inputEYPhone();

        System.out.println("Nhập email: ");
        String email = inputEYEmail();

        do {
            check = true;
            System.out.println("Loại khách hàng.");
            System.out.println("1. Diamond.");
            System.out.println("2. Platinium.");
            System.out.println("3. Gold.");
            System.out.println("4. Silver");
            System.out.println("5. Member");
            try {
                choose = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Bạn nhập sai định dạng vui lòng nhập lại");
                check = true;
                continue;
            }
            switch (choose) {
                case 1:
                    typeCustomer = "Diamond";
                    break;
                case 2:
                    typeCustomer = "Platinium";
                    break;
                case 3:
                    typeCustomer = "Gold";
                    break;
                case 4:
                    typeCustomer = "Silver";
                    break;
                case 5:
                    typeCustomer = "Member";
                    break;
                default:
                    check =true;
                    break;
            }
        } while (check);

        System.out.println("Địa chỉ");
        String address = scanner.nextLine();

        Customer customer = new Customer(id, name, age, sex, idCard, numberphone, email, typeCustomer, address);
        customerList.add(customer);
        write();
        System.out.println("Đã thêm danh sách khách hàng thành công");
    }

    private String inputEYBirthDay() {
        return RegexData.regexAge(scanner.nextLine(), BIRTHDAY_REGEX);
    }

    private String inputEYIDCard() {
        return RegexData.regexStr(scanner.nextLine(), EY_IDCARD,
                "Bạn đã nhập sai vui lòng nhập lại, chứng minh gồm có 9 số");
    }

    private String inputEYPhone() {
        return RegexData.regexStr(scanner.nextLine(), EY_NUMPHONE,
                "Bạn đã nhập sai vui lòng nhập lại, Số điện thoại gồm 9 số và bất đầu bằng 09");
    }

    private String inputEYEmail() {
        return RegexData.regexStr(scanner.nextLine(), EY_EMAIL,
                "Bạn đã nhập sai định dạng, vui lòng nhập lại");
    }



    @Override
    public void edit() {
        System.out.println("Input your id");
        String fixid = scanner.nextLine();
        boolean check = false;
        for (Person customer : customerList) {
            System.out.println(customer.getId());
            if (customer.getId().equals(fixid)) {
                check = true;
                System.out.println("DANH SÁCH SỬA THÔNG TIN");
                System.out.println("2. name");
                System.out.println("3. dateOfBirth");
                System.out.println("4. sex");
                System.out.println("5. idCard");
                System.out.println("6. numberPhone");
                System.out.println("7. email");
                System.out.println("8. type");
                System.out.println("9. address");
                int choice = scanner.nextInt();
                scanner.skip("\\R");
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Bạn đã nhập sai vui lòng nhập lại");
                }
                switch (choice) {
                    case 2:
                        System.out.println("Sửa tên: ");
                        String fixName = scanner.nextLine();
                        customer.setName(fixName);
                        break;

                    case 3:
                        System.out.println("sua ngay sinh");
                        String fixAge = scanner.nextLine();
                        customer.setAge(fixAge);
                        break;

                    case 4:
                        System.out.println("sua gioi tinh");
                        String fixSex = scanner.nextLine();
                        customer.setSex(fixSex);
                        break;

                    case 5:
                        System.out.println("sua cmnd");
                        String fixIdcard = scanner.nextLine();
                        customer.setIdCard(fixIdcard);
                        break;

                    case 6:
                        System.out.println("sua sdt");
                        String fixNumberPhone = scanner.nextLine();
                        customer.setNumBerPhone(fixNumberPhone);
                        break;

                    case 7:
                        System.out.println("Sữa Email: ");
                        String fixEmail = scanner.nextLine();
                        customer.setEmail(fixEmail);
                        break;

                    case 8:
                        System.out.println("Sửa loại khách hàng: ");
                        String fixType = scanner.nextLine();
                        ((Customer) customer).setTypeCustomer(fixType);
                        break;

                    case 9:
                        System.out.println("Địa chỉ: ");
                        String fixAddress = scanner.nextLine();
                        ((Customer) customer).setAddress(fixAddress);
                        break;
                }
            } else if (!check) {
                System.out.println("ID not found!");
            }
        }
        write();
    }

    int randomId() {
        int random;
        Random rd = new Random();
        random = rd.nextInt(10);
        return random;
    }
}
