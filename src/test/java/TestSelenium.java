import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.jupiter.api.Assertions.assertEquals;




public class TestSelenium {

    WebDriver driver;

    @BeforeEach
    void setup() {

        System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();

        //WebDriverManager.chromedriver().browserVersion("131").setup();

        //WebDriverManager.chromedriver().setup();
        //WebDriver driver= new ChromeDriver();
    }


    //@AfterEach
    //void tearDown() {
       // driver.quit();
       // driver = null;
    //}



    @Test
    public void shouldOpenRush (){
        // Открываем сайт
        driver.get("https://www.rush-analytics.ru/");

        String slogan = driver.findElement(By.className("hero-slogon")).getText();

        // сравниваем текст
        assertEquals("Доверьте рутину нам — занимайтесь реальными задачами", slogan.trim());

    }
    @Test
    public void shouldClickRegistry(){
        driver.get("https://www.rush-analytics.ru/");
        driver.findElement(By.linkText("Зарегистрироваться")).click();



    }


}
