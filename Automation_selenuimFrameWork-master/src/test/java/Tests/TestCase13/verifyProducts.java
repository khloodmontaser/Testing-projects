package Tests.TestCase13;

import Config.Config;
import PageObjects.VerifyProductquantityinCart.VerifyProductActions;
import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class verifyProducts extends TestBase {
    VerifyProductActions verifyProductActions;
    String url = Config.getProperty("URL");

    @BeforeMethod
    public void setupTest() {
        verifyProductActions = new VerifyProductActions(driver);
    }
    @Test
    public void verifyProductQuantityInCart() {
        // Step 1: Launch browser and navigate to URL
        verifyProductActions.navigateToUrl(url);
        // Step 2: Verify that home page is visible
        Assert.assertTrue(verifyProductActions.isHomePageVisible(), "Home page is not visible!");
        // Step 3: Click 'View Product' for any product on home page
        verifyProductActions.clickViewProduct();
        // Step 4: Verify product detail is opened
        Assert.assertTrue(verifyProductActions.isProductDetailOpened(), "Product detail page is not displayed!");
        // Step 5: Increase quantity to 4
        verifyProductActions.setProductQuantity(4);
        // Step 6: Click 'Add to cart' button
        verifyProductActions.clickAddToCart();
        // Step 7: Click 'View Cart' button
        verifyProductActions.clickViewCart();
        // Step 8: Verify product quantity in the cart
        String actualQuantity = verifyProductActions.getCartProductQuantity();
        Assert.assertEquals(actualQuantity, "4", "Product quantity in cart is not as expected!");
    }
}
