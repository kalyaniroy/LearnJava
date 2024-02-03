import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenYouTube {
    public static void main(String[] args) {
        // Specify the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open www.youtube.com
        driver.get("https://www.youtube.com");

        // Close the browser
        driver.quit();
    }
}
