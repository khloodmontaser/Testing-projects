package PageObjects.AddReview;
import Assertions.Assertion;
import BrowserActions.BrowserActions;
import PageObjects.AddReview.AddReviewElements;
import org.openqa.selenium.WebDriver;

public class AddReviewActions extends AddReviewElements {
    BrowserActions browserActions;
    Assertion assertion;

    public AddReviewActions(WebDriver driver) {
        browserActions = new BrowserActions(driver);
        assertion = new Assertion(driver);
    }


    public void validateAllProductsHeaderIsDisplayed() {
        assertion.assertElementIsDisplayed(AllProductsHeader);
    }

    public void clickViewProductButton() {browserActions.click(ViewProductButton);}

    public void validateWriteYourReviewTitleIsDisplayed() {
        assertion.assertElementIsDisplayed(WriteYourReviewTitle);
    }

    public void enterUserNameInput(String input) {
        browserActions.type(UserName, input);
    }

    public void UserEmailInput(String input) {
        browserActions.type(UserEmail, input);
    }

    public void UserReviewInput(String input) {
        browserActions.type(UserReview, input);
    }

    public void clickSubmitButton() {
        browserActions.click(SubmitButton);
    }



}
