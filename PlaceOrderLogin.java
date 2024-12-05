import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.By.*;

public class PlaceOrderLogin {

@Test
    public void OrderLogin(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://automationexercise.com");
        driver.manage().window().maximize();
        driver.findElement(cssSelector("header[id='header'] li:nth-child(1) a:nth-child(1)")).isDisplayed();
        driver.findElement(By.cssSelector("a[href='/login']")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("input[data-qa='login-email']")).sendKeys("ayatabuqaoud@gmail.com");
        driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("Ayat123");
        driver.findElement(By.cssSelector("button[data-qa='login-button']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Home']")).isDisplayed();
        driver.findElement(xpath("//a[@href='/products']")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//used implicit wait because the elements was not interactable exception
        List<WebElement> Item=driver.findElements(linkText("Add to cart"));
        Item.get(0).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//button[normalize-space()='Continue Shopping']")).click();
        Item.get(1).click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("a[href='/view_cart']")).click();
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath(" //li[@class='active']")).isDisplayed();
        driver.findElement(By.cssSelector(".btn.btn-default.check_out")).click();
        driver.findElement(By.xpath("//h2[normalize-space()='Address Details']")).isDisplayed();
        driver.findElement(By.xpath("//h2[normalize-space()='Review Your Order']")).isDisplayed();
        driver.findElement(By.xpath("//textarea[@name='message']")).sendKeys("This is a test");
        driver.findElement(By.xpath("//a[normalize-space()='Place Order']")).click();
        driver.findElement(By.cssSelector("input[name='name_on_card']")).sendKeys("Ayat Test");
        driver.findElement(By.cssSelector("input[name='card_number']")).sendKeys("987654321");
        driver.findElement(By.cssSelector("input[placeholder='ex. 311']")).sendKeys("123");
        driver.findElement(By.cssSelector("input[placeholder='MM']")).sendKeys("9");
        driver.findElement(By.cssSelector("input[placeholder='YYYY']")).sendKeys("2025");
        driver.findElement(By.cssSelector("#submit")).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.className("alert-success")).isDisplayed();
        driver.findElement(By.cssSelector("a[href='/delete_account']")).click();
        driver.findElement(By.xpath("//b[normalize-space()='Account Deleted!']")).isDisplayed();
        driver.findElement(xpath("//a[normalize-space()='Continue']")).click();


    }
}
