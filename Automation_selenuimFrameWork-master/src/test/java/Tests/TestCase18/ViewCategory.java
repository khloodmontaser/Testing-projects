package Tests.TestCase18;

import Config.Config;
import PageObjects.AddReview.AddReviewActions;
import PageObjects.ViewCategories.ViewCategoriesActions;
import PageObjects.HomePage.HomePageActions;
import PageObjects.NavBar.NavBarActions;
import Tests.TestBase;
import Utilities.Utilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class ViewCategory extends TestBase {
    HomePageActions homePageActions;

    ViewCategoriesActions viewCategoriesActions;
    NavBarActions navBarActions;
    String url = Config.getProperty("URL");

    @BeforeMethod
    public void setupTest() {
        homePageActions = new HomePageActions(driver);
        navBarActions = new NavBarActions(driver);

        viewCategoriesActions = new ViewCategoriesActions(driver);
    }
    public void NavigateToUrl() {homePageActions.navigateToHomePage(url);}

    @Test
    public void AddReviewTest() {

        NavigateToUrl();

        viewCategoriesActions.validateCategoryListTitleIsDisplayed();
        viewCategoriesActions.validateCategoryListIsDisplayed();
        viewCategoriesActions.ClickWomen();
        viewCategoriesActions.ClickDress();
        viewCategoriesActions.validateProductsGroupTitleIsDisplayed();
        viewCategoriesActions.validateProductsGroupIsDisplayed();
        viewCategoriesActions.ClickMen();
        viewCategoriesActions.ClickTshirts();
        viewCategoriesActions.validateProductsGroupTitleIsDisplayed();
        viewCategoriesActions.validateProductsGroupIsDisplayed();


        

    }

}
