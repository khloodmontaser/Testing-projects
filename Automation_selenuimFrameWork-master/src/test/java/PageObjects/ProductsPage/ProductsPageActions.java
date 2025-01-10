package PageObjects.ProductsPage;

import Assertions.Assertion;
import BrowserActions.BrowserActions;
import org.openqa.selenium.WebDriver;

public class ProductsPageActions extends ProductsPageElements {

    Assertion assertion;
    BrowserActions browserActions;

    public ProductsPageActions(WebDriver driver) {
        assertion = new Assertion(driver);
        browserActions = new BrowserActions(driver);
    }

    public void validateProductTitleIsDisplayed() {
        assertion.assertElementIsDisplayed(Product_Title);
    }

    public void validateItemsIsDisplayed() {
        assertion.assertElementIsDisplayed(ITEM_PRODUCT);
    }

    public void validateBrandsIsDisplayed() {
        assertion.assertElementIsDisplayed(BRANDS_TITLE);
    }
    public void SearchProduct(String productName){
        browserActions.scrollTillElement(Search_Bar);
        browserActions.type(Search_Bar, productName);
    }
    public void ValidateSearchTitle(){
        assertion.assertElementIsDisplayed(Search_title);
    }
    public void ClickSearch(){browserActions.click(Search_icon);}
    public void IsSearchedProductDisplayed(){
        assertion.assertElementIsDisplayed(searched_products);
    }
    public void addFirstProduct(){
        browserActions.scrollTillElement(First_product);
        browserActions.click(First_product);
    }
    public void addSecondProduct(){
        browserActions.scrollTillElement(Second_product);
        browserActions.click(Second_product);
    }
    public void ClickcontinueShopping(){
        browserActions.click(Continue_shopping);
    }

    public void Verify_First_Second_Added(){
        assertion.assertElementIsDisplayed(FirstProductAdded);
        assertion.assertElementIsDisplayed(SecondProductAdded);
    }


    /*public void clickBrandsPoloButton() {
        browserActions.click(BRANDS_POLO);
    }

    public void clickBrandsBibaButton() {
        browserActions.click(BRAND_Biba);
    }*/

    // dynamic for brands

    public void clickBrand(String brandName) {
        browserActions.scrollTillElement(BRANDS_PRODUCT);
        browserActions.click(getBrandLocator(brandName));
    }
}
