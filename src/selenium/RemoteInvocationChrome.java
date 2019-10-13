package selenium;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class RemoteInvocationChrome {
    public static void main(String[] args) throws MalformedURLException {
        //DesiredCapabilities dc = new DesiredCapabilities();
       // dc.setBrowserName("firefox");
        DesiredCapabilities dc =DesiredCapabilities.firefox();

        dc.setPlatform(Platform.MAC);
        URL url=new URL("http://10.0.0.127:2000/wd/hub");

        WebDriver driver=new RemoteWebDriver(url,dc);
        driver.get("https://www.expedia.com");

    }
}