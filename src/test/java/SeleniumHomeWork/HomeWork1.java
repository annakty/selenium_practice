package SeleniumHomeWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HomeWork1 {

    @Test
    public void launchFavoriteWebpage () {

        System.setProperty("webdriver.chrome.driver","./driver/chromedriver");
        WebDriver driver = new ChromeDriver();

        String myURL = "https://www.mail.ru/";
        driver.get(myURL);
        driver.manage().window().maximize();
        driver.quit();

    }

}
