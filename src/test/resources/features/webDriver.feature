@webdriver
Feature: Webdriver methods

  @webdriver1
  Scenario: Open the page
    Given I got to "google" page and print details

  @webdriver2
  Scenario: WebDriver - Navigate
    Given I navigate to "google"
    Then I print page detail
    And I navigate to "yahoo"
    Then I print page detail
    And I go back, forward, and refresh the site


  @webdriver3
  Scenario: Verifying Username Input Field Behavior
    Given I navigate to "quote"
    When I type "A" into username field
  #And I wait for 2 sec
    Then I submit form
  #And I wait for 2 sec
    Then username error message is displayed
    Then error message "Please enter at least 2 characters." is displayed
    When I clear "A" in username field
  #And I wait for 2 sec
    Then username error message is displayed
    Then error message "This field is required."
  #And I wait for 2 sec
    When I type "AA" into username field
    Then I submit form
    Then error message "This field is required." is not displayed

  @webdriver4
  Scenario: Quote - Email Field Verification
    Given I navigate to "quote"
    When I type "incorrectemail" into email field
    Then I submit form
    Then email error message is displayed
    Then message "Please enter a valid email address." is displayed


  @webdriver5
  Scenario: Verifying password input behavior
    Given I navigate to "quote"
    When I type "1234" into password input field
    Then I submit form
    Then password error message is displayed
    Then error message "Please enter at least 5 characters." is present
    Then I clear "1234" in password input field
    And I type "12345" into email input field
    Then I submit form
    Then error message "This field is required." is not present
    And I wait for 1 sec

  @webdriver6
  Scenario Outline: Quote - Email Field Verification-Multiple Data Set
    Given I navigate to "quote"
    When I type <email> into email field
    Then I submit form
    Then email error message is displayed
    Then message <expectedMessage> is displayed

    Examples:
      | email             | expectedMessage                       |
      | "incorrectemail"  | "Please enter a valid email address." |
      | "incorrectemail@" | "Please enter a valid email address." |
      | "incorr@abc"      | "Please enter a valid email address." |
      | ""                | "This field is required."             |

  @webdriver7
  Scenario: Verifying Confirm Password Field
    Given I navigate to "quote"
    When I type "12345" into password input field
    And I type "54321" into confirm password input field
    Then I submit form
    Then error message "Password do not match!" should be displayed
    When I clear confirm password field
    And I submit form
    Then error message "This field is required." should be displayed
    Then I clear "12345" from password input field
    Then I click on confirm password input field
    And confirm password field should be disabled


  @webdriver8
  Scenario: Verifying “Name” field behavior Modal dialog
    Given I navigate to "quote"
    When I click on name input field
    Then modal window appears
    Then I type "olesya" into first name field
    Then I type "Shum" into last name field
    And I click on save button
    Then "olesya" "Shum" should be displayed in name input field

    @webdriver9
    Scenario: Verifying Accepting Privacy Policy Field Behavior
      Given I navigate to "quote"
      Then text "I have read and accept Privacy Policy." is displayed
      And I submit form
      Then error message "- Must check!" should be present
      Then I click checkbox
      And I wait for 1 sec
      Then error message "- Must check!" should not be displayed

      @webdriver10
        Scenario: Verifying the form after submission
        Given I navigate to "quote"
        Then I type "Olesya" into username field
        Then I type "shumolesya@yahoo.com" into email field
        Then I type "12345" into password input field
        Then I type "12345" into confirm password input field
        When I click on name input field
        Then modal window appears
        Then I type "olesya" into first name field
        Then I type "Shum" into last name field
        And I click on save button
        Then "olesya" "Shum" should be displayed in name input field
        And I wait for 1 sec
        Then I click checkbox
        And I wait for 3 sec
        Then I submit form
        And I wait for 2 sec
        Then submitted form is displayed
        And I wait for 2 sec
        Then username should display "Olesya"
        Then email should display "shumolesya@yahoo.com"
        Then password should display "entered"
        And I wait for 3 sec
        Then Agreed To Policy displays "true"
        And I wait for 5 sec
        And Name displays "Olesya Shum"








 




