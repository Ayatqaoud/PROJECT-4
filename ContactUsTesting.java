import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.nio.file.LinkPermission;

public class ContactUsTesting {
@Test
    public void Contact(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String URL="https://automationexercise.com/";
        driver.navigate().to(URL);
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("header[id='header'] li:nth-child(1) a:nth-child(1)")).isDisplayed();
        driver.findElement(By.cssSelector("a[href='/login']")).click();
        driver.findElement(By.cssSelector("div[class='login-form'] h2")).isDisplayed();
        driver.findElement(By.xpath("//a[normalize-space()='Contact us']")).click();
        driver.findElement(By.xpath("//h2[normalize-space()='Get In Touch']")).isDisplayed();
        driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("Ayat Test");
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("ayatabuqaoud@gmail.com");
driver.findElement(By.xpath("//input[@placeholder='Subject']")).sendKeys("Test 1");
driver.findElement(By.cssSelector("#message")).sendKeys("This Is A Test");
    String filePath="C:\\Users\\plati\\OneDrive\\Desktop\\Evidance final project Ayat";
    driver.findElement(By.xpath("//input[@name='upload_file']")).sendKeys(filePath);
    driver.findElement(By.cssSelector("input[value='Submit']")).click();
driver.switchTo().alert().accept();
driver.findElement(By.xpath("//div[@class='status alert alert-success']")).isDisplayed();
driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
String LandingPage="https://automationexercise.com/";
        Assert.assertEquals(LandingPage,URL );


    }
}
