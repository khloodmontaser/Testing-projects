package Tests.TestCase10;

import Config.Config;
import PageObjects.HomePage.HomePageActions;
import PageObjects.NavBar.NavBarActions;
import PageObjects.ProductsPage.ProductsPageActions;
import PageObjects.SignUpLogin.SingUPLoginActions;
import Tests.TestBase;
import Utilities.Utilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class VerifySubscriptionInHomePage extends TestBase {
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

    /*
    7. Verify success message 'You have been successfully subscribed!' is visible
*/
    @Test
    public void verifySubscription(){
        String mail = Utilities.generateRandomString(5)+ "@gmail.com";
        navigateToUrl();
        homePageActions.validateHomePageTitleIsDisplayed();
        homePageActions.ScrollToFooter();
        homePageActions.ValidateSubscriptionTitleDisplayed();
        homePageActions.MailforSubscriotion(mail);
        homePageActions.ClickArrowSubscription();
        homePageActions.IsSubscriptionMsgDisplayed();



    }
}
