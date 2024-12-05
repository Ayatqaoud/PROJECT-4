import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;
import static org.openqa.selenium.By.*;

public class ADDPRODUCT{
    @Test
    public void AddCart() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://automationexercise.com");
        driver.manage().window().maximize();
        driver.findElement(cssSelector("header[id='header'] li:nth-child(1) a:nth-child(1)")).isDisplayed();
        driver.findElement(xpath("//a[@href='/products']")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//used implicit wait because the elements was not interactable exception
        List<WebElement> Item=driver.findElements(linkText("Add to cart"));
        Item.get(0).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//button[normalize-space()='Continue Shopping']")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Item.get(1).click();
       driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       driver.findElement(xpath("//u[normalize-space()='View Cart']")).click();
        driver.findElement(xpath("//tr[@id='product-1']")).isDisplayed();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//tr[@id='product-2']")).isDisplayed();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(xpath("//tr[@id='product-1']//td[@class='cart_quantity']")).isDisplayed();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(cssSelector("p[class='cart_total_price']")).isDisplayed();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(cssSelector("td[class='cart_price']")).isDisplayed();
    }

}
