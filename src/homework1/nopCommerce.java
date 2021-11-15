package homework1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class nopCommerce extends BaseClass {

    String baseUrl = "https://www.google.com/";

    @Before
    public void setUp() {

        openBrowser(baseUrl);
    }

    @Test
    public void verifyUserIsAbleToNavigateToNopCommerceComputerTab() {

        driver.findElement(By.xpath("//button[@id='L2AGLb'and @class='tHlp8d']/div[text()='I agree']")).click();
        driver.findElement(By.xpath("//div[@class='a4bIc']/input[@class='gLFyf gsfi' and @title='Search']")).sendKeys("nopCommerce demo store");

        driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']/center/input[@class='gNO89b' and @value='Google Search']")).click();

        driver.findElement(By.xpath("//div[@class='yuRUbf']/a[1]/h3[text()='nopCommerce demo store']")).click();

        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li/a[contains(text(),'Computers')]")).click();

    }

    @Test
    public void verifyUserIsAbleToNavigateToNopCommerceElectronicsTab() {

        driver.findElement(By.xpath("//button[@id='L2AGLb'and @class='tHlp8d']/div[text()='I agree']")).click();
        driver.findElement(By.xpath("//div[@class='a4bIc']/input[@class='gLFyf gsfi' and @title='Search']")).sendKeys("nopCommerce demo store");

        driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']/center/input[@class='gNO89b' and @value='Google Search']")).click();

        driver.findElement(By.xpath("//div[@class='yuRUbf']/a[1]/h3[text()='nopCommerce demo store']")).click();

        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li/a[contains(text(),'Electronics')]")).click();

    }

    @Test
    public void verifyUserIsAbleToNavigateToNopCommerceApparelTab() {

        driver.findElement(By.xpath("//button[@id='L2AGLb'and @class='tHlp8d']/div[text()='I agree']")).click();
        driver.findElement(By.xpath("//div[@class='a4bIc']/input[@class='gLFyf gsfi' and @title='Search']")).sendKeys("nopCommerce demo store");

        driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']/center/input[@class='gNO89b' and @value='Google Search']")).click();

        driver.findElement(By.xpath("//div[@class='yuRUbf']/a[1]/h3[text()='nopCommerce demo store']")).click();

        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li/a[contains(text(),'Apparel')]")).click();

    }

    @Test
    public void verifyUserIsAbleToNavigateToNopCommerceDigitalDownloadsTab() {

        driver.findElement(By.xpath("//button[@id='L2AGLb'and @class='tHlp8d']/div[text()='I agree']")).click();
        driver.findElement(By.xpath("//div[@class='a4bIc']/input[@class='gLFyf gsfi' and @title='Search']")).sendKeys("nopCommerce demo store");

        driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']/center/input[@class='gNO89b' and @value='Google Search']")).click();

        driver.findElement(By.xpath("//div[@class='yuRUbf']/a[1]/h3[text()='nopCommerce demo store']")).click();

        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li/a[contains(text(),'Digital downloads')]")).click();

    }

    @Test
    public void verifyUserIsAbleToNavigateToNopCommerceBooksTab() {

        driver.findElement(By.xpath("//button[@id='L2AGLb'and @class='tHlp8d']/div[text()='I agree']")).click();
        driver.findElement(By.xpath("//div[@class='a4bIc']/input[@class='gLFyf gsfi' and @title='Search']")).sendKeys("nopCommerce demo store");

        driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']/center/input[@class='gNO89b' and @value='Google Search']")).click();

        driver.findElement(By.xpath("//div[@class='yuRUbf']/a[1]/h3[text()='nopCommerce demo store']")).click();

        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li/a[contains(text(),'Books')]")).click();

    }

    @Test
    public void verifyUserIsAbleToNavigateToNopCommerceJewelryTab() {

        driver.findElement(By.xpath("//button[@id='L2AGLb'and @class='tHlp8d']/div[text()='I agree']")).click();
        driver.findElement(By.xpath("//div[@class='a4bIc']/input[@class='gLFyf gsfi' and @title='Search']")).sendKeys("nopCommerce demo store");

        driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']/center/input[@class='gNO89b' and @value='Google Search']")).click();

        driver.findElement(By.xpath("//div[@class='yuRUbf']/a[1]/h3[text()='nopCommerce demo store']")).click();

        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li/a[contains(text(),'Jewelry')]")).click();

    }

    @Test
    public void verifyUserIsAbleToNavigateToNopCommerceGiftCardsTab() {

        driver.findElement(By.xpath("//button[@id='L2AGLb'and @class='tHlp8d']/div[text()='I agree']")).click();
        driver.findElement(By.xpath("//div[@class='a4bIc']/input[@class='gLFyf gsfi' and @title='Search']")).sendKeys("nopCommerce demo store");

        driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']/center/input[@class='gNO89b' and @value='Google Search']")).click();

        driver.findElement(By.xpath("//div[@class='yuRUbf']/a[1]/h3[text()='nopCommerce demo store']")).click();

        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']/li/a[contains(text(),'Gift Cards')]")).click();

    }


    @After

    public void tearDown() {
        closeBrowser();
    }


}
