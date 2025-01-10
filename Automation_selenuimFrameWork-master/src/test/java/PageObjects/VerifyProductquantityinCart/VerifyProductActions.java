package PageObjects.VerifyProductquantityinCart;

import Assertions.Assertion;
import BrowserActions.BrowserActions;
import org.openqa.selenium.WebDriver;

public class VerifyProductActions extends VerifyProductElements {
    BrowserActions browserActions;
    Assertion assertion;
    public VerifyProductActions(WebDriver driver) {
        browserActions = new BrowserActions(driver);
        assertion = new Assertion(driver);
    }

    public void navigateToUrl(String url) {
        browserActions.navigateToURl(url);
    }

    public boolean isHomePageVisible() {
        return browserActions.waitUntilElementIsReady(homePageVisibleElement).isDisplayed();
    }

    public void clickViewProduct() {
        browserActions.click(viewProductButton);
    }

    public boolean isProductDetailOpened() {
        return browserActions.waitUntilElementIsReady(productDetailPage).isDisplayed();
    }

    public void setProductQuantity(int quantity) {
        browserActions.type(quantityInput, String.valueOf(quantity));
    }

    public void clickAddToCart() {
        browserActions.click(addToCartButton);
    }

    public void clickViewCart() {
        browserActions.click(viewCartButton);
    }

    public void clickContinueShoppingButton() {
        browserActions.click(CONTINUE_SHOPPING_BUTTON);
    }


    public String getCartProductQuantity() {
        return browserActions.getText(cartProductQuantity);
    }

    public void VerifyProductDetails(){
       assertion.assertElementIsDisplayed(productDetails);
    }
}