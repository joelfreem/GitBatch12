package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearCommandDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx");
        WebElement username=driver.findElement(By.xpath("//input[contains(id@, 'username')]"));
        username.sendKeys("Tester");
        WebElement password =driver.findElement(By.xpath("//input[@type = 'password']"));
        password.sendKeys("test");
        WebElement loginButton=driver.findElement(By.xpath("//input[@value = 'Login']"));

        Thread.sleep(2000);
        username.clear();
        password.clear();
        driver.quit();
    }

}

class Main extends EncapsulationDemo {
    EncapsulationDemo demo= new EncapsulationDemo();
   // demo.SetemAge

}
class EncapsulationDemo{
    private String name;
    private int age;

    public String GetempName(String name){
        return name;
    }
    private int SetempAge(int age){
        this.age=age;
        return age;
    }
}



