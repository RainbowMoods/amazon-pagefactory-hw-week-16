package com.amazon.pages;

import com.amazon.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class SelectedProductPage extends Utility {
    public SelectedProductPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy (id = "quantity")
    WebElement quantityBox;

    @CacheLookup
    @FindBy(id = "add-to-cart-button")
    WebElement addToCartButton;

    public void selectQuantity(String quantity){
        pmSelectByValueFromDropDown(quantityBox, quantity);
        Reporter.log("Selecting quantity :" + quantity);

    }

    public void addItemToCart(){
        pmClickOnElement(addToCartButton);
        Reporter.log("Click on the add to cart button :" + addToCartButton + "<br>");

    }

}
