package com.qa.tests;

import com.qa.base.BaseTest;
import com.qa.pages.BookStoreApplicationPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BookStoreApplicationTest extends BaseTest {

    BookStoreApplicationPage bookStoreApplicationPage=new BookStoreApplicationPage();

    @Test
    public void bookStorePage(){
        Assert.assertEquals(bookStoreApplicationPage.isPageLoaded(),true);
    }
    @Test
    public void thirdBookElementClicked(){
        Assert.assertEquals(bookStoreApplicationPage.isThirdBookClicked(),true);
    }


}
