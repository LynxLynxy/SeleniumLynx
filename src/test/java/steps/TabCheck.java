package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.GeneralPage;
import pages.MainUserPage;

import java.util.Map;

/**
 * Created by Lynx on 14.11.2016.
 */
public class TabCheck {
    protected WebDriver driver;
    public MainUserPage lPage;

    public TabCheck() {
        this.driver = Hooks.driver;
    }


    @When("^I click link \"([^\"]*)\"$")
    public void iClickLink(String tabLink) throws Throwable {
        lPage = new MainUserPage(driver);
        switch (tabLink) {
            case "myWorkTabOpen":
                lPage.myWorkTabOpen();
                break;
            case "customerTabOpen":
                lPage.customerTabOpen();
                break;
            case "billingTabOpen":
                lPage.billingTabOpen();
                break;
            case "policyTabOpen":
                lPage.policyTabOpen();
                break;
            case "quoteTabOpen":
                lPage.quoteTabOpen();
                break;
            case "claimTabOpen":
                lPage.claimTabOpen();
                break;
            case "reportsTabOpen":
                lPage.reportsTabOpen();
                break;
            case "producerTabOpen":
                lPage.producerTabOpen();
                break;
            default:
                Assert.fail("Tab doesn't exist");
                break;
        }
    }

    @Then("^\"([^\"]*)\" is on the page$")
    public void isOnThePage(String tabText) throws Throwable {
        lPage.checkTextOnPage(tabText);
    }

    @When("^Open page pageName with text$")
    public void openPageWith(Map<String, String> pageTabList) throws Throwable {
        lPage = new MainUserPage(driver);
        for (int i = 0; i < pageTabList.size(); i++) {
            Map.Entry<String, String> pageList = pageTabList.entrySet().iterator().next();
            String pageLink = pageList.getKey();
            System.out.println(pageList);
            switch (pageLink) {
                case "myWorkTabOpen":
                    lPage.myWorkTabOpen();
                    break;
                case "customerTabOpen":
                    lPage.customerTabOpen();
                    break;
                case "billingTabOpen":
                    lPage.billingTabOpen();
                    break;
                case "policyTabOpen":
                    lPage.policyTabOpen();
                    break;
                case "quoteTabOpen":
                    lPage.quoteTabOpen();
                    break;
                case "claimTabOpen":
                    lPage.claimTabOpen();
                    break;
                case "reportsTabOpen":
                    lPage.reportsTabOpen();
                    break;
                case "producerTabOpen":
                    lPage.producerTabOpen();
                    break;
                default:
                    Assert.fail("Tab doesn't exist");
                    break;
            }
        }
    }

}