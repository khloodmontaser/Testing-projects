package PageObjects.PaymentPage;

import Assertions.Assertion;
import BrowserActions.BrowserActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class PaymentPageActions extends PaymentPageElements {

    Assertion assertion;
    BrowserActions browserActions;


    public PaymentPageActions(WebDriver driver) {
        assertion = new Assertion(driver);
        browserActions = new BrowserActions(driver);

    }


    //enter card name
    public void enterCardName(String name) {
        browserActions.type(NAME_ON_CARD, name);
    }


    //enter card number
    public void enterCardNumber(String cardNumber) {
        browserActions.type(CARD_NUMBER, cardNumber);
    }


    //enter cvc
    public void enterCVC(String cvc) {
        browserActions.type(CVC, cvc);
    }


    //enter expiry day
    public void enterMonth(String month) {
        browserActions.type(EXPIRY_MONTH, month);
    }


    //enter expiry year
    public void enterYear(String year) {
        browserActions.type(EXPIRY_YEAR, year);
    }

    public void clickPayAndConfirmButton()  {
        browserActions.click(PAYANDCONFIRM_BUTTON);
    }


    public void validateSuccessMessageIsDisplayed() {
        assertion.assertElementIsDisplayed(SUCCESS_MESSAGE);

    }

    public void clickDownloadInvoice()  {

        browserActions.click(downloadInvoiceButton);

    }


}