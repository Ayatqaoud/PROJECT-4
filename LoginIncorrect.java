import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginIncorrect {
@Test
    public void IncorrectLogin(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://automationexercise.com");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("header[id='header'] li:nth-child(1) a:nth-child(1)")).isDisplayed();
        driver.findElement(By.cssSelector("a[href='/login']")).click();
        driver.findElement(By.cssSelector("div[class='login-form'] h2")).isDisplayed();
        driver.findElement(By.cssSelector("input[data-qa='login-email']")).sendKeys("ayataTester@gmail.com");
        driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("Ayat00123");
        driver.findElement(By.cssSelector("button[data-qa='login-button']")).click();

    }
}
