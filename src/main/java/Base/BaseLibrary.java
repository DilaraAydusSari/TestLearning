package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class BaseLibrary extends Data{

    public static WebDriver driver;

    public void sleep(int time) throws InterruptedException {
        Thread.sleep(time);
    }

    public void switchTab(){
        ArrayList <String> list = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(list.get(1));
    }
}
