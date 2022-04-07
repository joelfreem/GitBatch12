package Class26;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppingCart {
    double originalPrice=100;
    private double discount=.15;
    void setDiscount(double discount){
        if(discount>0&&discount<=.15){
            this.discount=discount;
        }else{
            System.out.println("Cannot have to much discount");
        }
    }
    public double getDiscount(){
        return discount;
    }
    void calculatePrice(){
        double price=originalPrice-(originalPrice*discount);
        System.out.println(price);
        WebDriver webdriver=new ChromeDriver();
        webdriver.get("www.google.com");
    }
}
