package homework4;

import homework1.BaseClass;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OrangeHRM extends BaseClass {

    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void Setup() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifyUserCanLoginSuccessfullyWithValidCredentials() {

        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();

        driver.findElement(By.xpath("//a[@id='welcome'][contains(text(),'Welcome')]")).click();
        driver.findElement(By.xpath("//ul/li[3]/a[text()='Logout']")).click();

        String expectedResult = "LOGIN Panel";
        WebElement loginText = driver.findElement(By.id("logInPanelHeading"));
        String actualResult = loginText.getText();

        Assert.assertEquals("Cannot logout successfully", expectedResult, actualResult);


    }


    @After
    public void tearDown() {
        closeBrowser();
    }


}
