

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class EbayRecorder {
  private WebDriver driver;

   @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new ChromeDriver();

    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @Test
  public void testEbayRecorder() throws Exception {

    openSite();
    registrationClick();
    firstnameClick();
    lastnameClick();
    emailClick();
    passwordClick();
    registerClick();
  }

  public void registerClick() {
    driver.findElement(By.id("ppaFormSbtBtn")).click();
  }

  public void passwordClick() {
    driver.findElement(By.id("PASSWORD")).click();
    driver.findElement(By.id("PASSWORD")).clear();
    driver.findElement(By.id("PASSWORD")).sendKeys("gdff3gjHGT6");
  }

  public void emailClick() {
    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("email")).clear();
    driver.findElement(By.id("email")).sendKeys("test777123test@mail.ru");
  }

  public void lastnameClick() {
    driver.findElement(By.id("lastname")).click();
    driver.findElement(By.id("lastname")).clear();
    driver.findElement(By.id("lastname")).sendKeys("Ivanov");
  }

  public void firstnameClick() {
    driver.findElement(By.id("firstname")).click();
    driver.findElement(By.id("firstname")).clear();
    driver.findElement(By.id("firstname")).sendKeys("Ivan");
  }

  public void registrationClick() {
    driver.findElement(By.linkText("register")).click();
  }

  public void openSite() {
    driver.get("https://www.ebay.com/");
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();

  }

  /*private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }*/
}
