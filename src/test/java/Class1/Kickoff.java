package Class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Locale;

public class Kickoff {

    @Test
    public void launchWebPage () {
        // mention path of (chrome)Driver

        System.setProperty("webdriver.chrome.driver","./driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        /**
         * Webdriver driver --> driver is a variable of WebDriver.
         * New ChromeDriver () ==> creating an object of ChromeDriver Class.
         *
         * Storing the object of ChromeDriver class into WebDriver variable.
         * ChromeDriver extend RemoteWebDriver(C); RemoteWebDriver(C) implements WebDriver(I)
         */

        /**
         * To launch a webpage:
         * Method 1: get() method
         * every webpage has an ID - it calls as portNumber/SessionId/windowHandle)
         *
         * Method 2: navigate().to()
         *
         * Interview QUESTIONS:
         * why do we have 2 diff methods and what is a difference and so on:
         *
         * get() VS navigate().to()
         * get() --> launch the webpage and waits for a few seconds (for webpage to load) before going to the next command.
         * navigate().to() --> launches the webpage, and goes to the next command. (does NOT wait for webpage to load)
         */

        String url = "https://www.amazon.com/";

        driver.get(url);
        // driver.navigate().to("https://www.mail.ru");

        /**
         * TO maximize the webpage
         * Method: maximize()
         */
        driver.manage().window().maximize();

        /**
         * To get Page Title:
         * Method: getTitle()
         */
        String pageTitle = driver.getTitle();
        String expectedTitle = ("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
        /*
            To assert while ignoring cases
         */
        Assert.assertEquals(pageTitle.toLowerCase(),expectedTitle.toLowerCase(),"Page title is not appearing as expected");

        boolean isPageEqual = pageTitle.equalsIgnoreCase(expectedTitle);
        Assert.assertTrue(isPageEqual, "Page is not equal after ignoring cases");

        Assert.assertEquals(pageTitle,expectedTitle,"Page title is not appearing as expected");
        /**
         * Assert class contains multiple methods which we can use to implement the verification.
         * assertEquals -  When we need to verify actualValue against expectedValue.
         *      Example: Assert.assertEquals(value1,value2,"This Error message to be printed as Assertion fails");
         * assertTrue - when we need to verify if the boolean value is true
         *      Example: Assert.assertTrue(booleanValue,"This Error message to be printed as Assertion fails");
         * assertFalse - When we need to verify if the boolean value is false.
         */

        /**
         * To get the URL of window associated with driver
         * MethodL getCurrentUrl()
         */

        String pageUrl= driver.getCurrentUrl();
        Assert.assertEquals(url,pageUrl,"Page URL is not as expected");


        /**
         * To close a webpage
         * Method 1: close()
         *      with close only the web-window associated with a driver
         * Method 2: quit()
         *      will close All web-windows opened due to automation code/script.
         *      used in the end of each test case!
         */

        //driver.close();
        driver.quit();


    }

}
