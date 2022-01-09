package step_definitions;

import command_providers.ActOn;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class UsBankSearchSteps {
    private final By TypeSearchField = By.id("search-input");
    WebDriver driver = Hooks.driver;
    private static final Logger LOGGER = LogManager.getLogger(UsBankSearchSteps.class);


    @Given("^a user is on US Bank Website$")
    public void userEntersUsBankWebsite() {
        ActOn.browser(driver).openBrowser("https://www.usbank.com/index.html");
        LOGGER.info("User lands on the US Bank Web site");
    }

    @When("^user types inside search field$")
    public void typeInSearchField() {
        ActOn.element(driver, TypeSearchField).setValue("savings account").getElement().sendKeys(Keys.ENTER);
        LOGGER.info("Use types in search field to search");
    }
    //@When("^user hover over to typed word$")
    //public void hoverOverTypedWord() {
        //ActOn.element(driver, HoverOverToTypedWord).mouseHover().click();
       // LOGGER.info("User hover overs to typed word and click");
  //  }
    @Then("^user lands on results page for intended search$")
    public void userLandsOnResultsPage() {
        LOGGER.info("User is on the search result page");
    }


}
