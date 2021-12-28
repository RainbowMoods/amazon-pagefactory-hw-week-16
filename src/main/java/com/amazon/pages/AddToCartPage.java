package com.amazon.pages;

import com.amazon.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class AddToCartPage extends Utility {

    public AddToCartPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Added to Cart')]")
    WebElement addToCartConfirmationMessage;

    public void verifyTheAddToCartMessage(String message) throws InterruptedException {
        //pmWaitUntilVisibilityOfElementLocated(By.linkText("Added to Cart"), 30);
        String actualMessage = pmGetTextFromElement(addToCartConfirmationMessage);
        Thread.sleep(5000);
        pmVerifyElements(actualMessage,message , "Incorrect Message");
        Reporter.log("Verifying the Added To Cart Message :" + message);


    }
}
