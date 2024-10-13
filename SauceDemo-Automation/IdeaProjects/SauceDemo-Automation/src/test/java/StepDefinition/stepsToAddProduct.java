package StepDefinition;

import PageObjectModel.LogOut;
import PageObjectModel.Login;
import PageObjectModel.ProductPurchase;
import Utils.GenericUtils;
import Utils.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepsToAddProduct {
    //page objects
    GenericUtils genericUtil;
    Login loginP;
    ProductPurchase PP;
    LogOut logoutP;

    public stepsToAddProduct(TestContext testContext1){

        genericUtil = testContext1.pageObjectManager.getGenericUtil();
        loginP = testContext1.pageObjectManager.getLogin();
        PP = testContext1.pageObjectManager.getProductPurchase();
        PP = testContext1.pageObjectManager.productPurchase;
        logoutP = testContext1.pageObjectManager.logOut();
    }
    @Given("User is logged in to the SauceDemo website")
    public void user_is_logged_in_to_the_saucedemo_website() throws InterruptedException {
        loginP.verifyUserOnLandingPage();
        loginP.enterId("standard_user");
        loginP.enterPassword("secret_sauce");
        loginP.signinButton();
    }

    @When("User selects the product")
    public void user_selects_the_product(){
            PP.selectProductsToBuy();
    }

    @Then("User should see the product in the cart")
        public void user_should_see_the_product_in_the_cart(){
        PP.clickOnAddToCartButton();
        PP.verifyUserOnCartPage();
        }

        @When("User clicks on the Logout button")
          public void user_clicks_on_the_logout_button(){
            logoutP.clickOnMenuIcon();
            logoutP.clickOnLogoutButton();

        }

        @Then("User should be logged out and redirected to the login page")
        public void user_should_be_logged_out_and_redirected_to_the_login_page(){

        }


}
