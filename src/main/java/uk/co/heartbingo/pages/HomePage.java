package uk.co.heartbingo.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.heartbingo.utility.Utility;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }



    @CacheLookup
    @FindBy(id= "onetrust-accept-btn-handler")
    WebElement acceptCookies;
    @CacheLookup
    @FindBy(xpath="//a[normalize-space()='Sign Up']")
    WebElement signUp;



public void acceptCookies(){
    JavascriptExecutor executor = (JavascriptExecutor) driver;
    executor.executeScript("arguments[0].click();", acceptCookies);

}





    public void clickOnSignUpLinkOnPage() {
        log.info("Mouse Hover And Click On Sign Up" );
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", signUp);
    }





}
