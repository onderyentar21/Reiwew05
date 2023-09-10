import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_ChromeDriver implements I_WebDriver {

    public C_ChromeDriver(){
        System.out.println("Chrome id opening");
    }
    @Override
    public void get(String url) {
        System.out.println("Navigate to url: "+url);
    }

    @Override
    public String getTitle() {
        System.out.println("Chrome gets the title");
        return "get tştle";
    }

    @Override
    public String getCurrentUrl() {
        System.out.println("Chrome get curent url");
        return "Current url";
    }

    @Override
    public void close() {

        System.out.println("chrome closed");
    }

    @Override
    public void quit() {

    }
}
