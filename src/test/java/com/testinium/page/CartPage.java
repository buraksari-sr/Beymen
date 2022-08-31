package com.testinium.page;

import com.testinium.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CartPage {

    public CartPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "((//span[@class='o-header__userInfo--text'])[3])/parent::a")
    private WebElement shoppingCart;

    @FindBy(id = "quantitySelect0-key-0")
    private WebElement dropDown;

    @FindBy(xpath = "//ins[@class='m-price__new']")
    private WebElement price;

    @FindBy(xpath = "//button[@class='m-basket__remove btn-text']")
    private WebElement deleteButton;

    @FindBy(xpath = "//strong[.='Sepetinizde Ürün Bulunmamaktadır']")
    private WebElement deleteMessage;

    public String getPrice() {
        return price.getText();
    }

    public int getItemAmount() {
        Select select = new Select(dropDown);
        System.out.println("select.getOptions().size() = " + select.getOptions().size());
        return select.getOptions().size();
    }

    public void selectAmount(int i) {
        Select select = new Select(dropDown);
        select.selectByValue("2");
    }


    public void addChart() {
        this.shoppingCart.click();
    }

    public void deleteItems() {
        deleteButton.click();
    }

    public String getDeletedMessage() {
        return deleteMessage.getText();
    }
}
