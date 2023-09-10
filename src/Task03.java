import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Task03 {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        tutorial();
        listWeb();

        /*
        Open chromem browser
        Go to "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx"
         Enter valid username
         Clear username and enter again valid username
        Leave password field empty
        Click on login button
        Verify error message with text "Invalid Login or Password." is displayed.

         */

        driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        // Kullanıcı adı alanını bulun ve geçerli bir kullanıcı adı girin
        WebElement usernameField = driver.findElement(By.id("ctl00_MainContent_username"));
        usernameField.sendKeys("validUsername");

        // Kullanıcı adı alanını temizleyin ve yeniden geçerli bir kullanıcı adı girin
        usernameField.clear();
        usernameField.sendKeys("validUsername");

        // Şifre alanını boş bırakın
        WebElement passwordField = driver.findElement(By.id("ctl00_MainContent_password"));
        passwordField.clear();

        // Giriş düğmesini tıklayın
        WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginButton.click();

        /*
        // Hata mesajını doğrulayın
       // WebElement errorMessage = driver.findElement(By.id("ctl00_MainContent_status"));
        //String actualErrorMessage = errorMessage.getText();
       // String expectedErrorMessage = "Invalid Login or Password.";

        if (actualErrorMessage.equals(expectedErrorMessage)) {
            System.out.println("Hata mesajı doğrulandı: " + actualErrorMessage);
        } else {
            System.out.println("Hata mesajı doğrulanamadı: " + actualErrorMessage);
        }

        // Tarayıcıyı kapatın

         */
        WebElement errormesage = driver.findElement(By.id("ctl00_MainContent_status"));
        String actualerror = errormesage.getText();
        String realMessage = "Invalid Login or Password";

        if (actualerror.equals(realMessage)){
            System.out.println("your tast is passed.."+realMessage);
        }else{
            System.out.println("your test unoassed: "+actualerror);
        }
        driver.quit();
    }
    public static void listWeb(){

        driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/selenium/newtours/");

        List<WebElement> objeList = driver.findElements(By.className("mouseOut"));

        for (WebElement alinan: objeList) {
        String geridonen= alinan.getText();
            System.out.println(geridonen);

        }
        driver.quit();

    }
    public static void tutorial() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/selenium/newtours/index.php");
        Thread.sleep(500);
        driver.findElement(By.name("userName")).sendKeys("mercury");
        driver.findElement(By.name("password")).sendKeys("mercury");
        driver.findElement(By.name("submit")).click();
        driver.findElement(By.xpath("//body[1]//tr[1]//tr[1]//tr[1]//tr[contains(.,'Flights')]")).click();
        Thread.sleep(10000);

        driver.findElement(By.name("fromPort"));
        //step 1: to create on object of element

        WebElement objWeb = driver.findElement(By.name("fromPort"));

        //step 2 : To create oble of select class
        Select objeselect = new Select(objWeb);

        // step 3 : to select
        objeselect.selectByIndex(2);// Londorn
        Thread.sleep(5000);
        objeselect.selectByValue("Paris");// Paris
        Thread.sleep(5000);
        objeselect.selectByVisibleText("Portland");// bu listede değilde kodlamada almak için
        driver.quit();

    }
}
