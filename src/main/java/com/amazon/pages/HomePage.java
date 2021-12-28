package com.amazon.pages;

import com.amazon.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage extends Utility {

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy (id = "twotabsearchtextbox")
    WebElement searchBox;

    @CacheLookup
    @FindBy (id = "nav-search-submit-button")
    WebElement searchButton;

    public void enterDataInTheSearchBox(String searchData){
        pmSendTextToElement(searchBox, searchData);
        Reporter.log("Entering data in the search box :" + searchData + "<br>");

    }

    public void clickOnTheSearchButton(){
        pmClickOnElement(searchButton);
        Reporter.log("Clicking on the search button :" + searchButton.toString() + "<br>");

    }




}
