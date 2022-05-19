package com.GeekBrains.Lesson_5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class JutsuTest {
    WebDriver driver;
    WebDriverWait webDriverWait;
////div[@class='all_anime_tooltip' and contains (@title, 'сезон')]
    @BeforeAll
    static void registerDriver(){
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void initDriver() throws InterruptedException {
        driver = new ChromeDriver();
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://jut.su/naruuto/");

    }

    @Test
    void OpenNameSeries() {
        List<WebElement> seasonList = driver.findElements(By.xpath("//div[@class='all_anime_tooltip' and contains (@title, 'сезон')]"));
        seasonList.stream().filter(t -> t.getText().contains("season-2")).findFirst().get().click();

        driver.findElement(By.xpath("//a[@onclick='show_seasons_title('yes'); return false;']")).click();
    }

    @AfterEach
    void tearDown(){
        driver.quit();
    }
}
