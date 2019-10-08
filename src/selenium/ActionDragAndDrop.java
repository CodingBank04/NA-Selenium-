package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionDragAndDrop {
    public static void main(String[] args) {
        InvokeBrowser myBrowser = new InvokeBrowser();
        WebDriver driver = myBrowser.invokeChromeBrowser();
        driver.get("http://demo.guru99.com/test/drag_drop.html");

        WebDriverWait wait =new WebDriverWait(driver,30);
       // wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()=' BANK ']")));

        WebElement source= driver.findElement(By.xpath("//a[text()=' BANK ']"));
        WebElement target= driver.findElement(By.cssSelector("#bank > li"));

        Actions myActions=new Actions(driver);
        myActions.dragAndDrop(source,target).build().perform();


    }
}
