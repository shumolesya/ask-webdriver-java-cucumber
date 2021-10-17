package definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import support.TestContext;

import static org.assertj.core.api.Assertions.assertThat;
import static support.TestContext.getDriver;

public class WebDriverStepDefs {
    @Given("I got to {string} page and print details")
    public void iGotToPageAndPrintDetails(String page) {
        getDriver().get("https://www.google.com/");
        System.out.println();
    }

    @Given("I navigate to {string}")
    public void iNavigateTo(String url) {
        switch(url){
            case "google":
                getDriver().get("https://www.google.com/");
                break;
            case "yahoo":
                getDriver().get("https://www.yahoo.com/");
                break;
            case "quote":
                getDriver().get("https://skryabin.com/market/quote.html");
                break;
            default:
                System.out.println("This site is not supported");

        }
    }

    @Then("I print page detail")
    public void iPrintPageDetail() {
        System.out.println(getDriver().getTitle());
        System.out.println(getDriver().getCurrentUrl());
        System.out.println(getDriver().getWindowHandle());

    }

    @And("I go back, forward, and refresh the site")
    public void iGoBackForwardAndRefreshTheSite() {
        getDriver().navigate().back();
        getDriver().navigate().forward();
        getDriver().navigate().refresh();
    }

    @When("I type {string} into email field")
    public void iTypeIntoEmailField(String email) {
        getDriver().findElement(By.name("email")).sendKeys(email);
    }

    @When("I type {string} into email input field")
    public void iTypeIntoEmailInputField(String letter1234) {
        getDriver().findElement(By.xpath("//input[@name='password']")).sendKeys(letter1234);
    }

    @Then("I submit form")
    public void iSubmitForm() {
      getDriver().findElement(By.id("formSubmit")).click();
    }

    @Then("email error message is displayed")
    public void emailErrorMessageIsDisplayed() {
        assertThat(getDriver().findElement(By.id("email-error")).isDisplayed()).isTrue();
    }


    @Then("message {string} is displayed")
    public void messageIsDisplayed(String expectedMessage) {
        String actualMessage = getDriver().findElement(By.id("email-error")).getText();
        System.out.println(actualMessage);
        assertThat(actualMessage.equals(expectedMessage)).isTrue();
    }


    @When("I type {string} into username field")
    public void iTypeIntoUsernameField(String letterA) {
        getDriver().findElement(By.xpath("//input[@name='username']")).sendKeys(letterA);
    }

    @Then("username error message is displayed")
    public void usernameErrorMessageIsDisplayed() {
        assertThat(getDriver().findElement(By.id("username-error")).isDisplayed()).isTrue();
    }

    @Then("error message {string} is displayed")
    public void errorMessageIsDisplayed(String expectedMessage) {
        String actualMessage = getDriver().findElement(By.xpath("//*[@id='username-error']")).getText();
        System.out.println(actualMessage);
        assertThat(expectedMessage.equals(actualMessage)).isTrue();

    }

    @When("I clear {string} in username field")
    public void iClearInUsernameField(String letterA) {
        getDriver().findElement(By.xpath("//input[@name='username']")).clear();
    }

    @Then("error message {string}")
    public void errorMessage(String expectedMessage) {
        String actualMessage = getDriver().findElement(By.xpath("//*[@id='username-error']")).getText();
        System.out.println(actualMessage);
        assertThat(expectedMessage.equals(actualMessage)).isTrue();
    }

    @Then("error message {string} is not displayed")
    public void errorMessageIsNotDisplayed(String expectedMessage) {
        String actualMessage = getDriver().findElement(By.xpath("//*[@id='username-error']")).getText();
        System.out.println(actualMessage);
        assertThat(expectedMessage.equals(actualMessage)).isFalse();
    }



    @Then("password error message is displayed")
    public void passwordErrorMessageIsDisplayed() {
        assertThat(getDriver().findElement(By.id("password-error")).isDisplayed()).isTrue();
    }

