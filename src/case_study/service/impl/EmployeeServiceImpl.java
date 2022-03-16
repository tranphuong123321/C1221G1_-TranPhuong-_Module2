package case_study.service.impl;


import case_study.models.Employee;
import case_study.service.EmployeeService;
import case_study.until.RegexData;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    private static List<Employee> employeeList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static final String BIRTHDAY_REGEX = "^(((0[1-9]|[12][0-9]|30)[-\\/](0[13-9]|1[012])|31[-\\/](0[13578]|1[02])|(0[1-9]|1[0-9]|2[0-8])[-\\/]02)" +
            "[-\\/](19[0-9]{2}|200[012])|29[-\\/]02[-\\/]" +
            "([0-9]{2}(([2468][048]|[02468][48])|[13579][26])|([13579][26]|[02468][048]|0[0-9]|1[0-6])00))$";
    private static final String EY_IDCARD = "^[0-9]{9}$";
    private static final String EY_NUMPHONE = "^09[0-9]{7}$";
    private static final String EY_EMAIL = "^[A-Za-z0-9]+[A-Za-z0-9]*@gmail.com$";
    private static final String EY_SALARY = "^[1-9][0-9]{2,}$";

    static {
         ReaderEmployee();
    }

    public static void ReaderEmployee() {
        try {
            FileReader fileReader = new FileReader(new File("src/case_study/data/employee"));
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String Data;
            String[] temp;
            Employee employee;
            while ((Data = bufferedReader.readLine()) != null) {
                temp = Data.split(",");
                employee = new Employee(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7], temp[8], temp[9]);
                employeeList.add(employee);

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
            FileWriter fileWriter = new FileWriter(new File("src/case_study/data/employee"));
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Employee employee : employeeList) {

                bufferedWriter.write(employee.getId()
                        + "," + employee.getName()
                        + "," + employee.getAge()
                        + "," + employee.getSex()
                        + "," + employee.getIdCard()
                        + "," + employee.getNumBerPhone()
                        + "," + employee.getEmail()
                        + "," + employee.getLevel()
                        + "," + employee.getPosition()
                        + "," + employee.getSalary()
                        + "\n");
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void display() {
        if (employeeList.size() == 0) {
            System.out.println("Hiện tại chưa có danh sách nhân viên");
        } else {
            for (Employee employee : employeeList) {
                System.out.println(employee.toString());
            }
        }

    }

    @Override
    public void addNew() {
        boolean check = true;
        int choose = 0;
        String sex = "";
        String level = "";
        String position = "";

        String id = "NV-" +randomId()+randomId();

        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();

        System.out.println("Nhập ngày sinh: ");
        String age = RegexData.regexAge(scanner.nextLine(), BIRTHDAY_REGEX);

        do {
            check = false;
            System.out.println("Giới Tính");
            System.out.println("1. Nam.");
            System.out.println("2. Nữ");
            System.out.println("3. 3D");
            try {
                choose = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Bạn đã chọn sai vui lòng chọn đúng giới tính");
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
            check = false;
            System.out.println("Trình độ");
            System.out.println("1. Trung Cấp.");
            System.out.println("2. Cao Đẳng");
            System.out.println("3. Đại Học");
            System.out.println("4. Sau đại Học");
            try {
                choose = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Bạn nhập sai định dạng vui lòng nhập chữ số");
                check = true;
                continue;
            }
            switch (choose) {
                case 1:
                    level = "Trung cấp";
                    break;
                case 2:
                    level = "Cao Đẳng";
                    break;
                case 3:
                    level = "Đại học";
                    break;
                case 4:
                    level = "Sau đại Học";
                    break;
                default:
                    check = true;
                    break;
            }
        } while (check);

        do {
            check = false;
            System.out.println("Vị trí");
            System.out.println("1. Lễ tân.");
            System.out.println("2. Phục vụ");
            System.out.println("3. Chuyên viên.");
            System.out.println("4. Giám sát");
            System.out.println("5. Quản lý");
            System.out.println("6. Giám đốc");
            try {
                choose = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Bạn đã nhập sai vui lòng nhập lại");
                check = true;
                continue;
            }
            switch (choose) {
                case 1:
                    position = "Lễ tân";
                    break;
                case 2:
                    position = "Cao Đẳng";
                    break;
                case 3:
                    position = "Đại học";
                    break;
                case 4:
                    position = "Sau đại Học";
                    break;
                default:
                    check = true;
                    break;
            }
        } while (check);

        System.out.println("Nhập lương: ");
        String salary = inputSalary();

        Employee employee = new Employee(id, name, age, sex, idCard, numberphone, email, level, position, salary);
        employeeList.add(employee);
        System.out.println(employeeList.size());
        write();
        System.out.println("Đã thêm thành công nhân viên");

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

    private String inputSalary() {
        return RegexData.regexStr(scanner.nextLine(), EY_SALARY,
                "Bạn phải nhập số, vui lòng nhập lại");
    }

    @Override
    public void edit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên nhân viên mà bạn muốn sữa đổi thông tin: ");
        String name = scanner.nextLine();
        List<Employee> editList = new ArrayList<>();
        for (Employee employee : employeeList) {
            if (employee.getName().contains(name)) {
                editList.add(employee);
            }
        }
        if (editList.size() < 1) {
            System.out.println("Không có người bạn muốn tìm.");
        } else if (editList.size() == 1) {
            Employee employee = editList.get(0);
            for (Employee employee1 : employeeList) {
                if (employee1.getId().equals(employee.getId())) {
                    String oldID = employee1.getId();
                    String numID = oldID.substring(2);
                    String position = scanner.nextLine();
                    String newID = position + numID;
                    employee1.setId(newID);
                    employee1.setName(scanner.nextLine());
                    employee1.setAge(scanner.nextLine());
                    employee1.setSex(scanner.nextLine());
                    employee1.setIdCard(scanner.nextLine());
                    employee1.setNumBerPhone(scanner.nextLine());
                    employee1.setEmail(scanner.nextLine());
                    employee1.setLevel(scanner.nextLine());
                    employee1.setPosition(scanner.nextLine());
                    employee1.setSalary(scanner.nextLine());
                }
            }
            write();
        }
    }

    int randomId(){
        int random;
        Random rd = new Random();
        random = rd.nextInt(10);
        return random;
    }
}



