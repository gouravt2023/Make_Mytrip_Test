
@tag
Feature: validating the login to zood back office Website
  I want to use this template for my feature file

	Background:
	Given I landed on zood back office login Page

  @Regression
  Scenario Outline: Positive Test of Submitting the order

    Given Logged in with username <name> and password <password>
    When I add product <productName> to Cart
    And Checkout <productName> and submit the order
    Then "THANKYOU FOR THE ORDER." message is displayed on ConfirmationPage

    Examples:
      | name  								|  password		    |	productName |
      | gourav.darjee@zoodmall.com |  Gourav@123  | ZARA COAT 3 |

