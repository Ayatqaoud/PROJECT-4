import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VeiwBarndProduct {
@Test
    public void VeiwBrand(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String URL="https://automationexercise.com/";
        driver.navigate().to(URL);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@href='/products']")).click();
        driver.findElement(By.xpath("//h2[normalize-space()='Brands']")).isDisplayed();
        driver.findElement(By.xpath("//a[@href='/brand_products/H&M']")).click();
        driver.findElement(By.xpath("//li[@class='active']")).getText();
        driver.findElement(By.cssSelector(".title.text-center")).isDisplayed();
        driver.findElement(By.cssSelector("a[href='/brand_products/Polo']")).click();
        driver.findElement(By.xpath("//li[@class='active']")).getText();
        driver.findElement(By.cssSelector(".title.text-center")).isDisplayed();

    }
}
