import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class VeiwCategoryProducts {
@Test
    public void CategoryProducts(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String URL="https://automationexercise.com/";
        driver.navigate().to(URL);
        driver.manage().window().maximize();
    driver.findElement(By.xpath("//a[@href='/products']")).click();
    driver.findElement(By.xpath("//h2[normalize-space()='Category']")).isDisplayed();
    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
     driver.findElement(By.xpath("//a[normalize-space()='Women']")).click();
    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    driver.findElement(By.xpath("//div[@id='Women']//li[2]")).click();
    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    driver.findElement(By.cssSelector(".title.text-center")).isDisplayed();
    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    driver.findElement(By.xpath("//a[normalize-space()='Men']")).click();
    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    driver.findElements(By.xpath("//div[@id='Men']//div[@class='panel-body']"));
    driver.findElement(By.xpath("//a[normalize-space()='Tshirts']")).click();
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    driver.findElement(By.cssSelector(".title.text-center")).isDisplayed();


    }


}
