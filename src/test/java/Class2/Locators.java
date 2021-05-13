package Class2;

import org.openqa.selenium.By;

public class Locators {

    /**
     * Locator: It's a kind of address (rout to reach/find) of webElement using which we find the webElement in Selenium.
     * Datatype of locator --> By (By is a class in Selenium)
     *
     * We find the address (String) of WebElement.
     * We put the address as input to appropriate method of By class -->Locator(By)
     *
     * Steps to interact webElement:
     * 1.Find the unique address to reach webElement using DOM
     * 2.Depending upon the type of address/info,
     *          we use specific method from By-class to create locator
     * 3.Use locator ti find WebElement using findElement() (eg: driver.find.Element(locatorUsingID)
     * 4.Then we interact (type,clear,click) with the WebElement
     *
     *
     * Address
     * 1.id(unique)      --> By locatorUsingID = By.id("idValue")
     * 2.name            --> By locatorUsingName =By.name("nameValue")
     *      In chropath, check if name is unique: //*[@name='value']
     * 3.className       --> By locatorUsingClass =By.className("classValue")
     *      In chropath, check if class is unique: //*[@class='value']
     * 4.linkText        --> By locatorUsingLinkText = By.linkText("text with link")
     *      In chropath, check if text is unique: //a[text()='text value']
     * 5.PartialLinkText --> By locatorUsingPartialLinkText = By.partialLinkText ("partial text of link")
     *      In chropath, check if partial text is unique: //a[contains(text(),'partial text value')]
     *
     * Links:
     *    1. Always with 'a' tag
     *    2. After clicking the link, user will move to a new webpage.
     *      This depend on the value href attribute.
     *
     * Text associated with a link is called linkText
     *
     */

    // By locatorUsingID = By.id("email");

}
