import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubScription {

@Test
    public void SubScriptionHomePage(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://automationexercise.com");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("header[id='header'] li:nth-child(1) a:nth-child(1)")).isDisplayed();
        driver.findElement(By.xpath("//h2[normalize-space()='Subscription']")).isDisplayed();
        driver.findElement(By.id("susbscribe_email")).sendKeys("ayatabuqaoud@gmail.com");
        driver.findElement(By.id("subscribe")).click();
        driver.findElement(By.className("alert")).getText();




    }
}
