package Assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Assertion {
    private final WebDriver driver;
    private final int WAIT_TIME=30;

    public Assertion(WebDriver driver){
        this.driver = driver;
    }
    private WebElement waitForCondition(By locator, ExpectedCondition<WebElement> condition) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME));
        return wait.until(condition);
    }
    public void assertElementIsDisplayed(By locator) {
        WebElement element = waitForCondition(locator, ExpectedConditions.visibilityOfElementLocated(locator));
        Assert.assertTrue(element.isDisplayed(), "Expected element to be displayed, but it is not: " + locator);
    }

    public void assertTextEquals(By locator, String actualText,String expectedText) {
        WebElement element = waitForCondition(locator, ExpectedConditions.visibilityOfElementLocated(locator));
        Assert.assertEquals(actualText, expectedText, "Expected text does not match actual text for element: " + locator);
    }

    public void assertPageTitle(String expectedTitle) {
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Page title does not match. Expected: " + expectedTitle + ", Actual: " + actualTitle);
    }

    public void assertElementIsEnabled(By locator) {
        WebElement element = waitForCondition(locator, ExpectedConditions.elementToBeClickable(locator));
        Assert.assertTrue(element.isEnabled(), "Expected element to be enabled, but it is not: " + locator);
    }

    public void assertElementIsNotDisplayed(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME));
        boolean isNotVisible = wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
        Assert.assertTrue(isNotVisible, "Expected element to not be displayed, but it is visible: " + locator);
    }


    public void assertElementTextEquals(By locator, String expectedText) {
        String actualText = driver.findElement(locator).getText(); // Get the text of the element
        Assert.assertEquals(actualText, expectedText, "Text does not match for element: " + locator);
    }
}
