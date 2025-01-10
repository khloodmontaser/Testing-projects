package PageObjects.AddProductsinCart;

import Assertions.Assertion;
import BrowserActions.BrowserActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddProductActions extends AddProductElements{
    BrowserActions browserActions;
    Assertion assertion;
    public AddProductActions(WebDriver driver) {
        browserActions = new BrowserActions(driver);
        assertion = new Assertion(driver);
    }


    public void clickProductsButton() {
        browserActions.click(productsButton);
    }


    public void AddFirstProductToCart() {
        browserActions.click(addToCartFirstProduct);
    }

    public void clickContinueShopping() {
        browserActions.click(continueShoppingButton);
    }
//    public void addSecondProductToCart() {
//        browserActions.click(addToCartSecondProduct);
//    }
//    public void clickViewCartButton() {
//        browserActions.click(viewCartButton);
//    }
//    public boolean areBothProductsAdded() {
//        return browserActions.waitUntilElementIsReady(firstProductInCart).isDisplayed()
//                && browserActions.waitUntilElementIsReady(secondProductInCart).isDisplayed();
//    }
//    public String getProductPrice(By priceLocator) {
//        return browserActions.getText(priceLocator);
//    }
//    public String getProductQuantity(By quantityLocator) {
//        return browserActions.getText(quantityLocator);
//    }
//    public String getProductTotal(By totalLocator) {
//        return browserActions.getText(totalLocator);
//    }

}
