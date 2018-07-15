import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Ebay {
    private WebDriver driver;


    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testEbay() throws Exception {

        driver.get("https://www.ebay.com/");
//POCHEMU TAK NE RABOTAET???
        //driver.findElement(By.xpath("//*[@href='https://reg.ebay.com/reg/PartialReg']")).click();
        driver.findElement(By.linkText("register")).click();

        driver.findElement(By.id("firstname")).click();
        driver.findElement(By.id("firstname")).clear();
        driver.findElement(By.id("firstname")).sendKeys("Ivan");

        driver.findElement(By.id("lastname")).click();
        driver.findElement(By.id("lastname")).clear();
        driver.findElement(By.id("lastname")).sendKeys("Ivanov");

        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("test777123test@mail.ru");

        driver.findElement(By.id("PASSWORD")).click();
        driver.findElement(By.id("PASSWORD")).clear();
        driver.findElement(By.id("PASSWORD")).sendKeys("parol123WhUo");

        driver.findElement(By.id("ppaFormSbtBtn")).click();

           }


        @AfterClass(alwaysRun = true)
        public void tearDown() throws Exception {
            Thread.sleep(3000);
            driver.quit();

        }
    }

