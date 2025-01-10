package PageObjects.AddToCartFromRecommended;

import Assertions.Assertion;
import BrowserActions.BrowserActions;
import org.openqa.selenium.WebDriver;

public class AddToCartFromRecommendedActions extends AddToCartFromRecommendedElements{

    BrowserActions browserActions;
    Assertion assertion;

    public AddToCartFromRecommendedActions(WebDriver driver) {
        browserActions = new BrowserActions(driver);
        assertion = new Assertion(driver);
    }

    public void scrollToRecommendedItems(){
        browserActions.scrollTillElement(recommendedItemsSection);
    }
    public void VerifyRecommendedItemsTitleDisplayed(){
       assertion.assertElementIsDisplayed(recommendedItemsTitle);
    }
    public void AddToCartFromRecommended(){
        browserActions.click(AddtoCart);
    }
    public void ClickViewCart(){
        browserActions.click(ViewCart);
    }
    public void VerifyProductDisplayed(){
        assertion.assertElementIsDisplayed(productDisplayed);
    }




}
