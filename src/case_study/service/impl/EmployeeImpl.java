package case_study.service.impl;

import case_study.models.Customer;
import case_study.models.Employee;
import case_study.service.IServiceEmployee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeImpl implements IServiceEmployee {
    static List<Employee> employeeList = new ArrayList<>();

    static {
        employeeList = readerEmployee();
    }

    public void writeCsv() {
        try {
            FileWriter fileWriter = new FileWriter("D:\\code gym\\C1221G1_TranPhuong_Module2\\src\\case_study\\data\\EmployeeCsv");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Employee employee : employeeList) {
                bufferedWriter.write(employee.getId() + "," + employee.getName() + "," + employee.getBirthDay() + "," + employee.getGender() + "," + employee.getGender() + "," + employee.getNumberPhone() + "," + employee.getEmail() + "," + employee.getLevel() + "," + employee.getPosition() + "," + employee.getSalary());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Employee> readerEmployee() {
        try {
            FileReader fileReader = new FileReader("D:\\code gym\\C1221G1_TranPhuong_Module2\\src\\case_study\\data\\EmployeeCsv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String[] data;
            String line;
            //  int id, String name, int birthDay, String gender, int idCard, int numberPhone, String email, String level, String position, int salary
            while ((line = bufferedReader.readLine()) != null) {
                data = line.split(",");
                Employee employee = new Employee(Integer.parseInt(data[0]), data[1], Integer.parseInt(data[2]), data[3], Integer.parseInt(data[4]), Integer.parseInt(data[5]), data[6], data[7], data[8], Integer.parseInt(data[9]));
                employeeList.add(employee);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();

        }
        return employeeList;
    }


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
            writeCsv();
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
                System.out.println("1. sua ten");
                System.out.println("2. sua ngay sinh");
                System.out.println("3. sua gioi tinh");
                System.out.println("4. sua CMND");
                System.out.println("5. sua so dien thoai");
                System.out.println("6. sua email");
                System.out.println("7. sua trinh do");
                System.out.println("8. sua vi tri");
                System.out.println("9. sua luong");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("sua ten");
                        String fixName = scanner.nextLine();
                        employee.setName(fixName);
                        break;
                    case 2:
                        System.out.println("sua ngay sinh");
                        int fixBirthDay = Integer.parseInt(scanner.nextLine());
                        employee.setBirthDay(fixBirthDay);
                        break;
                    case 3:
                        System.out.println("sua gioi tinh");
                        String fixGenDer = scanner.nextLine();
                        employee.setGender(fixGenDer);
                        break;
                    case 4:
                        System.out.println("sua CMND");
                        int fixIdCard = Integer.parseInt(scanner.nextLine());
                        employee.setIdCard(fixIdCard);
                        break;
                    case 5:
                        System.out.println("sua so dien thoai");
                        int fixNumberPhone = Integer.parseInt(scanner.nextLine());
                        employee.setNumberPhone(fixNumberPhone);
                        break;
                    case 6:
                        System.out.println("sua mail");
                        String fixMail = scanner.nextLine();
                        employee.setEmail(fixMail);
                        break;
                    case 7:
                        System.out.println("sua trinh do");
                        String fixLevel = scanner.nextLine();
                        employee.setLevel(fixLevel);
                        break;
                    case 8:
                        System.out.println("sua vi tri");
                        String fixPosition = scanner.nextLine();
                        employee.setPosition(fixPosition);
                        break;
                    case 9:
                        System.out.println("sua luong");
                        int fixSalary = Integer.parseInt(scanner.nextLine());
                        employee.setSalary(fixSalary);
                        break;
                }
                writeCsv();
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
