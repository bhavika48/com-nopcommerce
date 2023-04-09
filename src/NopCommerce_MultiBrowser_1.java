
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class NopCommerce_MultiBrowser_1 {
    static String browser = "Edge";
    static String baseurl = "https://demo.nopcommerce.com/login?returnUrl=%2";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("wrong Browser name :");
        }
        // open url
        driver.get(baseurl);

        // print title of the page
        String title = driver.getTitle();
        System.out.println(title);

        // print the current Url
        System.out.println("Current Url :" + driver.getCurrentUrl());

        // print the page source
        System.out.println("Page source :" + driver.getPageSource());

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
