package com.quinbay.qa.training.test;
import com.quinbay.qa.training.Actions.HomeAction;
import com.quinbay.qa.training.Actions.HomePageActions;
import com.quinbay.qa.training.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;
public class DemoPage {
        public static void main (String []args) throws InterruptedException{
            System.setProperty("webdriver.chrome.driver","src/main/resources/driver/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.get("https://www.edgewordstraining.co.uk/demo-site/");
            HomeAction action= new HomeAction(driver);
action.searchForAnItem();
            Thread.sleep(5000);
            action.search_box();
            action.add_to_cart();
            action.view_cart();
            action.Filling_form();

    }
}
