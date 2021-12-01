package com.xcart.pages;

import com.xcart.utility.Utility;
import org.openqa.selenium.By;

public class HotDeal extends Utility {

    By hotDealLink = By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[@class='primary-title'][normalize-space()='Hot deals']");
    By saleLink = By.xpath("//li[@class='leaf has-sub']//li[1]//a[1]");
    By BestsellersLink = By.xpath("(//span[contains(text(),'Bestsellers')])[2]");



    public void mouseHoverOnHotDealButton() {
        mouseHoverToElement(hotDealLink);
    }

    public void clickOnSaleButton() {
        clickOnElement(saleLink);
    }

    public void clickOnBestSellerButton() {
        clickOnElement(BestsellersLink);
    }


}