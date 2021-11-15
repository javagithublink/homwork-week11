package homework2;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class NopCommerceRegistration extends BaseClass1 {

    String baseUrl = "https://demo.nopcommerce.com/";

    protected String getRandomEmail() {
        String emailCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder text1 = new StringBuilder();
        Random rnd = new Random();
        while (text1.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * emailCharacters.length());
            text1.append(emailCharacters.charAt(index));
        }
        String newEmail = text1.toString();
        return newEmail;

    }


    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifyUserCanRegisterSuccessfully() {


        driver2.findElement(By.xpath("//div[@class='header-links']/ul/li/a[@class='ico-register']")).click();
        driver2.findElement(By.xpath("//div[@id='gender']/span[1]/input[@id='gender-male']")).click();
        driver2.findElement(By.id("FirstName")).sendKeys("abcdef");
        driver2.findElement(By.name("LastName")).sendKeys("wxyz");
        driver2.findElement(By.cssSelector("select[name='DateOfBirthDay']")).sendKeys("15");
        driver2.findElement(By.cssSelector("select[name='DateOfBirthMonth']")).sendKeys("July");
        driver2.findElement(By.cssSelector("select[name='DateOfBirthYear']")).sendKeys("1985");
        String emailAddress = getRandomEmail() + "@gmail.com";
        driver2.findElement(By.cssSelector("input#Email")).sendKeys(emailAddress);
        WebElement company = driver2.findElement(By.id("Company"));
        company.sendKeys("Sy Ltd");
        String password = "Admin123";
        driver2.findElement(By.xpath("//input[@id='Password' and @name='Password']")).sendKeys(password);
        driver2.findElement(By.xpath("//input[@id='ConfirmPassword' and @name='ConfirmPassword']")).sendKeys(password);
        driver2.findElement(By.name("register-button")).click();

        String expectedMessage = "Your registration completed";
        WebElement registrationText = driver2.findElement(By.xpath("//div[@class='result'][text()='Your registration completed']"));

        String actualMessage = registrationText.getText();

        Assert.assertEquals("Registration unsuccessful", expectedMessage, actualMessage);


    }


    @After
    public void tearDown() {
        closeBrowser();
    }

}
