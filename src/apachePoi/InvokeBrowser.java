package apachePoi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class InvokeBrowser {

        public WebDriver invokeChromeBrowser() {
            DesiredCapabilities dc=new DesiredCapabilities();
            dc.acceptInsecureCerts();
            dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
            ChromeOptions co=new ChromeOptions();
            co.merge(dc);
            System.setProperty("webdriver.chrome.driver", "/Users/vahit.peker/Desktop/chromedriver");
            WebDriver beehive = new ChromeDriver(co);
            return beehive;
        }
    }

