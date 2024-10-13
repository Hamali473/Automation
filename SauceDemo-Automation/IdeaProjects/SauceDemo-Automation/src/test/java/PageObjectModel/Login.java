package PageObjectModel;

import Utils.loggerHelper;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Login {

    public WebDriver driver;
    Logger log = loggerHelper.getLogger(Login.class);

    public Login(WebDriver driver) {
        this.driver = driver;
    }


    private final By id = By.id("user-name");
    private final By password = By.id("password");
    private final By signinButton = By.id("login-button");

    public void verifyUserOnLandingPage()
    {
        Assert.assertEquals(driver.getTitle(),"Swag Labs");
        log.info("User is on the landing page");
    }
    public void enterId(String em){
        driver.findElement(id).sendKeys(em);
        log.info("user enter email as "+em);
    }
    public void enterPassword(String pwd){
        driver.findElement(password).sendKeys(pwd);
        log.info("user enter password as"+pwd);
    }

    public void signinButton() throws InterruptedException {
        driver.findElement(signinButton).click();
        log.info("User click on signin button");
    }
}
