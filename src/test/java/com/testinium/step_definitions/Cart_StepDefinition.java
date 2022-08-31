package com.testinium.step_definitions;

import com.testinium.page.CartPage;
import com.testinium.page.ItemPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;


public class Cart_StepDefinition {

    ItemPage itemPage = new ItemPage();
    CartPage cartPage = new CartPage();

    @Then("prices should be same on the item's page and shopping chart")
    public void prices_should_be_same_on_the_item_s_page_and_shopping_chart() {
        String actualPrice = cartPage.getPrice();
        String expectedPrice = itemPage.getPrice();
        Assert.assertEquals("Prices are equal:",expectedPrice,actualPrice);
    }

    @Then("user change the amount to two")
    public void user_change_the_amount_to_two() throws InterruptedException {
        Thread.sleep(5000);
        cartPage.addChart();
        int actualAmount = cartPage.getItemAmount();
        Assert.assertTrue("Amount is more than 1",actualAmount>=2);
        cartPage.selectAmount(2);

    }

    @Then("user clicked on delete chart button to delete all the items from the chart")
    public void user_clicked_on_delete_chart_button_to_delete_all_the_items_from_the_chart() {
        cartPage.deleteItems();
    }

    @Then("user check the empty chart")
    public void user_check_the_empty_chart() {
        String actualMessage =cartPage.getDeletedMessage();
        String expectedMessage ="SEPETINIZDE ÜRÜN BULUNMAMAKTADIR";
        Assert.assertEquals(expectedMessage,actualMessage);
    }

}
