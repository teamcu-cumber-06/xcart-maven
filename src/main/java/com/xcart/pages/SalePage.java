package com.xcart.pages;

import com.xcart.utility.Utility;
import org.openqa.selenium.By;

public class SalePage extends Utility {

    By mouseHoverOnSortBy = By.xpath("//span[@class='sort-by-value']");
    By ClickOnAtoZ = By.partialLinkText("Name A -");
    By ClickOnZtoA = By.partialLinkText("Name Z -");
    By ClickOnPriceLowToHigh = By.partialLinkText("Price Low - Hi");
    By ClickOnPriceHighToLow = By.partialLinkText("Price High - L");
    By ClickOnRates=By.partialLinkText("Rates");
    By actualMSG= By.id("page-title");



    public void verifySaleProductArrangeAlphabetically() {
        mouseHoverToElement(mouseHoverOnSortBy);
        clickOnElement(ClickOnAtoZ);
    }

    public void verifySaleProductArrangeDescendingOrder() {
        mouseHoverToElement(mouseHoverOnSortBy);
        clickOnElement(ClickOnZtoA);
    }

    public void verifySaleProductArrangeLowToHigh() {
        mouseHoverToElement(mouseHoverOnSortBy);
        clickOnElement(ClickOnPriceLowToHigh);
    }

    public void verifySaleProductArrangeHighToLow() {
        mouseHoverToElement(mouseHoverOnSortBy);
        clickOnElement(ClickOnPriceHighToLow);
    }

    public void verifySaleProductArrangeRate(){
        mouseHoverToElement(mouseHoverOnSortBy);
        clickOnElement(ClickOnRates);
    }

    public String verifyActualTextMessage(){
       return getTextFromElement(actualMSG);
    }


}
