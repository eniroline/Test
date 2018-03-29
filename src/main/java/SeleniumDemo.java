import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver chrome = new ChromeDriver();
        chrome.get("https://master.jazva.com/login.jsp");
        WebElement uname = chrome.findElement(By.xpath("//*[@id=\"username\"]"));
        uname.clear();
        uname.sendKeys("test");
        WebElement pass = chrome.findElement(By.xpath("//*[@id=\"password\"]"));
        pass.clear();
        pass.sendKeys("123456jz");
        chrome.findElement(By.xpath("//*[@id=\"login\"]/div[2]/div[2]/div[2]/div[1]/form/div[3]/input")).click();
        chrome.findElement(By.xpath("//*[@id=\"mainnav\"]/ul/li[2]/a/span[1]")).click();
        Assert.assertFalse("Error on page", chrome.getPageSource().contains("Error"));
        Assert.assertTrue("Text 'Tasks' is absent", chrome.getPageSource().contains("Tasks"));
        Assert.assertTrue("Text 'Alerts", chrome.getPageSource().contains("Alerts"));

        chrome.findElement(By.xpath("//*[@id=\"mainnav\"]/ul/li[2]/div/ul/li[11]/a")).click();
/*        boolean isTheTextPresent = chrome.getPageSource().contains("Error");
        Assert.assertFalse(isTheTextPresent);*/
        Assert.assertFalse("Error on the page 'Orders - Shipping'", chrome.getPageSource().contains("Error"));
        Assert.assertTrue("Text 'Tasks' is absent", chrome.getPageSource().contains("Shipment"));
        //chrome.wait(10);
        chrome.close();
        chrome.quit();

    }
}
