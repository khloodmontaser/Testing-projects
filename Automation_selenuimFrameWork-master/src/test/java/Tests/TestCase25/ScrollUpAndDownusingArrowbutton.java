package Tests.TestCase25;

import Config.Config;
import PageObjects.AddToCartFromRecommended.AddToCartFromRecommendedActions;
import PageObjects.HomePage.HomePageActions;
import PageObjects.NavBar.NavBarActions;
import Tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
*
Test Case 25: Verify Scroll Up using 'Arrow' button and Scroll Down functionality

    1. Launch browser
    2. Navigate to url 'http://automationexercise.com'
    3. Verify that home page is visible successfully
    4. Scroll down page to bottom
    5. Verify 'SUBSCRIPTION' is visible
    *
    6. Click on arrow at bottom right side to move upward
    7. Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen


* */
public class ScrollUpAndDownusingArrowbutton extends TestBase {
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
    public void ScrollUpAndDownUsingArrow()  {
        navigateToUrl();
        homePageActions.validateHomePageTitleIsDisplayed();
        homePageActions.ScrollToFooter();
        homePageActions.ValidateSubscriptionTitleDisplayed();
        homePageActions.ClickArrowUpwards();
        homePageActions.Fullfledgedtextdisplayed();

    }
}
