package step_definitions;

import command_providers.ActOn;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class UsBankLocationsSteps {
    private final By ClickOnLocations = By.xpath("//A[@class='utility-link'][text()='Locations']");
    private final By TypeInSearchBox = By.xpath("//INPUT[@id='autocomplete']");

    private static final Logger LOGGER = LogManager.getLogger(UsBankLocationsSteps.class);
    WebDriver driver = Hooks.driver;


    @Given("^a user is on US Bank home page$")
    public void userLandsOnUsBankWebSie() {
        ActOn.browser(driver).openBrowser("https://www.usbank.com/index.html");
        LOGGER.info("User is on US BANK Website");
    }

    @Given("^user clicks on location link on the webpage$")
    public void clickOnLocationLink() {
        ActOn.element(driver, ClickOnLocations).getElement().click();
        LOGGER.info("User clicks on locations link to navigate to search locations page");
    }

    @Then("^user enters zip code in find nearby location search field$")
    public void typeSearchBox() {
        ActOn.element(driver, TypeInSearchBox).setValue("11204").getElement().sendKeys(Keys.ENTER);
        LOGGER.info("User type zip code in search box and press ENTER");
    }

    @Then("^user can all nearby banks from the given zip code$")
    public void viewNearbyLocations() {
        LOGGER.info("User sees all nearby locations in result");
    }
}
