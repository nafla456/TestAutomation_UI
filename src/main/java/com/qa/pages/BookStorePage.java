package com.qa.pages;

import com.qa.base.BasePage;
import org.openqa.selenium.By;

public class BookStorePage extends BasePage {

    private static final By PAGE_HEADER_LOCATOR = By.xpath("//div[@class='main-header']");
    private static final By ISBN_LOCATOR_OF_BOOKSTORE_PAGE =By.id("ISBN-label");
    private static final By AUTHOR_LOCATOR_OF_BOOKSTORE_PAGE=By.id("title-label");
    private static final By TITLE_LOCATOR_OF_BOOKSTORE_PAGE=By.id("author-label");
    //private static final By NEWTAB_OPENED_LOCATOR=By.cssSelector("(\"Body\")).sendKeys(Keys.CONTROL +\"t\"");
    private static final By WEBSITE_LINK_OF_BOOKSTORE_PAGE=By.xpath("//label[@class='form-label' and text()='http://chimera.labs.oreilly.com/books/1234000001708/index.html']");



    public boolean isPageLoaded() {

        return isVisible(PAGE_HEADER_LOCATOR);
    }

    public boolean isoreillySiteClicked(){
        return clickElement(WEBSITE_LINK_OF_BOOKSTORE_PAGE);

    }


}
