package org.home.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage(FirefoxDriver driver){
        this.driver = driver;
    }

    public ResultPage search(String text){
        driver.findElement(By.name("q")).sendKeys(text);
        return new ResultPage(driver);
    }
}
