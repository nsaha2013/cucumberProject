package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MymobilePage extends Page {
    public MymobilePage(WebDriver driver) {
        super(driver, "O2 | My device");
    }

    @FindBy(id = "mainTab")
    private WebElement myo2button;

    public Page clickMyo2Button(){
        clickButton(myo2button);
        return PageFactory.initElements(driver, DashboardPage.class);
    }





}
