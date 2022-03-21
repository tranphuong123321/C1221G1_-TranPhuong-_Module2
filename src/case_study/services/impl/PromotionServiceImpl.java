package case_study.services.impl;

import case_study.models.Booking;
import case_study.services.IPromotionService;
import case_study.untils.ReadAndWriteCSVFile;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;



public class PromotionServiceImpl implements IPromotionService {
    private static final String BOOKING_FILE_PATH = "src/case_study/data/Booking.csv";
    Set<Booking> bookingSet = ReadAndWriteCSVFile.readBookingFromCSVFile(BOOKING_FILE_PATH);
    Scanner sc = new Scanner(System.in);

    public static final String YEAR_REGEX = "^\\d{4}$";

    @Override
    public void displayListCustumersUseService() {
        Scanner sc = new Scanner(System.in);
//        System.out.println(bookingSet);
        boolean flag = false;

        String yearInput;
        do {
            System.out.print("Enter year: ");
            yearInput = sc.nextLine();
            if (!yearInput.matches(YEAR_REGEX)) {
                System.out.println("Please try again,yyyy.\n");
            }
        } while (!yearInput.matches(YEAR_REGEX));
        System.out.println("--------------Customer list book in " + yearInput + "--------------");
        for (Booking booking : bookingSet) {
            if (booking.getStartDay().contains(yearInput) || booking.getEndDay().contains(yearInput)) {
                System.out.println(booking);
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("-Empty-");
        }
        System.out.println("----------------------------------------------");
    }

    @Override
    public void displayListCustumersGetVoucher() {
        Stack<Booking> bookingStack = new Stack<>();

        Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        String year = String.valueOf(localDate.getYear());
        int month = localDate.getMonthValue();

        for (Booking booking : bookingSet) {
            if (booking.getStartDay().contains(year) || booking.getEndDay().contains(year)) {
                if (Integer.parseInt(booking.getStartDay().substring(3, 5)) == month
                        || Integer.parseInt(booking.getEndDay().substring(3, 5)) == month) {
                    bookingStack.push(booking);
                }
            }
        }

        if (bookingStack.isEmpty()) {
            System.out.println("Empty list.");
        } else {
            System.out.println(bookingStack);
            System.out.println("Number of booking of this month(" + month + ") is: " + bookingStack.size());
            int voucher10;
            while (true) {
                try {
                    System.out.print("Enter number of 10% voucher: ");
                    voucher10 = Integer.parseInt(sc.nextLine());
                    if (voucher10 >= 0) {
                        break;
                    } else {
                        System.out.println("Number of 10% voucher have to be positive number.\n" +
                                "Please try again.\n");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number.\n" +
                            "Please try again.\n");
                } catch (Exception e) {
                    System.out.println("Wrong format.\n" +
                            "Please try again.\n");
                }
            }

            int voucher20;
            while (true) {
                try {
                    System.out.print("Enter number of 20% voucher: ");
                    voucher20 = Integer.parseInt(sc.nextLine());
                    if (voucher20 >= 0) {
                        break;
                    } else {
                        System.out.println("Number of 20% voucher have to be positive number.\n" +
                                "Please try again.\n");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number." +
                            "Please try again.\n");
                } catch (Exception e) {
                    System.out.println("Wrong format." +
                            "Please try again.\n");
                }
            }

            int voucher50;
            while (true) {
                try {
                    System.out.print("Enter number of 50% voucher: ");
                    voucher50 = Integer.parseInt(sc.nextLine());
                    if (voucher50 >= 0) {
                        break;
                    } else {
                        System.out.println("Number of 50% voucher have to be positive number.\n" +
                                "Please try again.\n");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number.\n" +
                            "Please try again.\n");
                } catch (Exception e) {
                    System.out.println("Wrong format.\n" +
                            "Input again.\n");
                }
            }

            Map<String, Integer> voucherTreeMap = new TreeMap<>();
            voucherTreeMap.put("voucher10", voucher10);
            voucherTreeMap.put("voucher20", voucher20);
            voucherTreeMap.put("voucher50", voucher50);
            System.out.println(voucherTreeMap);
            int size = bookingStack.size();
            for (int i = 0; i < size; i++) {
                if (voucherTreeMap.get("voucher10") > 0) {
                    System.out.println(bookingStack.pop() + " get voucher 10%!");
                    voucherTreeMap.put("voucher10", voucherTreeMap.get("voucher10") - 1);
                } else if (voucherTreeMap.get("voucher20") > 0) {
                    System.out.println(bookingStack.pop() + " get voucher 20%!");
                    voucherTreeMap.put("voucher20", voucherTreeMap.get("voucher20") - 1);
                } else if (voucherTreeMap.get("voucher50") > 0) {
                    System.out.println(bookingStack.pop() + " get voucher 50%!");
                    voucherTreeMap.put("voucher50", voucherTreeMap.get("voucher50") - 1);
                } else {
                    System.out.println("Run out of voucher!!!");
                    break;
                }
            }
        }
    }
}
