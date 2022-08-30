Feature: As a user I should be able to search for an item, add it to shopping chart,
  change the amount of the item on shopping chart or delete it, so that I can change the search item,
  I can change the amount and I can cancel the checkout.

  @wip
  Scenario: User can search for any Item
    When user navigates to Beymen homepage and verify homepage landing
    Then user type product name and delete the text again
    And user type other product name and tap Enter
    And From the listed items user clicked on any product
    And user selected the size on the item page
    And user clicked on add chart button
    And prices should be same on the item's page and shopping chart
    And user change the amount to two
    And user clicked on delete chart button to delete all the items from the chart
    Then user check the empty chart