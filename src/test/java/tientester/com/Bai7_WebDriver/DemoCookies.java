package tientester.com.Bai7_WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import tientester.com.Bai5_Locators.XpathTuyetDoi.BT_LocatorsCRM;

import java.util.Set;

import static tientester.com.common.BaseTest.*;

public class DemoCookies {
    public static void main(String[] args) {

        createBrowser();

        driver.get("https://crm.anhtester.com/admin/authentication");
        driver.findElement(By.xpath(BT_LocatorsCRM.inputEmail)).sendKeys("admin@example.com");
        sleep(1);
        driver.findElement(By.xpath(BT_LocatorsCRM.inputPassword)).sendKeys("123456");
        sleep(1);
        //driver.findElement(By.xpath(BT_LocatorsCRM.buttonLogin)).click();
        driver.findElement(By.xpath(BT_LocatorsCRM.inputPassword)).submit();

        // Get all cookies
        Set<Cookie> cookies = driver.manage().getCookies();

        System.out.println(cookies.iterator().next().toString());

        //Get cookies current by name
        String cookiesCurrent = driver.manage().getCookieNamed("sp_session").getValue();
        System.out.println("Current Cookies: " + cookiesCurrent);

        closeBrowser();
    }
}
