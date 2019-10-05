package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class IframeCw {
    public static void main(String[] args) {
        InvokeBrowser myBrowser = new InvokeBrowser();
        WebDriver driver = myBrowser.invokeChromeBrowser();
        driver.get("https://jqueryui.com/droppable/");


       // WebDriverWait wait=new WebDriverWait(driver,10);
        String numberofFrames;
        numberofFrames = driver.findElement(By.tagName("iframe")).getTagName();
        System.out.println("numberOFfRAMES:" + numberofFrames);
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector("#content > iframe\n")));
        // driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
        driver.switchTo().frame(0);
        WebElement source=driver.findElement(By.cssSelector("#draggable"));
        WebElement target=driver.findElement(By.cssSelector("#droppable"));

        Actions act=new Actions(driver);
        act.dragAndDrop(source,target).build().perform();
        driver.findElement(By.tagName("iframe")).getSize();





    }
}
