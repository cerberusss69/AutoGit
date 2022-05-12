package com.gb.lesson4;


import io.github.bonigarcia.wdm.WebDriverManager;
import lesson_4.AreaOfTriangle;
import org.junit.jupiter.api.*;

public class AreaOfTriangleTest {
    @BeforeAll
    static void beforeAll() {
        System.out.println("Метод выполнился 1раз всеми тестами класса");
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("Метод выполняется перед каждым тестом");
    }
    //тест на метод
    @Test
    @DisplayName("Позитивный тест с простыми числами")
    void givenPrineNumberIsGivenIfNumberIsPositiveTrue(){
        boolean result = AreaOfTriangle.ABC(7,7,14);
        Assertions.assertTrue(result);
    }

    @AfterEach
    void afterEach(){
        //driver.quit();
    }

    @AfterAll
    static void afterAll(){
        System.out.println("Метод выполнился после всех тестов");
    }
}
