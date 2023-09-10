import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Facebook02 {

    static  WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        /* driver = new ChromeDriver();
        driver.get("https://www.facebook.com/login/");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#email")).sendKeys("admin");
        driver.findElement(By.cssSelector("#pass")).sendKeys("admin.123");
        driver.findElement(By.cssSelector("#loginbutton")).click();

        Thread.sleep(4000);
       // xpath();

         */
       // newOrnek();
        //navigateCommand();
        //Task1();
        amazon();
        driver.quit();


    }
    public static void xpath() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/newtours/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[normalize-space()='REGISTER']")).click();
        driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("onder");
        JavascriptExecutor jsx = (JavascriptExecutor) driver;
        //JavascriptExecutor jsx = (JavascriptExecutor) driver;
        //jsx.executeScript("window.scrollBy(0,450);");
        jsx.executeScript("window.scrollBy(0,250);");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("onderyentar");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("passs123");
        driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("passs123");
        driver.findElement(By.xpath("//input[@name='submit']")).click();
    }
    public static void newOrnek() throws InterruptedException {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        String url = "https://www.nytimes.com/games/wordle/";
        driver.get(url);
        Thread.sleep(3000);
        String currentURL = driver.getCurrentUrl();
        if (url.equals(currentURL)){
            System.out.println("url are same");
        }else{
            System.out.println("there is have a problem");
        }
        System.out.println(url);
        System.out.println(currentURL);

    }
    public static void navigateCommand() throws InterruptedException {
        driver = new ChromeDriver();
        String url = "https://www.instagram.com/";

        driver.navigate().to(url);
        driver.manage().window().fullscreen();// Will make full screen

        driver.navigate().to("https://www.mlssoccer.com/");
        Thread.sleep(3000);
        driver.navigate().to("https://www.fifa.com/fifaplus/en");
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().forward();
        Thread.sleep(1000);
        driver.navigate().refresh();
        Thread.sleep(2000);

    }
    public static void Task1() throws InterruptedException {
        int waitTime = 1;
         driver = new ChromeDriver();
         Thread.sleep(1000);
         driver.get("https://www.selenium.dev/");
         driver.get("https://www.google.com/");
         for(int i = 1; i<10; i++){
             driver.navigate().back();
             Thread.sleep(1000);
             driver.navigate().forward();
             Thread.sleep(1000);
         }
        }

        public static void amazon() throws InterruptedException {
        driver = new FirefoxDriver();
        String url = "https://www.amazon.com/";
        driver.get(url);
        driver.findElement(By.cssSelector(".nav-input[type=\"text\"]")).sendKeys("Haaland jerser kids");
        driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
        Thread.sleep(2000);
            List<WebElement> name = driver.findElements(By.className("nav-logo-link nav-progressive-attribute"));



        Thread.sleep(3000);
        driver.quit();
        }
    }


