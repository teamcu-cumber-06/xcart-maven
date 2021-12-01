package com.xcart.pages;

import com.xcart.utility.Utility;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class Bestseller extends Utility {

    By ActualTextatbestsellerPage = By.xpath("//h1[text()='Bestsellers']");
    By SortedBy = By.xpath("//span[@class='sort-by-value']");
    By AtoZorder = By.partialLinkText("Name A -");
    By MouseHoverOnProduct = By.xpath("//div[@class='product productid-13 ']");
    By ClickOnProduct = By.xpath("//div[@class='product productid-13 ']//div[@class='add-to-cart-button']");
    By ActualMsgAfterProductaddin = By.xpath("//li[(text()='Product has been added to your cart')]");
    By Closemsg = By.xpath("//a[@class='close']");
    By CartIcon = By.xpath("//div[@title='Your cart']");
    By ViewCart = By.xpath("//a[@class='regular-button cart']");
    By actualCartItemText = By.xpath("//h1[@id='page-title']");
    By EmptyCartButton = By.xpath("//a[contains(text(),'Empty your cart')]");
//    By AlertMsg=By.xpath("//a[contains(text(),'Empty your cart')]");
    By actualDeleteMsg=By.xpath("//li[text()='Item(s) deleted from your cart']");
    By ClosePopup = By.xpath("//a[@class='close']");
    By actualEmptyMsg= By.xpath("//h1[text()='Your cart is empty']");




    public String ActualTextInBestSellerPage() {
        return getTextFromElement(ActualTextatbestsellerPage);
    }

    public void MouseHoverOnSortedProduct() {
        mouseHoverToElement(SortedBy);
    }

    public void productSortedByAtoZ() {
        clickOnElement(AtoZorder);
    }

    public void ClickOnVinylGhost() {
        mouseHoverToElement(MouseHoverOnProduct);
        clickOnElement(ClickOnProduct);
    }

    public String ActualMSGafterProductAddedInCart() {
        return getTextFromElement(ActualMsgAfterProductaddin);
    }

    public void ClickToClosePopUpMSG() {
        clickOnElement(Closemsg);
    }

    public void ClickOnCartIcon() {
        clickOnElement(CartIcon);
    }

    public void ClickOnViewCartButton() {
        clickOnElement(ViewCart);
    }

    public String VerifyActualcartItemText() {
        return getTextFromElement(actualCartItemText);

    }
    public void clickOnEmptyCartButton(){
        clickOnElement(EmptyCartButton);
        Alert alert=driver.switchTo().alert();
    }
    public void alertPopUpAccept(){
        acceptAlert();
    }
    public String actualTextAfterDeleteCart(){
        return getTextFromElement(actualDeleteMsg);
    }
    public void ClosePopUp(){
        clickOnElement(ClosePopup);
    }
    public String actualTextWhileCartisEmpty(){
        return getTextFromElement(actualEmptyMsg);
    }



}
