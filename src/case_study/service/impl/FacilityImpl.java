package case_study.service.impl;

import case_study.models.Facility;
import case_study.models.House;
import case_study.models.Room;
import case_study.models.Villa;
import case_study.service.IServiceFacility;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityImpl implements IServiceFacility {
    static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();

    static {
        readVilla();
        readRoom();
        readHouse();
    }


    public void writeCsv() {
        try {
            FileWriter fileWriterVilla = new FileWriter("D:\\code gym\\C1221G1_TranPhuong_Module2\\src\\case_study\\data\\VillaCsv");
            FileWriter fileWriterRoom = new FileWriter("D:\\code gym\\C1221G1_TranPhuong_Module2\\src\\case_study\\data\\RoomCsv");
            FileWriter fileWriterHouse = new FileWriter("D:\\code gym\\C1221G1_TranPhuong_Module2\\src\\case_study\\data\\HouseCsv");
            BufferedWriter bufferedWriterVilla = new BufferedWriter(fileWriterVilla);
            BufferedWriter bufferedWriterRoom = new BufferedWriter(fileWriterRoom);
            BufferedWriter bufferedWriterHouse = new BufferedWriter(fileWriterHouse);
            for (Map.Entry<Facility, Integer> element : facilityIntegerMap.entrySet()) {
                if (element.getKey() instanceof Villa) {
                    Villa villa = (Villa) element.getKey();
                    bufferedWriterVilla.write(villa.getServiceName() + "," + villa.getUsableArea() + "," + villa.getRentalCosts() + "," + villa.getMaximumNumberOfPeople() + "," + villa.getRentalType() + "," + villa.getRoomStandard() + "," + villa.getPoolArea() + "," + villa.getNumberOfFloors());
                    bufferedWriterVilla.newLine();
                    bufferedWriterVilla.close();
                } else if (element.getKey() instanceof House) {
                    House house = (House) element.getKey();
                    bufferedWriterHouse.write(house.getServiceName() + "," + house.getUsableArea() + "," + house.getRentalCosts() + "," + house.getMaximumNumberOfPeople() + "," + house.getRentalType() + "," + house.getRoomStandard() + "," + house.getNumberOfFloors());
                    bufferedWriterHouse.newLine();
                    bufferedWriterHouse.close();
                } else {
                    Room room = (Room) element.getKey();
                    bufferedWriterRoom.write(room.getServiceName() + "," + room.getUsableArea() + "," + room.getRentalCosts() + "," + room.getMaximumNumberOfPeople() + "," + room.getRentalType() + "," + room.getFreeServiceIncluded());
                    bufferedWriterRoom.newLine();
                    bufferedWriterRoom.close();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Map<Facility, Integer> readVilla() {
        Map<Facility, Integer> entry = new LinkedHashMap<>();
        try {
            FileReader fileReader = new FileReader("D:\\code gym\\C1221G1_TranPhuong_Module2\\src\\case_study\\data\\VillaCsv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String[] data;
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                data = line.split(",");
                Villa villa = new Villa(data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2]), Integer.parseInt(data[3]), data[4], data[5], Integer.parseInt(data[6]), Integer.parseInt(data[7]));
                entry.put(villa, 0);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return entry;
    }

    public static Map<Facility, Integer> readRoom() {
        Map<Facility, Integer> entry = new LinkedHashMap<>();
        try {
            FileReader fileReader = new FileReader("D:\\code gym\\C1221G1_TranPhuong_Module2\\src\\case_study\\data\\RoomCsv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String[] data;
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                data = line.split(",");
                Room room = new Room(data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2]), Integer.parseInt(data[3]), data[4], data[5]);
                entry.put(room, 0);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return entry;
    }

    public static Map<Facility, Integer> readHouse() {
        Map<Facility, Integer> entry = new LinkedHashMap<>();
        try {
            FileReader fileReader = new FileReader("D:\\code gym\\C1221G1_TranPhuong_Module2\\src\\case_study\\data\\HouseCsv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String[] data;
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                data = line.split(",");
                House house = new House(data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2]), Integer.parseInt(data[3]), data[4], data[5], Integer.parseInt(data[6]));
                entry.put(house, 0);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return entry;
    }


    @Override
    public void addVilla() {
        // String serviceName, int usableArea, int rentalCosts, int maximumNumberOfPeople, String rentalType, String roomStandard, int poolArea, int numberOfFloors
        Scanner scanner = new Scanner(System.in);
        System.out.println("hay nhap ten dich vu");
        String serviceName = scanner.nextLine();
        System.out.println("hay nhap dien tich su dung");
        int usableArea = Integer.parseInt(scanner.nextLine());
        System.out.println("hay nhap chi phi thue");
        int rentalCosts = Integer.parseInt(scanner.nextLine());
        System.out.println("hay nhap so nguoi toi da");
        int maximumNumberOfPeople = Integer.parseInt(scanner.nextLine());
        System.out.println("hay nhap kieu thue");
        String rentalType = scanner.nextLine();
        System.out.println("hay nhap tieu chuan phong");
        String roomStandard = scanner.nextLine();
        System.out.println("hay nhap dien tich ho boi");
        int poolArea = Integer.parseInt(scanner.nextLine());
        System.out.println("hay nhap so tang");
        int numberOfFloors = Integer.parseInt(scanner.nextLine());
        Villa villa = new Villa(serviceName, usableArea, rentalCosts, maximumNumberOfPeople, rentalType, roomStandard, poolArea, numberOfFloors);
        facilityIntegerMap.put(villa, 0);
        writeCsv();


    }

    @Override
    public void addRoom() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("hay nhap ten dich vu");
        String serviceName = scanner.nextLine();
        System.out.println("hay nhap dien tich su dung");
        int usableArea = Integer.parseInt(scanner.nextLine());
        System.out.println("hay nhap chi phi thue");
        int rentalCosts = Integer.parseInt(scanner.nextLine());
        System.out.println("hay nhap so nguoi toi da");
        int maximumNumberOfPeople = Integer.parseInt(scanner.nextLine());
        System.out.println("hay nhap kieu thue");
        String rentalType = scanner.nextLine();
        System.out.println("hay nhap dich vu mien phi di kem");
        String freeServiceIncluded = scanner.nextLine();
        Room room = new Room(serviceName, usableArea, rentalCosts, maximumNumberOfPeople, rentalType, freeServiceIncluded);
        facilityIntegerMap.put(room, 0);
        writeCsv();
    }

    @Override
    public void addHouse() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("hay nhap ten dich vu");
        String serviceName = scanner.nextLine();
        System.out.println("hay nhap dien tich su dung");
        int usableArea = Integer.parseInt(scanner.nextLine());
        System.out.println("hay nhap chi phi thue");
        int rentalCosts = Integer.parseInt(scanner.nextLine());
        System.out.println("hay nhap so nguoi toi da");
        int maximumNumberOfPeople = Integer.parseInt(scanner.nextLine());
        System.out.println("hay nhap kieu thue");
        String rentalType = scanner.nextLine();
        System.out.println("hay nhap tieu chuan phong");
        String roomStandard = scanner.nextLine();
        System.out.println("hay nhap so tang");
        int numberOfFloors = Integer.parseInt(scanner.nextLine());
        House house = new House(serviceName, usableArea, rentalCosts, maximumNumberOfPeople, rentalType, roomStandard, numberOfFloors);
        facilityIntegerMap.put(house, 0);
        writeCsv();
    }

    @Override
    public void displayListFacility() {
        for (Map.Entry<Facility, Integer> element : facilityIntegerMap.entrySet()) {
            System.out.println("dich vu: " + element.getKey() + " " + "so lan da thue: " + element.getValue());
        }
    }

    @Override
    public void displayListMaintenance() {

    }
}
