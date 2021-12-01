package com.xcart.pages;

import com.xcart.utility.Utility;
import org.openqa.selenium.By;

public class AvengersPage extends Utility {

    By AddToCartButton = By.xpath("(//span[contains(text(),'Add to cart')])[1]");
    By ActualMsg = By.xpath("//div[@id='status-messages']//ul");
    By closeMsg = By.xpath("//a[@title='Close']");
    By cartIcon = By.xpath("//div[@title='Your cart']");
    By viewCart = By.xpath("//a[@class='regular-button cart']");
    By ActualMsginCart = By.xpath("//h1[@id='page-title']");
    By clearQuantity = By.xpath("//input[@id='amount16']");
    By changeQuantity = By.xpath("//input[@id='amount16']");
    By ActualSetQuantityText = By.xpath("//h1[text()='Your shopping cart - 2 items']");
    By actualSubTotal = By.xpath("//ul[@class='totals']//li[@class='subtotal']");
    By actualTotal = By.xpath("//li[@class='total']");
    By ClickOnCheckOutButton = By.xpath("//span[normalize-space()='Go to checkout']");
    By actualverify = By.xpath("//h3[normalize-space()='Log in to your account']");
    By EnterEmailId = By.xpath("//input[@id='email']");
    By ContinueButton = By.xpath("//td[@class='buttons-row']//button[@type='submit']");
    By actualSecure = By.xpath("//h1[normalize-space()='Secure Checkout']");
    By FirstName = By.xpath("//input[@id='shippingaddress-firstname']");
    By LastName = By.xpath("//input[@id='shippingaddress-lastname']");
    By StreetAddress = By.xpath("//input[@id='shippingaddress-street']");
    By ClearValueAtCityTextBox = By.xpath("//input[@id='shippingaddress-city']");
    By CityName = By.xpath("//input[@id='shippingaddress-city']");
    By Country = By.xpath("//select[@id='shippingaddress-country-code']");
    By State = By.xpath("//select[@id='shippingaddress-state-id']");
    By ClearValueAtZipCode = By.xpath("//input[@id='shippingaddress-zipcode']");
    By Zipcode = By.xpath("//input[@id='shippingaddress-zipcode']");
    By LocalShipping = By.xpath("//input[@id='method128']");
    By CashOnDelivery = By.xpath("(//input[@id='pmethod6'])[1]");
    By actualLastTotal=By.xpath("//div[@class='total clearfix']");
    By PlaceOrderButton=By.xpath("//span[normalize-space()='Place order: $33.95']");
    By actualThankMsg = By.xpath("//h1[@id='page-title']");


    public void clickOnAddToCartButton() {
        mouseHoverAndClickOnElement(AddToCartButton);
    }

    public String verifyActualTextMessage() {
        return getTextFromElement(ActualMsg);
    }

    public void closeMsg() {
        clickOnElement(closeMsg);
    }

    public void clickOnCartIcon() {
        clickOnElement(cartIcon);

    }

    public void clickOnViewCart() {
        clickOnElement(viewCart);
    }

    public String verifyOneProductAddedText() {
        return getTextFromElement(ActualMsginCart);
    }

    public void setQuantityTo2() {
        clearValue(clearQuantity);
        sendTextToElement(changeQuantity, "2");
    }

    public String VerifychangeQuntitytext() {
        return getTextFromElement(ActualSetQuantityText);
    }

    public String verifyActualSubtotal() {
        return getTextFromElement(actualSubTotal);
    }

    public String verifyActualtotal() {
        return getTextFromElement(actualTotal);
    }

    public void ClickOnCheckOutButton() {
        clickOnElement(ClickOnCheckOutButton);
    }

    public String expectedTextAfterClickOnCheckOut() {
        return getTextFromElement(actualverify);
    }

    public void EnterYourEmailId() {
        sendTextToElement(EnterEmailId, "PrimetestingLondon123@gmail.com");
    }

    public void ClickOnContinueButton() {
        clickOnElement(ContinueButton);
    }

    public String actualSecureText() {
        return getTextFromElement(actualSecure);
    }

    public void EnterYourFirstName() {
        sendTextToElement(FirstName, "Kishan");
    }

    public void EnterYourLastName() {
        sendTextToElement(LastName, "Patel");
    }

    public void EnterYourStreetName() {
        sendTextToElement(StreetAddress, "35 morrill");
    }

    public void EnterYourCity() {
        clearValue(ClearValueAtCityTextBox);
        sendTextToElement(CityName, "Boston");
    }

    public void EnterYourCountry() {
        selectByValueFromDropDown(Country, "US");
    }

    public void EnterYourState() {
        selectByValueFromDropDown(State, "580");
    }

    public void EnterYourZipcode() throws InterruptedException {
        Thread.sleep(1000);
        clearValue(ClearValueAtZipCode);
        Thread.sleep(1000);
        sendTextToElement(Zipcode, "01545");
    }

    public void ClickOnLocalShipping() {
        clickOnElement(LocalShipping);
    }

    public void ClickOnCOD() {
        clickOnElement(CashOnDelivery);
    }

    public String actualLastTotalVerify(){
        return getTextFromElement(actualLastTotal);

    }

    public void clickOnPlaceOrderButton(){
        clickOnElement(PlaceOrderButton);
    }

    public String actualThankYouText(){
        return getTextFromElement(actualThankMsg);
    }



}
