package Avito;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Avitoavto {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\AUTOMATING_TEST\\chrom.107\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        //Как получать свойства различных тегов и элементов
        driver.get("https://www.avito.ru/ussuriysk/avtomobili?cd=1&radius=200");


        // Ищем элемент на странице
        WebElement element = driver.findElement(By.xpath("(//a[text()='Мотоциклы и мототехника'])[1]")); //Указываем Xpath для элемента

        //Чтобы получить значения свойства у элемента используем getAttribute
        element.getAttribute("clientWidth"); //указываем что нас интересует этот элемент смотрим элемент в вкладке Propertis
        //берем свойство и записываем его в переменную
        String par = element.getAttribute("clientWidth");
        System.out.println(par); //Все верно значение clientWidth 282 выводится в консоль

        String par1 = element.getAttribute("href");
        System.out.println(par1); //получили ссылку с элемента Мотоциклы и мототехника.
    }

}