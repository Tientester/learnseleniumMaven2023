package tientester.com;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Login {
    public static void main(String[] args) {
        System.out.println("hello");

        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://anhtester.com/");
        //Click nút Login
        driver.findElement(By.xpath("//a[@id='btn-login']")).click();

        //Tắt browser
        driver.quit();
    }
}
