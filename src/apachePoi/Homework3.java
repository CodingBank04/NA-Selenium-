package apachePoi;

import com.sun.rowset.internal.Row;
import javafx.scene.control.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileOutputStream;
import java.sql.ResultSet;

public class Homework3 {

    /*public static void main(String[] args) throws InterruptedException {

    System.setProperty("webdriver.chrome.driver", "/Users/vahit.peker/Desktop/chromedriver");
    WebDriver driver = new ChromeDriver();
    driver.get("<http://www.facebook.com");

        int totalRows =sh.getLastRowNum();
    for(int i=1; i<totalRows+1; i++)
    {
        Row rw = sh.getRow(i);
        Cell userName =rw.getCell(0);
        Cell password;
        password = rw.getCell(1);

        driver.findElement(By.id("email")).sendKeys(userName.getStringCellValue());
        Thread.sleep(1500);
        driver.findElement(By.id("pass")).sendKeys(password.getStringCellValue());
        Thread.sleep(1500);
        driver.findElement(By.id("pass")).clear();
        Thread .sleep(1500);
        driver.findElement(By.id("email")).clear();
        Thread.sleep(1500);

        Cell passed=rw.createCell(2);
        passed.setCellValue("Failed");
        fileS.close();
        FileOutputStream fos = new FileOutputStream(file);
        workB.write(fos);
        fos.close();

    }
    }

     */
}



