package com.quinbay.qa.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Xpath_path {
    WebDriver driver;
    public Xpath_path(WebDriver webDriver) {

        driver = webDriver;
    }
    @FindBy(xpath="//input[@type='search']")
    WebElement searchBox;
    //@FindBy(xpath="//img[@src='https://www.edgewordstraining.co.uk/demo-site/wp-content/uploads/2018/03/vneck-tee.jpg']")
    //WebElement button;
    //public void search_box(){
         //button.click();


    @FindBy(xpath="//*[@class='button product_type_simple add_to_cart_button ajax_add_to_cart']")
    WebElement element;
    @FindBy(xpath="//*[@class='added_to_cart wc-forward']")
    WebElement view_cart;
    @FindBy(xpath="//*[@class='checkout-button button alt wc-forward']")
    WebElement Proceed_to_pay;
    @FindBy(xpath="//input[@id='billing_first_name']")
    WebElement First_name;

    @FindBy(xpath="//input[@id='billing_last_name']")
    WebElement Last_name;
    @FindBy(xpath="//input[@id='billing_address_1']")
    WebElement Billing_Address;

    public void setSearchBox() {searchBox.click();}
        public void 
    }
}

}
