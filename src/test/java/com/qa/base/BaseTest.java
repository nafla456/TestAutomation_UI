package com.qa.base;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest extends BasePage{

    @BeforeSuite
    public void beforeSuite() {
        initWebDriver();
    }

    @AfterSuite
    public void afterSuite() {
        quitWebDriver();
    }

}
