package Class25;

public class WebriverTeter {
    public static void main(String[] args) {
        WebDriver webDriver = new FirefoxDriver();
        webDriver.openBrowser();
        webDriver.closeBrowser();
        webDriver.maximizeWindow();
        webDriver.findElement();

        WebDriver[] webDrivers = {new ChromeDriver(), new FirefoxDriver()};
        for (WebDriver w : webDrivers) {
            w.openBrowser();
            w.closeBrowser();
            w.findElement();
            w.maximizeWindow();
        }
    }
}

