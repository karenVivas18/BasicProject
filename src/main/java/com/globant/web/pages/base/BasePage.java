package com.globant.web.pages.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BasePage {

    private final WebDriver driver;
    private final WebDriverWait wait;

    /**
     * Constructor.
     *
     * @param pDriver : WebDriver
     */
    public BasePage(WebDriver pDriver) {
        PageFactory.initElements(pDriver, this);
        wait = new WebDriverWait(pDriver, 20);
        driver = pDriver;
    }

}
