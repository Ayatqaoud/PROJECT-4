import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.By.*;
import static org.openqa.selenium.By.xpath;

public class PlaceOrderTest {
@Test
  public void PlaceOrder() {

    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.navigate().to("http://automationexercise.com");
    driver.manage().window().maximize();
    driver.findElement(cssSelector("header[id='header'] li:nth-child(1) a:nth-child(1)")).isDisplayed();
    driver.findElement(By.xpath("//a[@href='/products']")).click();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//used implicit wait because the elements was not interactable exception
    List<WebElement> Item = driver.findElements(linkText("Add to cart"));
    Item.get(0).click();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.findElement(By.xpath("//button[normalize-space()='Continue Shopping']")).click();
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    Item.get(1).click();
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    driver.findElement(xpath("//u[normalize-space()='View Cart']")).click();
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    driver.findElement(By.xpath("//a[normalize-space()='Cart']")).click();
    driver.findElement(By.xpath("//li[@class='active']")).getText();
    driver.findElement(By.cssSelector(".btn.btn-default.check_out")).click();
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    driver.findElement(By.xpath("//u[normalize-space()='Register / Login']")).click();
    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("Test Order");
    driver.findElement(By.cssSelector("input[data-qa='signup-email']")).sendKeys("AyatTest@gmail.com");
    driver.findElement(By.cssSelector("button[data-qa='signup-button']")).click();
    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    driver.findElement(By.xpath("//label[normalize-space()='Mrs.']")).isSelected();
    driver.findElement(By.cssSelector("#password")).sendKeys("test123");
    Select Day = new Select(driver.findElement(By.xpath("//select[@id='days']")));
    Day.selectByIndex(3);
    Select Month = new Select(driver.findElement(By.xpath("//select[@id='months']")));
    Month.selectByIndex(5);
    Select Year = new Select(driver.findElement(By.xpath("//select[@id='years']")));
    Year.selectByVisibleText("1991");
    driver.findElement(By.cssSelector("label[for='newsletter']")).isSelected();
    driver.findElement(By.cssSelector("label[for='optin']")).isSelected();
    driver.findElement(By.cssSelector("#first_name")).sendKeys("Test");
    driver.findElement(By.cssSelector("#last_name")).sendKeys("Hello");
    driver.findElement(By.cssSelector("#company")).sendKeys("TESTING");
    driver.findElement(By.cssSelector("#address1")).sendKeys("Amman");
    driver.findElement(By.cssSelector("#address2")).sendKeys("Madaba");
   Select Country=new Select(driver.findElement(By.xpath("//select[@id='country']")));
   Country.selectByIndex(3);
    driver.findElement(By.cssSelector("#state")).sendKeys("xyz");
    driver.findElement(By.cssSelector("#city")).sendKeys("qaaa");
    driver.findElement(By.cssSelector("#zipcode")).sendKeys("11111");
    driver.findElement(By.cssSelector("#mobile_number")).sendKeys("01230123");
    driver.findElement(By.cssSelector("button[data-qa='create-account']")).click();
    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    driver.findElement(By.xpath("//b[normalize-space()='Account Created!']")).isDisplayed();
    driver.findElement(By.cssSelector(".btn.btn-primary")).click();
    driver.findElement(By.xpath("//li[10]//a[1]")).isDisplayed();
    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    driver.findElement(By.xpath("//a[normalize-space()='Cart']")).click();
    driver.findElement(By.cssSelector(".btn.btn-default.check_out")).click();
    driver.findElement(By.xpath("//h2[normalize-space()='Address Details']")).isDisplayed();
    driver.findElement(By.xpath("//h2[normalize-space()='Review Your Order']")).isDisplayed();
    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    driver.findElement(By.className("form-control")).sendKeys("This is A test");
    driver.findElement(By.xpath("//a[normalize-space()='Place Order']")).click();
    driver.findElement(By.cssSelector("input[name='name_on_card']")).sendKeys("Ayat Test");
    driver.findElement(By.cssSelector("input[name='card_number']")).sendKeys("987654321");
    driver.findElement(By.cssSelector("input[placeholder='ex. 311']")).sendKeys("123");
    driver.findElement(By.cssSelector("input[placeholder='MM']")).sendKeys("9");
    driver.findElement(By.cssSelector("input[placeholder='YYYY']")).sendKeys("2025");
    driver.findElement(By.cssSelector("#submit")).click();
    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    driver.findElement(By.className("alert-success")).isDisplayed();
    driver.findElement(By.cssSelector("a[href='/delete_account']")).click();
    driver.findElement(By.xpath("//b[normalize-space()='Account Deleted!']")).isDisplayed();
  }
}