    @Then("error message {string} is present")
    public void errorMessageIsPresent(String expectedMessage) {
        String actualMessage = getDriver().findElement(By.xpath("//*[@id='password-error']")).getText();
        System.out.println(expectedMessage.equals(actualMessage));
        assertThat(getDriver().findElement(By.xpath("//*[@id='password-error']")).isDisplayed()).isTrue();
    }


    @Then("I clear {string} in password input field")
    public void iClearInPasswordInputField(String letter1234) {
        getDriver().findElement(By.xpath("//input[@name='password']")).clear();
    }

    @Then("error message {string} is not present")
    public void errorMessageIsNotPresent(String msg) {
        assertThat(getDriver().findElement(By.id("password-error")).isDisplayed()).isFalse();
    }

    @When("I type {string} into password input field")
    public void iTypeIntoPasswordInputField(String letter12345) {
        getDriver().findElement(By.name("password")).sendKeys(letter12345);
    }

    @And("I type {string} into confirm password input field")
    public void iTypeIntoConfirmPasswordInputField(String letter54321) {
        getDriver().findElement(By.name("confirmPassword")).sendKeys(letter54321);
    }


    @Then("error message {string} should be displayed")
    public void errorMessageShouldBeDisplayed(String expectedMessage) {
        String actualMessage = getDriver().findElement(By.id("confirmPassword-error")).getText();
        System.out.println(actualMessage);
        assertThat(getDriver().findElement(By.id("confirmPassword-error")).isDisplayed()).isTrue();
    }

    @When("I clear confirm password field")
    public void iClearConfirmPasswordField() {
        getDriver().findElement(By.name("confirmPassword")).clear();
    }


    @Then("I clear {string} from password input field")
    public void iClearFromPasswordInputField(String letter12345) {
        getDriver().findElement(By.xpath("//input[@id='password']")).clear();
    }

    @Then("I click on confirm password input field")
    public void iClickOnConfirmPasswordInputField() {
        getDriver().findElement(By.name("confirmPassword")).click();
    }

    @And("confirm password field should be disabled")
    public void confirmPasswordFieldShouldBeDisabled() {
        //getDriver().findElement(By.name("//input[@id='confirmPassword'][@disabled='disabled']"));
        assertThat(getDriver().findElement(By.xpath("//input[@id='confirmPassword']")).isEnabled()).isFalse();
    }

    @When("I click on name input field")
    public void iClickOnNameInputField() {
        getDriver().findElement(By.id("name")).click();
    }

    @Then("modal window appears")
    public void modalWindowAppears() {
        getDriver().findElement(By.id("nameDialog")).isDisplayed();
    }

    @Then("I type {string} into first name field")
    public void iTypeIntoFirstNameField(String name) {
        getDriver().findElement(By.xpath("//input[@id='firstName']")).sendKeys(name);
    }

    @Then("I type {string} into last name field")
    public void iTypeIntoLastNameField(String lastName) {
        getDriver().findElement(By.xpath("//input[@id='lastName']")).sendKeys(lastName);
    }

    @And("I click on save button")
    public void iClickOnSaveButton() {
        getDriver().findElement(By.xpath("//span[text()='Save']")).click();
    }

    @Then("{string} {string} should be displayed in name input field")
    public void shouldBeDisplayedInNameInputField(String name, String lastName) {
        assertThat(getDriver().findElement(By.xpath("//input[@id='firstName']")).getText().equals(name + " " + lastName));
    }
    @Then("text {string} is displayed")
    public void textIsDisplayed(String text) {
        getDriver().findElement(By.xpath("//span[contains(text(),'I have read and accept')]")).isDisplayed();
    }

    @Then("error message {string} should be present")
    public void errorMessageShouldBePresent(String expectedMessage) {
        String actualMessage = getDriver().findElement(By.xpath("//label[@id='agreedToPrivacyPolicy-error']")).getText();
        System.out.println(expectedMessage.equals(actualMessage));
        assertThat(getDriver().findElement(By.xpath("//label[@id='agreedToPrivacyPolicy-error']")).isDisplayed());
    }


