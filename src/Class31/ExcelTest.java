package Class31;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelTest {
    public static void main(String[] args) throws IOException {
        String path="\\C:\\Users\\joelf\\Downloads\\Test..xlsx\\";
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet=xssfWorkbook.getSheet("Test.");
        Row row=sheet.getRow(0);
        System.out.println(row.getCell(0));

    }
}
