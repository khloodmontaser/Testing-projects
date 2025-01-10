package Tests.TestCase12;

import Config.Config;
import PageObjects.AddProductsinCart.AddProductActions;
import PageObjects.HomePage.HomePageActions;
import PageObjects.NavBar.NavBarActions;
import PageObjects.ProductsPage.ProductsPageActions;
import PageObjects.VerifyProductquantityinCart.VerifyProductActions;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class addproducts extends TestBase {
    String url = Config.getProperty("URL");
    HomePageActions homePageActions;
    NavBarActions navBarActions;
    VerifyProductActions verifyProductActions;
    ProductsPageActions productsPageActions;




    @BeforeMethod
    public void setupTest() {
        productsPageActions = new ProductsPageActions(driver);
        homePageActions = new HomePageActions(driver);
        navBarActions = new NavBarActions(driver);
        verifyProductActions = new VerifyProductActions(driver);

    }
    public void navigateToUrl() {
        homePageActions.navigateToHomePage(url);
    }
    @Test
    public void addProductsToCartAndVerify() {
        navigateToUrl();

        // Step 2: Verify that home page is visible
        homePageActions.validateHomePageTitleIsDisplayed();
        // Step 3: Click 'Products' button
        navBarActions.clickProductButton();

        productsPageActions.addFirstProduct();
        productsPageActions.ClickcontinueShopping();

        productsPageActions.addSecondProduct();
        productsPageActions.ClickcontinueShopping();

        navBarActions.clickCartButton();

        productsPageActions.Verify_First_Second_Added();


    }
}