@smoke

Feature: Order
  Testing Order functionality

  Background:
    Given user is logged in
    And user is on the Orders page

  @Create_Order
  Scenario: Create New Order
    When user clicks New Order and enters three digit code
    And user should be directed to Create New Order page
    And user enters order details
    And user enters credit card information
    And user selects order from categories
    Then user should be able to save their order