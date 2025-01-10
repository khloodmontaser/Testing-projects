package PageObjects.SignUpLogin;

import org.openqa.selenium.By;

public class SingUPLoginElements {

    // Signup Form Locators
    By LoginTitle = By.xpath("/html/body/section/div/div/div[1]/div/h2");
    By login_email = By.xpath("//input[@data-qa='login-email']");
    By login_password = By.xpath("//input[@data-qa='login-password']");
    By LoginButton = By.xpath("//button[@data-qa=\"login-button\"]");
    By InvalidLoginMsg = By.xpath("/html/body/section/div/div/div[1]/div[1]/form/p");


    By NewUserSignUpTitle = By.xpath("//div[@class='signup-form']/h2");
    By SignUPUserNameInput = By.xpath("//input[@data-qa='signup-name']");
    By SignUPEmailInput = By.xpath("//input[@data-qa='signup-email']");
    By SignUpButton = By.xpath("//button[@data-qa='signup-button']");
    By alreadyExistMsg = By.xpath("//p[text()='Email Address already exist!']");
    // Personal Details
    By ChooseGenderMr = By.xpath("//input[@id='id_gender1']");
    By UserNewPassword = By.xpath("//input[@data-qa='password']");
    By SelectDay = By.xpath("//select[@data-qa='days']/option[text()='3']");
    By SelectMonth = By.xpath("//select[@id='months']/option[text()='March']");
    By SelectYear = By.xpath("//select[@id='years']/option[text()='2003']");

    // Address Information
    By FillFirstName = By.xpath("//input[@id='first_name']");
    By FillLastName = By.xpath("//input[@id='last_name']");
    By FillCompany = By.xpath("//input[@id='company']");
    By FillAddress = By.xpath("//input[@id='address1']");


    By SelectCountry = By.xpath("//select[@id='country']/option[text()='Canada']");


    By FillState = By.xpath("//input[@id='state']");

    By FillCity = By.xpath("//*[@name='city']");
    By FillZipCode = By.xpath("//*[@id=\"zipcode\"]");
    By FillMobilePhone = By.xpath("//*[@id=\"mobile_number\"]");

    // Account Creation
    By ClickCreateAccountButton = By.xpath("//button[@data-qa='create-account']");
    By Checkaccountcreated = By.xpath("//h2[@class='title text-center']/b");
    By Checkcontinuebutton = By.xpath("//a[@data-qa='continue-button']");
    By Checkuserlogin = By.xpath("//i[@class='fa fa-user']");

    // Utility Method for Dynamic Dropdown Selection
    public By selectDropdownOption(String dropdownId, String optionText) {
        return By.xpath("//select[@id='" + dropdownId + "']/option[text()='" + optionText + "']");
    }
}
