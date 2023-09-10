import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxDemo {
    public static String url = "https://fs2.formsite.com/meherpavan/form2/index.html";
    public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        driver.get(url);

        JavascriptExecutor jsx = (JavascriptExecutor) driver;
        //JavascriptExecutor jsx = (JavascriptExecutor) driver;
        //jsx.executeScript("window.scrollBy(0,450);");
        jsx.executeScript("window.scrollBy(0,450);");

        WebElement maleRb = driver.findElement(By.xpath("//label[@for='RESULT_RadioButton-7_0']"));
        maleRb.click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//label[.='Female']")).click();
        List<WebElement> elements =driver.findElements(By.xpath("//table[@class='inline_grid choices']/tbody/tr/td/label"));

        for (WebElement el:elements) {
           String text= el.getText();
           if (text.equals("female")){
               el.click();
           } else if (text.equals("saturday")) {
               el.click();

           } else if (text.equals("sunday")) {
               el.click();

           }
            Thread.sleep(1000);
        }
        Thread.sleep(1000);
        driver.quit();


    }
}
