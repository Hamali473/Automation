package PageObjectModel;
import Utils.GenericUtils;
import org.openqa.selenium.WebDriver;
public class PageObjectManager {


    public GenericUtils genericUtil;
    public WebDriver driver;
    public Login login;
    public LogOut logout;
    public ProductPurchase productPurchase;



    public  PageObjectManager(WebDriver driver)
    {
        this.driver = driver;
    }

    public Login getLogin(){
        login = new Login(driver);
        return login;
    }

    public GenericUtils getGenericUtil(){
        genericUtil= new GenericUtils(driver);
        return genericUtil;
    }
    public Login getLoginPage(){
        login = new Login(driver);
        return login;
    }

    public LogOut logOut(){
        logout = new LogOut(driver);
        return logout;
    }
    public ProductPurchase getProductPurchase(){
        productPurchase = new ProductPurchase(driver);
        return productPurchase;
    }
}
