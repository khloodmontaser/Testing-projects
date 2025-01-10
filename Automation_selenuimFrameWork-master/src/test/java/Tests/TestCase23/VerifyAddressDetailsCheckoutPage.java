package Tests.TestCase23;
/*
* Still not fifnished
*
* */

import Config.Config;

import PageObjects.AddProductsinCart.AddProductActions;
import PageObjects.CartPage.CartPageActions;
import PageObjects.HomePage.HomePageActions;
import PageObjects.NavBar.NavBarActions;
import PageObjects.SignUpLogin.SingUPLoginActions;

import Tests.TestBase;
import Utilities.Utilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VerifyAddressDetailsCheckoutPage extends TestBase {
    AddProductActions addProductActions;

    String url = Config.getProperty("URL");

    HomePageActions homePageActions;
    NavBarActions navBarActions;
    SingUPLoginActions singUPLoginActions;

    CartPageActions cartPageActions;


    @BeforeMethod
    public void setupTest() {
        addProductActions = new AddProductActions(driver);
        cartPageActions = new CartPageActions(driver);

        homePageActions = new HomePageActions(driver);
        navBarActions = new NavBarActions(driver);
        singUPLoginActions = new SingUPLoginActions(driver);}

    public void navigateToUrl() {
        homePageActions.navigateToHomePage(url);
    }
@Test
    public void VerifyAddressDetails(){
    String userName = Utilities.generateRandomString(7);
    String email = Utilities.generateRandomString(7) + "@gmail.com";
    String newuserpassword = Utilities.generateRandomString(30);
    String firstname = Utilities.generateRandomString(7);
    String lastname = Utilities.generateRandomString(7);
    String address = Utilities.generateRandomString(7);
    String state = Utilities.generateRandomString(7);
    String city = Utilities.generateRandomString(7);
    String zip = Utilities.generateRandomString(4);
    String number = Utilities.generateRandomString(9);

        navigateToUrl();

        homePageActions.validateHomePageTitleIsDisplayed();
        navBarActions.clickSignUpLoginButton();

        singUPLoginActions.enterSignUPNameInput(userName);
        singUPLoginActions.enterSignUPEmailInput(email);
        singUPLoginActions.clickSignUpButton();

    // Fill all details in Signup and create account

    singUPLoginActions.enterUserNewPassword(newuserpassword);
    singUPLoginActions.selectDay();
    singUPLoginActions.selectMonth();
    singUPLoginActions.selectYear();

    singUPLoginActions.enterUserNewPassword(newuserpassword);
    singUPLoginActions.selectDay();
    singUPLoginActions.selectMonth();
    singUPLoginActions.selectYear();

    singUPLoginActions.fillFirstNamefield(firstname);
    singUPLoginActions.fillLastNamefield(lastname);
    singUPLoginActions.fillAddressfield(address);


    singUPLoginActions.selctCountry();
    singUPLoginActions.fillStatefield(state);
    singUPLoginActions.fillCityfield(city);
    singUPLoginActions.fillZipCodefield(zip);
    singUPLoginActions.fillMobilePhonefield(number);
    singUPLoginActions.clickCreateAccountButton();

    singUPLoginActions.checkaccountcreatedIsDisplayed();
    singUPLoginActions.checkcontinuebutton();

    homePageActions.LoggedUserNameDisplayed();

    navBarActions.clickProductButton();
    addProductActions.AddFirstProductToCart();
    addProductActions.clickContinueShopping();
    navBarActions.clickCartButton();

    cartPageActions.validateCarPageIsDisplayed();

    cartPageActions.clickProceedToCheckoutButton();


//12 13 14 15 steps remaining


}
}
