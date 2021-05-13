package Class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HomeWork2 {

    @Test

    public void Task1 () throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","./driver/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");


        Thread.sleep(2000);

        String emailID = "email";
        By emailLocator = By.id(emailID);
        WebElement emailBox = driver.findElement(emailLocator);
        emailBox.sendKeys("myemail@gmail.com");

        Thread.sleep(2000);

        String passName = "pass";
        By passLocator = By.name(passName);
        WebElement passBox = driver.findElement(passLocator);
        passBox.sendKeys("passw0rd");

        Thread.sleep(2000);

        String logInText = "Log In";
        By logInTextLocator = By.linkText(logInText);
        WebElement logIntButton = driver.findElement(logInTextLocator);
        logIntButton.click();

        Thread.sleep(2000);

        driver.quit();

    }

    @Test
    public void Task2 () throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","./driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        Thread.sleep(2000);

        String createAccountText = "Create New Account";
        By accountTextLocator = By.linkText(createAccountText);
        WebElement createAccountButton = driver.findElement(accountTextLocator);
        createAccountButton.click();

        Thread.sleep(2000);

        String firstName = "firstname";
        By firstNameLocator = By.name(firstName);
        WebElement firstNameBox = driver.findElement(firstNameLocator);
        firstNameBox.sendKeys("First");

        String lastName = "lastname";
        By lastNameLocator = By.name(lastName);
        WebElement lastNameBox = driver.findElement(lastNameLocator);
        lastNameBox.sendKeys("Last");

        String phoneName = "reg_email__";
        By phoneLocator = By.name(phoneName);
        WebElement phoneBox = driver.findElement(phoneLocator);
        phoneBox.sendKeys("9898787800");

        String passID = "password_step_input";
        By passIdLocator = By.id(passID);
        WebElement passBox = driver.findElement(passIdLocator);
        passBox.sendKeys("passw0rd");

        String signUpName = "websubmit";
        By signUpTextLocator = By.name(signUpName);
        WebElement signUpButton = driver.findElement(signUpTextLocator);
        signUpButton.click();

        driver.quit();

    }


    /**
     * Homework 2:
     *
     * Task 1:
     * Write code to perform below steps:
     * 1. Launch facebook.com
     * 2. Enter "myemail@gmail.com" in Email or Phone Number
     * 3. Enter "passw0rd" in password
     * 4. Click Log In button
     * 5. Close the browser window
     * /



     /** Task 2:
     * Write code to perform below steps:
     * 1. Launch facebook.com
     * 2. Click on "Create New Account"
     * 3. Enter "First" in Firstname
     * 4. Enter "Last" in Lastname
     * 5. Enter "9898787800" in Mobile number or Email
     * 6. Enter "passw0rd@123" in New pasword
     * 7. Click on "Sign Up" button
     * 8. Close the browser window
     *
     */
}
