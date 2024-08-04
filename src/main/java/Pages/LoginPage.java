package Pages;

import Base.BaseLibrary;
import Base.BaseTest;
import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BaseLibrary {

    @Step("Email Alanı Doldurulur")
    public LoginPage emailDoldur (String email) {
        driver.findElement(By.name("login email")).sendKeys(email);
        return this;
    }

    @Step("Parola Alanı Doldurulur")
    public LoginPage passwordDoldur (String password) {
        driver.findElement(By.name("login-password")).sendKeys(password);
        return this;
    }

    @Step("Login Ekranına Tıklanır")
    public LoginPage clickLogin () {
        driver.findElement(By.xpath("//*[@id=\"login-register\"]/div[3]/div[1]/form/button")).submit();
        return this;
    }

    public LoginPage errorMessageControl(String text) {
        String value = driver.findElement(By.cssSelector("[class='message']")).getText();
        Assert.assertEquals(text, value);
        return this;
    }

    public LoginPage emailTemizle () {
        driver.findElement(By.name("login email")).clear();
        return this;
    }

    public LoginPage passwordTemizle () {
        driver.findElement(By.name("login-password")).clear();
        return this;
    }

}
