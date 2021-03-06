package Class33;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FinallyDemo {
    public static void main(String[] args) {
        FileInputStream fileInputStream=null;
        try{
        String path="C:\\Users\\joelf\\Downloads\\Batch12\\Book2.xlsx";
         fileInputStream=new FileInputStream(path);
        //special class that reads the excel files
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        //First we get the sheets by specifying the name of the sheet
        Sheet sheet=xssfWorkbook.getSheet("Sheet1");}
        catch(FileNotFoundException exception){
            System.out.println("The File that you are trying to read is not present on the provided path please check your path");
        } catch (IOException ioException) {
            System.out.println("Something with hard drive went wrong");
        }finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                System.out.println("error while closing the file");
            }

        }
        System.out.println("Now you should be able to perform other operations");
    }
}
