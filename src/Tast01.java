import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tast01 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/newtours/");
        driver.findElement(By.cssSelector("[width='77'] > [href='register.php']")).click();
        WebElement name = driver.findElement(By.cssSelector("input[name='firstName']"));
        name.click();
        name.sendKeys("onder");
        WebElement lastname = driver.findElement(By.cssSelector("input[name='lastName']"));
        lastname.click();
        lastname.sendKeys("yentar");
        WebElement phone = driver.findElement(By.cssSelector("input[name='phone']"));
        phone.click();
        phone.sendKeys("123445676555");
        WebElement email = driver.findElement(By.cssSelector("#userName"));
        email.click();
        email.sendKeys("examp@gmail.com");
        WebElement city = driver.findElement(By.cssSelector("input[name='city']"));
        city.click();
        city.sendKeys("Orlando");
        JavascriptExecutor jsx = (JavascriptExecutor) driver;
        //JavascriptExecutor jsx = (JavascriptExecutor) driver;
        //jsx.executeScript("window.scrollBy(0,450);");
        jsx.executeScript("window.scrollBy(0,250);");
        WebElement state = driver.findElement(By.cssSelector("input[name='state']"));
        state.click();
        state.sendKeys("Florida");
        WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
        username.click();
        username.sendKeys("oserder@gmail.com");
        WebElement passs = driver.findElement(By.cssSelector("input[name='password']"));
        passs.click();
        passs.sendKeys("onder21");
        driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("onder21");
        driver.findElement(By.name("submit")).click();

       // String url = ""
        System.out.println("url: "+driver.getCurrentUrl());
        Thread.sleep(10000);

        driver.quit();




    }

}
