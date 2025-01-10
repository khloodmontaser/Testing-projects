package Tests.TestCase8;
import BrowserActions.BrowserActions;
import Config.Config;
import PageObjects.HomePage.HomePageActions;
import PageObjects.NavBar.NavBarActions;
import PageObjects.ProductsPage.ProductsPageActions;
import PageObjects.VerifyProductquantityinCart.VerifyProductActions;
import Tests.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class All_ProductsAnd_product_detail_page extends TestBase {
    HomePageActions homePageActions;
    ProductsPageActions productsPageActions;
    NavBarActions navBarActions;
    String url = Config.getProperty("URL");
    VerifyProductActions verifyProductActions;
    BrowserActions browseraction;
/*

    9. Verify that detail detail is visible: product name, category, price, availability, condition, brand
* */
    @BeforeMethod
    public void setupTest() {
        productsPageActions = new ProductsPageActions(driver);
        homePageActions = new HomePageActions(driver);
        navBarActions = new NavBarActions(driver);
        verifyProductActions = new VerifyProductActions(driver);
        browseraction = new BrowserActions(driver);
    }
    public void navigateToUrl() {
        homePageActions.navigateToHomePage(url);
    }
    @Test
    public void ValidateAllProductsAndProductDetail(){
        navigateToUrl();
        homePageActions.validateHomePageTitleIsDisplayed();
        navBarActions.clickProductButton();
        productsPageActions.validateProductTitleIsDisplayed();
        productsPageActions.validateItemsIsDisplayed();
        browseraction.scrollTillElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[2]/ul/li/a"));
        verifyProductActions.clickViewProduct();
        verifyProductActions.isProductDetailOpened();
        verifyProductActions.VerifyProductDetails();


    }


}
