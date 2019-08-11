package stepDefinition;

import cucumber.api.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static config.Hooks.driver;

public class SearchActions {
    @And("^user searches for securepay on google$")
    public void user_searches_for_securepay_on_google(){

        driver.get("https://www.google.com.au");

        WebElement search = driver.findElement(By.xpath("//input[@name=\"q\"]"));

        search.sendKeys("secure pay");

        search.submit();

    }

    @And("^clicks through to securepay website$")
    public void clicks_through_to_SecurePay_website(){

        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.id("resultStats")));

        WebElement website = driver.findElement(By.xpath("//h3[contains(.,'SecurePay online payment and eCommerce solutions for businesses')]"));

        website.click();

    }
}
