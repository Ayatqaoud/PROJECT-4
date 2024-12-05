import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class ProductQuantity {
@Test
    public void ProductQuantityCart(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String URL="https://automationexercise.com/";
        driver.navigate().to(URL);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@href='/products']")).click();
        driver.findElement(By.cssSelector("a[href='/product_details/1']")).click();
        driver.findElement(By.xpath("//label[normalize-space()='Quantity:']")).isDisplayed();
        driver.findElement(By.id("quantity")).clear();
        driver.findElement(By.id("quantity")).sendKeys("4");
        driver.findElement(By.cssSelector("button[type='button']")).click();
        WebDriver.Timeouts timeouts = driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//u[normalize-space()='View Cart']")).click();
        driver.findElement(By.xpath("//tr[@id='product-1']")).isDisplayed();

    }
}
