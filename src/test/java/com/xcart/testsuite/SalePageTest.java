package com.xcart.testsuite;

import com.xcart.pages.HotDeal;
import com.xcart.pages.SalePage;
import com.xcart.testbase.TestBase;
import org.junit.Assert;
import org.testng.annotations.Test;

public class SalePageTest extends TestBase {

    HotDeal hotDeal = new HotDeal();
    SalePage salePage = new SalePage();

    @Test
    public void verifySaleProductsArrangeAlphabetically() throws InterruptedException {
        hotDeal.mouseHoverOnHotDealButton();
        Thread.sleep(1000);
        hotDeal.clickOnSaleButton();
        String expectedMsg = "Sale";
        salePage.verifyActualTextMessage();
        Assert.assertEquals("USER IS UNABLE TO REACH ", expectedMsg, salePage.verifyActualTextMessage() );
        salePage.verifySaleProductArrangeAlphabetically();


    }

    @Test
    public void verifySaleProductArrangeDescendingOrder() {
        hotDeal.mouseHoverOnHotDealButton();
        hotDeal.clickOnSaleButton();
        String expectedMsg = "Sale";
        salePage.verifyActualTextMessage();
        Assert.assertEquals("USER IS UNABLE TO REACH ", expectedMsg, salePage.verifyActualTextMessage() );
        salePage.verifySaleProductArrangeDescendingOrder();

    }

    @Test
    public void verifySaleProductArrangeLowToHigh() {
        hotDeal.mouseHoverOnHotDealButton();
        hotDeal.clickOnSaleButton();
        String expectedMsg = "Sale";
        salePage.verifyActualTextMessage();
        Assert.assertEquals("USER IS UNABLE TO REACH ", expectedMsg, salePage.verifyActualTextMessage() );
        salePage.verifySaleProductArrangeLowToHigh();
    }

    @Test
    public void verifySaleProductArrangeHighToLow() {
        hotDeal.mouseHoverOnHotDealButton();
        hotDeal.clickOnSaleButton();
        String expectedMsg = "Sale";
        salePage.verifyActualTextMessage();
        Assert.assertEquals("USER IS UNABLE TO REACH ", expectedMsg, salePage.verifyActualTextMessage() );
        salePage.verifySaleProductArrangeHighToLow();
    }

    @Test
    public void verifySaleProductArrangeByRate(){
        hotDeal.mouseHoverOnHotDealButton();
        hotDeal.clickOnSaleButton();
        String expectedMsg = "Sale";
        salePage.verifyActualTextMessage();
        Assert.assertEquals("USER IS UNABLE TO REACH ", expectedMsg, salePage.verifyActualTextMessage() );
        salePage.verifySaleProductArrangeRate();

    }

}
