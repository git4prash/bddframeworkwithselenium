package stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import data.ContactUsDataGenerator;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.ContactUsPage;

import static config.Hooks.driver;

public class ContactUsActions {
    private ContactUsPage contactUsPage= new ContactUsPage();
    private ContactUsDataGenerator contactUsDataGenerator= new ContactUsDataGenerator();

    @Then("^verify that the Contact Us page is displayed$")
    public void verify_that_the_Contact_Us_page_is_displayed() {
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[contains(.,'Contact us')]")));

        Assert.assertEquals(contactUsPage.contactUsPageHeader.getText(), "Contact us");
    }

    @And("^User should be able to enter details into the contact form$")
    public void user_should_be_able_to_enter_details_into_the_contact_form() {
        enterFirstName();
        enterLasttName();
        enterPhoneNumber();
        enterEmail();
        enterWebsite();
        enterCompanyName();
        enterOption();
    }

    private void enterFirstName(){
        String firstName=contactUsDataGenerator.generateFirstName();

        contactUsPage.firstName.sendKeys(firstName);
    }

    private void enterLasttName(){
        String lastName=contactUsDataGenerator.generateLastName();

        contactUsPage.lastName.sendKeys(lastName);
    }

    private void enterPhoneNumber(){
        String phoneNumber=contactUsDataGenerator.generatePhoneNumber();

        contactUsPage.phoneNumber.sendKeys(phoneNumber);
    }

    private void enterEmail(){
        String email=contactUsDataGenerator.generateEmail();

        contactUsPage.emailAddress.sendKeys(email);
    }

    private void enterWebsite(){
        String website=contactUsDataGenerator.generateWebsite();

        contactUsPage.websiteUrl.sendKeys(website);
    }

    private void enterCompanyName(){
        String companyName=contactUsDataGenerator.generateCompanyName();

        contactUsPage.companyName.sendKeys(companyName);
    }

    private void enterOption(){
        int option=contactUsDataGenerator.selectOptionIndex();

        Select reasonDropDown=new Select(contactUsPage.reasonForEnquiry);

        reasonDropDown.selectByIndex(option);
    }
}
