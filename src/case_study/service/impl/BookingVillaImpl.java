package case_study.service.impl;

import case_study.models.Booking;
import case_study.models.BookingVilla;
import case_study.service.IServiceBookingVilla;

import java.util.Scanner;

public class BookingVillaImpl implements IServiceBookingVilla {
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
        BookingVilla bookingVilla=new BookingVilla(idBooking,  startDay,  endDay, idCustomer, serviceName,  typeOfService);


    }





    @Override
    public void displayBookingVilla() {

    }
}
