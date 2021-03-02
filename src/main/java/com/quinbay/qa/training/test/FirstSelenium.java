package com.quinbay.qa.training.test;
import com.quinbay.qa.training.Actions.HomePageActions;
import com.quinbay.qa.training.pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class FirstSelenium {
    private static WebElement View_cart;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.edgewordstraining.co.uk/demo-site/");
        Thread.sleep(5000);
        WebElement searchBox = driver.findElement(By.xpath("//input[@type='search']"));
        searchBox.click();
        searchBox.sendKeys("Tshirt");
        searchBox.sendKeys(Keys.RETURN);
        Thread.sleep(5000);
        List<WebElement> elements = driver.findElements(By.xpath("//img[@src='https://www.edgewordstraining.co.uk/demo-site/wp-content/uploads/2018/03/vneck-tee.jpg']"));


        if (elements.isEmpty()) {
            System.out.println("/n/n element not found");
        } else {
            System.out.println("/n/n Element found");

        }

        Thread.sleep(3000);
        WebElement elements1 = driver.findElement(By.xpath("//*[@class='button product_type_simple add_to_cart_button ajax_add_to_cart']"));
         elements1.click();
WebElement view_cart = driver.findElement(By.xpath("//*[@class='added_to_cart wc-forward']"));
view_cart.click();
        Thread.sleep(3000);

WebElement Proceed_to_pay=driver.findElement(By.xpath("//*[@class='checkout-button button alt wc-forward']"));
Proceed_to_pay.click();
WebElement First_name= driver.findElement(By.xpath("//input[@id='billing_first_name']"));
First_name.sendKeys("sushma");
WebElement Last_name= driver.findElement(By.xpath("//input[@id='billing_last_name']"));
        Last_name.sendKeys("y");
        WebElement Billing_Address=driver.findElement(By.xpath("//input[@id='billing_address_1']"));
Billing_Address .sendKeys("abc");
WebElement Billing_city = driver.findElement(By.xpath("//input[@id='billing_city']"));
Billing_city.sendKeys("xyz");
WebElement State= driver.findElement(By.xpath("//select[@name='billing_state']"));
Select sel =new Select(State);
        Thread.sleep(5000);

sel.selectByVisibleText("Karnataka");
WebElement Pincode=driver.findElement(By.xpath("//input[@id='billing_postcode']"));
        Pincode.sendKeys("585102");
        Thread.sleep(5000);

        WebElement phone= driver.findElement(By.xpath("//input[@id='billing_phone']"));
        phone.sendKeys("345675333");
WebElement email= driver.findElement(By.xpath("//input[@id='billing_email']"));
email.sendKeys("abc@gmail.com");
        Thread.sleep(5000);
        WebElement Place_order=driver.findElement(By.xpath("//button[@id='place_order']"));
        Place_order.click();
        Thread.sleep(5000);
        driver.close();
    }
}






