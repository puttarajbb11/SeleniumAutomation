package Selenium.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(xpath = "//input[@id='email' and @data-validate='isEmail']")
    private WebElement username;

    @FindBy(xpath = "//input[@id='passwd' and @data-validate='isPasswd']")
    private WebElement password;

    @FindBy(xpath = "//button[@id=\"SubmitLogin\"]")
    private WebElement loginButton;

    @FindBy(xpath = "//input[@id='email' and @name='user[email]']")
    public WebElement emailField;


    // Constructor to initialize elements
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    // Page Methods
    public void login(String user, String pass) {
        username.sendKeys(user);
        password.sendKeys(pass);
        loginButton.click();
    }


}
