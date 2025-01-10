package Tests.TestCase9;

import Config.Config;
import PageObjects.HomePage.HomePageActions;
import PageObjects.NavBar.NavBarActions;
import PageObjects.ProductsPage.ProductsPageActions;
import PageObjects.SignUpLogin.SingUPLoginActions;
import Tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchProduct extends TestBase {

    SingUPLoginActions singUPLoginActions;
    HomePageActions homePageActions;
    NavBarActions navBarActions;
    ProductsPageActions productsPageActions;
    String url = Config.getProperty("URL");

    @BeforeMethod
    public void setupTest() {
        singUPLoginActions = new SingUPLoginActions(driver);
        homePageActions = new HomePageActions(driver);
        productsPageActions = new ProductsPageActions(driver);
        navBarActions = new NavBarActions(driver);
    }


    public void navigateToUrl() {
        homePageActions.navigateToHomePage(url);
    }

    @Test
    public void SearchProduct() {
        navigateToUrl();
        homePageActions.validateHomePageTitleIsDisplayed();
        navBarActions.clickProductButton();
        productsPageActions.validateProductTitleIsDisplayed();

        productsPageActions.SearchProduct("Winter Top");
        productsPageActions.ClickSearch();
        productsPageActions.ValidateSearchTitle();
    }
}