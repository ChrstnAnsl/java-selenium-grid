// package com.chrstnnsl.test;
// // import org.testng.annotations.Test;
// import org.testng.annotations.*;


// import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.By;
// import org.openqa.selenium.WebDriver;
// import java.io.File;

// import org.openqa.selenium.TakesScreenshot;

// import static java.lang.Thread.sleep;

// public class Test {

//     @BeforeClass
//     public void test() throws InterruptedException, Exception {

//         System.setProperty("webdriver.chrome.driver", "E:/JAR and Drivers/drivers/chromedriver/chromedriver.exe");

//         WebDriver driver = new ChromeDriver();

// //        OPENING WEBINARINC AND SEARCH TITLE
//         driver.manage().window().maximize();

//         driver.get("https://lms-v3-staging.webinarinc.com/");
// //          Screenshot

//         try {
//             TestScreenShot.takeScreenShot(driver, "E:/JAR and Drivers/screenshots");
//         } catch (Exception e) {
//             System.out.println(e);
//         }


// //
//         // SIGN UP

//         driver.findElement(By.cssSelector("div#app div.login-switch > div > span:nth-child(2)")).click();

//         driver.findElement(By.id("input-40")).sendKeys("Automation Test Name");

//         driver.findElement(By.id("input-43")).sendKeys("karldojo123+2@gmail.com");

// //        driver.findElement(By.id("MazPhoneNumberInput-46_country_selector")).click();
// //
// //        driver.findElement(By.className("ph")).click();

//         driver.findElement(By.id("MazPhoneNumberInput-46_phone_number")).sendKeys("9164028930");

//         driver.findElement(By.cssSelector("div#app div.v-input.mt-5.v-input--hide-details.theme--light.v-input--selection-controls.v-input--checkbox > div > div > div > div")).click();

//         driver.findElement(By.cssSelector("div#app form:nth-child(3) > div.v-card__actions.login-card__action.pa-0 > button[type=\"submit\"] > span")).click();


// // TEST FOR ADDING NOTE
// //        driver.findElement(By.id("input-25")).sendKeys("Admin@webinarinc.com");
// //
// //        driver.findElement(By.id("input-29")).sendKeys("El3ph@n7");
// //
// //        driver.findElement(By.className("submit-group")).sendKeys(Keys.RETURN);
// //
// //        sleep(20000);
// //
// //        driver.findElement(By.cssSelector("input[placeholder='Search for courses..']")).sendKeys("New Course");
// //        driver.findElement(By.cssSelector("input[placeholder='Search for courses..']")).sendKeys(Keys.RETURN);
// //
// //        sleep(10000);
// //
// //        driver.findElement(By.className("font-semibold")).click();
// //
// //        sleep(10000);
// //
// //        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
// //        driver.switchTo().window(tabs.get(tabs.size() - 1));
// //
// //        driver.findElement(By.cssSelector("textarea[placeholder='Write a note...']")).sendKeys("Test Note");
// //
// //        driver.findElement(By.id("UnitPageNotes-Button-PostNewNotes")).click();

//         sleep(10000);

//         driver.quit();

//     }

    
//     @Test
//     public static void takeScreenShot(WebDriver driver, String filePath) throws Exception {
//         TakesScreenshot scrShot =((TakesScreenshot) driver);
//         File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
//         File DestFile=new File(filePath);
//         FileUtils.copyFile(SrcFile, DestFile);
//     }
    

// }