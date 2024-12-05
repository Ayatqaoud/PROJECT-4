import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.By.xpath;

public class VerifyAddress {

@Test
    public void VerifyAddressDetails() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://automationexercise.com");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("header[id='header'] li:nth-child(1) a:nth-child(1)")).isDisplayed();
        driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']")).click();
        driver.findElement(By.cssSelector("div[class='signup-form'] h2")).isDisplayed();
        driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("Ayat Test");
        driver.findElement(By.cssSelector("input[data-qa='signup-email']")).sendKeys("ayatabuqaoud@gmail.com");
        driver.findElement(By.cssSelector("button[data-qa='signup-button']")).click();
        driver.findElement(By.cssSelector("#uniform-id_gender2")).click();
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("1234");
        Select Days = new Select(driver.findElement(By.xpath("//select[@id='days']")));
        Days.selectByIndex(12);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        Select Months = new Select(driver.findElement(By.xpath("//select[@id='months']")));
        Months.selectByIndex(5);
        Select Years = new Select(driver.findElement(By.xpath("//select[@id='years']")));
        Years.selectByIndex(25);
        driver.findElement(By.cssSelector("label[for='newsletter']")).isSelected();
        driver.findElement(By.cssSelector("label[for='optin']")).isSelected();
        driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Tester");
        driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("AAA");
        driver.findElement(By.xpath("//input[@id='company']")).sendKeys("Htester");
        driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("Aqaba");
        driver.findElement(By.xpath("//input[@id='address2']")).sendKeys("Dubai");
        Select Country = new Select(driver.findElement(By.xpath("//select[@id='country']")));
        Country.selectByIndex(1);
        driver.findElement(By.xpath("//input[@id='state']")).sendKeys("New Delhi");
        driver.findElement(By.xpath("//input[@id='city']")).sendKeys("ABCD");
        driver.findElement(By.xpath("//input[@id='zipcode']")).sendKeys("9999");
        driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys("789456123");
        driver.findElement(By.xpath("//button[normalize-space()='Create Account']")).click();
        driver.findElement(By.cssSelector("h2[class='title text-center'] b")).isDisplayed();
        driver.findElement(By.xpath("//a[normalize-space()='Continue']")).click();
        driver.findElement(By.xpath("//li[10]//a[1]")).isDisplayed();
        List<WebElement> Item = driver.findElements(linkText("Add to cart"));
        Item.get(0).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//button[normalize-space()='Continue Shopping']")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Item.get(1).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[normalize-space()='Cart']")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       driver.findElement(By.xpath("//li[@class='active']")).isDisplayed();
        driver.findElement(By.xpath("//a[normalize-space()='Proceed To Checkout']")).click();
        WebElement DeliveryAddress = driver.findElement(By.xpath("//ul[@id='address_delivery']"));
        WebElement BillingAddress = driver.findElement(By.xpath("//ul[@id='address_invoice']"));
        Assert.assertEquals(BillingAddress, DeliveryAddress);
        driver.findElement(By.cssSelector("a[href='/delete_account']")).click();
        driver.findElement(By.xpath("//b[normalize-space()='Account Deleted!']")).isDisplayed();
    }
}
