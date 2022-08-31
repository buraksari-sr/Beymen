package com.testinium.page;

import com.testinium.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class BeymenPage {
    public BeymenPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = ".default-input")
    private WebElement searchBox;

    public void clickRandomItem() {
        List<WebElement> elements = Driver.getDriver().findElements(By.xpath("//span[@class='m-productCard__desc']"));
        int min = 0;
        int max = elements.size();
        int a = (int) (Math.random() * (max - min + 1) + min);
        elements.get(a).click();
    }

    public void searchForItem(String item) {
        searchBox.sendKeys(Keys.DELETE);
        searchBox.sendKeys(item);
    }

    public WebElement getSearchBox() {
        return searchBox;
    }

}
