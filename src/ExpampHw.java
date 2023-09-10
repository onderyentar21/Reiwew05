import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import javax.jws.WebParam;

public class ExpampHw {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.facebook.com/login/");

        WebElement email = driver.findElement(By.id("email"));
        email.click();
        email.sendKeys("onderyentar@gmail.com");

        driver.findElement(By.cssSelector("._97w4")).click();
        WebElement pass = driver.findElement(By.id("pass"));
        pass.click();
        pass.sendKeys("passworddd");
        WebElement login = driver.findElement(By.id("loginbutton"));
        driver.findElement(By.id("onder")).sendKeys("yenyar");
        login.click();

        driver.quit();


    }
}
