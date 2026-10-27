package Tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class RegistrationTest {

    private WebDriver driver;

    @Before
    public void setUp() {

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

        driver.get("https://www.sharelane.com/cgi-bin/register.py");
    }

    @Test
    public void testPositiveRegistration() {
        driver.findElement(By.id("firstName")).sendKeys("Валентин");

        driver.findElement(By.id("lastName")).sendKeys("Шлемаков");

        driver.findElement(By.id("email")).sendKeys("testuser_" + System.currentTimeMillis() + "dr@yandex.ru");

        driver.findElement(By.id("password")).sendKeys("12345");

        driver.findElement(By.id("confirmPassword")).sendKeys("12345");

        driver.findElement(By.xpath("//button[text()='Register']")).click();
    }

        @After

        public void tearDown () {
            if (driver != null) {
                driver.quit();

            }
        }

    }



