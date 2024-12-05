import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.By.linkText;

public class AddRecommndedItem {
@Test

    public void AddRecommended(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String URL="https://automationexercise.com/";
        driver.navigate().to(URL);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//h2[normalize-space()='recommended items']")).isDisplayed();
        List<WebElement> Item=driver.findElements(linkText("Add to cart"));
        Item.get(0).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//u[normalize-space()='View Cart']")).click();
        driver.findElement(By.xpath("//body[1]/section[1]/div[1]")).isDisplayed();



    }
}
