package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchFieldTest {
    private static final Logger LOGGER = LogManager.getLogger(SearchFieldTest.class);
    private final By SearchField = By.id("search-input");
    private final By ClickOnEnter = By.xpath("/html/body/section/div/div[1]/div[5]/div/div[1]/div[1]/div[1]/nav/div[1]/div[2]/ul/li[3]/form/div/button[1]/svg");

    public WebDriver driver;

    public  SearchFieldTest(WebDriver driver){
        this.driver = driver;
    }

    //type to search something in search field
    public SearchFieldTest typeInSearchField(){
        LOGGER.debug("type to search something in the search field");
        ActOn.element(driver, SearchField).setValue("Checking account" + "\n");
        return this;
    }
    //Click on enter button to search
    //*public SearchFieldTest clickOnEnterIcon(){
      //  LOGGER.debug("Click on enter icon to go to search results");
    //    ActOn.element(driver, ClickOnEnter).click();
     //   return this;
   // }

}
