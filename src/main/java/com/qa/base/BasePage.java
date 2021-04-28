package com.qa.base;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    private static WebDriver driver;
    private int timeOut = 3;

    public void initWebDriver() {
        ChromeDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    public void quitWebDriver() {
        if (null != driver) {
            driver.close();
            driver.quit();
        }
    }

    public void openPage(String Url) {
        driver.get(Url);
    }

    public void maximizeWindow() {
        driver.manage().window().maximize();
    }

    public boolean clickElement(By locator) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, timeOut);
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
            element.click();
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public String getText(By locator) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, timeOut);
            wait.until(ExpectedConditions.attributeToBeNotEmpty(driver.findElement(locator), "value"));
            return driver.findElement(locator).getAttribute("value");
        } catch (Exception ex) {
            return null;
        }
    }

    public boolean isVisible(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, timeOut);
        return wait.until(ExpectedConditions.visibilityOf(driver.findElement(locator))) != null;
    }

    public WebElement getElement(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, timeOut);
        WebElement element = null;
        if (isVisible(locator)) {
            element = wait.until(ExpectedConditions.visibilityOf(driver.findElement(locator)));
        }
        return element;
    }



    public void scrollDown() {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }
}
