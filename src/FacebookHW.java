import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookHW {
    static WebDriver driver ;
    public static void main(String[] args) throws InterruptedException {
        driver = new EdgeDriver();
        //ChromeDriver();
        //WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        Thread.sleep(3000);
        WebElement createNew = driver.findElement(By.cssSelector("._6lti"));
        createNew.click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).click();
        driver.findElement(By.name("firstname")).sendKeys("onder");
        driver.findElement(By.name("lastname")).sendKeys("Yentar");
        driver.findElement(By.name("reg_email__")).sendKeys("onder@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("onder@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("dsjhfsjd");
       // driver.findElement(By.cssSelector("[for='u_y_5_LX']")).click();
       // driver.findElement(By.id("u_y_s_ui")).click();
        driver.findElement(By.xpath("//input[@value='2']")).click();
        JavascriptExecutor jsx = (JavascriptExecutor) driver;
        //JavascriptExecutor jsx = (JavascriptExecutor) driver;
        //jsx.executeScript("window.scrollBy(0,450);");
        jsx.executeScript("window.scrollBy(0,250);");
        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(10000);

        close();

    }
    public static void close(){
        driver.quit();
    }
}
