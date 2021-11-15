package homework1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class BaseClass {
    public static WebDriver driver;

    public void openBrowser(String baseUrl){

    System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");

    driver = new ChromeDriver();

    driver.get(baseUrl);
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

    }

    public void closeBrowser(){

        driver.quit();
    }

}
