import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.manager.SeleniumManager;

public class SeleniumHw {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.amazon.com");

        String curenntUrl= driver.getCurrentUrl();
        String expekctUrl = "amazon.com";//"Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";

        if (curenntUrl.equals(expekctUrl)){
            System.out.println("Title:"+driver.getTitle());

        }else{
            System.out.println("there is have problem");
        }

        Thread.sleep(7000);

       // SeleniumManager


        driver.quit();
        chromeExamp();
    }
    public static void chromeExamp() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.redfin.com/");
        String currentURL = driver.getCurrentUrl();
        String expecktURL = "https://www.redfin.com/";
        if (currentURL.equals(expecktURL)){
            System.out.println("Title:"+ driver.getTitle());
        }else{
            System.out.println("There is something wrong!");
        }
        Thread.sleep(7000);
        driver.quit();
    }
}
