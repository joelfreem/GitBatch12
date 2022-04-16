package Class32;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelDemo3 {

    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\joelf\\Downloads\\Batch12\\Book2.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        //special class that reads the excel files
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        //First we get the sheets by specifying the name of the sheet
        Sheet sheet=xssfWorkbook.getSheet("Sheet1");
        for(int i=0; i<sheet.getPhysicalNumberOfRows();i++){
            Row row= sheet.getRow(i);
            for(int j=0;j<row.getPhysicalNumberOfCells();j++){
                Cell cell=row.getCell(j);
                System.out.println(cell+" ");
            }
            System.out.println();
        }
    }
}
