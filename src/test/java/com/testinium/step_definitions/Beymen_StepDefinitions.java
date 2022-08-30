package com.testinium.step_definitions;

import com.testinium.page.BeymenPage;
import com.testinium.utilities.ConfigurationReader;
import com.testinium.utilities.Driver;
import com.testinium.utilities.ExcelReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Beymen_StepDefinitions {

    //BeymenPage beymenPage = new BeymenPage();

    @When("user navigates to Beymen homepage and verify homepage landing")
    public void user_navigates_to_beymen_homepage_and_verify_homepage_landing() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
      //  String actualTitle = Driver.getDriver().getTitle();
     //   String expectedTitle ="Beymen.com - Türkiye'nin Tek Dijital Lüks Platformu";
        Assert.assertTrue(Driver.getDriver().getTitle().equals("Beymen.com - Türkiye'nin Tek Dijital Lüks Platformu"));
    }
    @Then("user type product name and delete the text again")
    public void user_type_product_name_and_delete_the_text_again() {

       // String firstItem = ExcelReader.getCell(0, 0);
      //  new BeymenPage().searchForItem(firstItem);
    }
    @Then("user type other product name and tap Enter")
    public void user_type_other_product_name_and_tap_enter() {
       // String firstItem = ExcelReader.getCell(0, 1);
      //  new BeymenPage().searchForItem(firstItem);
    }
    @Then("From the listed items user clicked on any product")
    public void from_the_listed_items_user_clicked_on_any_product() {

    }
    @Then("user selected the size on the item page")
    public void user_selected_the_size_on_the_item_page() {

    }
    @Then("user clicked on add chart button")
    public void user_clicked_on_add_chart_button() {

    }
    @Then("prices should be same on the item's page and shopping chart")
    public void prices_should_be_same_on_the_item_s_page_and_shopping_chart() {

    }
    @Then("user change the amount to two")
    public void user_change_the_amount_to_two() {

    }
    @Then("user clicked on delete chart button to delete all the items from the chart")
    public void user_clicked_on_delete_chart_button_to_delete_all_the_items_from_the_chart() {

    }
    @Then("user check the empty chart")
    public void user_check_the_empty_chart() {

    }

}
