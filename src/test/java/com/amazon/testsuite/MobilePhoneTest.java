package com.amazon.testsuite;

import com.amazon.pages.AddToCartPage;
import com.amazon.pages.FindYourProductPage;
import com.amazon.pages.HomePage;
import com.amazon.pages.SelectedProductPage;
import com.amazon.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MobilePhoneTest extends TestBase {

    HomePage homePage;
    FindYourProductPage findYourProductPage;
    SelectedProductPage selectedProductPage;
    AddToCartPage addToCartPage;


    @BeforeMethod
    public void init1() {
        homePage = new HomePage();
        findYourProductPage = new FindYourProductPage();
        selectedProductPage = new SelectedProductPage();
        addToCartPage = new AddToCartPage();
    }

    @Test
    @Parameters({"search2", "description2", "quantity2", "message2" })
    public void userShouldBeAbleToPurchaseMobilePhoneSuccessfully(String mSearch, String mDescription, String mQuantity, String mMessage) throws InterruptedException {
        homePage.enterDataInTheSearchBox(mSearch);
        homePage.clickOnTheSearchButton();
        findYourProductPage.findSelection(mDescription);
        selectedProductPage.selectQuantity(mQuantity);
        selectedProductPage.addItemToCart();
        addToCartPage.verifyTheAddToCartMessage(mMessage);
    }
}
