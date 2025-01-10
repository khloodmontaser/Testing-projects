package Tests.TestCase2;
/*
EL VALID CREDENTIALS STATIC SO, ALTER THE STATIC DATA BEFORE RUN
* */
import Config.Config;
import PageObjects.DeleteAccountPage.DeleteAccountActions;
import PageObjects.HomePage.HomePageActions;
import PageObjects.NavBar.NavBarActions;
import PageObjects.SignUpLogin.SingUPLoginActions;
import Tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class loginWithValidCredentials extends TestBase {
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
    public void LoginValidCredentials()  {
        navigateToUrl();
        homePageActions.validateHomePageTitleIsDisplayed();
        navBarActions.clickSignUpLoginButton();

        singUPLoginActions.CheckLoginTitle();
        singUPLoginActions.EnterLoginMail("khlood@gmail.com");

        singUPLoginActions.EnterLoginPassword("445566");
        singUPLoginActions.ClickLogin();

        homePageActions.LoggedUserNameDisplayed();
//        navBarActions.clickDeleteAccountButton();
//
//        deleteAccountActions.validateAccountDeletedMessageIsDisplayed();



    }

}
