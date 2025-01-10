package PageObjects.AddToCartFromRecommended;

import org.openqa.selenium.By;

public class AddToCartFromRecommendedElements {
    By recommendedItemsSection = By.xpath("//div[@class='recommended_items']");
    By recommendedItemsTitle = By.xpath("//h2[text()='recommended items']");
    By  AddtoCart = By.xpath("//a[@class=\"btn btn-default add-to-cart\"] ");
    By  ViewCart = By.xpath("//u[text() = 'View Cart']");

    By productDisplayed = By.xpath("//tr[@id='product-1']");

}
