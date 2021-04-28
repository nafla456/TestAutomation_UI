package com.qa.pages;

import com.qa.base.BasePage;
import org.openqa.selenium.By;

public class BookStoreApplicationPage extends BasePage {

    private static final By PAGE_HEADER_LOCATOR = By.xpath("//div[@class='main-header']");
    private static final By VERIFY_TITLE_LOCATOR_OF_THIRD_BOOK=By.xpath("//a[@href='/books?book=9781449337711']");
    private static final By VERIFY_AUTHOR_LOCATOR_OF_THIRD_BOOK=By.xpath("//div[@class='rt-td' and text()='Glenn Block et al.']");
    private static final By VERIFY_PUBLISHER_LOCATOR_OF_THIRD_BOOK=By.xpath("//div[@id='app']/div/div/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[3]/div/div[4]");
    private static final By THIRD_BOOK_LINK_LOCATOR=By.xpath("//a[text()='Designing Evolvable Web APIs with ASP.NET']");



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

}
