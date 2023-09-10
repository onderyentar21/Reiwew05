import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxes {
    public static String url = "https://fs2.formsite.com/meherpavan/form2/index.html";
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement firstName = driver.findElement(By.xpath("//*[@id=\"RESULT_TextField-1\"]"));
        firstName.click();
        firstName.sendKeys("Onder");
        Thread.sleep(1000);
        firstName.clear();
        firstName.sendKeys("Ali");
        String maxlenght =firstName.getAttribute("maxlength");
        System.out.println("The length of actitube: "+maxlenght);

        // getAttribute(); metodu ile bağlı olduğu elementi buluyıruz.
        WebElement country = driver.findElement(By.name("RESULT_TextField-4"));
       String classs=  country.getAttribute("class");
        System.out.println("The class attribute of country Webelement is:"+classs);

        WebElement phone = driver.findElement(By.name("RESULT_TextField-5"));
        phone.sendKeys("323-4332-2334");
        String namee = firstName.getAttribute("name");
        System.out.println("The actrabute: "+ namee);

        Thread.sleep(2000);

        driver.quit();

    }
}
