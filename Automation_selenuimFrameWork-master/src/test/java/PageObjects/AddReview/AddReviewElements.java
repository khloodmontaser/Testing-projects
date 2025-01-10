package PageObjects.AddReview;

import org.openqa.selenium.By;

public class AddReviewElements {


    By AllProductsHeader=By.xpath("//h2[@class='title text-center']");
    By ViewProductButton=By.xpath("//a[@href='/product_details/1']");
    By WriteYourReviewTitle=By.xpath("//a[@href='#reviews']");
    By UserName=By.xpath("//input[@id='name']");
    By UserEmail=By.xpath("//input[@id='email']");
    By UserReview=By.xpath("//textarea[@id='review']");
    By SubmitButton=By.xpath("//button[@id='button-review']");


}
