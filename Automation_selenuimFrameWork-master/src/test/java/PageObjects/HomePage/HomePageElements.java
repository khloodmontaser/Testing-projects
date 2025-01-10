package PageObjects.HomePage;

import org.openqa.selenium.By;

public class HomePageElements {
    By Title =By.xpath("//div[@id='slider-carousel']//div[@class='carousel-inner']");
    By cartButton = By.xpath("//a[contains(text(),'Cart')]");
    By footer = By.xpath("//footer[@id = 'footer']");
    By subscribtion = By.xpath("//h2[text()='Subscription']");
    By ArrowUpward = By.xpath("//i[@class='fa fa-angle-up']");
    By UserLogged = By.xpath("//*[@id='header']/div/div/div/div[2]/div/ul/li[10]/a/b");
    By SubscriotionMail = By.xpath("//input[@id='susbscribe_email']");
    By SubscriptionArrow = By.xpath("//i[@class='fa fa-arrow-circle-o-right']");
    By SubscriptionMsg = By.xpath("/html/body/footer/div[1]/div/div/div[1]/div/div");

    By FullfledgedText = By.xpath("//h2[text()='Full-Fledged practice website for Automation Engineers']");
}