package com.qa.tests;

import com.qa.base.BaseTest;
import com.qa.pages.BookStorePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BookStoreTest extends BaseTest {

    BookStorePage bookStorePage = new BookStorePage();

    @Test
    public void secondBookStore(){
        Assert.assertEquals(bookStorePage.isPageLoaded(),true);
    }
    @Test
    public void oreillySiteLaunced(){
        Assert.assertEquals(bookStorePage.isoreillySiteClicked(),true);

    }
}
