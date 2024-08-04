package Pages;

import Base.BaseLibrary;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MainPage extends BaseLibrary {

    public MainPage kabulEtTikla() throws InterruptedException {
        //elementin gelmesi durumunda tıklama, gelmemesi durumunda tıklamama:
        WebElement element = driver.findElement(By.id("onetrust-accept-btn-handler"));
        sleep(4000);
        if(element.isDisplayed())
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
        return this;
    }

}
