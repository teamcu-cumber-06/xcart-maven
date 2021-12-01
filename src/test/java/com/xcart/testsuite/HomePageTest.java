package com.xcart.testsuite;

import com.xcart.pages.HomePageXcart;
import com.xcart.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {
    HomePageXcart homePage = new HomePageXcart();


    @Test
    public void verifyUserShouldNavigateToShippingPageSuccessfully() throws InterruptedException {

        homePage.clickOnShippingLink();
        String expectedMsg = "Shipping";
        String actualMsg = getTextFromElement(By.id("page-title"));
        Thread.sleep(1000);
        org.testng.Assert.assertEquals(expectedMsg, actualMsg, "User is unable to reach to shipping page");

    }

    @Test
    public void verifyUserShouldNavigateToNewArrivalPageSuccessfully() throws InterruptedException {
        homePage.clickOnNewArrivalLink();
        String expectedMsg = "New arrivals";
        String actualMsg = getTextFromElement(By.id("page-title"));
        Thread.sleep(1000);
        Assert.assertEquals(expectedMsg, actualMsg, " New Arrrival Page not found");
    }

    @Test
    public void verifyUserShouldNavigateToComingSoonPageSuccessfully() throws InterruptedException {
        Thread.sleep(1000);
        homePage.clickOnComingSoonLink();
        String expectedMsg = "Coming soon";
        String actualMsg = getTextFromElement(By.id("page-title"));
        Thread.sleep(1000);
        Assert.assertEquals(expectedMsg, actualMsg, "Coming soon Page not found");

    }

    @Test
    public void verifyUserShouldNavigateToContactUsPageSuccessfully() throws InterruptedException {
        Thread.sleep(1000);
        homePage.clickOnContactUSLink();
        String expectedMsg = "Contact us";
        String actualMsg = getTextFromElement(By.id("page-title"));
        Thread.sleep(1000);
        Assert.assertEquals(expectedMsg, actualMsg, "contact us Page not found");


    }


}
