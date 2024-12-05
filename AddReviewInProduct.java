import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AddReviewInProduct {

@Test
    public void AddReview(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String URL="https://automationexercise.com/";
        driver.navigate().to(URL);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@href='/products']")).click();
        driver.findElement(By.xpath("//h2[normalize-space()='All Products']")).isDisplayed();
        driver.findElement(By.cssSelector("a[href='/product_details/1']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Write Your Review']")).isDisplayed();
        driver.findElement(By.cssSelector("#name")).sendKeys("Ayat Test");
        driver.findElement(By.cssSelector("#email")).sendKeys("ayatabuqaoud@gmail.com");
        driver.findElement(By.cssSelector("#review")).sendKeys("This is a Test");
        driver.findElement(By.cssSelector("#button-review")).click();
    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    driver.findElement(By.className("alert")).isDisplayed();

    }
}
