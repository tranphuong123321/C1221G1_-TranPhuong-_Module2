package luyen_tap.until;

import luyen_tap.models.SanPhamNhapKhau;
import luyen_tap.models.SanPhamXuatKhau;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {

    // phương tổng quát để ghi 1 list kiểu string vào trong file csv.Phương thức dùng chung
    public   void writeSanPhamNhapKhauToCSV(String filePath, List<SanPhamNhapKhau> nhapKhauList, boolean append){
        File file = new File(filePath);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter =null;
        try {
            fileWriter = new FileWriter(file,append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (SanPhamNhapKhau string: nhapKhauList) {
                bufferedWriter.write(string.writeToCSV());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public   void writeSanPhamXuatKhauToCSV(String filePath, List<SanPhamXuatKhau> xuatKhauList, boolean append){
        File file = new File(filePath);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter =null;
        try {
            fileWriter = new FileWriter(file,append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (SanPhamXuatKhau string: xuatKhauList) {
                bufferedWriter.write(string.writeToCSV());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // ghi một list Customer cụ thể vào CSV
//    public static void writeListCustomerToCSV(List<Customer> customerList,boolean append){
//        // chuyển đổi customerList => stringList;
//        List<String> stringList = new ArrayList<>();
//        for (Customer c: customerList) {
//            stringList.add(c.getInfoToCSV());
//        }
//        // gọi phương thức dùng chung để ghi file
//        writeListStringToCSV(CUSTOMER_FILE,stringList,append);
//    }
//    // đọc ra một danh sách Customer
//    public static List<Customer> readCustomerListFromCSV(){
//        List<Customer> customerList = new ArrayList<>();
//        // sử dụng phương thức dùng chung trả về một list dạng String
//        List<String> stringList = readListStringFromCSV(CUSTOMER_FILE);
//        String[] arr =null;
//        // Chuyển đổi list String về list Customer
//        for (String string: stringList) {
//            arr= string.split(",");
//            Customer customer = new Customer(Integer.parseInt(arr[0]),arr[1],arr[2]);
//            customerList.add(customer);
//        }
//        return customerList;
//    }

    // phương thức đọc ra một danh sách  dạng string từ csv. Phương thức dùng chung
    public   List<SanPhamNhapKhau > readSanPhamNhapKhauFromCsv(String pathFile){
        List<SanPhamNhapKhau> sanPhamNhapKhauList = new ArrayList<>();
        File file = new File(pathFile);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader=new BufferedReader(fileReader);
            String line=null;
            String[] arr;
            while ((line=bufferedReader.readLine())!=null){
                        arr = line.split(",");
                sanPhamNhapKhauList.add(new SanPhamNhapKhau(Integer.parseInt(arr[0]),arr[1],arr[2],Integer.parseInt(arr[3]),Integer.parseInt(arr[4]),arr[5],Integer.parseInt(arr[6]),arr[7],Integer.parseInt(arr[8])));
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sanPhamNhapKhauList;
    }
    public   List<SanPhamXuatKhau > readSanPhamXuatKhauFromCsv(String pathFile){
        List<SanPhamXuatKhau> sanPhamXuatKhauList = new ArrayList<>();
        File file = new File(pathFile);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader=new BufferedReader(fileReader);
            String line=null;
            String[] arr;
            while ((line=bufferedReader.readLine())!=null){
                arr = line.split(",");
                sanPhamXuatKhauList.add(new SanPhamXuatKhau(Integer.parseInt(arr[0]),arr[1],arr[2],Integer.parseInt(arr[3]),Integer.parseInt(arr[4]),arr[5],Integer.parseInt(arr[6]),arr[7]));
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sanPhamXuatKhauList;
    }
}
