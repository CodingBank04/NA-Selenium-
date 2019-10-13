package selenium;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Class {

        public static void main(String[] args) throws MalformedURLException {
            //Step 1: Define the desired capability
            DesiredCapabilities dc=DesiredCapabilities.chrome();
            //Step 2: Set the browser type
            // dc.setBrowserName("chrome");
            //dc.setVersion("77");
            //Step3: Set the platform
            //  dc.setCapability("ignoreZoomSetting", true);
            dc.setPlatform(Platform.MAC);
            //Step 4: create the driver that we use for setting up the UI components
            // System.setProperty("webdriver.gecko.driver","C:\\Users\\iulusoy\\Downloads\\geckodriver.exe");
            WebDriver driver =new RemoteWebDriver(new URL("http://10.0.0.127:2000/wd/hub"),dc);
            //Step 5: create the driver that we use for setting up the UI components
            // Every step will be the same as before
            driver.get("http://www.expedia.com");
           // driver.close();
        }
}
