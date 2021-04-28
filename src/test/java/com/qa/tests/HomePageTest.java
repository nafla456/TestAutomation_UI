package com.qa.tests;

import com.qa.base.BaseTest;
import com.qa.pages.BookStoreApplicationPage;
import com.qa.pages.BookStorePage;
import com.qa.pages.HomePage;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    private static final String URL = "https://demoqa.com/";
    HomePage homePage = new HomePage();
    BookStoreApplicationPage bookStoreApplicationPage=new BookStoreApplicationPage();
    BookStorePage bookStorePage= new BookStorePage();

    @Test
    public void clickOnBookstoreApplication() {
        //pre-conditions
        openPage(URL);
        Reporter.log("Opening the browser");
        maximizeWindow();
        Reporter.log("Maximizing the window");
        scrollDown();
        Reporter.log("Scrolling down");
        //click on the bookstoreapplication
        homePage.clickBookStoreApplication();
        Reporter.log("Clicked on the bookstoreapplication");
        //verify widgets page loaded
        Assert.assertTrue(bookStoreApplicationPage.isPageLoaded());
        Reporter.log("Verified new page loaded");
    }



}
