package mentoring;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import selenium.InvokeBrowser;

import java.util.List;

public class SampleTest3 {

    private static final String APP_URL = "http://the-internet.herokuapp.com/add_remove_elements/";

    private static By buttonAddElement = By.xpath("//button[.='Add Element']");
    private static By buttonDelete = By.xpath("//button[.='Delete']");


    public static void main(String[] args) {
        selenium.InvokeBrowser myBrowser = new InvokeBrowser();
        WebDriver driver = myBrowser.invokeChromeBrowser();

        driver.get(APP_URL);

//		WebElement el = driver.findElement(buttonDelete);  // >>>>> finds only one element

        List<WebElement> elList = driver.findElements(buttonDelete);  // >>>>> finds all elements inside the page

        System.out.println("Are there Delete buttons already on the page?: " + !elList.isEmpty());
    }






}

