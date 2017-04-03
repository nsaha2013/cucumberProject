package Steps;

import Helper.Hooks;
import Pages.DashboardPage;
import Pages.MymobilePage;
import Pages.Page;
import Pages.SignInPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class SignInSteps {
    WebDriver driver;
    SignInPage signinpage;
    Page mymobilepage;
    Page dashboardPage;


    @Given("^I navigate to \"([^\"]*)\"$")
    public void i_navigate_to(String url) throws Throwable {
        driver= Hooks.driver;
        signinpage= PageFactory.initElements(driver,SignInPage.class);
    }

    @When("^I enter username as \"([^\"]*)\"$")
    public void i_enter_username_as(String username) throws Throwable {
        signinpage.enterUsername(username);
    }

    @When("^I enter password as \"([^\"]*)\"$")
    public void i_enter_password_as(String password) throws Throwable {
        signinpage.enterPassword(password);
    }

    @When("^I click on sigin button$")
    public void i_click_on_sigin_button() throws Throwable {
        mymobilepage = signinpage.clickSigninButton();
    }

    @Then("^I should be currently on \"([^\"]*)\"$")
    public void i_should_be_currently_on(String title) throws Throwable {
        assertThat(mymobilepage.getPageTitle().equalsIgnoreCase(title),is(true));
    }


}
