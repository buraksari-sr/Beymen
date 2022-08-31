package com.testinium.step_definitions;

import com.testinium.page.BeymenPage;
import com.testinium.utilities.ConfigurationReader;
import com.testinium.utilities.Driver;
import com.testinium.utilities.ExcelReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;


public class Beymen_StepDefinitions {

    BeymenPage beymenPage = new BeymenPage();

    @When("user navigates to Beymen homepage and verify homepage landing")
    public void user_navigates_to_beymen_homepage_and_verify_homepage_landing() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Beymen.com – Türkiye’nin Tek Dijital Lüks Platformu";
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @Then("user type product name and delete the text again")
    public void user_type_product_name_and_delete_the_text_again() {
        String firstItem = ExcelReader.getCell(0, 0);
        beymenPage.searchForItem(firstItem);
        for (int i = 0; i < firstItem.length(); i++) {
            beymenPage.getSearchBox().sendKeys(Keys.BACK_SPACE);
        }
    }

    @Then("user type other product name and tap Enter")
    public void user_type_other_product_name_and_tap_enter() {
        String firstItem = ExcelReader.getCell(0, 1);
        beymenPage.searchForItem(firstItem + Keys.ENTER);
    }

    @Then("From the listed items user clicked on any product")
    public void from_the_listed_items_user_clicked_on_any_product() {
        beymenPage.clickRandomItem();
    }


}
