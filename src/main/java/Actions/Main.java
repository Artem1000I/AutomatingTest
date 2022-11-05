package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\AUTOMATING_TEST\\chrom.107\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));






        try {
            driver.get("https://crossbrowsertesting.github.io/drag-and-drop");
            Thread.sleep(2000); // задежка чтоб информация загрузилась
            // Ищем элемент на странице
            WebElement element1 = driver.findElement(By.id("draggable")); // элемент который хотим перенести
            WebElement element2 = driver.findElement(By.id("droppable")); // элемент куда нужно перенести

            //actions.dragAndDrop указывает два элемента и произойдёт тоже самое
            //actions.dragAndDropBy(element,координаты оси х 100 ось у 100) указывем элемент и координаты куда хоти перенести
            Actions actions = new Actions(driver);

            // метод puse если нужна пауза
            //например
            //actions.moveToElement(element).pause(1000).clickAndHold

            actions.moveToElement(element1).clickAndHold().moveToElement(element2).release().build().perform(); //нам нужно перенести курсор над элементом 1/// дальше нужно нажать на него и держать эту кнопку,///
            // дальшу нужно перенести курсор над вторым элементом/// и дальше нужно отпустить наш курсор/// .дальше собираем///и применяем.


        } catch (InterruptedException e) {
            throw new RuntimeException(e);

        }finally {
            Thread.sleep(20000);
            driver.quit(); //чтобы закрывать драйвер после выполнения
        }


        //element.clear(); //очиститть поле ввода куда мы чтото ввели

        //actions.contextClick()  нажимаем правой кнопкой мыши

        //clickAndHold нажать на какойто элемент и задержать левую кнопку мыши

        //doubleClick двойное нажатие левой кнопкой мыши

        //БОЛЕЕ СЛОЖНЫЕ

        //actions.moveToElement() навести курсор на какойто элемент
        //.keyDown() нажимаем на кнопку
        //.keuUp() отжимаем клик от кнопки
        //.release() например зажали кнопку с пмощбю clickAndHold() и чтобы её отжать используем release

        //Чтобы потом все действия с мышкой собрать и применить используем
                //.build()  собираем
                //.perform(); применяем


        //Хотим кликнуть по элементу инструменты на саййте DNS







    }
}