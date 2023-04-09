import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NopCommerce_1 {
    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/";

        // launch the Chrome browser
        WebDriver driver= new ChromeDriver();

        // open Url
        driver.get(baseUrl);

        // print the title of the page
       String title= driver.getTitle();
       System.out.println(title);

        // get the current title
        System.out.println("Current title :"+driver.getCurrentUrl());

        // get page source
        System.out.println("Page source :"+driver.getPageSource());

        // find the login link element
       WebElement loginLink= driver.findElement(By.linkText("Log in"));

       // click on login element
        loginLink.click();

        // find the Email field
       WebElement emailField = driver.findElement(By.id("Email"));

        // type the email address to the email field
        emailField.sendKeys("test123@gamil.com");

        // find the password field
       driver.findElement(By.id("Password")).sendKeys("test123");

       // close the browser
        driver.close();

    }




}
