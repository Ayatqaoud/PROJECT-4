import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.List;

public class SearchProduct {
@Test
    public void SearchTest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String URL="https://automationexercise.com/";
        driver.navigate().to(URL);
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("header[id='header'] li:nth-child(1) a:nth-child(1)")).isDisplayed();
        driver.findElement(By.xpath("//a[@href='/products']")).click();
        driver.findElement(By.className("col-sm-4")).isDisplayed();
        driver.findElement(By.id("search_product")).sendKeys("Tshirt");
        driver.findElement(By.id("submit_search")).click();
        driver.findElement(By.xpath("//h2[normalize-space()='Searched Products']")).isDisplayed();
        List<WebElement> TshirtLIST=driver.findElements(By.xpath(" //div[@class='features_items']"));
       List<WebElement> TshirtTagName=driver.findElements(By.tagName("p"));
        int i ;
        for (i=0;i<TshirtTagName.size();i++) {
            String Tshirt = TshirtTagName.get(i).getText();
            System.out.println(Tshirt);

        }

    }
}
