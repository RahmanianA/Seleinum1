import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class GoogleSearchTest {
    private static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://alirahmaniancv2024-rahmanianas-projects.vercel.app/");
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
//        driver.findElement(By.linkText("")).click();
//        driver.quit();

    }

}


//https://chromedriver.storage.googleapis.com/index.html
//https://chromedriver.storage.googleapis.com/index.html?path=2.27///
