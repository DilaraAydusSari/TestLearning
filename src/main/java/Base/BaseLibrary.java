package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseLibrary extends Data{

    public static WebDriver driver;

    public void sleep(int time) throws InterruptedException {
        Thread.sleep(time);
    }
}
