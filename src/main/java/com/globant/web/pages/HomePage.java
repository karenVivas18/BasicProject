package com.globant.web.pages;

import com.globant.web.pages.base.BasePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Represents the Home Page.
 */
public class HomePage extends BasePage {

    // Labels
    @FindBy(css = "input[type=button]")
    private WebElement btnGo;


    public HomePage(WebDriver driver, String url) {
        super(driver);
        driver.get(url);
    }


    public HomePage switchToAlert() {
        driver.switchTo().alert();
        return this;
    }
    public HomePage aceptAlert() {
        return aceptAlert();
    }

    private WebDriver getDriver() {
        return getDriver();
    }


    public void clickGo(){
         btnGo.click();
    }

}
