package Tests.TestCase19;

import BrowserActions.BrowserActions;
import Config.Config;

import PageObjects.HomePage.HomePageActions;
import PageObjects.NavBar.NavBarActions;
import PageObjects.ProductsPage.ProductsPageActions;
import Tests.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ViewCartBrandProductsTest extends TestBase {

    HomePageActions homePageActions;
    NavBarActions navBarActions;
    ProductsPageActions productsPageActions;
    BrowserActions browserActions;
    String url = Config.getProperty("URL");


    @BeforeMethod
    public void setupTest() {
        homePageActions = new HomePageActions(driver);
        browserActions = new BrowserActions(driver);
        navBarActions = new NavBarActions(driver);
        productsPageActions = new ProductsPageActions(driver);
    }


    // Navigate to the application URL
    public void navigateToUrl() {
        homePageActions.navigateToHomePage(url);
    }

    @Test
    public void ViewCartBrandProducts() throws InterruptedException {
        // Step 1 & 2: Launch browser and navigate to the URL
        navigateToUrl();

        // Step 3:  Click on 'Products' button
        navBarActions.clickProductButton();

        // Step 4:  Verify that Brands are visible on left side bar
        productsPageActions.validateBrandsIsDisplayed();

        // Step 5: Click on any brand name ex: polo
        //productsPageActions.clickBrandsPoloButton();  //static
        productsPageActions.clickBrand("Polo");

        // Step 6: Verify that user is navigated to brand page and brand products are displayed
        productsPageActions.validateProductTitleIsDisplayed();
        productsPageActions.validateItemsIsDisplayed();


        // Step 7: On left side bar, click on any other brand link ex:biba
        //productsPageActions.clickBrandsBibaButton();
        productsPageActions.clickBrand("Biba");

        // Step 8: Verify that user is navigated to that brand page and can see products
        productsPageActions.validateProductTitleIsDisplayed();
        productsPageActions.validateItemsIsDisplayed();

    }














}
