package Test;

import Steps.LoginStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Steps;

public class Login {
    @Steps
    LoginStep loginStep;

    @Given("I am on the login page")
    public void givenIamOnLoginPage() {
        loginStep.UserOpenSauceDemoLoginPage();
    }

    @When("I input the correct credentials")
    public void whenOpenCorrectCreds() {
        loginStep.InputUsernameAndPassword("standard_user", "secret_sauce");
    }

    @Then("I could login successfully")
    public void thenCouldLoginSuccessfully() {
        loginStep.CanLoginSuccessfully();
    }
}
