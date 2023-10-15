package tientester.com.Bai5_Locators.XpathTuyetDoi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginCMS
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://cms.anhtester.com/login");

        //driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@example.com");
        driver.findElement(By.id("email")).sendKeys("admin@example.com");


        //driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
        driver.findElement(By.name("password")).sendKeys("123456");
        //forgotpassword
        //driver.findElement(By.linkText("Forgot password ?")).click();
        //driver.findElement(By.partialLinkText("password")).click();

        driver.findElement(By.tagName("button")).click();

        Thread.sleep(2000);

        //Tắt Browser
        driver.quit();
    }
}
