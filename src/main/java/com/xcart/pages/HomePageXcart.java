package com.xcart.pages;

import com.xcart.utility.Utility;
import org.openqa.selenium.By;

public class HomePageXcart extends Utility {
   By shippingPage=By.xpath("//ul[@class='nav navbar-nav top-main-menu']//li[@class='leaf']//a[@href='shipping.html']");
   By newArrivalPage=By.xpath("//ul[@class='nav navbar-nav top-main-menu']");
   By comingsoonPage=By.xpath("(//span[contains(text(),'Coming soon')])[2]");
   By contactUsPage=By.xpath("//ul[@class='nav navbar-nav top-main-menu']//li[@class='leaf last']//a");

   public void clickOnShippingLink(){
      clickOnElement(shippingPage);
   }
   public void clickOnNewArrivalLink(){
      clickOnElement(newArrivalPage);
   }
   public void clickOnComingSoonLink(){
      clickOnElement(comingsoonPage);
   }
   public void clickOnContactUSLink(){
      clickOnElement(contactUsPage);
   }



}
