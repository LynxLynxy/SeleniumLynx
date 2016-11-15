package steps;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.LoginPage;
import pages.GeneralPage;

import java.util.concurrent.TimeUnit;

/**
 * Created by Lynx on 06.11.2016.
 */
public class LoginSteps {
    protected WebDriver driver;
    public LoginPage lPage;

    public LoginSteps() {
        this.driver = Hooks.driver;
    }

    @Given("^User opens login page$")
    public void userOpensLoginPage() throws Throwable {
        lPage = new LoginPage(driver);
        lPage.isPageOpened();
    }

    @When("^Login is \"([^\"]*)\"$")
    public void loginIs(String login) throws Throwable {
        lPage.fillLogin(login);
    }
    @And("^Password is \"([^\"]*)\"$")
    public void passwordIs(String password) throws Throwable {
        lPage.fillPassword(password);
    }

    @And("^User submit form$")
    public void userSubmitForm() throws Throwable {
        lPage.clickSubmitLogin();
    }

    @And("^Page redirected to admin tab$")
    public void pageRedirectedToAdminTab() throws Throwable {
        lPage.checkLoginRedirect();
    }

    @And("^Error \"([^\"]*)\" display$")
    public void errorDisplay(String errorText) throws Throwable {
        lPage.checkIncorrectLoginError(errorText);
    }

    @And("^User click log out$")
    public void userClickLogOut() throws Throwable {
        lPage.clickLogOut();
    }
}
