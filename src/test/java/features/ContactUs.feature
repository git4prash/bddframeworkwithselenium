Feature: Securepay - Contact Us Page

  Scenario: Securepay - Navigate to Contact Us form and enter details

    Given user searches for securepay on google
    And clicks through to securepay website
    And User is redirected to the SecurePay homepage
    When User Navigates to Contact Us page
    Then verify that the Contact Us page is displayed
    And User should be able to enter details into the contact form



