package Class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Locators_Practice {

    @Test
    public void practical () throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","./driver/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");

        Thread.sleep(2000);

        //enter email abcd@test.com

        String emailID = "email"; // trying to find unique address I can use to find the webElement
        By emailLocator = By.id(emailID); // using the address -- creating a locator/rout to find the WebElement
        WebElement emailBox = driver.findElement(emailLocator); // using the rout I'm trying to find webElement
        emailBox.sendKeys("abcd@test.com"); //once I found the webElement I'm trying to interact
        // OR we can write it in one line
        // driver.findElement(By.id(emailID)).sendKeys("abcd@test.com");

        //enter password as abcd@1234
        String passName = "pass";
        By passLocator = By.name(passName);
        WebElement passBox = driver.findElement(passLocator);
        passBox.sendKeys("abcd@1234");
        //driver.findElement(By.name(passName)).sendKeys("abcd@1234");


        /* by className
        String passClass = "_6ltj";
        By passLocator2 = By.name(passClass);
        WebElement passBox2 = driver.findElement(passLocator2);
        passBox.sendKeys("abcd@1234");
         */

        String createAccountText = "Create New Account";
        By accountTextLocator = By.linkText(createAccountText);
        WebElement createAccountButton = driver.findElement(accountTextLocator);
        createAccountButton.click();


        /*
        String createAccountPartialText = "New Acc";
        By accountTextLocator_2 = By.partialLinkText(createAccountPartialText);
        WebElement createAccountButton_2 = driver.findElement(accountTextLocator_2);
        createAccountButton_2.click();
         */


    }
}
