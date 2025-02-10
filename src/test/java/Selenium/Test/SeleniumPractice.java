package Selenium.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Timestamp;
import java.time.Duration;
import java.util.Random;

public class SeleniumPractice {
    static {
        System.setProperty("webdriver,chrome,driver", "ChromeDriver/chromedriver.exe");
    }

    @Test
    public void hitURLWithoutUsingGetMethodOfSelenium() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        Thread.sleep(2000);
        driver.navigate().to("https://mail.google.com");
        Assert.assertEquals(driver.getTitle(), "Gmail: Private and secure email at no cost | Google Workspace");
        Thread.sleep(2000);
        driver.navigate().back();
        Assert.assertEquals(driver.getTitle(), "Google");
        driver.manage().deleteAllCookies();
        driver.quit();
    }

    @Test
    public void CheckTheNavigationOfPageAndVerifyThePageLoaded() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.selenium.dev");
        Thread.sleep(2000);
        String url = driver.getCurrentUrl();
        System.out.println(url);
        if (url.equals("https://www.selenium.dev/")) {
            System.out.println("The url is successfully navigated and Passed");
        } else {
            System.out.println("url is not navigated & Fail " + url);
        }
        driver.quit();
    }

    @Test
    public void htmlSourceCode() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        String htmlCode = driver.getPageSource();
        WebElement links = driver.findElement(By.xpath("//a"));
        System.out.println(links);
        System.out.println(htmlCode);
        driver.quit();
    }

    @Test
    public void RemoveTextFromTextField() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.opensourcebilling.org/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='email' and @name='user[email]']")).clear();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='password' and @name='user[password]']")).clear();
        driver.quit();
    }

    @Test
    public void PrintTextIdTagNameAndAttributeOfFacebookLoginPage() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.facebook.com/");
        WebElement text = driver.findElement(By.xpath("//button[text()='Log in']"));
        WebElement attribute = driver.findElement(By.xpath("//button[@name='login']"));
        WebElement logo = driver.findElement(By.xpath("//img[@alt='Facebook']"));
        Thread.sleep(3000);
        WebElement emailContainer = driver.findElement(By.xpath("//input[@id='email']"));
        System.out.println("Text ---> " + text.getText());
        System.out.println("Tag Name ---> " + text.getTagName());
        System.out.println("Attribute --->" + attribute.getAttribute("name"));
        System.out.println("E-mail Container Height " + emailContainer.getSize().height);
        System.out.println("E-mail Container width " + emailContainer.getSize().width);
        System.out.println("Is logo displayed " + logo.isDisplayed());
        System.out.println("Fount Family " + logo.getCssValue("font-family"));
        System.out.println("Fount Colour " + logo.getCssValue("color"));
        System.out.println("Fount Size " + logo.getCssValue("font-size"));
        driver.quit();
    }

    @Test
    public void actionClassMoveToElementExample() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://www.vtiger.com/");
        WebElement resources = driver.findElement(By.xpath("//a[normalize-space(.)='Company']"));
        WebElement contactUs = driver.findElement(By.xpath("//a[@href='/contact-us/']"));

        Actions actions = new Actions(driver);
        actions.moveToElement(resources).perform();
        Thread.sleep(3000);
        contactUs.click();
        Thread.sleep(3000);
        WebElement addressAndPhoneNumber = driver.findElement(By.xpath("(//h2[text()='Phone Sales & Support']/ancestor::div//div[@class='text-reset text-decoration-none'])[2]"));
        System.out.println("Address and Phone number ---> " + addressAndPhoneNumber.getText());
        driver.quit();
    }


    @Test
    public void actionDragAndDrop() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://jqueryui.com/droppable/");
        Thread.sleep(3000);
        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
        WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(source, target).perform();
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void doubleClickAndRightClick() throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demoqa.com/buttons");
        ChromeOptions options = new ChromeOptions();

        // Disable pop-ups and unwanted elements
        options.addArguments("--disable-popup-blocking");  // Disable pop-ups
        options.addArguments("--disable-notifications");   // Disable notifications
        options.addArguments("--blink-settings=imagesEnabled=false"); // Block images (optional)

        Actions actions = new Actions(driver);
        Thread.sleep(3000);
        WebElement rightClickBtn = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
        actions.contextClick(rightClickBtn).perform();
        Thread.sleep(3000);
        WebElement doubleClick1 = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
        actions.doubleClick(doubleClick1).perform();
        driver.quit();
    }

    @Test
    public void selectClassExampleFromFacebook()
    {
        Random r=new Random();
        r.nextInt();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.facebook.com/reg/");
        WebElement name= driver.findElement(By.xpath("//input[@name='firstname']"));
        name.sendKeys("Kayani"+r.toString());
        WebElement lastName= driver.findElement(By.xpath("//input[@name='lastname']"));
        lastName.sendKeys("lasya"+r.toString());


    }
}
