package Tests.TestCase22;

import Config.Config;
import PageObjects.AddToCartFromRecommended.AddToCartFromRecommendedActions;
import PageObjects.CartPage.CartPageActions;
import PageObjects.DeleteAccountPage.DeleteAccountActions;
import PageObjects.HomePage.HomePageActions;
import PageObjects.NavBar.NavBarActions;

import Tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddCartFromRecommendedItems extends TestBase {
    HomePageActions homePageActions;
    NavBarActions navBarActions;
    AddToCartFromRecommendedActions addToCartFromRecommendedActions;

    String url = Config.getProperty("URL");

    @BeforeMethod
    public void setupTest() {
        homePageActions = new HomePageActions(driver);
        navBarActions = new NavBarActions(driver);
        addToCartFromRecommendedActions = new AddToCartFromRecommendedActions(driver);


    }
    public void navigateToUrl() {
        homePageActions.navigateToHomePage(url);
    }
@Test
    public void AddCartFromRecommended(){
        navigateToUrl();

        addToCartFromRecommendedActions.scrollToRecommendedItems();
        addToCartFromRecommendedActions.VerifyRecommendedItemsTitleDisplayed();
        addToCartFromRecommendedActions.AddToCartFromRecommended();
        addToCartFromRecommendedActions.ClickViewCart();
        addToCartFromRecommendedActions.VerifyProductDisplayed();



    }


}
