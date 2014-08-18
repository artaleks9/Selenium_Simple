package org.home.selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class GoogleTestPage {
    private FirefoxDriver driver;

    @Before
    public void setUp(){
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://google.com");
    }

    @After
    public void tearDown(){
        driver.close();
    }

    @Test
    public void testSearch(){
        HomePage home = new HomePage(driver);
        ResultPage result = home.search("codenvy");
        assertTrue(result.getFirstLink().contains("Codenvy"));
    }
}
