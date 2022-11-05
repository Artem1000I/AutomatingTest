package Метод_Clic;

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
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Как получать свойства различных тегов и элементов
        driver.get("https://www.dns-shop.ru/");


        // Ищем элемент на странице
        WebElement element = driver.findElement(By.xpath("//a[text()='Инструменты']")); //Говорим что нам нужна ссылка у которой есть текст вход

        //Хотим кликнуть по элементу инструменты на саййте DNS
        element.click();




    }
}