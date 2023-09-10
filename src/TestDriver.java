public class TestDriver {
    public static void main(String[] args) {

        I_WebDriver webDriver = new C_ChromeDriver();

        webDriver.get("Onderyentar");
        webDriver.getCurrentUrl();
        webDriver.getTitle();
        webDriver.quit();
    }

}
