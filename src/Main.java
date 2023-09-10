import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import javax.swing.border.TitledBorder;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\testmuhendisi_dersler\\untitled3\\drivers\\chromedriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        //driver.get("https://www.instagram.com/onderyentar/");
        //driver.get("https://www.google.com/");
        //System.out.println("Hello world!");
        driver.get("https://www.neotechacademy.com/");


        String actualyURL = driver.getCurrentUrl();
        String expectedURL = "https://www.neotechacademy.com/";
        if (actualyURL.equals(expectedURL)) {
            System.out.println("Title:"+ driver.getTitle());
        }else{
            System.out.println("this is not corect");
        }
        Thread.sleep(5000);
        driver.quit();


    }
}