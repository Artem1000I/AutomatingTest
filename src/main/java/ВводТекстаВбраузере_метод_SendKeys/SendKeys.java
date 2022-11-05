package ВводТекстаВбраузере_метод_SendKeys;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class SendKeys {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\AUTOMATING_TEST\\chrom.107\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Как получать свойства различных тегов и элементов
        driver.get("https://www.udemy.com/");


        // Ищем элемент на странице
        WebElement element = driver.findElement(By.xpath("//input[@name='q']")); //Говорим что нам нужна ссылка у которой есть текст вход

        //Хотим ввести в поле поиска запрос и нажать интер
        element.sendKeys("Java", Keys.ENTER);//указываем что печатаем "текст" потом keys и выбираем из списка кнопок

        //SendKeys можем использовать для передачи файла на сервис


    }
}
