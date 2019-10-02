package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class CapitalLetterActions {
    public static void main(String[] args) {
        InvokeBrowser myBrowser = new InvokeBrowser();
        WebDriver driver = myBrowser.invokeChromeBrowser();
        driver.get("http://www.facebook.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        Actions myActions=new Actions(driver);
        WebElement myWebElement= driver.findElement(By.cssSelector("input#email"));
        /*
        myActions.moveToElement(myWebElement).build().perform();
        myActions.click().build().perform();
        myActions.keyDown(myWebElement, Keys.SHIFT).build().perform();
        myActions.sendKeys("beehive").build().perform();
        myActions.keyUp(myWebElement,Keys.SHIFT).build().perform();

         */
        Action action=myActions.moveToElement(myWebElement)
                .click()
                .keyDown(myWebElement,Keys.SHIFT)
                .sendKeys("BEEHIVE")
                .keyUp(myWebElement,Keys.SHIFT).build();
              //action.perform();

    }
}