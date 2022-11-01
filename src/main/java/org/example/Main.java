package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\AUTOMATING_TEST\\chrom.107\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com"); // ОТКРЫЛИ ГУГЛ


        // Обратимся к какомуто элементу дяля этого
        //Нужно создать переменную где укажем ссылку на наш элемент

        WebElement input = driver.findElement(By.xpath("//input[@aria-label='Найти']"));   //findElement чтобы чтото найти
        //x.path
        input.click(); // кликаем по нему

        //Что такое локаторы
        //____________________________________________________________________________________________________________________________________________
                                                // это By.xpath("//input[@aria-label='Найти']") локатор
        //WebElement input = driver.findElement(By.xpath("//input[@aria-label='Найти']")); //в первом случае находим один элемент
        //WebElement inputs = driver.findElements(By.xpath("//input[@aria-label='Найти']")); // находим множесьво элементов и помещаем их в список

        //cssSelector() вместо x.path
        //Можно искать элементы через Class By.className
        //Можно искать по id By.id
        // LinkText ищет по тексту сслыке
        //____________________________________________________________________________________________________________________________________________

        //Сss локаторы Селекторы


        //Ожидания в Selenium
        //Устаревший метод явное ожидание
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  //вызываем у драйвера менеджер и потом вызываем timouts и задаём тайм 10  указываем что это 10 секунд
        // Актуальный метод
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //явное ожидание

        //НЕ ЯВНОЕ ОЖИДАНИЕ
        WebElement element = (new WebDriverWait(driver, Duration.ofSeconds(10))//Ложим сюда элемент который нас интересует.
                .until(ExpectedConditions.presenceOfElementLocated(By.id("123")))); //Ожидание для элемента событие presenceOfElementLocated ожидание элемента передаём локатор


        //___________________________________________________________________________________________________________________________________________________________________

        //Как получать свойства различных тегов и элементов
        driver.get("https://www.avito.ru/rossiva/avtomobili");










    }
}

