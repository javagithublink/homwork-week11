package homework3;

import homework1.BaseClass;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AutomationPractice extends BaseClass {

    String baseUrl = "http://automationpractice.com/index.php";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void verifyUserCannotLoginWithInvalidCredentials(){

        driver.findElement(By.cssSelector("a.login")).click();
        driver.findElement(By.id("email")).sendKeys("abc123@gmail.com");
        driver.findElement(By.xpath("//input[@id='passwd' and @name='passwd']")).sendKeys("asdf123");
        WebElement submit = driver.findElement(By.xpath("//button[@id='SubmitLogin']"));
        submit.click();

        String expectedResult = "There is 1 error";

        WebElement errorText= driver.findElement(By.xpath("//div[@class='alert alert-danger']/p[contains(text(),'There is 1 error')]"));

        String actualResult = errorText.getText();

        Assert.assertEquals("Test Failed-Raise Bug",expectedResult,actualResult);

    }


    @After
    public void tearDown(){
        closeBrowser();
    }

}
