package case_study.service.impl;

import case_study.models.Booking;
import case_study.models.Contract;
import case_study.models.Customer;
import case_study.service.ContractService;

import java.util.*;

public class ContractServiceImpl implements ContractService {

    static List<Contract> contractList = new ArrayList<>();

    static Scanner scanner = new Scanner(System.in);

    @Override
    public void createNewContract() {
        Queue<Booking> bookingQueue = new LinkedList<>();
        Set<Booking> bookingSet = new BookingServiceImpl().sendBooking();

        for (Booking booking : bookingSet) {
            bookingQueue.add(booking);
        }
        while (!bookingQueue.isEmpty()) {
            Booking booking = bookingQueue.poll();
            Customer customer = booking.getCustomer();
            System.out.println("Đang tạo hợp đồng cho Booking có thông tin: " + booking);
            System.out.println("Đang tạo hợp đồng cho khách hàng có thông tin: " + customer.toString());
            System.out.println("Nhập id hợp đồng: ");
            String id = scanner.nextLine();

            System.out.println("Nhập số tiền trả trước: ");
            String pre = scanner.nextLine();
            System.out.println("Nhập số chi phí: ");
            String pay = scanner.nextLine();
            Contract contract = new Contract(id, booking, pre, pay, customer);
            contractList.add(contract);
            System.out.println("Đã tạo hợp đồng thành công: " + contract);
        }
    }

    @Override
    public void displayListContract() {
        for (Contract contract : contractList) {
            System.out.println(contract.toString());
        }
    }

    @Override
    public void editContract() {

    }
}
