package Tests.TestCase24;

import BrowserActions.BrowserActions;
import Config.Config;
import PageObjects.AddProductsinCart.AddProductActions;
import PageObjects.CartPage.CartPageActions;
import PageObjects.DeleteAccountPage.DeleteAccountActions;
import PageObjects.HomePage.HomePageActions;
import PageObjects.NavBar.NavBarActions;
import PageObjects.PaymentPage.PaymentPageActions;
import PageObjects.SignUpLogin.SingUPLoginActions;
import PageObjects.TestCase.TestCasesActions;
import Tests.TestBase;
import Utilities.Utilities;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DownloadInvoice  extends TestBase {
    HomePageActions homePageActions;
    TestCasesActions testCasesActions;
    String url = Config.getProperty("URL");// URL for the test
    AddProductActions  addProductActions;
    NavBarActions navbarActions;
    CartPageActions cartPageActions;
    SingUPLoginActions signUpLoginActions;
    BrowserActions browserActions;
    PaymentPageActions paymentPageActions;
    DeleteAccountActions deleteAccountActions;



    String userName = Utilities.generateRandomString(7);
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
    String cardName = Utilities.generateRandomString(8);


    @BeforeMethod
    public void setupTest() {
        browserActions = new BrowserActions(driver);
        homePageActions = new HomePageActions(driver);
        testCasesActions = new TestCasesActions(driver);
        addProductActions = new AddProductActions(driver);
        navbarActions =new NavBarActions(driver);
        cartPageActions = new CartPageActions(driver);
        signUpLoginActions = new SingUPLoginActions(driver);
        paymentPageActions = new PaymentPageActions(driver);
        deleteAccountActions = new DeleteAccountActions(driver);


        driver.manage().window().maximize();
    }
    public void navigateToUrl() {
        homePageActions.navigateToHomePage(url);
    }
    @Test
    public void downloadInvoiceTest() throws InterruptedException {
        //  Navigate to the URL
        navigateToUrl();

        //  Verify the homepage is visible
        homePageActions.validateHomePageTitleIsDisplayed();
        //  Click 'Products' button
        addProductActions.clickProductsButton();
        //  Hover over first product and click 'Add to cart'
        browserActions.scrollTillElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div"));

        addProductActions.AddFirstProductToCart();
        //  Click 'Continue Shopping'
        addProductActions.clickContinueShopping();

        navbarActions.clickCartButton();
        // Verify that cart page is displayed
        cartPageActions.validateCarPageIsDisplayed();
        // Click Proceed To Checkout
        cartPageActions.clickProceedToCheckoutButton();
        cartPageActions.clickRegisterLoginButton();
        // Click 'Register / Login' button
       // signUpLoginActions.clickSignUpButton();
        // Fill all details in Signup and create account
        signUpLoginActions.enterSignUPNameInput(userName);
        signUpLoginActions.enterSignUPEmailInput(email);
        signUpLoginActions.clickSignUpButton();
        signUpLoginActions.chooseGenderMr();
        signUpLoginActions.enterUserNewPassword(newuserpassword);
        signUpLoginActions.selectDay();
        signUpLoginActions.selectMonth();
        signUpLoginActions.selectYear();
        signUpLoginActions.fillFirstNamefield(firstname);
        signUpLoginActions.fillLastNamefield(lastname);
        signUpLoginActions.fillCompanyfield(company);
        signUpLoginActions.fillAddressfield(address);
        signUpLoginActions.selctCountry();
        signUpLoginActions.fillStatefield(state);
        signUpLoginActions.fillCityfield(city);
        signUpLoginActions.fillZipCodefield(zip);
        signUpLoginActions.fillMobilePhonefield(number);
        signUpLoginActions.clickCreateAccountButton();
        //Verify 'ACCOUNT CREATED!' and click 'Continue' button
        signUpLoginActions.checkaccountcreatedIsDisplayed();
        signUpLoginActions.checkcontinuebutton();
        // Verify ' Logged in as username' at top
        signUpLoginActions.checkuserloginIsDisplayed();
        // Click 'Cart' button
        homePageActions.clickCartButton();
        //Click 'Proceed To Checkout' button
        cartPageActions.clickProceedToCheckoutButton();

        // Place Order
        browserActions.scrollTillElement(By.xpath("/html/body/section/div/div[7]"));

        cartPageActions.enterComment("hurry ");
        cartPageActions.clickPlaceOrderButton();

        paymentPageActions.enterCardName(cardName);
        paymentPageActions.enterCardNumber("5659586");
        paymentPageActions.enterCVC("123");
        paymentPageActions.enterMonth("10");
        paymentPageActions.enterYear("2026");
        paymentPageActions.clickPayAndConfirmButton();
        paymentPageActions.clickDownloadInvoice();

        navbarActions.clickDeleteAccountButton();

        deleteAccountActions.validateAccountDeletedMessageIsDisplayed();
        deleteAccountActions.clickContinueButton();




    }

}