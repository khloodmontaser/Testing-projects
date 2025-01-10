package BrowserActions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BrowserActions {
    private final WebDriver driver;
    private final int WAIT_TIME = 30;

    public BrowserActions(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement waitUntilElementIsReady(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public WebElement waitUntilElementIsClickable(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME));
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public void click(By locator) {
        WebElement element = waitUntilElementIsClickable(locator);
        element.click();
    }


    public void scrollTillElement(By locator) {
            WebElement element = waitUntilElementIsReady(locator); // Wait until the element is present
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView(true);", element); // Scroll to the element
        }
    public void scrollToTop() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 0);"); // Scrolls to the top of the page
    }


    public void type(By locator, String text) {
        WebElement element = waitUntilElementIsReady(locator);
        element.click();
        element.clear();
        element.sendKeys(text);
    }

    public String getText(By locator) {
        WebElement element = waitUntilElementIsReady(locator);
        return element.getText();
    }
    public void navigateToURl(String url){
        driver.get(url);
    }

    public void acceptAlert() {
        Alert alert = driver.switchTo().alert(); // Switch to the alert
        alert.accept(); // Accept the alert
    }
}
