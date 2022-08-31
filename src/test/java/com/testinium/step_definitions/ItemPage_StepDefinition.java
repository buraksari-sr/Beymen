package com.testinium.step_definitions;


import com.testinium.page.ItemPage;
import io.cucumber.java.en.Then;

public class ItemPage_StepDefinition {

    ItemPage itemPage = new ItemPage();

    @Then("user save product info in txt file")
    public void user_save_product_info_in_txt_file() {
        itemPage.getPrice();
        itemPage.getDetail();
    }

    @Then("user selected the size on the item page and click cart button")
    public void user_selected_the_size_on_the_item_page() {
        itemPage.selectSize();
        itemPage.addChart();
    }

}
