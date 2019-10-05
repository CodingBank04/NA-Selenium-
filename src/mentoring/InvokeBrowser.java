package mentoring;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeBrowser {

    public WebDriver invokeChromeBrowser() {

        System.setProperty("webdriver.chrome.driver", "/Users/vahit.peker/Desktop/chromedriver");

        WebDriver beehive = new ChromeDriver();
        return beehive;
    }
}
