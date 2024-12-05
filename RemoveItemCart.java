import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.annotation.Tainted;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.By.*;

public class RemoveItemCart {
@Test
    public void RemoveItem() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://automationexercise.com");
        driver.manage().window().maximize();
        driver.findElement(cssSelector("header[id='header'] li:nth-child(1) a:nth-child(1)")).isDisplayed();
        driver.findElement(xpath("//a[@href='/products']")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//used implicit wait because the elements was not interactable exception
        List<WebElement> Item = driver.findElements(linkText("Add to cart"));
        Item.get(0).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//button[normalize-space()='Continue Shopping']")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[normalize-space()='Cart']")).click();
        driver.findElement(By.xpath("//div[@id='cart_info']")).isDisplayed();
        driver.findElement(By.cssSelector(".cart_quantity_delete")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       driver.findElement(By.xpath("//b[normalize-space()='Cart is empty!']")).isDisplayed();

}
}