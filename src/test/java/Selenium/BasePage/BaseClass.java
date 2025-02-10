package Selenium.BasePage;

import Selenium.Pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClass {

    static WebDriver driver;  // Declare WebDriver at the class level

    @BeforeSuite
    public static void loginToApplication() throws InterruptedException {
        System.out.println("Logging into Guru99 application");

        // Setup ChromeDriver

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/login.html");
        Thread.sleep(5000);
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.login("mngr609421", "pYhesuq");
    }

    @AfterSuite
    public static void logoutFromApplication() {
        System.out.println("Logging out from Guru99 application");
        if (driver != null) {
            driver.quit();  // Close browser
        }
    }

    public static WebDriver getDriver() {
        return driver;  // Getter method to use driver in other classes
    }
}
