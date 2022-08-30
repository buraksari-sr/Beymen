package com.testinium.page;

import com.testinium.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BeymenPage {
    public BeymenPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = ".default-input")
    private WebElement searchBox;

    @FindBy(xpath = "//span[normalize-space(text()) = 'Slim Fit Lacivert Poplin Gömlek']")
    public WebElement anyProduct;

    @FindBy(xpath = "//*[.=\"XXL\"]")
    public WebElement productSize;





    public void searchForItem(String item) {
        searchBox.sendKeys(Keys.DELETE);
        searchBox.sendKeys(item);
        searchBox.sendKeys(Keys.ENTER);
    }
}
