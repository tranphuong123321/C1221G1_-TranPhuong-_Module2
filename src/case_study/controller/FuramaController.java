package case_study.controller;

import case_study.service.impl.*;

import java.util.Scanner;

public class FuramaController {
    static boolean check;
    static int choice = 0;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {         //Hiển thị displayMainMenu()
        displayMainMenu();
    }

    public static void displayMainMenu() {
        do {
            check = false;
            System.out.println("----DisplayMainMenu----");
            System.out.println("1.\tEmployee Management");     //Hiển thị thông tin nhân viên Furama
            System.out.println("2.\tCustomer Management");     //Hiển thị thông tin khách hàng Furama
            System.out.println("3.\tFacility Management");     //Hiển thị các dịch vụ của Furama
            System.out.println("4.\tBooking Managerment");     //Hiển thị danh sách mà khách đã booking của Furama
            System.out.println("5.\tPromotion Management");    //Hiển thị chương trình khuyến mãi của Furama
            System.out.println("6.\tExit");

            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại.");
                check = true;
                continue;
            }
            switch (choice) {
                case 1:
                    displayEmployeeMenu();
                    break;
                case 2:
                    displayCustomerMenu();
                    break;
                case 3:
                    displayFacilityMenu();
                    break;
                case 4:
                    displayBookingMenu();
                    break;
                case 5:
                    displayPromotionMenu();
                    break;
                case 6:
                    System.exit(0);
                default:
                    check = true;
                    break;
            }
        } while (check);
    }

    //Case 1:
    public static void displayEmployeeMenu() {
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        do {
            check = false;
            System.out.println("----DisplayMainMenuEmployee----");
            System.out.println("1.\tDisplay list employees");
            System.out.println("2.\tAdd new employee");
            System.out.println("3.\tEdit employee");
            System.out.println("4.\tReturn main menu");

            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại.");
                check = true;
                continue;
            }
            switch (choice) {
                case 1:
                    employeeService.display();
                    displayEmployeeMenu();
                    break;
                case 2:
                    employeeService.addNew();
                    displayEmployeeMenu();
                    break;
                case 3:
                    employeeService.edit();
                    displayEmployeeMenu();
                    break;
                case 4:
                    displayMainMenu();
                    break;
                default:
                    check = true;
                    break;
            }
        } while (check);
    }


    //Case 2:
    public static void displayCustomerMenu() {
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        do {
            check = false;
            System.out.println("----DisplayMainMenuCustomer----");
            System.out.println("1.\tDisplay list customers");
            System.out.println("2.\tAdd new customer");
            System.out.println("3.\tEdit customer");
            System.out.println("4.\tReturn main menu");

            try {
                choice = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại.");
                check = false;
                continue;
            }
            switch (choice) {
                case 1:
                    customerService.display();
                    displayCustomerMenu();
                    break;
                case 2:
                    customerService.addNew();
                    displayCustomerMenu();
                    break;
                case 3:
                    customerService.edit();
                    displayCustomerMenu();
                    break;
                case 4:
                    displayMainMenu();
                    break;
                default:
                    check = true;
                    break;
            }
        } while (check);
    }


    //Case 3:
    public static void displayFacilityMenu() {
        FacilityServiceIpml facilityServiceIpml = new FacilityServiceIpml();
        do {
            check = false;
            System.out.println("----DisplayMainMenuFacility----");
            System.out.println("1.\tDisplay list facility");
            System.out.println("2.\tAdd new facility");
            System.out.println("3.\tDisplay list facility maintenancer");
            System.out.println("4.\tReturn main menu");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại.");
            }
            switch (choice) {
                case 1:
                    facilityServiceIpml.display();
                    displayFacilityMenu();
                    break;
                case 2:
                    do {
                        check = false;
                        System.out.println("----DisplayAddFacility----");
                        System.out.println("1.\tAdd new Villa");
                        System.out.println("2.\tAdd new House");
                        System.out.println("3.\tAdd new Room");
                        System.out.println("4.\tBack to menu");
                        try {
                            choice = Integer.parseInt(scanner.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại.");
                        }
                        switch (choice) {
                            case 1:
                                facilityServiceIpml.addNewVilla();
                                displayFacilityMenu();
                                break;
                            case 2:
                                facilityServiceIpml.addNewHouse();
                                displayFacilityMenu();
                                break;
                            case 3:
                                facilityServiceIpml.addNewRoom();
                                displayFacilityMenu();
                                break;
                            case 4:
                                displayFacilityMenu();
                                break;
                        }

                    } while (check);
                    break;
                case 3:
                    facilityServiceIpml.displayMaintain();
                    displayEmployeeMenu();
                    break;
                case 4:
                    displayMainMenu();
                    break;
            }
        } while (check);
    }


    public static void displayBookingMenu() {
        BookingServiceImpl bookingService = new BookingServiceImpl();
        ContractServiceImpl contractService = new ContractServiceImpl();
        do {
            check = false;
            System.out.println("----DisplayMainMenuBooking");
            System.out.println("1.\tAdd new booking");
            System.out.println("2.\tDisplay list booking");
            System.out.println("3.\tCreate new constracts");
            System.out.println("4.\tDisplay list contracts");
            System.out.println("5.\tEdit contracts");
            System.out.println("6.\tReturn main menu");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại.");
            }

            switch (choice) {
                case 1:
                    bookingService.addBooking();
                    displayBookingMenu();
                    break;
                case 2:
                    bookingService.displayListBooking();
                    displayBookingMenu();
                    break;
                case 3:
                    contractService.createNewContract();
                    displayBookingMenu();
                    break;
                case 4:
                    contractService.displayListContract();
                    displayBookingMenu();
                    break;
                case 5:
                    displayBookingMenu();
                    break;
                case 6:
                    displayMainMenu();
                    break;
            }
        } while (check);
    }

    //Case 5:
    public static void displayPromotionMenu() {
        do {
            try {
                System.out.println("---Display List Service and Voucher---");
                System.out.println("1.\tDisplay list customers use service");
                System.out.println("2.\tDisplay list customers get voucher");
                System.out.println("3.\tReturn main menu");
                Scanner scanner = new Scanner(System.in);

                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Bạn đã nhập sai định dạng, vui lòng nhập lại.");
            }
            switch (choice) {
                case 1:
                    displayPromotionMenu();
                    break;
                case 2:
                    displayPromotionMenu();
                    break;
                case 3:
                    displayMainMenu();
                    break;
            }
        } while (check);
    }
}
