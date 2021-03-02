package com.quinbay.qa.training.Actions;
import com.quinbay.qa.training.pages.HomePage;
import com.quinbay.qa.training.pages.Xpath_path;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomeAction {
    public Xpath_path homeAction;

    public HomeAction(WebDriver driver) {
        homeAction = PageFactory.initElements(driver, Xpath_path.class);
    }
    public void searchForAnItem() {
        homeAction.setSearchText();
    }

    public void add_to_cart() {
        homeAction.add_to_cart();
    }
    public void view_cart() {
        homeAction.viewcart();
    }
    public void Proceed_to_pay(){
       homeAction.Proceed_to_pay();
    }
    public void Filling_form() throws InterruptedException{
        homeAction.
    }
}
