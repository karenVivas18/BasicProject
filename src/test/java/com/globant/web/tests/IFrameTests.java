package com.globant.web.tests;

import com.globant.web.pages.HomePage;
import com.globant.web.tests.base.BaseTest;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

/**
 * Suite to test the video integration.
 */
@Slf4j
public class IFrameTests extends BaseTest {

    @Test(description = "Test to validate YouTube")
    public void validateYouTubeVideo() {

        // HOME PAGE
        HomePage homePage = getHomePage();


    }

}
