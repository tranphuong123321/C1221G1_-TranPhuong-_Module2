package case_study.service.impl;

import case_study.models.Employee;
import case_study.service.IServiceEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeImpl implements IServiceEmployee {
    static List<Employee> employeeList = new ArrayList<>();


    @Override
    public void addNew() {


        // String level, String position, int salary
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
            }
            System.out.println("hay nhap so CMND");
            int idCard = Integer.parseInt(scanner.nextLine());
            System.out.println("hay nhap so dien thoai");
            int numberPhone = Integer.parseInt(scanner.nextLine());
            System.out.println("hay nhap email");
            String email = scanner.nextLine();
            System.out.println("hay nhap trinh do");
            System.out.println("1.Trung cấp");
            System.out.println("2.Cao đẳng");
            System.out.println("3.Đại học ");
            System.out.println("4.Sau Đại học ");
            String level = " ";
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    level = "Trung cấp";
                    break;
                case 2:
                    level = "Cao đẳng";
                    break;
                case 3:
                    level = "Đại học";
                    break;
                case 4:
                    level = "Sau Đại học";
                    break;
            }
            System.out.println("hay nhap vi tri");
            System.out.println("1.Lễ tân");
            System.out.println("2.Phục vụ");
            System.out.println("3.Chuyên viên");
            System.out.println("4.Giám sát");
            System.out.println("5.Quản lý");
            System.out.println("6.Giám đốc");
            String position = " ";
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    position = "Lễ tân";
                    break;
                case 2:
                    position = "Phục vụ";
                    break;
                case 3:
                    position = "Chuyên viên";
                    break;
                case 4:
                    position = "Giám sát";
                    break;
                case 5:
                    position = "Quản lý";
                    break;
                case 6:
                    position = "Giám đốc";
                    break;
            }
            System.out.println("hay nhap luong");
            int salary = Integer.parseInt(scanner.nextLine());
            Employee employee = new Employee(id, name, birthDay, gender, idCard, numberPhone, email, level, position, salary);
            employeeList.add(employee);
            break;
        }
    }

    @Override
    public void edit() {
        //id, name, birthDay, gender, idCard, numberPhone, email, level, position, salary
        Scanner scanner = new Scanner(System.in);
        System.out.println("hay nhap id muon sua");
        int fixId = Integer.parseInt(scanner.nextLine());
        boolean check = false;
        for (Employee employee : employeeList) {
            System.out.println(employee.getId());
            if (employee.getId() == fixId) {
                check = true;
                System.out.println("Ban muon sua cai gi");
                System.out.println("Ban muon sua cai gi");


            }
        }

    }

    @Override
    public void disPlay() {
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }
}
