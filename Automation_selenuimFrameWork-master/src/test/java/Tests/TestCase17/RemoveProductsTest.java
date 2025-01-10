package Tests.TestCase17;


import Config.Config;
import PageObjects.CartPage.CartPageActions;
import PageObjects.HomePage.HomePageActions;
import PageObjects.NavBar.NavBarActions;
import PageObjects.VerifyProductquantityinCart.VerifyProductActions;
import Tests.TestBase;
import Utilities.Utilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
 /*مفروض ادد  الاول */
public class RemoveProductsTest extends TestBase{
     VerifyProductActions verifyProductActions;

        HomePageActions homePageActions;
        NavBarActions navBarActions;
        CartPageActions cartPageActions;
        String url = Config.getProperty("URL");

        @BeforeMethod
        public void setupTest() {
            homePageActions = new HomePageActions(driver);
            navBarActions = new NavBarActions(driver);
            cartPageActions = new CartPageActions(driver);
            verifyProductActions = new VerifyProductActions(driver);

        }

        // Navigate to the application URL
        public void navigateToUrl() {
            homePageActions.navigateToHomePage(url);
        }

        @Test
        public void removeProductFromCartTest() {
            // Step1&2: Launch browser and navigate to the URL
            navigateToUrl();

            // Step3: Verify that home page is visible successfully
            homePageActions.validateHomePageTitleIsDisplayed();

            // Step4: Add  product to the cart
            verifyProductActions.clickViewProduct();
            verifyProductActions.clickAddToCart();
            verifyProductActions.clickContinueShoppingButton();


            // Step5: Click 'Cart' button
            navBarActions.clickCartButton();

            // Step6: Verify that the cart page is displayed
            cartPageActions.validateCarPageIsDisplayed();

            // Step7: Remove the product
            cartPageActions.clickRemoveButton();

            // Step8: Verify that the product is removed from the cart
            cartPageActions.validateDeletionMessageIsDisplayed();
        }


}
