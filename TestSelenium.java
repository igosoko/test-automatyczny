package localbrowsers;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium {

    private WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testLogowania() {
        driver.get("https://www.phptravels.net/login");
        driver.findElement(By.name("email")).click();
        driver.findElement(By.name("email")).sendKeys("user@phptravels.com");
        driver.findElement(By.name("password")).click();
        driver.findElement(By.name("password")).sendKeys("demouser");
        driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://www.phptravels.net/account/dashboard");
    }
}
