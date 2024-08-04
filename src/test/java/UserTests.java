import Base.BaseTest;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.MainPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UserTests extends BaseTest {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    MainPage mainPage = new MainPage();

    @Test(description = "Başarılı Kullanıcı Girişi")
    public void LoginSuccessful() throws InterruptedException {
        loginPage
                .emailDoldur(email)
                .passwordDoldur(password)
                .clickLogin();
        sleep(5000);
        homePage.hesabimKontrol();
    }

    @Test(description = "Hatalı Şifre Girişi")
    public void notValidLogin() throws InterruptedException {
        loginPage
                .emailDoldur(email)
                .passwordDoldur("asdfsgfdgsdadasdadd")
                .clickLogin();
        sleep(5000);
        loginPage.errorMessageControl(errorMessage);
    }

    @Test(description = "Sistemde Kayıtlı Olmayan Email Kullanıcı Girişi")
    public void notValidEmailLogin() throws InterruptedException {
        loginPage
                .emailDoldur("dilekadasdas@gmail.com")
                .passwordDoldur(password)
                .clickLogin();
        sleep(5000);
        loginPage.errorMessageControl(errorMessage);
    }

    @Test(description = "Boş Karakter Kontrolü")
    public void requiredBlankControl() throws InterruptedException {
        loginPage
                .emailDoldur("")
                .passwordDoldur("")
                .clickLogin();
        sleep(5000);
        loginPage
                .errorMessageControl(errorMessage2)
                .emailDoldur(email)
                .clickLogin()
                .errorMessageControl("Lütfen şifrenizi giriniz.")
                .passwordDoldur(password)
                .clickLogin();
        sleep(5000);
        homePage.hesabimKontrol();
    }

    @Test(description = "Minimum Karakter Konrolü")
    public void minControl() throws InterruptedException {
        loginPage
                .emailDoldur("1")
                .passwordDoldur("2")
                .clickLogin();
        sleep(5000);
        loginPage
                .errorMessageControl(errorMessage2)
                .emailDoldur("mail@gmail.com")
                .passwordDoldur("2")
                .clickLogin();
        sleep(5000);
        loginPage.errorMessageControl(errorMessage);
    }

    @Test(description = "Maksimum Karakter Konrolü")
    public void maxControl() throws InterruptedException {
        loginPage
                .emailDoldur("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa")
                .passwordDoldur(password)
                .clickLogin();
        sleep(5000);
        loginPage.errorMessageControl(errorMessage2);
        sleep(5000);
        loginPage
                .emailTemizle()
                .passwordTemizle()
                .emailDoldur(email)
                .clickLogin();
        sleep(5000);
        homePage.hesabimKontrol();
    }

}
