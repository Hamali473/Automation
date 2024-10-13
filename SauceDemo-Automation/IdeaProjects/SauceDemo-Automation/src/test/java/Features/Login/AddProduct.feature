Feature: AddProduct

  Scenario: Add Product to the Cart

  Given User is logged in to the SauceDemo website
  When User selects the product
  Then User should see the product in the cart


  Scenario: Logout
    Given User is logged in to the SauceDemo website
    When User clicks on the Logout button
    Then User should be logged out and redirected to the login page



