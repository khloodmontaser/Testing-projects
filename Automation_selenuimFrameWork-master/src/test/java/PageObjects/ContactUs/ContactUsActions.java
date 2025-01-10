package PageObjects.ContactUs;

import Assertions.Assertion;
import BrowserActions.BrowserActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;

public class ContactUsActions extends ContactUsElements {
    BrowserActions browserActions;
    Assertion assertion;

    public ContactUsActions(WebDriver driver) {
        browserActions = new BrowserActions(driver);
        assertion = new Assertion(driver);
    }

    public void fillContactForm(String name, String email, String subject, String message) {
        browserActions.type(NameInput, name);
        browserActions.type(EmailInput, email);
        browserActions.type(SubjectInput, subject);
        browserActions.type(MessageInput, message);
    }

  /* public void uploadFile(String filePath) {
       //browserActions.type(UploadFileInput, filePath);
        browserActions.click(FileInput);
        File fileToUpload = new File(filePath);


        if (fileToUpload.exists()) {
            fileToUpload.getAbsolutePath();
        } else {
            System.out.println("File not found: " + fileToUpload.getAbsolutePath());
            return;
        }

    }*/

    public void clickSubmitButton() {
        browserActions.click(SubmitButton);
    }

    public void acceptAlert() {
        browserActions.acceptAlert();
    }

    public void validateGetInTouchTitleIsDisplayed() {
        assertion.assertElementIsDisplayed(GetInTouchTitle);
    }

    public void validateSuccessMessageIsDisplayed() {
        assertion.assertElementTextEquals(SuccessMessage, "Success! Your details have been submitted successfully.");
    }
}
