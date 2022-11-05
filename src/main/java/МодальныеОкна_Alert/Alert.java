package МодальныеОкна_Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Alert{
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\AUTOMATING_TEST\\chrom.107\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); // неявное ожидание


      //  WebDriverWait wait = new WebDriverWait(driver, 1000); //явное ожидание
        try {
            driver.get("https://127.0.0.1:500/index.html"); //сайт сделанный в vs code
            Thread.sleep(5000); // Засыпание на 5 секунд

            WebElement element = driver.findElement(By.id("a")); // каждую из ссылок находим по id
            WebElement element2 = driver.findElement(By.id("b"));
            WebElement element3 = driver.findElement(By.id("c"));

            element.click();

           /* Alert alert = wait.until(alertIsPresent()); // запускаем метод и с помощью метода wait ждём пока алерт появится
            alert.accept();

            element2.click();

            Alert prompt = wait.until(alertPresent());
            alert.accept();

            prompt.sendKeys("Super!"); // в модальное окно с помощью метода sendKeys  вводим текст Super
            prompt.accept();

            Alert alert2 = wait.until(alertIsPresent());
            Thread.sleep(2000);
            alert2.accept();

            element3.click();
            Alert alert3 = wait.until(alertIsPresent());
            alert3.dismiss();
*/
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            driver.quit();
        }


    }
}
