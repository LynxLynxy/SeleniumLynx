package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Lynx on 09.11.2016.
 */
public class MainUserPage extends GeneralPage{
    By myWorkLink = By.id("tabForm:topTabsBarList:0:link");
    By customerLink = By.id("tabForm:topTabsBarList:1:link");
    By billingLink = By.id("tabForm:topTabsBarList:2:link");
    By policyLink = By.id("tabForm:topTabsBarList:3:link");
    By quoteLink = By.id("tabForm:topTabsBarList:4:link");
    By claimLink = By.id("tabForm:topTabsBarList:5:link");
    By reportsLink = By.id("tabForm:topTabsBarList:6:link");
    By producerLink = By.id("tabForm:topTabsBarList:7:link");

    public MainUserPage(WebDriver driver){
        super(driver);
    }

    public void myWorkTabOpen(){
        clickButton(myWorkLink);
    }

    public void customerTabOpen(){
        clickButton(customerLink);
    }

    public void billingTabOpen(){
        clickButton(billingLink);
    }

    public void policyTabOpen(){
        clickButton(policyLink);
    }

    public void quoteTabOpen(){
        clickButton(quoteLink);
    }

    public void claimTabOpen(){
        clickButton(claimLink);
    }

    public void reportsTabOpen(){
        clickButton(reportsLink);
    }

    public void producerTabOpen(){
        clickButton(producerLink);
    }

}
