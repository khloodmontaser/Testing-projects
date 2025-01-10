package Tests.TestCase26;

import Config.Config;
import PageObjects.HomePage.HomePageActions;
import PageObjects.NavBar.NavBarActions;
import Tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VerifyScrollUpAndDownNoArrow extends TestBase {

    HomePageActions homePageActions;
    NavBarActions navBarActions;
    String url = Config.getProperty("URL");

    @BeforeMethod
    public void setupTest() {
        homePageActions = new HomePageActions(driver);
        navBarActions = new NavBarActions(driver);

    }

    public void navigateToUrl() {
        homePageActions.navigateToHomePage(url);
    }
    @Test
    public void ScrollNoArrow() {
        navigateToUrl();
        homePageActions.validateHomePageTitleIsDisplayed();
        homePageActions.ScrollToFooter();
        homePageActions.ValidateSubscriptionTitleDisplayed();
        homePageActions.scrollTop();

        homePageActions.Fullfledgedtextdisplayed();



    }
}
