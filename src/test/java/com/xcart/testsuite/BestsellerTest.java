package com.xcart.testsuite;

import com.xcart.pages.Bestseller;
import com.xcart.pages.HotDeal;
import com.xcart.testbase.TestBase;
import org.junit.Assert;
import org.testng.annotations.Test;

public class BestsellerTest extends TestBase {

    HotDeal hotDeal = new HotDeal();
    Bestseller bestseller = new Bestseller();

    @Test
    public void verifyThatUserShouldClearShoppingCartSuccessfully() throws InterruptedException {
        hotDeal.mouseHoverOnHotDealButton();
        hotDeal.clickOnBestSellerButton();

        String expectedText1 = "Bestsellers";
        bestseller.ActualTextInBestSellerPage();
        Assert.assertEquals("Bestsellers Text did not match", expectedText1, bestseller.ActualTextInBestSellerPage());

        bestseller.MouseHoverOnSortedProduct();
        bestseller.productSortedByAtoZ();
        bestseller.ClickOnVinylGhost();

        String expectedMsg = "Product has been added to your cart";
        bestseller.ActualMSGafterProductAddedInCart();
        Assert.assertEquals("Message did not match", expectedMsg, bestseller.ActualMSGafterProductAddedInCart());

        bestseller.ClickToClosePopUpMSG();
        Thread.sleep(1000);
        bestseller.ClickOnCartIcon();
        Thread.sleep(1000);
        bestseller.ClickOnViewCartButton();

        String expectedCartItem = "Your shopping cart - 1 item";
        bestseller.VerifyActualcartItemText();
        Assert.assertEquals("Item Message did not match", expectedCartItem, bestseller.VerifyActualcartItemText());

        bestseller.clickOnEmptyCartButton();

        String expectedPopUp = "Are you sure you want to clear your cart?";
        String actualPopUp = getTextFromAlert();
        bestseller.alertPopUpAccept();

        String expectedDeleteMsg = "Item(s) deleted from your cart";
        bestseller.actualTextAfterDeleteCart();
        Assert.assertEquals("Item is not deleted from cart", expectedDeleteMsg, bestseller.actualTextAfterDeleteCart());

        bestseller.ClosePopUp();

        String expectedEmptyMsg = "Your cart is empty";
        bestseller.actualTextWhileCartisEmpty();
        Assert.assertEquals("cart not empty", expectedEmptyMsg, bestseller.actualTextWhileCartisEmpty());


    }


}