    @Then("I click checkbox")
    public void iClickCheckbox() {
        getDriver().findElement(By.name("agreedToPrivacyPolicy")).click();
    }

    @Then("error message {string} should not be displayed")
    public void errorMessageShouldNotBeDisplayed(String expectedMessage) {
        String actualMessage = getDriver().findElement(By.id("agreedToPrivacyPolicy-error")).getText();
        assertThat(actualMessage.equals(expectedMessage)).isTrue();
    }

    @Given("I open - Get a Quote")
    public void iOpenGetAQuote() {
        getDriver().get("https://skryabin.com/market/quote.html");
        System.out.println(getDriver().getTitle());
    }

    @Then("I fill out firstName {string}")
    public void iFillOutFirstName(String firstName) {
        getDriver().findElement(By.id("name")).click();
        getDriver().findElement(By.id("firstName")).click();
        getDriver().findElement(By.id("firstName")).sendKeys(firstName);

    }

    @Then("I fill out lastName {string}")
    public void iFillOutLastName(String lastName) {
        getDriver().findElement(By.id("lastName")).click();
        getDriver().findElement(By.id("lastname")).sendKeys(lastName);

    }

    @And("I click {string} button")
    public void iClickButton(String save) {
        getDriver().findElement(By.xpath("//span[text()='Save']")).click();

    }

    @Then("I check Country of Origin")
    public void iCheckCountryOfOrigin() {
        getDriver().findElement(By.name("countryOfOrigin")).click();

    }

    @And("choose country {string}")
    public void chooseCountry(String country) {
      getDriver().findElement(By.xpath("//option[contains(text(),'Japan')]")).click();
    }

    @Then("I fill out Username {string}")
    public void iFillOutUsername(String username) {
     getDriver().findElement(By.name("username")).click();
        getDriver().findElement(By.name("username")).sendKeys(username);
    }


    @Then("I fill out phone {string}")
    public void iFillOutPhone(String phone) {
        getDriver().findElement(By.name("phone")).click();
        getDriver().findElement(By.name("phone")).sendKeys(phone);
    }

    @Then("I fill out {string} field")
    public void iFillOutField(String password) {
        getDriver().findElement(By.name("password")).click();
        getDriver().findElement(By.name("password")).sendKeys(password);
    }

    @Then("I click submit form")
    public void iClickSubmitForm() {
        getDriver().findElement(By.name("formSubmit")).click();
    }

    @And("I verify that error message is displayed")
    public void iVerifyThatErrorMessageIsDisplayed() {
        assertThat(getDriver().findElement(By.id("email-error")).isDisplayed()).isTrue();
    }

    @And("message contains {string} is displayed")
    public void messageContainsIsDisplayed(String expectedError) {
    }

    @Then("I verify that error message is displayed in Confirm Password")
    public void iVerifyThatErrorMessageIsDisplayedInConfirmPassword() {
        assertThat(getDriver().findElement(By.id("confirmPassword-error")).isDisplayed()).isTrue();
    }

    @And("message contains {string} is displayed in Confirm Password")
    public void messageContainsIsDisplayedInConfirmPassword(String expectedError) {
        String actualError = getDriver().findElement(By.id("confirmPassword-error")).getText();
        System.out.println(actualError);
        assertThat(actualError.equals(expectedError)).isTrue();
    }

    @Then("I fill out email {string}")
    public void iFillOutEmail(String email) {
        getDriver().findElement(By.name("email")).click();
        getDriver().findElement(By.name("email")).sendKeys(email);
    }

    @Then("I fill out Confirm Password {string}")
    public void iFillOutConfirmPassword(String confirmPassword) {
        getDriver().findElement(By.name("confirmPassword")).sendKeys(confirmPassword);
    }

    @And("I verify that error message is displayed in Privacy Policy")
    public void iVerifyThatErrorMessageIsDisplayedInPrivacyPolicy() {
        assertThat(getDriver().findElement(By.xpath("//label[@id='agreedToPrivacyPolicy-error']")).isDisplayed());
    }

