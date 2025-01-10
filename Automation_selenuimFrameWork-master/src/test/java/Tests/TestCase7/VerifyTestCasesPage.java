package Tests.TestCase7;

import Config.Config;
import PageObjects.CartPage.CartPageActions;
import PageObjects.DeleteAccountPage.DeleteAccountActions;
import PageObjects.HomePage.HomePageActions;
import PageObjects.NavBar.NavBarActions;
import PageObjects.PaymentPage.PaymentPageActions;
import PageObjects.SignUpLogin.SingUPLoginActions;
import PageObjects.TestCase.TestCasesActions;
import PageObjects.VerifyProductquantityinCart.VerifyProductActions;
import Tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VerifyTestCasesPage  extends TestBase {

    HomePageActions homePageActions;
    NavBarActions navBarActions;
    String url = Config.getProperty("URL");
    TestCasesActions testCasesActions;


    @BeforeMethod
    public void setupTest() {
        homePageActions = new HomePageActions(driver);
        navBarActions = new NavBarActions(driver);
        testCasesActions = new TestCasesActions(driver);
    }

    public void navigateToUrl() {
        homePageActions.navigateToHomePage(url);
    }

    @Test
    public void VerifyTestCasesPage(){
        navigateToUrl();
        //3. Verify that home page is visible successfully

        homePageActions.validateHomePageTitleIsDisplayed();
        navBarActions.TestCasesButton();
        //5. Verify user is navigated to test cases page successfully
        testCasesActions.validateTestCasesPageIsDisplayed();

    }
}
