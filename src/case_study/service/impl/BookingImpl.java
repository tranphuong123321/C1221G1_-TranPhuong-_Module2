package case_study.service.impl;

import case_study.models.Booking;
import case_study.models.Villa;
import case_study.service.IServiceBooking;

import java.util.Scanner;

public class BookingImpl implements IServiceBooking {
    @Override
    public void bookVilla() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("hay nhap ma booking");
        int idBooking = Integer.parseInt(scanner.nextLine());
        System.out.println("hay nhap ngay bat dau");
        String startDay = scanner.nextLine();
        System.out.println("hay nhap ngay ket thuc");
        String endDay = scanner.nextLine();
        System.out.println("hay nhap ma khach hang");
        int idCustomer = Integer.parseInt(scanner.nextLine());
        System.out.println("hay nhap ten dich vu");
        String serviceName = scanner.nextLine();
        System.out.println("hay nhap ten dich vu");
        String typeOfService = scanner.nextLine();
        Booking booking=new Booking();

    }

    @Override
    public void bookHouse() {

    }

    @Override
    public void bookRoom() {

    }

    @Override
    public void displayBooking() {

    }
}
