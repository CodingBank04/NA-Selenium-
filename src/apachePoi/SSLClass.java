package apachePoi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSLClass {
    public static Object main(String[] args) {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.acceptInsecureCerts();
        ChromeOptions co = new ChromeOptions();
        co.merge(dc);
        System.setProperty("webdriver.chrome.driver", "/Users/vahit.peker/Desktop/chromedriver");
        WebDriver driver= new ChromeDriver(co);
        Object beehive = null;
        return beehive;





    }
}