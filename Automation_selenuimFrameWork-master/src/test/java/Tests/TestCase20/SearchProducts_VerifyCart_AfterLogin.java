package Tests.TestCase20;

import BrowserActions.BrowserActions;
import Config.Config;
import PageObjects.CartPage.CartPageActions;
import PageObjects.DeleteAccountPage.DeleteAccountActions;
import PageObjects.HomePage.HomePageActions;
import PageObjects.NavBar.NavBarActions;
import PageObjects.PaymentPage.PaymentPageActions;
import PageObjects.ProductsPage.ProductsPageActions;
import PageObjects.SignUpLogin.SingUPLoginActions;
import PageObjects.VerifyProductquantityinCart.VerifyProductActions;
import Tests.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchProducts_VerifyCart_AfterLogin extends TestBase {


    HomePageActions homePageActions;
    ProductsPageActions productsPageActions;
    BrowserActions browserActions;
    NavBarActions navBarActions;
    CartPageActions cartPageActions;
    VerifyProductActions verifyProductActions;
    DeleteAccountActions deleteAccountActions;
    PaymentPageActions paymentPageActions;
    SingUPLoginActions signUpLoginActions;
    String url = Config.getProperty("URL");

    @BeforeMethod
    public void setupTest() {
        homePageActions = new HomePageActions(driver);
        productsPageActions = new ProductsPageActions(driver);
        navBarActions = new NavBarActions(driver);
        cartPageActions = new CartPageActions(driver);
        verifyProductActions = new VerifyProductActions(driver);
        deleteAccountActions = new DeleteAccountActions(driver);
        paymentPageActions = new PaymentPageActions(driver);
        signUpLoginActions = new SingUPLoginActions(driver);
        browserActions = new BrowserActions(driver);

    }
    public void navigateToUrl() {
        homePageActions.navigateToHomePage(url);
    }


    @Test
    public void PlaceOrderRegisterWhileCheckoutTest(){
        navigateToUrl();
        navBarActions.clickProductButton();
        productsPageActions.validateProductTitleIsDisplayed();
        productsPageActions.SearchProduct("Men Tshirt");
        productsPageActions.ClickSearch();
        productsPageActions.IsSearchedProductDisplayed();
        browserActions.scrollTillElement(By.xpath("/html/body/section[2]/div/div/div[2]/div"));
        verifyProductActions.clickViewProduct();
        verifyProductActions.clickAddToCart();
        verifyProductActions.clickViewCart();
        cartPageActions.clickProceedToCheckoutButton();
        cartPageActions.clickRegisterLoginButton();
        signUpLoginActions.EnterLoginMail("khlood@gmail.com");

        signUpLoginActions.EnterLoginPassword("445566");
        signUpLoginActions.ClickLogin();
        navBarActions.clickCartButton();
        cartPageActions.ItemsAreDisplayed();


    }
}
