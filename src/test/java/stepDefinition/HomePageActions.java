package stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.HomePage;

public class HomePageActions {
    private HomePage homePage = new HomePage();

    @And("^User is redirected to the SecurePay homepage$")
    public void user_is_redirected_to_the_SecurePay_homepage(){

        String homePageTitle = homePage.validateHomePageTitle();

        Assert.assertEquals(homePageTitle,"SecurePay online payment and eCommerce solutions for businesses");

    }

    @When("^User Navigates to Contact Us page$")
    public void user_Navigates_to_Contact_Us_page() {

        homePage.navigateToContactUs();

    }
}
