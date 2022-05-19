package com.Domashka.Lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JutSuTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get ("https://jut.su/naruuto/");

        driver.manage().window().maximize();

        WebElement narutoSeason2 = driver.findElement(By.xpath("//a[@href='/naruuto/season-2/']"));
        narutoSeason2.click();
        driver.findElement(By.xpath("//a[@title='Акацуки начинают действовать']")).click();
        driver.findElement(By.xpath("//button[@title='Воспроизвести видео']")).click();

        Thread.sleep(5000);
        driver.quit();
    }
}
