package Tests.TestCase5;

import Config.Config;
import PageObjects.DeleteAccountPage.DeleteAccountActions;
import PageObjects.HomePage.HomePageActions;
import PageObjects.NavBar.NavBarActions;
import PageObjects.SignUpLogin.SingUPLoginActions;
import Tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
/*
*
Test Case 5: Register User with existing email

    1. Launch browser
    2. Navigate to url 'http://automationexercise.com'
    3. Verify that home page is visible successfully
    4. Click on 'Signup / Login' button
    5. Verify 'New User Signup!' is visible
    6. Enter name and already registered email address
    7. Click 'Signup' button
    8. Verify error 'Email Address already exist!' is visible


*
* */

public class RegisterWithExistingEmail extends TestBase {

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
    public void RegisterWithExistingEmail(){

        navigateToUrl();
        homePageActions.validateHomePageTitleIsDisplayed();
        navBarActions.clickSignUpLoginButton();
        singUPLoginActions.validateNewUserSignUpTitleIsDisplayed();

        singUPLoginActions.enterSignUPNameInput("khlood");
        singUPLoginActions.enterSignUPEmailInput("khlood@gmail.com");
        singUPLoginActions.clickSignUpButton();

        singUPLoginActions.AlreadyExistMsgDisplayed();




    }


}
