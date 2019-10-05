package mentoring;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ArrayListTesting {

    private static final String APP_URL ="https://wwww.com" ;
    private static By buttonAddElement = By.xpath("//button[.='Add Element']");
    private static By buttonDelete = By.xpath("//button[.='Delete']");


    public static void main(String[] args) {
        InvokeBrowser myBrowser = new InvokeBrowser();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get(APP_URL);


        WebElement el = driver.findElement(buttonAddElement);  // >>>>> finds only one element
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(buttonAddElement));
        el.click();
        System.out.println("Program ended");


        // Before clicking Add Element button
        List<WebElement> addElementButtonList = driver.findElements(buttonAddElement);
        List<WebElement> deleteButtonList = driver.findElements(buttonDelete);  // >>>>> finds all elements inside the page
        System.out.println("There are " + addElementButtonList.size() + " Add Element buttons on the page.");
        System.out.println("There are " + deleteButtonList.size() + " Delete buttons on the page.");

        // Click Add Element button
        driver.findElement(buttonAddElement).click();

        // After clicking on Add Element button
        addElementButtonList = driver.findElements(buttonAddElement);
        deleteButtonList = driver.findElements(buttonDelete);
        System.out.println("There are " + addElementButtonList.size() + " Add Element buttons on the page after clicking on Add Element.");
        System.out.println("There are " + deleteButtonList.size() + " Delete buttons on the page after clicking on Add Element.");

        // Click Add Element button
        // After clicking on Add Element button​
        addElementButtonList = driver.findElements(buttonAddElement);
        deleteButtonList = driver.findElements(buttonDelete);
        System.out.println("There are " + addElementButtonList.size() + " Add Element buttons on the page after clicking on Add Element again.");
        System.out.println("There are " + deleteButtonList.size() + " Delete buttons on the page after clicking on Add Element again.");

        // Click Delete button
        driver.findElement(buttonDelete).click();

        // After clicking on Delete Element button
        addElementButtonList = driver.findElements(buttonAddElement);
        deleteButtonList = driver.findElements(buttonDelete);
        System.out.println("There are " + addElementButtonList.size() + " Add Element buttons on the page after clicking on Delete button.");
        System.out.println("There are " + deleteButtonList.size() + " Delete buttons on the page after clicking on Delete button.");

    }


}