package PageObjects.NavBar;

import org.openqa.selenium.By;

public class NavBarElements {
    By SignUpLoginButton = By.xpath("//a[@href='/login']");
    By ContactUsButton = By.xpath("//a[@href='/contact_us']");
    By HomeButton = By.xpath("//a[@href='/']");


    // Locator for the Add to Cart button in the navbar
    By CART_BUTTON = By.xpath("//a[@href='/view_cart']");
    By PRODUCTS_BUTTON = By.xpath("//a[@href='/products']");
    By DELETE_ACCOUNT_BUTTON = By.xpath("//a[@href='/delete_account']");
    By TC_BUTTON = By.xpath("//a[@href='/test_cases']");
    By logout_button = By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[4]/a");
}
