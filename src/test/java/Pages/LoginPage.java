package Pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class LoginPage extends PageObject {
    @FindBy(xpath = "//input[@id='user-name']")
    WebElement username_field;

    @FindBy(xpath = "//input[@id='password']")
    WebElement password_field;

    @FindBy(xpath = "//input[@id='login-button']")
    WebElement login_btn;

    @FindBy(xpath =  "//span[@class='title' and @data-test='title']")
    WebElement product_title;

    public void InputUsernameAndPassword(String username, String password){
        username_field.sendKeys(username);
        password_field.sendKeys(password);
        login_btn.click();
    }

    public void LoginSuccess() {
        product_title.isDisplayed();
    }
}
