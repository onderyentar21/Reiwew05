import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserCommands {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.zillow.com/");
        Thread.sleep(5000);
       // driver.navigate().back();
        //driver.navigate().to("www.google.com/");

        driver.navigate().refresh();
        Thread.sleep(10000);
        driver.navigate().refresh();
        Thread.sleep(10000);
        driver.navigate().to("https://www.google.com/");
        Thread.sleep(10000);
        driver.navigate().back();
        Thread.sleep(10000);
        driver.navigate().forward();
        Thread.sleep(10000);








        driver.quit();
    }
}
