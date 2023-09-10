import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task02 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
        username.click();
        username.sendKeys("Tester");
        WebElement pass = driver.findElement(By.id("ctl00_MainContent_password"));
        pass.click();
        pass.sendKeys("test");
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();
        Thread.sleep(2000);

        //WebElement weborder = driver.findElement(By.xpath("//h1[normalize-space()='Web Orders']"));
        WebElement weborder = driver.findElement(By.tagName("h1"));
        WebElement welcome = driver.findElement(By.xpath("//div[@class='login_info']"));

        if (weborder.isDisplayed()){
            System.out.println("Log in scsesful"+weborder.getText());
        }else{
            System.out.println("there is something wrong");
        }

        if (welcome.isDisplayed()){
            System.out.println("is correct"+welcome.getText());
        }else{
            System.out.println("not coreckt");
        }
        driver.quit();
    }
}
