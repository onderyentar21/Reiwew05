import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.util.List;

public class AllebayLinks {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        // eBay ana sayfasına gidin
        driver.get("https://www.ebay.com/");

        // Tüm bağlantıları bulun
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));

        // Bağlantı sayısını yazdırın
        System.out.println("Toplam bağlantı sayısı: " + allLinks.size());

        // Tarayıcıyı kapatın
        driver.quit();
    }
}
