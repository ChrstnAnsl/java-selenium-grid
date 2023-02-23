package com.chrstnnsl.Base;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Remote {
    
    public void test () throws MalformedURLException {
        
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setBrowserName("chrome");
        caps.setPlatform(Platform.MAC);
        WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.17:4444"), caps);
        driver.get("http://www.google.com");
        driver.quit();
    }
    
    

}
