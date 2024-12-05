import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterExistingEmail {
@Test
    public void ExistingEmail(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://automationexercise.com");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("header[id='header'] li:nth-child(1) a:nth-child(1)")).isDisplayed();
        driver.findElement(By.cssSelector("a[href='/login']")).click();
        driver.findElement(By.xpath(" //h2[normalize-space()='New User Signup!']")).isDisplayed();
        driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("Ayat Test");
        driver.findElement(By.cssSelector("input[data-qa='signup-email']")).sendKeys("ayatabuqaoud@gmail.com");
        driver.findElement(By.cssSelector("button[data-qa='signup-button']")).click();
        driver.findElement(By.xpath("//p[normalize-space()='Email Address already exist!']")).isDisplayed();
    }
}
