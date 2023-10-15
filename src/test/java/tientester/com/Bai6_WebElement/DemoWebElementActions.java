package tientester.com.Bai6_WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import tientester.com.Bai5_Locators.XpathTuyetDoi.BT_LocatorsCRM;

import java.time.Duration;

public class DemoWebElementActions {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://crm.anhtester.com/admin/authentication");

        driver.findElement(By.xpath(BT_LocatorsCRM.inputEmail)).clear();
        driver.findElement(By.xpath(BT_LocatorsCRM.inputPassword)).clear();

        driver.findElement(By.xpath(BT_LocatorsCRM.inputEmail)).sendKeys("admin@example.com");
        Thread.sleep(500);
        driver.findElement(By.xpath(BT_LocatorsCRM.inputPassword)).sendKeys("123456");
        Thread.sleep(500);
        //driver.findElement(By.xpath(BT_LocatorsCRM.buttonLogin)).click();
        driver.findElement(By.xpath(BT_LocatorsCRM.inputPassword)).submit();

        Thread.sleep(2000);
        driver.quit();
    }
}
