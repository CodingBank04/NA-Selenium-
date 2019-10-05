package mentoring;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionsTogether {
    //locators on main page
    private static By searchBox = By.id("textSearch");
    private static By searchButton = By.id("btnSearch");
    //locators on result page
    private static By yearMakeModel = By.cssSelector("tbody h4");
    private static By stockNumber = By.cssSelector("tbody text");
    private static By vinNumber = By.cssSelector("tbody tr td:nth-child(3) p:nth-of-type(2)");


    public static void main(String[] args) throws InterruptedException {
        InvokeBrowser myBrowser = new InvokeBrowser();
        WebDriver driver = myBrowser.invokeChromeBrowser();
        driver.get("https://www.iaai.com/");

        driver.findElement(searchBox).sendKeys("toyota corolla");
        driver.findElement(searchButton).click();
        Thread.sleep(5000);
        List<Map<String, String>> carList = new ArrayList<>();

        List<WebElement> carVins = driver.findElements(vinNumber);

        int numberOfCarsOnPage = carVins.size();

        for (int i = 0; i < numberOfCarsOnPage; i++) {
            Map<String, String> carMap = new HashMap<>();
            carMap.put("yearMakeModel", driver.findElement(yearMakeModel).getText());
            carMap.put("stockNumber", driver.findElement(stockNumber).getText());
            carMap.put("vinNumber", driver.findElement(vinNumber).getText());
        }
    }
}