package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SignInPage extends Page {
    public SignInPage(WebDriver driver) {
        super(driver, "O2 | Accounts | Sign in | View bills , balances and emails in your My O2 account");
    }


    @FindBy(id="username")
    private WebElement username;

    @FindBy(id="password")
    private WebElement password;

    @FindBy(id="signInButton")
    private WebElement signinButton;



    public void enterUsername(String usernametext){
        enterText(username,usernametext);
    }

    public void enterPassword(String passwordtext){
        enterText(password,passwordtext);
    }

    public Page clickSigninButton(){
        clickButton(signinButton);
        return PageFactory.initElements(driver, MymobilePage.class);

    }




}
