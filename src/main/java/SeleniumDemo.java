import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.awt.*;
import java.io.File;

public class SeleniumDemo {
    public static void main(String[] args) throws InterruptedException {
        //WebDriver firefoxDriver = new FirefoxDriver();
        //firefoxDriver.get("https://www.bing.com/");
          //By by = By.className("b_searchbox");
          //WebElement element = firefoxDriver.findElement(by);

      // firefoxDriver.quit();
          //File file = new File("C:/Selenium/IEDriverServer.exe");
          //System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
        //WebDriver explorer = new InternetExplorerDriver();
        //explorer.get("https://www.bing.com/");
        //explorer.quit();

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //System.getProperty("driver.chrome");
        WebDriver chrome = new ChromeDriver();
        chrome.get("https://master.jazva.com/login.jsp");
        //chrome.wait(10);
        WebElement uname = chrome.findElement(By.xpath("//*[@id=\"username\"]"));
        uname.clear();
        uname.sendKeys("test");
        WebElement pass = chrome.findElement(By.xpath("//*[@id=\"password\"]"));
        pass.clear();
        pass.sendKeys("123456jz");
        //chrome.findElement(By.className("btn btn-primary")).click();
        chrome.findElement(By.xpath("//*[@id=\"login\"]/div[2]/div[2]/div[2]/div[1]/form/div[3]/input")).click();
        chrome.wait(10);
        chrome.close();
        chrome.quit();

    }
}
