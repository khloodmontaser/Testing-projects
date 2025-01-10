package Tests.TestCase21;

import BrowserActions.BrowserActions;
import Config.Config;
import PageObjects.AddReview.AddReviewActions;
import PageObjects.HomePage.HomePageActions;
import PageObjects.NavBar.NavBarActions;
import PageObjects.VerifyProductquantityinCart.VerifyProductActions;
import Tests.TestBase;
import Utilities.Utilities;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddReview extends TestBase{
    HomePageActions homePageActions;
    AddReviewActions addreviewactions;
    VerifyProductActions verifyProductActions;
    BrowserActions browserActions;

    NavBarActions navBarActions;
    String url = Config.getProperty("URL");

    @BeforeMethod
    public void setupTest() {
        homePageActions = new HomePageActions(driver);
        navBarActions = new NavBarActions(driver);
        addreviewactions = new AddReviewActions(driver);
        browserActions = new BrowserActions(driver);

        verifyProductActions = new VerifyProductActions(driver);

    }
    public void NavigateToUrl() {homePageActions.navigateToHomePage(url);}

    @Test
    public void AddReviewTest() {

        NavigateToUrl();
        String userName = Utilities.generateRandomString(7);
        String email = Utilities.generateRandomString(7) + "@gmail.com";
        String review = Utilities.generateRandomString(100);

        navBarActions.clickProductButton();

        browserActions.scrollTillElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div[1]/div[2]/div/div[1]/div[2]"));

        verifyProductActions.clickViewProduct();

        addreviewactions.validateWriteYourReviewTitleIsDisplayed();
        addreviewactions.enterUserNameInput(userName);
        addreviewactions.UserEmailInput(email);
        addreviewactions.UserReviewInput(review);
        addreviewactions.clickSubmitButton();


    }
}
/*24
  (ناقص اخر حتة)
   12 failed leeeeeeeh heya =

* */