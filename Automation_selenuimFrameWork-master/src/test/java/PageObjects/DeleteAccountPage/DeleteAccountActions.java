package PageObjects.DeleteAccountPage;

import Assertions.Assertion;
import BrowserActions.BrowserActions;
import org.openqa.selenium.WebDriver;

public class DeleteAccountActions extends DeleteAccountElements{
    Assertion assertion;
    BrowserActions browserActions;

    public DeleteAccountActions(WebDriver driver) {
        browserActions = new BrowserActions(driver);
        assertion = new Assertion(driver);
    }

    public void validateAccountDeletedMessageIsDisplayed(){
        assertion.assertElementIsDisplayed(ACCOUNT_DELETED_MESSAGE);
    }
    public void clickContinueButton(){
        browserActions.click(CONTINUE_BUTTON);
    }





}
