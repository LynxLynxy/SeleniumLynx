package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.GeneralPage;
import pages.LoginPage;
import steps.Hooks;

/**
 * Created by Lynx on 10.11.2016.
 */
public class CustomerSteps {

    protected WebDriver driver;
    public GeneralPage lPage;
    // need move to search page
    By searchByFName = By.id("searchForm:searchFormME_firstName");
    By startSearchButton = By.id("searchForm:searchBtn");

    public CustomerSteps() {
        this.driver = Hooks.driver;
    }

    @When("^User click Adv Search$")
    public void userClickAdvSearch() throws Throwable {
        lPage = new GeneralPage(driver);
        lPage.searchStart();
    }

    @And("^Fill first name \"([^\"]*)\"$")
    public void fillFirstName(String customerName) throws Throwable {
        lPage.fillField(customerName,searchByFName);
    }

    @And("^Click Search button$")
    public void clickSearchButton() throws Throwable {
        lPage.clickButton(startSearchButton);
    }

    @And("^Customer \"([^\"]*)\" opened$")
    public void customerOpened(String customerFullName) throws Throwable {
        driver.getPageSource().contains(customerFullName);
    }

}
