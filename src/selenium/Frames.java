package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Frames {
    public static void main(String[] args) {
            InvokeBrowser myBrowser = new InvokeBrowser();
            WebDriver driver = myBrowser.invokeChromeBrowser();
            driver.get("https://jqueryui.com/droppable/");

            WebDriverWait wait =new WebDriverWait(driver,30);
            driver.switchTo().frame(driver.findElement(By.cssSelector("#content > iframe")));
            Actions myActions=new Actions(driver);
            WebElement source= driver.findElement(By.id("draggable"));
            WebElement target= driver.findElement(By.cssSelector("#droppable > p"));

            myActions.dragAndDrop(source,target).build().perform();
            //driver.switchTo().defaultContent();


        }
    }

