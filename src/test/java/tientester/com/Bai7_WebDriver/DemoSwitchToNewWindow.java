package tientester.com.Bai7_WebDriver;

import org.openqa.selenium.WindowType;

import static tientester.com.common.BaseTest.*;

public class DemoSwitchToNewWindow {
    public static void main(String[] args) {
        createBrowser();

        driver.get("https://github.com/anhtester/SeleniumMaven042023");
        String mainWindow = driver.getWindowHandle();
        System.out.println(mainWindow);
        sleep(1);
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://google.com");
        sleep(1);
        driver.switchTo().window(mainWindow); //chuuyen ve cua so mac dinh

        closeBrowser();

    }
}
