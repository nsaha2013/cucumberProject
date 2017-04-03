package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.util.concurrent.TimeUnit;

public abstract class Page {
    protected WebDriver driver;

    public Page(WebDriver driver, String pagetitle) {
        this.driver=driver;
        Wait wait = new FluentWait(driver)
                .withTimeout(60, TimeUnit.SECONDS)
                .pollingEvery(2, TimeUnit.SECONDS);

        wait.until(ExpectedConditions.titleIs(pagetitle));
    }

    protected void enterText(WebElement element,String text){
        element.sendKeys(text);
    }

    protected void clickButton(WebElement element){
        element.click();
    }


    public String getPageTitle(){
        return driver.getTitle();
    }
}
