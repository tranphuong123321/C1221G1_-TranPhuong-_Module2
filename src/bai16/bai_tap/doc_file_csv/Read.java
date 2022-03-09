package bai_16.bai_tap.doc_file_csv;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

public class Read {
    public static void main(String[] args) {
        File file=new File("D:\\up_git\\ca\\src\\ss16_io_text_file\\read_file_csv\\text.csv");
        try {
            BufferedReader rd= Files.newBufferedReader(file.toPath(), StandardCharsets.UTF_8);
            String line=null;
            while (true){
                line=rd.readLine();
                if(line==null){
                    break;
                }else{
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
