import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import javax.swing.text.TabableView;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.By.linkText;

public class SearchProductAfterLogin {
@Test

    public void SearchAndVerify() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String URL = "https://automationexercise.com/";
        driver.navigate().to(URL);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@href='/products']")).click();
        driver.findElement(By.cssSelector(".title.text-center")).isDisplayed();
        driver.findElement(By.cssSelector("#search_product")).sendKeys("jeans");
        driver.findElement(By.xpath("//button[@id='submit_search']")).click();
        driver.findElement(By.cssSelector(".title.text-center")).isDisplayed();
        driver.findElement(By.cssSelector(".features_items")).isDisplayed();
        List<WebElement> Item=driver.findElements(linkText("Add to cart"));
        Item.get(0).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//button[normalize-space()='Continue Shopping']")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Item.get(1).click();
        driver.findElement(By.xpath("//button[normalize-space()='Continue Shopping']")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Item.get(2).click();
        driver.findElement(By.xpath("//button[normalize-space()='Continue Shopping']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Cart']")).click();
  List<WebElement> table= driver.findElements(By.className("table-responsive"));
   int i;
    String tableinfo ;
  for (i=0;i< table.size();i++){
       tableinfo= table.get(i).getText();
       System.out.println(tableinfo);
   }
    driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']")).click();
        driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("ayatabuqaoud@gmail.com");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Ayat123");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[normalize-space()='Cart']")).click();
    List<WebElement> table2= driver.findElements(By.className("table-responsive"));
    for (i=0;i< table.size();i++) {
        String tableinfo2 = table2.get(i).getText();
        System.out.println(tableinfo2);
    }
    Assert.assertSame(table2,table);
    }
}