import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDemo {

    public static void main(String[] args) throws InterruptedException {

/*        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver chrome = new ChromeDriver();*/
        WebDriver driver = new FirefoxDriver();
        driver.get("https://master.jazva.com/login.jsp");
        WebElement uname = driver.findElement(By.xpath("//*[@id=\"username\"]"));
        uname.clear();
        uname.sendKeys("test");
        WebElement pass = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        pass.clear();
        pass.sendKeys("123456jz");
        driver.findElement(By.xpath("//*[@id=\"login\"]/div[2]/div[2]/div[2]/div[1]/form/div[3]/input")).click();
        driver.findElement(By.xpath("//*[@id=\"mainnav\"]/ul/li[2]/a/span[1]")).click();
        Assert.assertFalse("Error on page", driver.getPageSource().contains("Error"));
        Assert.assertTrue("Text 'Tasks' is absent", driver.getPageSource().contains("Tasks"));
        Assert.assertTrue("Text 'Alerts", driver.getPageSource().contains("Alerts"));

        driver.findElement(By.xpath("//*[@id=\"mainnav\"]/ul/li[2]/div/ul/li[11]/a")).click();
/*        boolean isTheTextPresent = chrome.getPageSource().contains("Error");
        Assert.assertFalse(isTheTextPresent);*/
        Assert.assertFalse("Error on the page 'Orders - Shipping'", driver.getPageSource().contains("Error Code"));
        Assert.assertTrue("Text 'Tasks' is absent", driver.getPageSource().contains("Shipment"));
        //chrome.wait(10);
        driver.close();
        //driver.quit();

    }
}
