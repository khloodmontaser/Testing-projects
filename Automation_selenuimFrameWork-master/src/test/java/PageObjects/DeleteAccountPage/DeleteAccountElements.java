package PageObjects.DeleteAccountPage;

import org.openqa.selenium.By;

public class DeleteAccountElements {


    // message after cclicking on deletion button
    By ACCOUNT_DELETED_MESSAGE = By.xpath("//h2[@data-qa='account-deleted']");

    // BUTTON CONTINUE AFTER DELETION
    By CONTINUE_BUTTON = By.xpath("//a[@data-qa='continue-button']");

}