package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class SignUpTest {


    @Test
    public void checkZipCodeInputWithValidData() throws InterruptedException {
        //1.Перейти на https://www.sharelane.com/cgi-bin/register.py
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");

        //2.Ввести в поле Zip Code-11111
        WebElement zipCodeInput = driver.findElement(By.name("zip code"));
        zipCodeInput.sendKeys("11111");


        //3. Нажать кнопку Continue

       WebElement continueButton = driver.findElement(By.xpath("//input[@value='Continue' or @type='submit']"));
                        continueButton.click();

        //4. Отображается ли заголовок "Sign Up"
        WebElement signUpTitle = driver.findElement(By.xpath("//*[text()='Sign Up']"));
        assertTrue(signUpTitle.isDisplayed(), "Заголовок 'Sign Up' не отображается на странице!");


    }
}
