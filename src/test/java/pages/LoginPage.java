package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigurationReader;
import utilities.Driver;



public class LoginPage extends PageBase {
    public LoginPage() {
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(name="USER_LOGIN")
    private WebElement userName;

    @FindBy(name="USER_PASSWORD")
    private WebElement password;



    @FindBy(className = "login-btn")
    private WebElement loginButton;

    public  void login(){
       userName.clear();
        password.clear();

        userName.sendKeys(ConfigurationReader.get("user_name"));
        password.sendKeys(ConfigurationReader.get("password"));
        loginButton.click();

    }

}
