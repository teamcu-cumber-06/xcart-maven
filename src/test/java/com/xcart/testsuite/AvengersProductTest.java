package com.xcart.testsuite;

import com.xcart.pages.AvengersPage;
import com.xcart.pages.HotDeal;
import com.xcart.pages.SalePage;
import com.xcart.testbase.TestBase;
import org.junit.Assert;
import org.testng.annotations.Test;

public class AvengersProductTest extends TestBase {
    HotDeal hotDeal = new HotDeal();
    SalePage salePage = new SalePage();
    AvengersPage avengersPage = new AvengersPage();


    @Test
    public void verifyUserShouldPlaceOrderOfAvengersProduct() throws InterruptedException {
        hotDeal.mouseHoverOnHotDealButton();
        hotDeal.clickOnSaleButton();
        String expectedMsg = "Sale";
        salePage.verifyActualTextMessage();
        Assert.assertEquals("USER IS UNABLE TO REACH ", expectedMsg, salePage.verifyActualTextMessage());
        salePage.verifySaleProductArrangeAlphabetically();
        Thread.sleep(1000);
        avengersPage.clickOnAddToCartButton();

        String expectedmsg = "Product has been added to your cart";
        avengersPage.verifyActualTextMessage();
        Assert.assertEquals("Product not shipped in cart", expectedmsg, avengersPage.verifyActualTextMessage());
        avengersPage.closeMsg();
        Thread.sleep(1000);
        avengersPage.clickOnCartIcon();
        avengersPage.clickOnViewCart();
        String expectedmsgincart = "Your shopping cart - 1 item";
        avengersPage.verifyOneProductAddedText();
        Assert.assertEquals("Item is not in cart", expectedmsgincart, avengersPage.verifyOneProductAddedText());
        avengersPage.setQuantityTo2();                //Change the quantity=2

        String ChangedQTexpectedText = "Your shopping cart - 2 items";              //1.11 Verify the text “Your shopping cart - 2 items
        avengersPage.VerifychangeQuntitytext();
        org.testng.Assert.assertEquals(ChangedQTexpectedText, avengersPage.VerifychangeQuntitytext(), "Change Quantity Text Not found");

//        String expectedSubTotal = "Subtotal: $29.98";
//        avengersPage.verifyActualSubtotal();
//        Assert.assertEquals(expectedSubTotal,avengersPage.verifyActualSubtotal());

        String expectedTotal = "$32.88";
        avengersPage.verifyActualtotal();
        Assert.assertEquals(expectedTotal, avengersPage.verifyActualtotal());

        avengersPage.ClickOnCheckOutButton();     //click on checkout button
        String expectedVerify = "Log in to your account";
        avengersPage.expectedTextAfterClickOnCheckOut();
        Assert.assertEquals("Log in your account text failed", expectedVerify, avengersPage.expectedTextAfterClickOnCheckOut());

        avengersPage.EnterYourEmailId();
        avengersPage.ClickOnContinueButton();

        String expectedSecure = "Secure Checkout";
        avengersPage.actualSecureText();
        Assert.assertEquals("Secure checkout is failed", expectedSecure, avengersPage.actualSecureText());

        //fill all the mandatory fields
        avengersPage.EnterYourFirstName();
        avengersPage.EnterYourLastName();
        avengersPage.EnterYourStreetName();
        avengersPage.EnterYourCity();
        avengersPage.EnterYourCountry();
        avengersPage.EnterYourState();
        avengersPage.EnterYourZipcode();
        avengersPage.ClickOnLocalShipping();
        avengersPage.ClickOnCOD();

        String expectedLastTotal = "$33.95";
        avengersPage.actualLastTotalVerify();
        Assert.assertEquals("Last Total not matched", expectedLastTotal, avengersPage.actualLastTotalVerify());

        avengersPage.clickOnPlaceOrderButton();

        String expectedThankmsg = "Thank you for your order";
        avengersPage.actualThankYouText();
        Assert.assertEquals("Thank you for your order page not found", expectedThankmsg, avengersPage.actualThankYouText());




    }


}
