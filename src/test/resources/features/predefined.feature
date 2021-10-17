@predefined
Feature: Smoke steps
  @predefined1
  Scenario: Predefined steps for Google
    Given I open url "https://www.google.com/"
    Then I should see page title as "Google"
    Then element with xpath "//input[@name='q']" should be present
    When I type "Behavior Driven Development" into element with xpath "//input[@name='q']"
    Then I click on element using JavaScript with xpath "(//input[@name='btnK'])[1]"
    Then I wait for element with xpath "//*[@id='res']" to be present
    Then element with xpath "//*[@id='res']" should contain text "Cucumber"
    Then I wait for 10 sec

  @predefined2
  Scenario: Predefined steps for Yahoo
    Given I open url "https://yahoo.com"
    Then I should see page title contains "Yahoo | Mail"
    Then element with xpath "//input[@id='ybar-sbq']" should be present
    When I type "Behavior Driven Development" into element with xpath "//input[@id='ybar-sbq']"
    Then I click on element with xpath "//input[@id='ybar-search']"
    Then I wait for element with xpath "//div[@id='results']" to be present
    Then element with xpath "//div[@id='results']" should contain text "Cucumber"



  @predefined3
  Scenario: predefined steps for Gibiru
    Given I open url "https://gibiru.com/"
    Then I should see page title contains "Gibiru"
    Then element with xpath "//input[@id='q']" should be present
    And I type "Behavior Driven Development" into element with xpath "//input[@id='q']"
    And I click on element with xpath "//button[@type='submit']"
    Then I wait for element with xpath "//div[@id='web-results']" to be present
    Then element with xpath "//div[@id='web-results']" should contain text "BDD"
    


  @predefined4
  Scenario: Steps for Duckduckgo
    Given I open url "https://duckduckgo.com/"
    Then I should see page title contains "DuckDuckGo"
    Then element with xpath "//input[@id='search_form_input_homepage']" should be present
    And I type "Weather" into element with xpath "//input[@id='search_form_input_homepage']"
    And I click on element with xpath "//input[@id='search_button_homepage']"
    Then I wait for element with xpath "//div[@id='links_wrapper']" to be present
    Then element with xpath "//div[@id='links_wrapper']" should contain text "The Weather Channel"

  @predefined5
  Scenario: Steps for Swisscows
    Given I open url "https://swisscows.com/"
    Then I should see page title contains "Swisscows"
    Then element with xpath "//input[@class='input-search']" should be present
    And I type "Agile" into element with xpath "//input[@class='input-search']"
    And I click on element with xpath "//button[@class='search-submit']"
    Then I wait for element with xpath "//div[@class='page-results']" to be present
    Then element with xpath "//div[@class='page-results']" should contain text "Scrum"

  @predefined5
  Scenario: Steps for SearchEncrypt
    Given I open url "https://www.searchencrypt.com/home"
    Then I should see page title contains "Encrypt"
    Then element with xpath "//input[@class='search-bar__search']" should be present
    And I type "Portnov School" into element with xpath "//input[@class='search-bar__search']"
    And I click on element with xpath "//button[@type='submit']"
    Then I wait for element with xpath "//section[@class='serp__results container']" to be present
    Then element with xpath "//section[@class='serp__results container']" should contain text "Computer"

  @predefined6
  Scenario: Steps for Startpage
    Given I open url "https://www.startpage.com/"
    Then I should see page title contains "Startpage"
    Then element with xpath "//input[@id='q']" should be present
    And I type "Christmas" into element with xpath "//input[@id='q']"
    And I click on element with xpath "//button[@class='search-form-home__button-desktop']"
    Then I wait for element with xpath "//div[@class='mainline-results mainline-results__web']" to be present
    Then element with xpath "//div[@class='mainline-results mainline-results__web']" should contain text "decorations"

  @predefined8
  Scenario: Predefined steps for Yandex.com
    Given I open url "https://yandex.com"
    Then I should see page title contains "Yandex"
    Then element with xpath "//input[@class='input__control input__input mini-suggest__input']" should be present
    When I type "weather" into element with xpath "//input[@class='input__control input__input mini-suggest__input']"
    Then I click on element using JavaScript with xpath "//button[contains(@class,'button mini-suggest')]"
    Then I wait for element with xpath "//div[@class='content i-bem']" to be present
    Then element with xpath "//div[@class='content i-bem']" should contain text "Информация о температуре воздуха"


      @predefined9
      Scenario: predefined steps for Ecosia
        Given I open url "https://www.ecosia.org/"
        Then I should see page title as "Ecosia - the search engine that plants trees"
        Then element with xpath "//input[@placeholder='Search the web to plant trees...']" should be present
        When I type "Birch tree" into element with xpath "//input[@placeholder='Search the web to plant trees...']"
        Then I click on element with xpath "//button[@type='submit']"
        Then element with xpath "//div[@class='mainline-results']" should be present
        Then element with xpath "//div[@class='mainline-results']" should contain text "White Birch Landscape Design"
        
      
      @predefined10
      Scenario: predefined steps for Wiki
        Given I open url "https://www.wiki.com/"
        Then I should see page title contains "Wiki"
        Then element with xpath "//input[@name='q']" should be present
        Then I type "Java" into element with xpath "//input[@name='q']"
        When I click on element with xpath "//input[@name='btnG']"
        Then element with xpath "//h1[text()='The information you’re about to submit is not secure']" should be present
        Then I click on element with xpath "//button[text()='Send anyway']"
        Then I switch to iframe with xpath "//iframe[@name='googleSearchFrame']"
        Then element with xpath "//div[@class='gsc-result-info']" should be present
        And element with xpath "//div[@class='gsc-result-info']" should contain text "About"

        @predefined11
        Scenario: predefined steps for Givewater.com
          Given I open url "https://www.givewater.com/"
          Then I should see page title contains "Clean Water"
          And I wait for 3 sec
          #Then element with xpath "//button[@class='pum-close popmake-close']" should be present
          Then element with xpath "//button[@class='pum-close popmake-close']" should be displayed
          Then I click on element with xpath "//button[@class='pum-close popmake-close']"
          Then element with xpath "//input[@id='site-search']" should be present
          And I type "Water" into element with xpath "//input[@id='site-search']"
          Then I click on element with xpath "//button[@id='button-addon2']"
          Then element with xpath "//span[@class='web-bing__label']" should be present
          And I wait for 2 sec
          
          @predefined12
          Scenario: predefined steps for Ekoru
            Given I open url "https://www.ekoru.org/"
            Then I should see page title contains "Ekoru"
            Then element with xpath "//input[@id='fld_q']" should be present
            When I type "ocean" into element with xpath "//input[@id='fld_q']"
            Then I click on element with xpath "//div[@class='landing-image-wrapper']"
            Then element with xpath "//div[@id='btn_search']" should be present
            And I click on element with xpath "//div[@id='btn_search']"
            Then element with xpath "//div[@class='serp-wrapper']" should be present
            Then element with xpath "//div[@class='serp-wrapper']" should contain text "beach"
            






