package Selenium.Test;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.apache.poi.ss.usermodel.*;

import java.io.*;


import java.io.FileInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Properties;

public class SeleniumPractice {
    static {
        System.setProperty("webdriver,chrome,driver", "ChromeDriver/chromedriver.exe");
    }

    @Test
    public void hitURLWithoutUsingGetMethodOfSelenium() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
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

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(emailContainer));

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

        Wait<WebDriver> fluentWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);
        fluentWait.until(ExpectedConditions.visibilityOf(resources));

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
    public void selectClassExampleFromFacebook() throws InterruptedException {
        String letters = RandomStringUtils.randomAlphabetic(2); // 2 random letters
        String numbers = RandomStringUtils.randomNumeric(2);    // 2 random numbers

        String randomString = letters + numbers;
        System.out.println(randomString);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.facebook.com/reg/");
        WebElement name = driver.findElement(By.xpath("//input[@name='firstname']"));
        name.sendKeys("Kayani" + randomString);
        WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));
        lastName.sendKeys("lasya" + randomString);
        WebElement birthDay = driver.findElement(By.xpath("//select[@name='birthday_day' and @id='day']"));
        WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month' and @id='month']"));
        WebElement birthYear = driver.findElement(By.xpath("//select[@name='birthday_year' and @id='year']"));
        Select day = new Select(birthDay);
        day.selectByIndex(23);
        Select m = new Select(month);
        m.selectByValue("2");
        Select year = new Select(birthYear);
        year.selectByVisibleText("1989");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//label[text()='Male']")).click();
        driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("1234554321");
        Thread.sleep(4000);
        driver.quit();
    }

    @Test
    public void brokenLinksVerification() throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.deadlinkchecker.com/");

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());
        for (WebElement element : links) {
            String url = element.getAttribute("href");
            if (url != null && !url.isEmpty()) {
                verifyLink(url);
            } else {
                System.out.println("Skipping empty or null links ");
            }
        }
        driver.quit();

    }

    private void verifyLink(String url) throws IOException {

        URL urls = new URL(url);
        HttpURLConnection connection = (HttpURLConnection) urls.openConnection();
        connection.setRequestMethod("HEAD");
        connection.connect();

        int responseCode = connection.getResponseCode();

        if (responseCode >= 400) {
            System.out.println(" Broken Link: " + url + " | Response Code: " + responseCode);
        } else {
            System.out.println("✅ Valid Link: " + url + " | Response Code: " + responseCode);
        }
    }

    @Test
    public void scrollExample() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.bbc.com/");
        JavascriptExecutor je = (JavascriptExecutor) driver;
        je.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        Thread.sleep(3000);
        je.executeScript("window.scrollBy(0,document.body.scrollWidth)");
        Thread.sleep(3000);
        je.executeScript("window.scrollTo(0,0)");
        Thread.sleep(5000);
        System.out.println("Scrolled to bottom of the page");
        driver.quit();
    }

    @Test
    public void disableElementExample() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("file:///C:/Users/123/OneDrive/Desktop/Test%20Data/disable.html");
        driver.findElement(By.id("d1")).sendKeys("admin");
        RemoteWebDriver r = (RemoteWebDriver) driver;
        r.executeScript("document.getElementById('d2').value='manager'");
        driver.quit();
    }

    @Test
    public void peopertyFileExample() throws IOException, InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        FileInputStream fis = new FileInputStream("C:/Users/123/OneDrive/Desktop/Test Data/CommonData.property/");
        Properties p = new Properties();
        p.load(fis);
        String url = p.getProperty("url");
        String userName = p.getProperty("userName");
        String password = p.getProperty("password");
        System.out.println(url);
        System.out.println(userName);
        System.out.println(password);
        driver.get(url);
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys(userName);
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
        Thread.sleep(4000);
        driver.quit();
    }

    @Test
    public void getDataFromExcel() throws IOException, InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        FileInputStream fis = new FileInputStream(IPathConstant.excel_Path);
        Workbook wb = WorkbookFactory.create(fis);

        String userName = wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
        System.out.println("User Name " + userName);
        String password = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
        System.out.println("Password " + password);
        driver.get("https://en-gb.facebook.com/login/web/");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys(userName);
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
        Thread.sleep(4000);

//        Workbook wb = WorkbookFactory.create(fis);
        wb.getSheet("Sheet1").getRow(1).getCell(0).setCellValue("Kamadolli");
        FileOutputStream fos = new FileOutputStream(IPathConstant.excel_Path);
        wb.write(fos);
        wb.close();
        driver.quit();
    }

    @Test
    public void writeBackToExcel() throws IOException {
        FileInputStream fis = new FileInputStream("C:/Users/123/IdeaProjects/MoneyHeist/New Microsoft Excel Worksheet.xlsx");

        Workbook wb = WorkbookFactory.create(fis);
        wb.getSheet("Sheet1").getRow(3).getCell(0).setCellValue("Kamadolli");
        FileOutputStream fos = new FileOutputStream("C:/Users/123/IdeaProjects/MoneyHeist/New Microsoft Excel Worksheet.xlsx");
        wb.write(fos);
        wb.close();

    }
}
