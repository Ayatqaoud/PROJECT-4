import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterTest {
@Test
   public void Register(){
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
driver.findElement(By.xpath("//b[normalize-space()='Enter Account Information']")).isDisplayed();
driver.findElement(By.cssSelector("label[for='id_gender2']")).click();
driver.findElement(By.xpath("//input[@id='name']")).getText();
driver.findElement(By.xpath("//input[@id='email']")).getText();
driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Ayat123");
Select Days=new Select(driver.findElement(By.xpath("//select[@id='days']")));
Days.selectByIndex(28);
Select Months=new Select(driver.findElement(By.xpath("//select[@id='months']")));
Months.selectByVisibleText("September");
Select Year=new Select(driver.findElement(By.xpath("//select[@id='years']")));
Year.selectByVisibleText("1991");
driver.findElement(By.xpath("//input[@id='newsletter']")).click();
driver.findElement(By.xpath("//input[@id='optin']")).click();
driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Ayat");
driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("Qaoud");
driver.findElement(By.xpath("//input[@id='company']")).sendKeys("Aplus");
driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("Amman");
driver.findElement(By.cssSelector("#address2")).sendKeys("Al Salt");
Select Country=new Select(driver.findElement(By.cssSelector("#country")));
Country.selectByVisibleText("United States");
driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Florida");
driver.findElement(By.xpath("//input[@id='city']")).sendKeys("xxx");
driver.findElement(By.xpath("//input[@id='zipcode']")).sendKeys("1234");
driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys("123456789");
driver.findElement(By.cssSelector("button[data-qa='create-account']")).click();
driver.findElement(By.cssSelector("h2[class='title text-center'] b")).isDisplayed();
driver.findElement(By.xpath("//a[normalize-space()='Continue']")).click();
driver.findElement(By.linkText("Logged in as Ayat Test")).isDisplayed();
driver.findElement(By.cssSelector("a[href='/delete_account']")).click();
driver.findElement(By.className("text-center")).isDisplayed();
driver.findElement(By.className("btn-primary")).click();


   }
}
