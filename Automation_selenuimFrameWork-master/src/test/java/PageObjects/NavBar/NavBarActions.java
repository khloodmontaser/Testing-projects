package PageObjects.NavBar;

import Assertions.Assertion;
import BrowserActions.BrowserActions;
import org.openqa.selenium.WebDriver;

public class NavBarActions extends NavBarElements {
    BrowserActions browserActions;
    Assertion assertion;

    public NavBarActions(WebDriver driver) {
        browserActions = new BrowserActions(driver);
        assertion = new Assertion(driver);
    }
    public void clickSignUpLoginButton(){
        browserActions.click(SignUpLoginButton);
    }

    public void clickContactUsButton() {
        browserActions.click(ContactUsButton);
    }

    public void clickHomeButton() {
        browserActions.click(HomeButton);
    }
    public void clickCartButton(){
        browserActions.click(CART_BUTTON);
    }
    public void clickProductButton(){
        browserActions.click(PRODUCTS_BUTTON);
    }
    public void clickDeleteAccountButton(){
        browserActions.click(DELETE_ACCOUNT_BUTTON);
    }
    public void TestCasesButton(){
        browserActions.click(TC_BUTTON);
    }
    public void clickLogOut(){
        browserActions.click(logout_button);
    }
}

