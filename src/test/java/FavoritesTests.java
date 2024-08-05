import Base.BaseTest;
import Pages.*;
import org.testng.annotations.Test;

public class FavoritesTests extends BaseTest {

    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();
    ProductListPage productListPage = new ProductListPage();
    ProductDetailPage productDetailPage = new ProductDetailPage();
    FavoritesPage favoritesPage = new FavoritesPage();

    @Test(description = "Favorilerim'e Ürün Ekleme")
    public void AddFavoriteProduct() throws InterruptedException {
        loginPage
                .emailDoldur(email)
                .passwordDoldur(password)
                .clickLogin();
        sleep(5000);
        mainPage.aramaDoldur("Laptop");
        productListPage.ilkUruneTikla();
        switchTab();
        productDetailPage.addFavorites();
        String title = productDetailPage.getTitleProduct();
        mainPage.favorilerimTikla();
        favoritesPage.productControl("title");
    }
}
