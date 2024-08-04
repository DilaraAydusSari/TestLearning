package Base;

import Pages.MainPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import javax.xml.crypto.Data;

public class BaseTest extends BaseLibrary {

    MainPage mainPage = new MainPage();

    @BeforeMethod
    public void setUp() throws InterruptedException {
        //WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.trendyol.com/giris");
        mainPage.kabulEtTikla();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
