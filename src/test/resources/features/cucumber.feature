@cucumber
Feature: Quote page Scenarios

  Background:
    Given I open url "https://skryabin.com/market/quote.html"
    Then I should see page title contains "Quote"

  @cucumber1
  Scenario: Verifying Responsive UI Behavior
    When I resize window to 1024 and 768
    Then element with xpath "//b[@id='location']" should be displayed
    When I resize window to 375 and 667
    Then element with xpath "//b[@id='location']" should not be displayed


  @cucumber2
  Scenario: Verifying Username Input Field Behavior
    When I type "A" into element with xpath "//input[@name='username']"
    And I click on element with xpath "//button[@id='formSubmit']"
    Then element with xpath "//label[@id='username-error']" should be displayed
    Then element with xpath "//label[@id='username-error']" should contain text "Please enter at least 2 characters."
    When I clear element with xpath "//input[@name='username']"
    Then element with xpath "//label[@id='username-error']" should contain text "This field is required."
    When I type "AA" into element with xpath "//input[@name='username']"
    And I click on element with xpath "//button[@id='formSubmit']"
    Then element with xpath "//label[@id='username-error']" should not be displayed
    And I wait for 2 sec

  @cucumber3
  Scenario: Verifying Email Input field Behavior
    When I type "A" into element with xpath "//input[@name='email']"
    And I click on element with xpath "//button[@id='formSubmit']"
    Then element with xpath "//label[@id='email-error']" should be displayed
    Then element with xpath "//label[@id='email-error']" should contain text "Please enter a valid email address."
    When I clear element with xpath "//input[@name='email']"
    Then element with xpath "//label[@id='email-error']" should contain text "This field is required."
    And I wait for 1 sec
    When I type "shumolesya!#@yahoo.com" into element with xpath "//input[@name='email']"
    And I wait for 3 sec
    Then element with xpath "//label[@id='email-error']" should not be displayed
    And I wait for 1 sec
    Then I clear element with xpath "//input[@name='email']"
    When I type "shumolesya@yahoo.com" into element with xpath "//input[@name='email']"
    And I wait for 5 sec
    And I click on element with xpath "//button[@id='formSubmit']"
    And I wait for 1 sec
    Then element with xpath "//label[@id='email-error']" should not be displayed

  @cucumber4
  Scenario: Verifying Password Input Field Behavior
    When I type "1234" into element with xpath "//input[@id='password']"
    And I click on element with xpath "//button[@id='formSubmit']"
    Then element with xpath "//label[@id='password-error']" should be displayed
    And I wait for 1 sec
    And element with xpath "//label[@id='password-error']" should contain text "Please enter at least 5 characters."
    When I type "12345" into element with xpath "//input[@id='password']"
    And I click on element with xpath "//button[@id='formSubmit']"
    Then element with xpath "//label[@id='password-error']" should not be displayed


  @cucumber5
  Scenario: Verifying Confirm Password Input Field Behavior
    When I type "12345" into element with xpath "//input[@id='password']"
    And I type "54321" into element with xpath "//input[@name='confirmPassword']"
    And I click on element with xpath "//button[@id='formSubmit']"
    Then element with xpath "//label[@id='confirmPassword-error']" should be displayed
    And element with xpath "//label[@id='confirmPassword-error']" should contain text "Passwords do not match!"
    When I clear element with xpath "//input[@id='password']"
    And I click on element with xpath "//button[@id='formSubmit']"
    Then element with xpath "//label[@id='password-error']" should be displayed
    And element with xpath "//label[@id='password-error']" should contain text "required"
    Then I click on element with xpath "//input[@id='confirmPassword']"
    And element with xpath "//input[@id='confirmPassword']" should be disabled

  @cucumber6
  Scenario: Verifying “Name” field behavior Modal dialog
    When I click on element with xpath "//input[@id='name']"
    Then element with xpath "//div[@id='nameDialog']" should be present
    Then I type "Olesya" into element with xpath "//input[@id='firstName']"
    And I type "Shum" into element with xpath "//input[@id='lastName']"
    And I click on element with xpath "//span[text()='Save']"
    Then element with xpath "//input[@id='name']" should have attribute "value" as "Olesya Shum"

  @cucumber7
  Scenario: Verifying Accepting Privacy Policy Field Behavior
    Then element with xpath "//span[contains(text(),'I have read and accept')]" should be present
    And I click on element with xpath "//button[@id='formSubmit']"
    Then element with xpath "//label[@id='agreedToPrivacyPolicy-error']" should be present
    And element with xpath "//label[@id='agreedToPrivacyPolicy-error']" should contain text "Must"
    And I wait for 1 sec
    Then I click on element using JavaScript with xpath "//input[@name='agreedToPrivacyPolicy'][@type='checkbox']"
    And element with xpath "//label[@id='agreedToPrivacyPolicy-error']" should not be displayed

  @cucumber8
  Scenario: Verifying the form after submission
    When I type "Olesya" into element with xpath "//input[@name='username']"
    Then I type "shumolesya@gmail.com" into element with xpath "//input[@name='email']"
    Then I type "12345" into element with xpath "//input[@name='password']"
    Then I type "12345" into element with xpath "//input[@name='confirmPassword']"
    Then I click on element using JavaScript with xpath "//input[@id='name']"
    And I wait for element with xpath "//div[@id='nameDialog']" to be present
    Then I type "Olesya" into element with xpath "//input[@id='firstName']"
    And I type "Shum" into element with xpath "//input[@id='lastName']"
    And I click on element with xpath "//span[text()='Save']"
    Then element with xpath "//input[@id='name']" should have attribute "value" as "Olesya Shum"
    Then I click on element using JavaScript with xpath "//input[@name='agreedToPrivacyPolicy'][@type='checkbox']"
    And I wait for 1 sec
    And I click on element with xpath "//button[@id='formSubmit']"
    And I wait for 1 sec
    Then element with xpath "//div[@class='well form-container container-fluid']" should be present
    And element with xpath "//span[contains(text(),'Username')]" should contain text "Username"
    And element with xpath "//b[@name='username']" should contain text "Olesya"
    Then element with xpath "//span[contains(text(),'Email')]" should contain text "Email"
    And element with xpath "//b[@name='email']" should contain text "shumolesya"
    Then element with xpath "//span[contains(text(),'Password')]" should contain text "Password"
    And element with xpath "//b[@name='password']" should contain text "entered"
    Then element with xpath "//*[contains(text(),'Agreed To Privacy Policy')]" should contain text "Policy"
    And element with xpath "//b[@name='agreedToPrivacyPolicy']" should contain text "true"
    Then element with xpath "//b[@name='name']/../span" should contain text "Name"
    And element with xpath "//b[@name='name']" should contain text "Olesya"




            