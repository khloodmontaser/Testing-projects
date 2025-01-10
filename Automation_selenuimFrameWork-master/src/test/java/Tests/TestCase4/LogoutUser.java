package Tests.TestCase4;

import Config.Config;
import PageObjects.DeleteAccountPage.DeleteAccountActions;
import PageObjects.HomePage.HomePageActions;
import PageObjects.NavBar.NavBarActions;
import PageObjects.SignUpLogin.SingUPLoginActions;
import Tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogoutUser extends TestBase {
    /*
    *
Test Case 4: Logout User

    1. Launch browser
    2. Navigate to url 'http://automationexercise.com'
    3. Verify that home page is visible successfully
    4. Click on 'Signup / Login' button
    5. Verify 'Login to your account' is visible
    6. Enter correct email address and password
    7. Click 'login' button
    8. Verify that 'Logged in as username' is visible
    9. Click 'Logout' button
    10. Verify that user is navigated to login page


    *
    * */
    SingUPLoginActions singUPLoginActions;
    HomePageActions homePageActions;
    NavBarActions navBarActions;
    DeleteAccountActions deleteAccountActions;
    String url = Config.getProperty("URL");

    @BeforeMethod
    public void setupTest() {
        singUPLoginActions = new SingUPLoginActions(driver);
        homePageActions = new HomePageActions(driver);
        navBarActions = new NavBarActions(driver);
        deleteAccountActions = new DeleteAccountActions(driver);
    }

    public void navigateToUrl() {
        homePageActions.navigateToHomePage(url);
    }
    @Test
    public void LoginInValidCredentials()  {
        navigateToUrl();
        homePageActions.validateHomePageTitleIsDisplayed();
        navBarActions.clickSignUpLoginButton();
        singUPLoginActions.CheckLoginTitle();
        singUPLoginActions.EnterLoginMail("khlood@gmail.com");
        singUPLoginActions.EnterLoginPassword("445566");
        singUPLoginActions.ClickLogin();
        homePageActions.LoggedUserNameDisplayed();
        navBarActions.clickLogOut();

        singUPLoginActions.CheckLoginTitle();
    }
}
