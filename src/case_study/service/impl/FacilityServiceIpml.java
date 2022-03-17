package case_study.service.impl;

import case_study.models.Facility;
import case_study.models.House;
import case_study.models.Room;
import case_study.models.Villa;
import case_study.service.FacilityService;
import case_study.until.RegexData;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class FacilityServiceIpml implements FacilityService {
    static Map<Facility, Integer> initMap = new LinkedHashMap<>();
    //Đường dẫn link
    static final String PATH_VILLA = "src/case_study/data/villa";
    static final String PATH_HOUSE = "src/case_study/data/house";
    static final String PATH_ROOM = "src/case_study/data/room";

    //String Regex
    public static final String REGEX_STR = "[A-Z][a-zA-Z]+";   //Tên dịch vụ, kiểu thuê, tiêu chuẩn
    public static final String REGEX_FLOOR = "[1-9]{1,}";       //Số tầng
    public static final String REGEX_AMOUNT = "^[0-9]*[1-9][0-9]*$";       //Giá tiền
    public static final String REGEX_INT = "^[1-9]|([1][0-9])$";  //Số lượng người
    public static final String REGEX_AREA = "^([0-9]{3,}|[3-9][0-9]{1,})$";    //Diện tích > 30


    private static String inputName() {
        return RegexData.regexStr(scanner.nextLine(), REGEX_STR,
                "Bạn đã nhập sai định dạng, tên dịch vụ phải viết hoa chữ cái đầu");
    }

    private static String inputArea() {
        return RegexData.regexStr(scanner.nextLine(), REGEX_AREA,
                "Bạn đã nhập sai định dạng, diện tích phải hơn 30");
    }

    private static String inputTotalPlay() {
        return RegexData.regexStr(scanner.nextLine(), REGEX_AMOUNT,
                "Bạn đã nhập sai định dạng, giá tiền phải là số dương");
    }

    private static String inputMaxPeople() {
        return RegexData.regexStr(scanner.nextLine(), REGEX_INT,
                "Bạn đã nhập sai, vui lòng nhập lại");
    }

    private static String inputFloor() {
        return RegexData.regexStr(scanner.nextLine(), REGEX_FLOOR,
                "Bạn đã nhập sai vui lòng nhập lại");
    }


    private static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    static boolean check;
    static int choose;
    static String rentStyle = "";

    static {
        readFacility();
    }

    @Override
    public void display() {
        for (Map.Entry<Facility, Integer> element : facilityIntegerMap.entrySet()) {
            System.out.println("Sever " + element.getKey() + " số lần thuê: " + element.getValue());
        }
    }

    @Override
    public void displayMaintain() {
        for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
            if (entry.getValue() > 4) {
                System.out.println(entry.getKey());
            }
        }
    }

    @Override
    public void addNewVilla() {

        String id = "SVVL-" + randomId() + randomId() + randomId() + randomId();

        System.out.println("Nhập tên dịch vụ của VIILA: ");
        String name = inputName();

        System.out.println("Nhập diện tích sử dụng của VIILA: ");
        double area = Double.parseDouble(inputArea());

        System.out.println("Nhập chi phí thuê của VIILA: ");
        int price = Integer.parseInt(inputTotalPlay());


        System.out.println("Nhập số lượng người của VIILA:");
        int people = Integer.parseInt(inputMaxPeople());

        do {
            check = false;
            System.out.println("Kiểu thuê của VIILA: " + "\n"
                    + "1.Năm " + " 2.Tháng " + " 3.Ngày " + " 4.Giờ ");
            try {
                choose = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Bạn đã nhập sai vui lòng nhập lại");
                check = true;
                continue;
            }
            switch (choose) {
                case 1:
                    rentStyle = "Năm";
                    break;
                case 2:
                    rentStyle = "Tháng";
                    break;
                case 3:
                    rentStyle = "Ngày";
                    break;
                case 4:
                    rentStyle = "Giờ";
                    break;
                default:
                    check = true;
                    break;
            }
        }while (check);


        System.out.println("Nhập tiêu chuẩn Phòng của VIILA: ");
        String standard = inputName();

        System.out.println("Nhập diện tích hồ bơi của VIILA:");
        double arePool = Double.parseDouble(inputArea());

        System.out.println("Nhập Số tầng của VIILA: ");
        int floor = Integer.parseInt(inputFloor());

        Villa villa = new Villa(id, name, area, price, people, rentStyle, standard, arePool, floor);
        facilityIntegerMap.put(villa, 0);
        write();
        System.out.println("Đã Thêm Villa Thành công");
    }


    @Override
    public void addNewHouse() {

        String id = "SVHO-" + randomId() + randomId() + randomId() + randomId();

        System.out.println("Nhập tên dịch vụ của HOUSE: ");
        String name = inputName();

        System.out.println("Nhập diện tích sử dụng của HOUSE: ");
        double area = Double.parseDouble(inputArea());

        System.out.println("Nhập chi phí thuê của HOUSE: ");
        int price = Integer.parseInt(inputTotalPlay());

        System.out.println("Nhập số lượng người của HOUSE: ");
        int people = Integer.parseInt(inputMaxPeople());


        do {
            check = false;
            System.out.println("Kiểu thuê của HOUSE: "
                    + "1.Năm" + "\n"
                    + "2.Tháng" + "\n"
                    + "3.Ngày" + "\n"
                    + "4.Giờ");
            try {
                choose = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Bạn đã nhập sai vui lòng nhập lại");
                check = true;
                continue;
            }
            switch (choose) {
                case 1:
                    rentStyle = "Năm";
                    break;
                case 2:
                    rentStyle = "Tháng";
                    break;
                case 3:
                    rentStyle = "Ngày";
                    break;
                case 4:
                    rentStyle = "Giờ";
                    break;
                default:
                    check = true;
                    break;
            }
        }while (check);

        System.out.println("Nhập tiêu chuẩn phòng của HOUSE: ");
        String roomStandard = scanner.nextLine();

        System.out.println("Nhập Số tầng của HOUSE: ");
        int floor = Integer.parseInt(inputFloor());

        House house = new House(id, name, area, price, people, rentStyle, roomStandard, floor);
        facilityIntegerMap.put(house, 0);
        write();
        System.out.println("Đã thêm mới House thành công");

    }

    @Override
    public void addNewRoom() {

        String id = "SVRO-" + randomId() + randomId() + randomId() + randomId();

        System.out.println("Nhập tên dịch vụ của ROOM: ");
        String name = inputName();

        System.out.println("Nhập diện tích sử dụng của ROOM: ");
        double area = Double.parseDouble(inputArea());

        System.out.println("Nhập chi phí thuê của ROOM: ");
        int price = Integer.parseInt(inputTotalPlay());

        System.out.println("Nhập số lượng người của ROOM");
        int people = Integer.parseInt(inputMaxPeople());
        scanner.nextLine();

        do{
            check = false;
            System.out.println("Kiểu thuê của ROOM"
                    + "1.Năm" + "\n"
                    + "2.Tháng" + "\n"
                    + "3.Ngày" + "\n"
                    + "4.Giờ");
            try {
                choose = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Bạn đã nhập sai vui lòng nhập lại");
                check = true;
                continue;
            }
            switch (choose) {
                case 1:
                    rentStyle = "Năm";
                    break;
                case 2:
                    rentStyle = "Tháng";
                    break;
                case 3:
                    rentStyle = "Ngày";
                    break;
                case 4:
                    rentStyle = "Giờ";
                    break;
                default:
                    check = true;
                    break;
            }
        }while (check);

        System.out.println("Dịch vụ miễn phí đi kèm của ROOM");
        String freeServiceIncluded = scanner.nextLine();

        Room room = new Room(id, name, area, price, people, rentStyle, freeServiceIncluded);
        facilityIntegerMap.put(room, 0);
        write();
        System.out.println("Đã thêm mới villa thành công");
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
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return initMap;
    }

    static Map<Facility, Integer> readHouse() {
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
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return initMap;
    }

    static Map<Facility, Integer> readRoom() {
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
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return initMap;
    }

    public void write() {
        try {
            FileWriter fileWriterVilla = new
                    FileWriter(PATH_VILLA);
            BufferedWriter bufferedWriter = new
                    BufferedWriter(fileWriterVilla);
            FileWriter fileWriterHouse = new
                    FileWriter(PATH_HOUSE);
            BufferedWriter bufferedWriterHouse = new BufferedWriter(fileWriterHouse);
            FileWriter fileWriterRoom = new
                    FileWriter(PATH_ROOM);
            BufferedWriter bufferedWriterRoom = new BufferedWriter(fileWriterRoom);
            for (Map.Entry<Facility, Integer> element : facilityIntegerMap.entrySet()) {
                if (element.getKey() instanceof Villa) {
                    Villa villa = (Villa) element.getKey();
                    bufferedWriter.write(villa.getIdFacility()
                            + "," + villa.getNameService()
                            + "," + villa.getAreaUse()
                            + "," + villa.getRentalPrice()
                            + "," + villa.getRentalPeopleMax()
                            + "," + villa.getStyleRental()
                            + "," + villa.getStandardVilla()
                            + "," + villa.getArePool()
                            + "," + villa.getFloor());
                    bufferedWriter.close();
                } else if (element.getKey() instanceof House) {
                    House house = (House) element.getKey();
                    bufferedWriterHouse.write(house.getIdFacility()
                            + "," + house.getNameService()
                            + "," + house.getAreaUse()
                            + "," + house.getRentalPrice()
                            + "," + house.getRentalPeopleMax()
                            + "," + house.getStyleRental()
                            + "," + house.getRoomStandard()
                            + "," + house.getNumberOfFloors());
                    bufferedWriterHouse.close();
                } else if (element.getKey() instanceof Room) {
                    Room room = (Room) element.getKey();
                    bufferedWriterRoom.write(room.getIdFacility()
                            + "," + room.getNameService()
                            + "," + room.getAreaUse()
                            + "," + room.getRentalPrice()
                            + "," + room.getStyleRental()
                            + "," + room.getRentalPeopleMax()
                            + "," + room.getFreeServiceIncluded());
                    bufferedWriterRoom.close();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    int randomId() {
        int random;
        Random rd = new Random();
        random = rd.nextInt(10);
        return random;
    }
}
