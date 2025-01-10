package PageObjects.TestCase;

import Assertions.Assertion;
import BrowserActions.BrowserActions;
import PageObjects.TestCase.TestCasesElements;
import org.openqa.selenium.WebDriver;

public class TestCasesActions extends TestCasesElements {
    BrowserActions browserActions;
    Assertion assertion;

    public TestCasesActions(WebDriver driver) {
        browserActions = new BrowserActions(driver);
        assertion = new Assertion(driver);
    }

    public void clickTestCasesButton() {
        browserActions.click(testCasesButton); // Click on the Test Cases button
    }

    public void validateTestCasesPageIsDisplayed() {
        assertion.assertElementIsDisplayed(testCasesPageHeader); // Validate the Test Cases page header
        //another method to validate :
        // Get the color property
 /*     String colorValue = element.getCssValue("color");

// Expected RGB color for red
        String expectedColor = "rgba(255, 0, 0, 1)";

// Validate the color
        if (colorValue.equals(expectedColor)) {
            System.out.println("Element exists with the expected color!");
        } else {
            System.out.println("Element color does not match!");
        }*/
    }
}
