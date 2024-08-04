package Pages;

import Base.BaseLibrary;
import Base.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BaseLibrary {

    public HomePage hesabimKontrol() {
        String value3 = driver.findElement(By.cssSelector("[class='link account-user'] p")).getText();
        //System.out.println(value3);
        Assert.assertEquals("Hesabım", value3);
        return this;
    }
}
