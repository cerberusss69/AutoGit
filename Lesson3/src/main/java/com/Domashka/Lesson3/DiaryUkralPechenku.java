package com.Domashka.Lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DiaryUkralPechenku {
    private static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://diary.ru/user/login");
/*
        //логин
        driver.findElement(By.id("loginform-username")).sendKeys("cerberusss69");
        //пароль
        driver.findElement(By.id("loginform-password")).sendKeys("#Lpv6JEPLf");
        //переход на айфрейм
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='reCAPTCHA']")));
        //клик по чек-боксу
        driver.findElement(By.xpath("//div [@class='recaptcha-checkbox-border']")).click();
        //выход из айфрейма
        driver.switchTo().parentFrame();
        //клик по входу
        driver.findElement(By.id("login_btn")).click();

        Thread.sleep(5000);
        driver.quit();

 */

        driver.get("https://diary.ru");
        //копируем печеньку
        Cookie cookie = new Cookie("_identity_","f983fbbb8b57c03e840812e8f76141054058d79126bc88a4d5e3865bd2e3a0bea%3A2%3A%7Bi%3A0%3Bs%3A10%3A%22_identity_%22%3Bi%3A1%3Bs%3A52%3A%22%5B3566773%2C%22G3K_i0-1vZPNztTc80D2DXJId2aTfb1X%22%2C2592000%5D%22%3B%7D");
        //подставляем нашу печеньку
        driver.manage().addCookie(cookie);
        //перезагрузка
        driver.navigate().refresh();

        Thread.sleep(5000);
        driver.quit();


    }
}
