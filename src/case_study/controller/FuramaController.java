package case_study.controller;

import case_study.service.impl.*;

import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        FuramaController furamaController = new FuramaController();
        furamaController.displayMainMenu();
    }

    public void displayMainMenu() {
        boolean check = true;
        while (check) {
            System.out.println("1.\tEmployee Management");
            System.out.println("2.\tCustomer Management");
            System.out.println("3.\tFacility Management");
            System.out.println("4.\tBooking Management");
            System.out.println("5.\tPromotion Management");
            System.out.println("6.\tExit");
            Scanner scanner = new Scanner(System.in);
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    employeeManagement();
                    break;
                case 2:
                    customerManagement();
                    break;
                case 3:
                    facilityManagement();
                    break;
                case 4:
                    bookingManagerment();
                    break;
            }
        }
    }

    public void employeeManagement() {
        EmployeeImpl employee = new EmployeeImpl();
        System.out.println("1\tDisplay list employees");
        System.out.println("2\tAdd new employee");
        System.out.println("3\tEdit employee");
        System.out.println("4\tReturn main menu");
        Scanner scanner = new Scanner(System.in);
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                employee.disPlay();
                break;
            case 2:
                employee.addNew();
                break;
            case 3:
                employee.edit();
                break;
            case 4:
                displayMainMenu();
                break;
        }
    }

    public void customerManagement() {
        CustomerImpl customer = new CustomerImpl();
        System.out.println("1\tDisplay list customers");
        System.out.println("2\tAdd new customer");
        System.out.println("3\tEdit customer");
        System.out.println("4\tReturn main menu");
        Scanner scanner = new Scanner(System.in);
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                customer.disPlay();
                break;
            case 2:
                customer.addNew();
                break;
            case 3:
                customer.edit();
                break;
            case 4:
                displayMainMenu();
                break;
        }
    }

    public void facilityManagement() {
        FacilityImpl facility=new FacilityImpl();
        System.out.println("1\tDisplay list facility");
        System.out.println("2\tAdd new facility");
        System.out.println("3\tDisplay list facility maintenance");
        System.out.println("4\tReturn main menu");
        Scanner scanner = new Scanner(System.in);
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                facility.displayListFacility();
                break;
            case 2:
                System.out.println("1.Add Villa");
                System.out.println("2.Add House");
                System.out.println("3.Add Room");
                choice=Integer.parseInt(scanner.nextLine());
                switch (choice){
                    case 1:
                        facility.addVilla();
                        break;
                    case 2:
                        facility.addHouse();
                        break;
                    case 3:
                        facility.addRoom();
                        break;

                }
            case 3:
                facility.displayListMaintenance();
                break;
            case 4:
                displayMainMenu();
                break;
        }
    }

    public void bookingManagerment() {
        BookingVillaImpl booking=new BookingVillaImpl();
        ConstractImpl constract=new ConstractImpl();
        System.out.println("1.\tAdd new booking");
        System.out.println("2.\tDisplay list booking");
        System.out.println("3.\tCreate new constracts");
        System.out.println("4.\tDisplay list contracts");
        System.out.println("5.\tEdit contracts");
        System.out.println("6.\tReturn main menu");
        Scanner scanner = new Scanner(System.in);
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                System.out.println("1.Book Villa");
                System.out.println("2.Book House");
                System.out.println("3.Book Room");
                 choice= Integer.parseInt(scanner.nextLine());
                 switch (choice){
                     case 1:
                         booking.bookVilla();
                         break;
                     case 2:
                         booking.bookHouse();
                         break;
                     case 3:
                         booking.bookRoom();
                         break;

                 }
            case 2:
                booking.displayBooking();
                break;
            case 3:
                constract.creatConstract();
                break;
            case 4:
                constract.displayConstract();
                break;
            case 5:
                constract.editConstract();
                break;
            case 6:
                displayMainMenu();
                break;


        }
    }

    public void promotionManagement() {
        System.out.println("1.\tDisplay list customers use service");
        System.out.println("2.\tDisplay list customers get voucher");
        System.out.println("3.\tReturn main menu");
        Scanner scanner = new Scanner(System.in);
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:

        }
    }
}
