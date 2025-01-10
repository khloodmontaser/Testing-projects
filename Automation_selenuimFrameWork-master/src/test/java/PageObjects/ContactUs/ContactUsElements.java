package PageObjects.ContactUs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsElements {
    By GetInTouchTitle = By.xpath("//h2[contains(text(),'Get In Touch')]");
    By NameInput = By.xpath("//input[@data-qa='name']");
    By EmailInput = By.xpath("//input[@data-qa='email']");
    By SubjectInput = By.xpath("//input[@data-qa='subject']");
    By MessageInput = By.xpath("//textarea[@data-qa='message']");
   // By UploadFileInput = By.xpath("//input[@data-qa='file']");
    By SubmitButton = By.xpath("//input[@data-qa='submit-button']");
    By SuccessMessage = By.xpath("//div[@class='status alert alert-success']");
    By FileInput = By.xpath("//input[@name=\"upload_file\"]");
   // @FindBy(xpath = "//input[@name=\"upload_file\"]")
    //public WebElement FileInput;

}
