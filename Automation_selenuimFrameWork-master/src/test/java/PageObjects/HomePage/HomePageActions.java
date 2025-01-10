package PageObjects.HomePage;

import Assertions.Assertion;
import BrowserActions.BrowserActions;
import org.openqa.selenium.WebDriver;

public class HomePageActions extends HomePageElements {
    Assertion assertion;
    BrowserActions browserActions;
    public HomePageActions(WebDriver driver){
        assertion = new Assertion(driver);
        browserActions = new BrowserActions(driver);
    }
    public void navigateToHomePage(String url){
        browserActions.navigateToURl(url);
    }
    public void validateHomePageTitleIsDisplayed(){
        assertion.assertElementIsDisplayed(Title);
    }
    public void clickCartButton() {
        browserActions.click(cartButton);

    }
    public void ScrollToFooter(){
        browserActions.scrollTillElement(footer);
    }
    public void scrollTop(){
        browserActions.scrollToTop();
    }
    public void ValidateSubscriptionTitleDisplayed(){
        assertion.assertElementIsDisplayed(subscribtion);
    }
    public void MailforSubscriotion(String mail){
        browserActions.type(SubscriotionMail, mail);
    }

    public void ClickArrowSubscription(){
        browserActions.click(SubscriptionArrow);
    }
    public void IsSubscriptionMsgDisplayed(){
        assertion.assertElementIsDisplayed(SubscriptionMsg);
    }

    public void ClickArrowUpwards(){
        browserActions.click(ArrowUpward);
    }
    public void Fullfledgedtextdisplayed(){
        assertion.assertElementIsDisplayed(FullfledgedText);
    }
    public void LoggedUserNameDisplayed(){
        assertion.assertElementIsDisplayed(UserLogged);
    }
}