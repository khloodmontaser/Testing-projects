package PageObjects.TestCase;

import org.openqa.selenium.By;

public class TestCasesElements {
    // Locator for the Test Cases button
    protected By testCasesButton = By.xpath("//a[@href=\"/test_cases\"] //i");

    // Locator for the Test Cases page header (assuming it has a specific header)
    protected By testCasesPageHeader = By.xpath("//div[@class=\"panel-group\"]/h5/span");
}
