package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Lynx on 06.11.2016.
 */
public class GeneralPage {
    WebDriver driver;
    By advSearch = By.id("topQuickSearchForm:searchExtendedBtn");
    // elements list


    public GeneralPage(WebDriver driver) {this.driver=driver;}


    public void fillField(String fieldValue, By fieldLocator){
        WebElement currentField = driver.findElement(fieldLocator);
        Assert.assertNotNull(fieldLocator + "field not found", currentField);
        currentField.clear();
        currentField.sendKeys(fieldValue);
    }

    public void clickButton(By buttonLocator){
        WebElement currentButton = driver.findElement(buttonLocator);
        Assert.assertNotNull(buttonLocator+"button not found", currentButton);
        currentButton.click();
    }

    public void pageRedirect(String url){
        Assert.assertTrue(url+"Not Opened", driver.getCurrentUrl().startsWith(url));
    }

    public void checkTextOnPage(String text){
        Assert.assertNotNull(text+"Doesn't exist on this page", driver.getPageSource().contains(text));
    }

    public void searchStart(){
        clickButton(advSearch);
    }



}
