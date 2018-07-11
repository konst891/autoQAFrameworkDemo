package webDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

    private WebDriver webDriver;

    private void setupChromeDriver() {
        WebDriverManager.chromedriver().setup();
    }

    public WebDriver setupDriver() {
        setupChromeDriver();
        return webDriver = new ChromeDriver();
    }

}
