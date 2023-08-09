package com.globant.web.tests.base;

import com.globant.web.driver.Driver;
import com.globant.web.pages.HomePage;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

/**
 * Parent of the other classes of test.
 */
@Slf4j
public class BaseTest {

    private Driver driver;
    private HomePage home;

    @BeforeTest(alwaysRun = true)
    @Parameters({"browser", "url"})
    public void beforeTest(String browser, String url) {
        driver = new Driver(browser);
        home = new HomePage(driver.getDriver(), url);
    }


    /**
     * Get the home page.
     *
     * @return HomePage
     */
    public HomePage getHomePage() {
        return home;
    }

    public void waitSomeSeconds(int timeout) {
        try {
            TimeUnit.SECONDS.sleep(timeout);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
