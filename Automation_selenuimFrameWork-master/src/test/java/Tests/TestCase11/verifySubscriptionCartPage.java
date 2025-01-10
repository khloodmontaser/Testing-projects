package Tests.TestCase11;

import Config.Config;
import PageObjects.CartPage.CartPageActions;
import PageObjects.HomePage.HomePageActions;
import PageObjects.NavBar.NavBarActions;
import PageObjects.ProductsPage.ProductsPageActions;
import PageObjects.SignUpLogin.SingUPLoginActions;
import Tests.TestBase;
import Utilities.Utilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class verifySubscriptionCartPage extends TestBase {
    SingUPLoginActions singUPLoginActions;
    HomePageActions homePageActions;
    NavBarActions navBarActions;
    CartPageActions cartpageActions;
    String url = Config.getProperty("URL");

    @BeforeMethod
    public void setupTest() {
        singUPLoginActions = new SingUPLoginActions(driver);
        homePageActions = new HomePageActions(driver);
        cartpageActions = new CartPageActions(driver);
        navBarActions = new NavBarActions(driver);
    }


    public void navigateToUrl() {
        homePageActions.navigateToHomePage(url);
    }

    /*
*/
    @Test
    public void verifySubscriptionInCart() {
        String mail = Utilities.generateRandomString(5) + "@gmail.com";
        navigateToUrl();
        homePageActions.validateHomePageTitleIsDisplayed();
        navBarActions.clickCartButton();
        cartpageActions.ScrollingDownCartPage();
        cartpageActions.SubscriptionTextDisplayed();
        cartpageActions.MailforSubscriotion(mail);
        cartpageActions.ClickArrowSubscription();



    }
}