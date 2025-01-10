package PageObjects.SignUpLogin;

import Assertions.Assertion;
import BrowserActions.BrowserActions;
import org.openqa.selenium.WebDriver;

public class SingUPLoginActions extends SingUPLoginElements {
    BrowserActions browserActions;
    Assertion assertion;

    public SingUPLoginActions(WebDriver driver) {
        browserActions = new BrowserActions(driver);
        assertion = new Assertion(driver);
    }
    public void CheckLoginTitle(){
        assertion.assertElementIsDisplayed(LoginTitle);
    }

    public void EnterLoginMail(String mail){
        browserActions.type(login_email, mail);
    }
    public void EnterLoginPassword(String pass){
        browserActions.type(login_password, pass);
    }
    public void ClickLogin(){
        browserActions.click(LoginButton);
    }

    public void InvalidLoginMsgDisplayed(){
        assertion.assertElementIsDisplayed(InvalidLoginMsg);
    }


    public void enterSignUPNameInput(String input) {
        browserActions.type(SignUPUserNameInput, input);
    }

    public void enterSignUPEmailInput(String input) {
        browserActions.type(SignUPEmailInput, input);
    }
    public void AlreadyExistMsgDisplayed(){
        assertion.assertElementIsDisplayed(alreadyExistMsg);
    }

    public void clickSignUpButton() {
        browserActions.click(SignUpButton);
    }

    public void validateNewUserSignUpTitleIsDisplayed() {
        assertion.assertElementIsDisplayed(NewUserSignUpTitle);
    }

    public void chooseGenderMr() {browserActions.click(ChooseGenderMr);}
    //   public void enterUserNewName(String input) {browserActions.type(UserNewName, input);}
    //  public void enterUserNewEmail(String input) {browserActions.type(UserNewEmail, input);}
    public void enterUserNewPassword(String input) {
        browserActions.type(UserNewPassword, input);
    }

    public void selectDay() {
        browserActions.click(SelectDay);
    }


    public void selectMonth (){
        browserActions.click(SelectMonth);

    }
    public void selectYear (){browserActions.click(SelectYear);}
    public void fillFirstNamefield(String input) {
        browserActions.scrollTillElement(FillFirstName);
        browserActions.type(FillFirstName, input);
    }
    public void fillLastNamefield(String input) {
        browserActions.type(FillLastName, input);
    }
    public void fillCompanyfield(String input) {
        browserActions.type(FillCompany, input);
    }
    public void fillAddressfield(String input) {
        browserActions.type(FillAddress, input);
    }
    public void selctCountry() {browserActions.click(SelectCountry);}

    public void fillStatefield(String input) {
        browserActions.type(FillState, input);
    }
    public void fillCityfield(String input) {
        browserActions.scrollTillElement(FillCity);
        browserActions.type(FillCity, input);
    }
    public void fillZipCodefield(String input) {
        browserActions.type(FillZipCode, input);
    }
    public void fillMobilePhonefield(String input) {
        browserActions.type(FillMobilePhone,input);
    }
    public void clickCreateAccountButton() {browserActions.click(ClickCreateAccountButton);}

    public void checkaccountcreatedIsDisplayed(){assertion.assertElementIsDisplayed(Checkaccountcreated);}
    public void checkcontinuebutton (){browserActions.click(Checkcontinuebutton);}
    public void checkuserloginIsDisplayed(){assertion.assertElementIsDisplayed(Checkuserlogin);}




}