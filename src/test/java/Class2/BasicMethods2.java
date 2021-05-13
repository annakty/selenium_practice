package Class2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BasicMethods2 {

    @Test

    public void BasicMethods2 () throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","./driver/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com/");

        /**
         * To move back and forward
         * Method: back ()
         * Method: forward ()
         */

        Thread.sleep(5000);
        driver.navigate().back();  // <-- to go back once

        Thread.sleep(5000);
        driver.navigate().forward();  // <-- to go forward once

        /**
         * To refresh the webpage
         * 1.MethodL navigate().refresh()
         * 2.Launch the current url
         * 3.Go back and then forward
         *
         * Interview QUESTION: how refresh the webpage w/o refresh method?
         */

        // #1
        driver.navigate().refresh();
        /* #2
        get the current URL using ->> getCurrentUrl()
        launch the result of step-1 with get()
         */
        String currentUrl = driver.getCurrentUrl();
        driver.get(currentUrl);
        /* #3 Go back and then forward
         */
        driver.navigate().back();
        driver.navigate().forward();


    }

}
