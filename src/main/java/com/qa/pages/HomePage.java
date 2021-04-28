package com.qa.pages;

import com.qa.base.BasePage;
import org.openqa.selenium.By;

public class HomePage extends BasePage {

    private static final By HOME_PAGE_LOCATOR = By.xpath("//h5[text()='Book Store Application']");


    //h5[text()='Book Store Application']

    //METHODS
    public void clickBookStoreApplication(){

        clickElement(HOME_PAGE_LOCATOR);
    }

    public boolean isBookStoreApplicationClicked(){

        return clickElement(HOME_PAGE_LOCATOR);
    }


}
