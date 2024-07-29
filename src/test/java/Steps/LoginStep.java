package Steps;

import Pages.LoginPage;
import net.thucydides.core.steps.ScenarioSteps;

public class LoginStep extends ScenarioSteps {
    LoginPage loginPage;

    public void UserOpenSauceDemoLoginPage(){
        loginPage.open();
    }

    public void InputUsernameAndPassword(String username, String password){
        loginPage.InputUsernameAndPassword(username,password);
    }

    public void CanLoginSuccessfully() {
        loginPage.LoginSuccess();
    }
}
