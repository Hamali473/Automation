package PageObjectModel;
import Utils.loggerHelper;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ProductPurchase {

    public WebDriver driver;
    Logger log = loggerHelper.getLogger(ProductPurchase.class);


    public ProductPurchase(WebDriver driver) {
        this.driver = driver;
    }


    private final By firstProduct = By.xpath("(//button[normalize-space()='Add to cart'])[1]");
    private final By secondProduct = By.xpath("(//button[normalize-space()='Add to cart'])[2]");
    private final By thirdProduct = By.xpath("(//button[normalize-space()='Add to cart'])[3]");
    private final By addToCartButton = By.xpath("//a[@class=\"shopping_cart_link\"]");
    private final By cartPageTitle = By.xpath("//span[@class='title']");

    public void selectProductsToBuy(){
        driver.findElement(firstProduct).click();
        driver.findElement(secondProduct).click();
        driver.findElement(thirdProduct).click();
    }
    public void clickOnAddToCartButton(){
        driver.findElement(addToCartButton).click();
    }
    public void verifyUserOnCartPage()
    {
        String cartPage_title = driver.findElement(cartPageTitle).getText();
        Assert.assertEquals(cartPage_title,"Your Cart");
        log.info("User is on the Cart page");
    }


}
