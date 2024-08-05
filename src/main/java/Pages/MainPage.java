package Pages;

import Base.BaseLibrary;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class MainPage extends BaseLibrary {

    @Step("Kabul Et Alanı Kontrolü")
    public MainPage kabulEtTikla() throws InterruptedException {
        //elementin gelmesi durumunda tıklama, gelmemesi durumunda tıklamama:
        WebElement element = driver.findElement(By.id("onetrust-accept-btn-handler"));
        sleep(4000);
        if(element.isDisplayed())
            driver.findElement(By.id("onetrust-accept-btn-handler")).click();
        return this;
    }

    @Step("Arama İşlemi Sağlama")
    public MainPage aramaDoldur(String text) {
        WebElement element = driver.findElement(By.cssSelector("[data-testid='suggestion']"));
        element.sendKeys(text, Keys.ENTER);
        return this;
    }

    @Step("Favorilerim Alanına Tıklanır")
    public MainPage favorilerimTikla() {
        WebElement element = driver.findElement(By.cssSelector("[class='account-nav-item account-favorites']"));
        element.click();
        return this;
    }
}
