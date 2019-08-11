package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static config.Hooks.driver;

public class ContactUsPage {
    @FindBy(xpath = "//input[@name=\"first-name\"]")
    public WebElement firstName;

    @FindBy(xpath = "//input[@name=\"last-name\"]")
    public WebElement lastName;

    @FindBy(xpath = "//input[@name=\"email-address\"]")
    public WebElement emailAddress;

    @FindBy(xpath = "//input[@name=\"phone-number\"]")
    public WebElement phoneNumber;

    @FindBy(xpath = "//input[@name=\"business-name\"]")
    public WebElement companyName;

    @FindBy(xpath = "//input[@name=\"website-url\"]")
    public WebElement websiteUrl;

    @FindBy(xpath = "//*[@name=\"reason-for-enquiry\"]")
    public WebElement reasonForEnquiry;

    @FindBy(xpath = "//h1")
    public WebElement contactUsPageHeader;

    public ContactUsPage(){
        PageFactory.initElements(driver, this);
    }



}
