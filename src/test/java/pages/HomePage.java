package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static config.Hooks.driver;

public class HomePage {

    @FindBy(xpath = "//a[contains(@data-description,'Support:Contact Us') and (@data-category='footer:li')]")

    WebElement contactUs;

    public HomePage(){
        PageFactory.initElements(driver, this);
    }

    public String validateHomePageTitle(){
        return driver.getTitle();
    }

    public void navigateToContactUs(){
        HomePage homePage = new HomePage();

        homePage.contactUs.click();
    }
}
