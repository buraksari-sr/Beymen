package com.testinium.page;

import com.testinium.utilities.Driver;
import com.testinium.utilities.WriteToText;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


public class ItemPage {

    public ItemPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "priceNew")
    private WebElement productPrice;

    @FindBy(id = "addBasket")
    private WebElement addChart;

    @FindBy(xpath = "//span[@class='o-productDetail__description']")
    private WebElement productDetail;

    @FindAll({
            @FindBy(xpath = "//span[@class='m-variation__item']"),
            @FindBy(xpath = "//span[@class='m-variation__item -criticalStock']"),

    })
    private List<WebElement> sizes;

    public void selectSize() {
        if (sizes.size() == 0) {
            Driver.getDriver().navigate().back();
            new BeymenPage().clickRandomItem();
            selectSize();
        }
        sizes.get(0).click();
    }

    public String getPrice() {
        String price = productPrice.getText();
        WriteToText.writeToFile("Fiyat= " + price);
        return price;
    }

    public String getDetail() {
        String detail = productDetail.getText();
        WriteToText.writeToFile("Ürün Bilgisi= " + detail);
        return detail;
    }

    public void addChart(){
        this.addChart.click();
    }
}