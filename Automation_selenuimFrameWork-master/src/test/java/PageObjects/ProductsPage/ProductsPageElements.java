package PageObjects.ProductsPage;

import org.openqa.selenium.By;


public class ProductsPageElements {

    //first product:
    By First_product = By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[2]/div/a");
    By Continue_shopping = By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[1]/div/div/div[3]/button");

    By Second_product = By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[3]/div/div[1]/div[2]/div/a");
    By FirstProductAdded = By.xpath("//*[@id=\"product-1\"]");
    By SecondProductAdded = By.xpath("//*[@id=\"product-2\"]");



    // Title of products page
    By Product_Title = By.xpath("//h2[@class='title text-center']");

    //ITEMS on products
    By ITEM_PRODUCT = By.xpath("//div[@class='features_items']");

    //brands in left sidebar
    By BRANDS_TITLE = By.xpath("/html/body/section[2]/div[1]/div/div[1]/div[1]/div[3]/h2");
    By BRANDS_PRODUCT = By.xpath("//div[@class='brands_products']");
    By Search_Bar = By.xpath("//*[@id='search_product']");
    By Search_icon = By.xpath("//button[@id='submit_search']");
    By Search_title = By.xpath("//h2[text()='Searched Products']");
    By searched_products = By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/h2");
    //xpathes of the brands
   /* By BRANDS_POLO = By.xpath("//a[@href='/brand_products/Polo']");
    By BRAND_HandM= By.xpath("//a[@href='/brand_products/H&M']");
    By BRAND_MADAME = By.xpath("//a[@href='/brand_products/Madame']");
    By BRAND_Mast_and_Harbour = By.xpath("//a[@href='/brand_products/Mast & Harbour']");
    By BRAND_Babyhug = By.xpath("//a[@href='/brand_products/Babyhug']");
    By BRAND_Allen_Solly_Junior = By.xpath("//a[@href='/brand_products/Allen Solly Junior']");
    By BRAND_Kookie_Kids= By.xpath("//a[@href='/brand_products/Kookie Kids']");
    By BRAND_Biba = By.xpath("//a[@href='/brand_products/Biba']");
    */

    public By getBrandLocator(String brandName) {
        return By.xpath("//a[@href='/brand_products/" + brandName + "']");
    }


}
