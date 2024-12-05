import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ScrollUpFunctionality {
@Test
    public void ScrollUp(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://automationexercise.com");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("header[id='header']")).isDisplayed();
        driver.findElement(By.xpath("//h2[normalize-space()='Subscription']")).isDisplayed();
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,11790.400)");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        jse.executeScript("window.scrollBy(0,-11790.400)");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[@class='item active']//h2[contains(text(),'Full-Fledged practice website for Automation Engin')]")).isDisplayed();


    }
}