    @And("{string} is displayed")
    public void isDisplayed(String newError) {
        String actError = getDriver().findElement(By.id("agreedToPrivacyPolicy-error")).getText();
        System.out.println(actError);
        assertThat(actError.equals(newError)).isTrue();
    }

    @Then("I switch to iframe with")
    public void iSwitchToIframeWith() {
        getDriver().switchTo().frame(0);

    }

    @Then("I fill out Contact Person Name {string}")
    public void iFillOutContactPersonName(String contactPersonName) {
        getDriver().findElement(By.id("contactPersonName")).sendKeys(contactPersonName);
    }

    @Then("I fill out Contact Person Phone {string}")
    public void iFillOutContactPersonPhone(String contactPersonPhone) {

    }

    @Then("I switch back to main windows")
    public void iSwitchBackToMainWindows() {
        getDriver().switchTo().defaultContent();
    }

    @Then("I check box with Privacy Policy.")
    public void iCheckBoxWithPrivacyPolicy() {
        getDriver().findElement(By.name("agreedToPrivacyPolicy")).click();
    }

    @Then("I click submit end form")
    public void iClickSubmitEndForm() {
        getDriver().findElement(By.xpath("//button[@id='formSubmit']")).submit();
    }

    @Then("I verify that {string} is displayed")
    public void iVerifyThatIsDisplayed(String applicationResult) {
        getDriver().findElement(By.xpath("//*[@id='formSubmit']")).isDisplayed();
    }

    @Then("I verify that correct name {string} is displayed")
    public void iVerifyThatCorrectNameIsDisplayed(String username) {
        String actualUsername = getDriver().findElement(By.name("username")).getText();
        System.out.println(actualUsername);
        assertThat(actualUsername.equals(username)).isTrue();
    }

    @Then("I verify that email is displayed")
    public void iVerifyThatEmailIsDisplayed() {
        assertThat(getDriver().findElement(By.name("email")).isDisplayed());
    }

    @Then("I verify that email {string} is displayed")
    public void iVerifyThatEmailIsDisplayed(String email) {
        String actualEmail = getDriver().findElement(By.name("email")).getText();
        System.out.println(actualEmail);
        assertThat(actualEmail.equals(email)).isTrue();
    }


    @Then("error message {string} should not be present")
    public void errorMessageShouldNotBePresent(String expectedMessage) {
        assertThat(getDriver().findElement(By.xpath("//label[@id='agreedToPrivacyPolicy-error']")).isDisplayed()).isFalse();
    }


    @Then("submitted form is displayed")
    public void submittedFormIsDisplayed() {
        getDriver().findElement(By.xpath("//div[@class='well form-container container-fluid']")).isDisplayed();
    }

    @Then("username should display {string}")
    public void usernameShouldDisplay(String username) {
        getDriver().findElement(By.xpath("//span[contains(text(),'Username')]")).isDisplayed();
        assertThat(username.contains("Olesya"));
    }


    @Then("email should display {string}")
    public void emailShouldDisplay(String email) {
        getDriver().findElement(By.xpath("//span[contains(text(),'Email')]")).isDisplayed();
        assertThat(email.contains("shumolesya@yahoo.com"));
    }

    @Then("password should display {string}")
    public void passwordShouldDisplay(String password) {
        getDriver().findElement(By.xpath("//b[@name='password']")).isDisplayed();
        assertThat(password.contains("entered"));

    }

    @Then("Agreed To Policy displays {string}")
    public void agreedToPolicyDisplays(String expectedMessage) {
        String actualMessage = getDriver().findElement(By.xpath("//b[@name='agreedToPrivacyPolicy']")).getText();
        assertThat(expectedMessage.equals(actualMessage));
    }


    @And("Name displays {string}")
    public void nameDisplays(String nameValue) {
        assertThat(getDriver().findElement(By.xpath("//b[@name='name']")).isDisplayed());
        assertThat(nameValue.contains("Olesya"));
    }
}


