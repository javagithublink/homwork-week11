package homework2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseClass1 {

    public static WebDriver driver2;

    public void openBrowser(String baseUrl){

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");

        driver2 = new ChromeDriver();
        driver2.get(baseUrl);
        driver2.manage().window().maximize();
        driver2.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }

    public void closeBrowser(){
        driver2.quit();
    }

}
