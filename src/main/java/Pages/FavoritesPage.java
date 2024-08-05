package Pages;

import Base.BaseLibrary;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.Assert;

public class FavoritesPage extends BaseLibrary {

    @Step("Ürün Kontrolü")
    public FavoritesPage productControl(String text){
        boolean status = driver.findElement(By.xpath("//*[contains(text(),'IP/Celeron İşlemci/4 GB RAM/128 GB SSD/15.6\"/Win/Laptop Gri 82V700A9TX')]")).isDisplayed();
        Assert.assertTrue(status);
        return this;
    }
}
