package com.chrstnnsl.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base {

    protected static WebDriver driver;

    public String Test() {

        String test = "TEST";
        
        return test;
    }

    public Base(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        System.setProperty("webdriver.chrome.driver", "/Users/christiananselfernandez/Documents/christian/selenium-test/tdd-java/chromedriver");
    }

    public void home() {
        driver.get("https://demoqa.com/");
    }

    public void quit() {
        driver.quit();
    }

    
}
