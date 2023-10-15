package tientester.com.Bai7_WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class DemoWebdriverBasic {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        driver.get("https://www.google.com/");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//textarea[@name='q']")).click();
        driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Selenium Java");
        driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//h3[contains(text(),'[Selenium Java] Bài 4: Cài đặt môi trường Selenium')]")).click();
        Thread.sleep(2000);
        //quay lai trang truoc do
        driver.navigate().back();
        Thread.sleep(1000);
        //dieu huong den trang tiep sau
        driver.navigate().forward();
        Thread.sleep(1000);
        //lam moi trang hien tai
        driver.navigate().refresh();

        //get the title of the page
        String title = driver.getTitle();
        //get the current URL
        String url = driver.getCurrentUrl();
        //get the current page HTML source
        String html = driver.getPageSource();

        System.out.println("Title: " + title);
        System.out.println("Current URL: " + url);
        System.out.println("Page Sources: " + html);

        Thread.sleep(1000);
        driver.quit();


    }


}
