package com.qa.tests;

import com.qa.base.BaseTest;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class DemoQaScreenshot extends BaseTest {

    private WebDriver driver;

    private static final By PAGE_HEADER_LOCATOR = By.xpath("//div[@class='main-header']");
    private static final By VERIFY_TITLE_LOCATOR_OF_THIRD_BOOK=By.xpath("//a[@href='/books?book=9781449337711']");
    private static final By VERIFY_AUTHOR_LOCATOR_OF_THIRD_BOOK=By.xpath("//div[@class='rt-td' and text()='Glenn Block et al.']");
    private static final By VERIFY_PUBLISHER_LOCATOR_OF_THIRD_BOOK=By.xpath("//div[@id='app']/div/div/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[3]/div/div[4]");
    private static final By THIRD_BOOK_LINK_LOCATOR=By.xpath("//a[text()='Designing Evolvable Web APIs with ASP.NET']");

    private static final By ISBN_LOCATOR_OF_BOOKSTORE_PAGE =By.id("ISBN-label");
    private static final By AUTHOR_LOCATOR_OF_BOOKSTORE_PAGE=By.id("title-label");
    private static final By TITLE_LOCATOR_OF_BOOKSTORE_PAGE=By.id("author-label");
    private static final By WEBSITE_LINK_OF_BOOKSTORE_PAGE=By.xpath("//label[@class='form-label' and text()='http://chimera.labs.oreilly.com/books/1234000001708/index.html']");


    public boolean isPageLoaded() {

        return isVisible(PAGE_HEADER_LOCATOR);
    }
    public boolean isThirdBookClicked(){
        return clickElement(THIRD_BOOK_LINK_LOCATOR);
    }
    public boolean veryfy_Titleof_thirdbook(){
        return isVisible(VERIFY_TITLE_LOCATOR_OF_THIRD_BOOK);
    }
    public  boolean verify_author_of_thirdbook(){
        return isVisible(VERIFY_AUTHOR_LOCATOR_OF_THIRD_BOOK);
    }
    public boolean verify_publisher_of_thirdbook(){
        return isVisible(VERIFY_PUBLISHER_LOCATOR_OF_THIRD_BOOK);
    }

    public boolean isoreillySiteClicked(){
        return clickElement(WEBSITE_LINK_OF_BOOKSTORE_PAGE);

    }

    @Test
    public void captureScreenshot() throws Exception {
        ChromeDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //LAUNCH THE DEMOQA WEBSITE
        driver.get("https://demoqa.com/");

    }

    @AfterMethod
    public void tearDown(ITestResult result) {
        if (ITestResult.FAILURE == result.getStatus()) {
            Utility.captureScreenshot(driver, result.getName());
        }
        driver.quit();

    }


}
