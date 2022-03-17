package case_study.service.impl;

import case_study.models.*;
import case_study.service.BookingService;
import case_study.until.BookingComparator;
import case_study.until.RegexData;

import java.io.*;
import java.util.*;

public class BookingServiceImpl implements BookingService {

    static Scanner scanner = new Scanner(System.in);

    private static final String BIRTHDAY_REGEX = "^(((0[1-9]|[12][0-9]|30)[-\\/](0[13-9]|1[012])|31[-\\/](0[13578]|1[02])|(0[1-9]|1[0-9]|2[0-8])[-\\/]02)" +
            "[-\\/](19[0-9]{2}|200[012])|29[-\\/]02[-\\/]" +
            "([0-9]{2}(([2468][048]|[02468][48])|[13579][26])|([13579][26]|[02468][048]|0[0-9]|1[0-6])00))$";

    private static final String DATE_REGEX = "^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$";

    static Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());

    static List<Customer> customerList = new ArrayList<>();

    static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();

    static {
        ReaderCustomer();

        readFacility();
    }

    public Set<Booking> sendBooking() {
        return bookingSet;
    }

    public static void ReaderCustomer() {
        try {
            FileReader fileReader = new FileReader(new File("src/case_study/data/customer"));
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String Data = null;
            while ((Data = bufferedReader.readLine()) != null) {
                String[] dataArray = Data.split(",");
                Customer customer = new Customer(dataArray[0], dataArray[1], dataArray[2], dataArray[3], dataArray[4], dataArray[5], dataArray[6], dataArray[7], dataArray[8]);
                customerList.add(customer);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void readFacility() {
        for (Map.Entry<Facility, Integer> entry : readVilla().entrySet()) {
            facilityIntegerMap.put(entry.getKey(), entry.getValue());
        }
        for (Map.Entry<Facility, Integer> entry : readHouse().entrySet()) {
            facilityIntegerMap.put(entry.getKey(), entry.getValue());
        }
        for (Map.Entry<Facility, Integer> entry : readRoom().entrySet()) {
            facilityIntegerMap.put(entry.getKey(), entry.getValue());
        }

    }

    static Map<Facility, Integer> readVilla() {
        Map<Facility, Integer> initMap = new LinkedHashMap<>();
        final String PATH_VILLA = "src/case_study/data/villa";
        try {
            FileReader fileReader = new FileReader(PATH_VILLA);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String data = null;
            while ((data = bufferedReader.readLine()) != null) {
                String[] villaArray = data.split(",");
                Villa villa = new Villa(villaArray[0], villaArray[1], Double.parseDouble(villaArray[2]), Integer.parseInt(villaArray[3]),
                        Integer.parseInt(villaArray[4]), villaArray[5], villaArray[6],
                        Double.parseDouble(villaArray[7]), Integer.parseInt(villaArray[8]));
                initMap.put(villa, 0);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return initMap;
    }

    static Map<Facility, Integer> readHouse() {
        Map<Facility, Integer> initMap = new LinkedHashMap<>();
        final String PATH_HOUSE = "src/case_study/data/house";
        try {
            FileReader fileReader = new FileReader(PATH_HOUSE);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String data = null;
            while ((data = bufferedReader.readLine()) != null) {
                String[] houseArray = data.split(",");
                House house = new House(houseArray[0],
                        houseArray[1],
                        Double.parseDouble(houseArray[2]),
                        Integer.parseInt(houseArray[3]),
                        Integer.parseInt(houseArray[4]),
                        houseArray[5],
                        houseArray[6],
                        Integer.parseInt(houseArray[7]));
                initMap.put(house, 0);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return initMap;
    }

    static Map<Facility, Integer> readRoom() {
        Map<Facility, Integer> initMap = new LinkedHashMap<>();
        final String PATH_ROOM = "src/case_study/data/room";
        try {
            FileReader fileReader = new FileReader(PATH_ROOM);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String data = null;
            while ((data = bufferedReader.readLine()) != null) {
                String[] roomArray = data.split(",");
                Room room = new Room(roomArray[0],
                        roomArray[1],
                        Double.parseDouble(roomArray[2]),
                        Integer.parseInt(roomArray[3]),
                        Integer.parseInt(roomArray[4]),
                        roomArray[5],
                        roomArray[6]);
                initMap.put(room, 0);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return initMap;
    }


    @Override
    public void addBooking() {
        int id = 1;
        if (!bookingSet.isEmpty()) {
            id = bookingSet.size();
        }
        Customer customer = chooseCustomer();
        Facility facility = chooseFacility();

        System.out.println("Nhập ngày thue phòng: ");
        String starDate = inToDay();


        System.out.println("Nhập ngày trả phòng: ");
        String endDate = inToDay();


        Booking booking = new Booking(id, starDate, endDate, customer, facility);

        bookingSet.add(booking);
        System.out.println("Đã booking thành công.");
    }

    private String inToDay(){

        return RegexData.regexStr(scanner.nextLine(), DATE_REGEX,
                "Bạn đã nhập sai định dạng, dd/MM/yyyy");
    }

    @Override
    public void displayListBooking() {
        for (Booking booking : bookingSet) {
            System.out.println(booking);
        }
    }

    public static Customer chooseCustomer() {
        System.out.println("Danh sách khách hàng: ");
        for (Customer customer : customerList) {
            System.out.println(customer);
        }

        System.out.println("Nhập id khách hàng: ");
        boolean check = true;
        String id = scanner.nextLine();

        while (check) {
            for (Customer customer : customerList) {
                if (customer.getId().equals(id)) {
                    check = false;

                    return customer;
                }
            }
            if (check) {
                System.out.println("Bạn đã nhập sai, vui lòng nhập id khách hàng: ");
                id = scanner.nextLine();
            }
        }
        return null;
    }

    public static Facility chooseFacility() {
        System.out.println("Danh sách dịch vụ: ");
        for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
            System.out.println(entry.getKey());
        }

        System.out.println("Nhập id dịch vụ: ");
        boolean check = true;

        while (check) {
            String id = scanner.nextLine();
            for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
                if (id.equals(entry.getKey().getIdFacility())) {
                    check = false;
                    return entry.getKey();
                }
            }
            if (check) {
                System.out.println("Bạn đã nhập sai, vui lòng nhập id dịch vụ: ");
                id = scanner.nextLine();
            }
        }
        return null;
    }
}
