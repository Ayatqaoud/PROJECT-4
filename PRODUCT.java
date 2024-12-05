import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class PRODUCT {
@Test
    public void ProductTesting(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String URL="https://automationexercise.com/";
        driver.navigate().to(URL);
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("header[id='header'] li:nth-child(1) a:nth-child(1)")).isDisplayed();
        driver.findElement(By.xpath("//a[@href='/products']")).click();
        driver.findElement(By.className("col-sm-4")).isDisplayed();
        List<WebElement>ProductList = driver.findElements(By.className("col-sm-4"));
        ProductList.get(1).click();
        driver.findElement(By.cssSelector("a[href='/product_details/1']")).click();
        String ProductDetails="https://automationexercise.com/product_details/1";
        Assert.assertEquals(ProductDetails,"https://automationexercise.com/product_details/1");
        driver.findElement(By.cssSelector("div[class='product-information'] h2")).isDisplayed();
        driver.findElement(By.xpath("//p[normalize-space()='Category: Women > Tops']")).isDisplayed();
        driver.findElement(By.cssSelector("div[class='product-information'] span span")).isDisplayed();
        driver.findElement(By.xpath("//b[normalize-space()='Availability:']")).isDisplayed();
        driver.findElement(By.xpath("//b[normalize-space()='Condition:']")).isDisplayed();
        driver.findElement(By.xpath("//b[normalize-space()='Brand:']")).isDisplayed();

}}