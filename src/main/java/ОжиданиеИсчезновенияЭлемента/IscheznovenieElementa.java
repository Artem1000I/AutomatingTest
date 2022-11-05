package ОжиданиеИсчезновенияЭлемента;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class IscheznovenieElementa {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\AUTOMATING_TEST\\Chrom107.53\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        try {
            driver.get("https://pagination.js.org/");
            Thread.sleep(2000);

            List<WebElement> elements6 = (List<WebElement>) driver.findElement(By.xpath("//div[@class='data-container']/ul/li")); //это локатор для списка нас айте
            List<WebElement> pages     = (List<WebElement>) driver.findElement(By.xpath("//div[@class='paginationjs-pages']/ul/li")); //это локатор для лишек которые лситают список
            //Смотрим что там лежит
            String text = elements6.get(5).getText(); //элемент 16
            System.out.println(text);


            //Нужно переключить страницу
            pages.get(2).click();
            wait.until(ExpectedConditions.stalenessOf(elements6.get(5)));// ожидание для появление информации на странице 6 по индексу элемент

            //Нужно сохранить в элемент новую информацию на странице 2
            elements6 = (List<WebElement>) driver.findElement(By.xpath("//div[@class='data-container']/ul/li"));

            //Смотрим что там лежит
            text = elements6.get(5).getText(); //элемент 16
            System.out.println(text);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        }

    }
