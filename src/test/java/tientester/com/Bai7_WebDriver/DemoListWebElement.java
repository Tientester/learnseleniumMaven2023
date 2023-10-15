package tientester.com.Bai7_WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

import static tientester.com.common.BaseTest.*;

public class DemoListWebElement {
    public static void main(String[] args) {
        createBrowser();

        //navigate to a page
        driver.get("https://www.google.com/");
        sleep(1);
        driver.findElement(By.xpath("//textarea[@name='q']")).click();
        driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Selenium Java");
        driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys(Keys.ENTER);
        sleep(1);

        List<WebElement> listTitle = driver.findElements(By.xpath("//h3"));

        for (int i = 0; i < listTitle.size(); i++) {
            System.out.println(listTitle.get(i).getText());
        }

        sleep(1);
        driver.quit();

    }
}
