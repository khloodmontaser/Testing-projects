package PageObjects.ViewCategories;

import Assertions.Assertion;
import BrowserActions.BrowserActions;
import PageObjects.AddReview.AddReviewElements;
import org.openqa.selenium.WebDriver;

public class ViewCategoriesActions extends ViewCategoriesElements {
    BrowserActions browserActions;
    Assertion assertion;

    public ViewCategoriesActions(WebDriver driver) {
        browserActions = new BrowserActions(driver);
        assertion = new Assertion(driver);
    }


    public void validateCategoryListTitleIsDisplayed() {
        assertion.assertElementIsDisplayed( CategoryListTitle);
    }
    public void validateCategoryListIsDisplayed() {
        assertion.assertElementIsDisplayed( CategoryList);
    }
    public void ClickWomen() {
        browserActions.click(ClickWomen);
    }
    public void ClickDress() {browserActions.click(ClickDress);}
    public void ClickMen() {
        browserActions.click(ClickMen);
    }
    public void ClickTshirts() {browserActions.click(ClickTshirts);}
    public void validateProductsGroupTitleIsDisplayed() {
        assertion.assertElementIsDisplayed( ProductsGroupTitle);
    }
    public void validateProductsGroupIsDisplayed() {
        assertion.assertElementIsDisplayed(ProductsGroup);
    }






}