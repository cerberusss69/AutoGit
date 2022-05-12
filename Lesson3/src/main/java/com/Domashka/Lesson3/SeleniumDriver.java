package com.Domashka.Lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.v95.overlay.model.LineStyle;

import java.util.ArrayList;
import java.util.List;

public class SeleniumDriver {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.get("https://google.com");
        driver.switchTo().newWindow(WindowType.TAB);

        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get("https://jut.su");

       // driver.close();
        Thread.sleep(5000);

        ((JavascriptExecutor)driver).executeScript("window.open('https://www.youtube.com', '_blank').focus();");
        Thread.sleep(5000);

        Thread.sleep(5000);
        driver.quit();
    }
}
