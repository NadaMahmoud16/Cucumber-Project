Feature: User reservation
  Scenario: User can make successfully reservation
    Given User should open website url
    When User select a destination
    And User select check out and check in date
    And User select number of adults and children
    And User select child age
    Then User selected data should be appear correctly
    And User click on search button
    Then User should be redirected to hotels page
    And User select maximum price range
    And User select 5 stars rate
    Then User should be able to print number and names of the hotels With their prices