package com.amazon.testsuite;

import com.amazon.pages.AddToCartPage;
import com.amazon.pages.FindYourProductPage;
import com.amazon.pages.HomePage;
import com.amazon.pages.SelectedProductPage;
import com.amazon.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class LaptopTest extends TestBase {

    HomePage homePage;
    FindYourProductPage findYourProductPage;
    SelectedProductPage selectedProductPage;
    AddToCartPage addToCartPage;


    @BeforeMethod
    public void init() {
        homePage = new HomePage();
        findYourProductPage = new FindYourProductPage();
        selectedProductPage = new SelectedProductPage();
        addToCartPage = new AddToCartPage();
    }


    @Test
    @Parameters({"search1", "description1", "quantity1", "message1" })
    public void userShouldBeAbleToPurchaseLaptopSuccessfully(String lSearch, String lDescription, String lQuantity, String lMessage) throws InterruptedException {
        homePage.enterDataInTheSearchBox(lSearch);
        homePage.clickOnTheSearchButton();
        findYourProductPage.findSelection(lDescription);
        selectedProductPage.selectQuantity(lQuantity);
        selectedProductPage.addItemToCart();
        addToCartPage.verifyTheAddToCartMessage(lMessage);
    }

}
