package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LocationTest {
    private static final Logger LOGGER = LogManager.getLogger(LocationTest.class);
    private final By LocationLink = By.xpath("//A[@class='utility-link'][text()='Locations']");
    private final By SearchBox = By.xpath("//INPUT[@id='autocomplete']");

    public WebDriver driver;

    public LocationTest(WebDriver driver){
        this.driver = driver;
    }
    //Click on the Locations link to get to the location search page
    public LocationTest clickLocationLink(){
        LOGGER.debug("click on location link");
        ActOn.element(driver, LocationLink).click();
        return this;
    }
    //Type in search box to enter zip code
    public LocationTest typeInSearchBox(){
        LOGGER.debug("Type zip code inside search box");
        ActOn.element(driver, SearchBox).setValue("11230" + "\n");
        return this;
    }
}
