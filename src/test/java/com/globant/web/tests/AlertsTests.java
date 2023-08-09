package com.globant.web.tests;

import com.globant.web.pages.HomePage;
import com.globant.web.tests.base.BaseTest;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

/**
 * Suite to test the video integration.
 */
@Slf4j
public class AlertsTests extends BaseTest {

    @Test(description = "Test to validate Alerts")
    public void AlertTest() {

        // HOME PAGE

        HomePage homePage = getHomePage();
        homePage.clickGo();

        homePage.switchToAlert(0);
        waitSomeSeconds(6);
        homePage.clickGo();
    }

}
