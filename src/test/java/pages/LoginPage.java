package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Lynx on 06.11.2016.
 */
public class LoginPage extends GeneralPage {
    String loginUrl = "http://dev5aig6was708.eqxdev.exigengroup.com:9082/premier";
    String redirectUrl = "http://dev5aig6was708.eqxdev.exigengroup.com:9082/premier/faces/work";
    By loginFieldLocator = By.id("loginForm:j_username");
    By passwordFieldLocator = By.id("loginForm:j_password");
    By submitButtonLocator = By.id("loginForm:submitForm");
    By logoutLink = By.id("logoutForm:logout_link");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void isPageOpened() {
        driver.navigate().to(loginUrl);
        Assert.assertTrue("Wrong page opened", driver.getTitle().startsWith("EIS Core Insurance Software"));
    }

    public void fillLogin(String login) {
        fillField(login, loginFieldLocator);
    }

    public void fillPassword(String password) {
        fillField(password, passwordFieldLocator);
    }

    public void clickSubmitLogin() {
        clickButton(submitButtonLocator);
    }

    public void checkLoginRedirect() {
        pageRedirect(redirectUrl);
    }

    public void checkIncorrectLoginError(String error) {
        checkTextOnPage(error);
    }

    public void clickLogOut() {
        clickButton(logoutLink);
    }
}
