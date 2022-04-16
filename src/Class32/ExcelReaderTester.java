package Class32;

import Util.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ExcelReaderTester {
    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\joelf\\Downloads\\Batch12\\Book4.xlsx";
        List<Map<String,String>> excelData= ExcelReader.getData(path,"Sheet1");
        System.out.println(excelData.get(1).get("FirstName"));
    }
}
