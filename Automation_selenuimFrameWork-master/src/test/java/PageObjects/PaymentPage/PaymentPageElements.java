package PageObjects.PaymentPage;

import org.openqa.selenium.By;

public class PaymentPageElements {


        By NAME_ON_CARD=By.xpath("//input[@data-qa='name-on-card']");
        By CARD_NUMBER=By.xpath("//input[@data-qa='card-number']");
        By CVC=By.xpath("//input[@data-qa='cvc']");
        By EXPIRY_MONTH=By.xpath("//input[@data-qa='expiry-month']");
        By EXPIRY_YEAR=By.xpath("//input[@data-qa='expiry-year']");
        By PAYANDCONFIRM_BUTTON=By.xpath("//button[@id='submit']");
        By SUCCESS_MESSAGE=By.xpath("//*[@id=\"success_message\"]/div");
        By downloadInvoiceButton = By.xpath("/html/body/section/div/div/div/a");







}
