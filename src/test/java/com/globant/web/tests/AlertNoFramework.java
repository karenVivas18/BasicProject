package com.globant.web.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;


public class AlertNoFramework {
    @Test()
    public void AlertNoFramework() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/karen.vivas/IdeaProjects/geckodriver.exe");
        WebDriver driver = new ChromeDriver();

        // open url
        String url = "https://output.jsbin.com/usidix/1";
        driver.get(url);

        try {
            // wait Until
            WebDriverWait wait = new WebDriverWait(driver, 10);
            WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[type=button]")));
            button.click();

            // Wait alert
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
            String alertText = alert.getText();

            // print message
            System.out.println("Alert Text: " + alertText);

            // Acept alert
            alert.accept();

        } finally {
            // quit driver
            driver.quit();
        }
    }
}
