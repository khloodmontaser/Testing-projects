package Tests.TestCase15;

import BrowserActions.BrowserActions;
import Config.Config;
import PageObjects.CartPage.CartPageActions;
import PageObjects.DeleteAccountPage.DeleteAccountActions;
import PageObjects.HomePage.HomePageActions;
import PageObjects.NavBar.NavBarActions;
import PageObjects.PaymentPage.PaymentPageActions;
import PageObjects.SignUpLogin.SingUPLoginActions;
import PageObjects.VerifyProductquantityinCart.VerifyProductActions;
import Tests.TestBase;
import Utilities.Utilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PlaceOrderRegisterBeforeCheckout extends TestBase {
    HomePageActions homePageActions;
    BrowserActions browserActions;
    NavBarActions navBarActions;
    CartPageActions cartPageActions;
    VerifyProductActions verifyProductActions;
    DeleteAccountActions deleteAccountActions;
    PaymentPageActions paymentPageActions;
    SingUPLoginActions signUpLoginActions;
    String url = Config.getProperty("URL");

    @BeforeMethod
    public void setupTest() {
        homePageActions = new HomePageActions(driver);
        browserActions = new BrowserActions(driver);
        navBarActions = new NavBarActions(driver);
        cartPageActions = new CartPageActions(driver);
        verifyProductActions = new VerifyProductActions(driver);
        deleteAccountActions = new DeleteAccountActions(driver);
        paymentPageActions = new PaymentPageActions(driver);
        signUpLoginActions = new SingUPLoginActions(driver);

    }
    public void navigateToUrl() {
        homePageActions.navigateToHomePage(url);
    }


    @Test
    public void PlaceOrderRegisterWhileCheckoutTest() throws InterruptedException {
        navigateToUrl();

        String userName = Utilities.generateRandomString(7);
        String comment = Utilities.generateRandomString(15);
        String email = Utilities.generateRandomString(7) + "@gmail.com";
        String newuserpassword = Utilities.generateRandomString(30);
        String firstname = Utilities.generateRandomString(7);
        String lastname = Utilities.generateRandomString(7);
        String company = Utilities.generateRandomString(7);
        String address = Utilities.generateRandomString(7);
        String state = Utilities.generateRandomString(7);
        String city = Utilities.generateRandomString(7);
        String zip = Utilities.generateRandomString(4);
        String number = Utilities.generateRandomString(9);
        // for payment info
        String cardName = Utilities.generateRandomString(20);
        //String cardNumber = Utilities.generateRandomString(15);
        String cardNumber = String.valueOf(Utilities.generateRandomNumber(13, 16));

        homePageActions.validateHomePageTitleIsDisplayed();
        navBarActions.clickSignUpLoginButton();
        signUpLoginActions.enterSignUPNameInput(userName);
        signUpLoginActions.enterSignUPEmailInput(email);
        signUpLoginActions.clickSignUpButton();

        signUpLoginActions.enterUserNewPassword(newuserpassword);
        signUpLoginActions.selectDay();
        signUpLoginActions.selectMonth();
        signUpLoginActions.selectYear();

        signUpLoginActions.enterUserNewPassword(newuserpassword);
        signUpLoginActions.selectDay();
        signUpLoginActions.selectMonth();
        signUpLoginActions.selectYear();


        signUpLoginActions.fillFirstNamefield(firstname);
        signUpLoginActions.fillLastNamefield(lastname);
        signUpLoginActions.fillAddressfield(address);


        signUpLoginActions.selctCountry();
        signUpLoginActions.fillStatefield(state);
        signUpLoginActions.fillCityfield(city);
        signUpLoginActions.fillZipCodefield(zip);
        signUpLoginActions.fillMobilePhonefield(number);
        signUpLoginActions.clickCreateAccountButton();

        signUpLoginActions.checkaccountcreatedIsDisplayed();
        signUpLoginActions.checkcontinuebutton();
        homePageActions.LoggedUserNameDisplayed();

        //ADD PRODUCT
        verifyProductActions.clickViewProduct();
        verifyProductActions.clickAddToCart();
        verifyProductActions.clickContinueShoppingButton();

        navBarActions.clickCartButton();

        cartPageActions.validateCarPageIsDisplayed();
        cartPageActions.clickProceedToCheckoutButton();

        //14. Verify Address Details and Review Your Order
        cartPageActions.validateAddressTitleIsDisplayed();
        cartPageActions.validateAddressDetailsIsDisplayed();
        cartPageActions.validateOrderIsDisplayed();


        cartPageActions.enterComment(comment);
        cartPageActions.clickPlaceOrderButton();

        paymentPageActions.enterCardName(cardName);
        paymentPageActions.enterCardNumber(cardNumber);
        paymentPageActions.enterCVC("123");
        paymentPageActions.enterMonth("10");
        paymentPageActions.enterYear("2026");


        paymentPageActions.clickPayAndConfirmButton();

        //paymentPageActions.validateSuccessMessageIsDisplayed();


        navBarActions.clickDeleteAccountButton();

        deleteAccountActions.validateAccountDeletedMessageIsDisplayed();
        deleteAccountActions.clickContinueButton();
    }
    }
