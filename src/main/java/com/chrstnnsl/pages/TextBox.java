// package com.chrstnnsl.pages;

// import com.chrstnnsl.Base.Base;
// import com.chrstnnsl.Helper.*;
// import org.openqa.selenium.support.FindBy;

// import org.openqa.selenium.support.PageFactory;

// import java.util.ArrayList;
// import java.util.List;

// import org.openqa.selenium.JavascriptExecutor;
// import org.openqa.selenium.WebElement;

// public class TextBox extends Base {
//     JavascriptExecutor js = (JavascriptExecutor) driver;

//     public String fullName;
//     public String email;
//     public String currentAddress;
//     public String permanentAddress;
	
// 	@FindBy(id="userName")
// 	WebElement _fullName;
	
// 	@FindBy(id="userEmail")
// 	WebElement _email;
	
// 	@FindBy(id="currentAddress")
// 	WebElement _currentAddress;
	
// 	@FindBy(id="permanentAddress")
// 	WebElement _permanentAddress;

//     @FindBy(id="submit")
//     WebElement _submit;

//     @FindBy(xpath="//div[@id='output']//p")
//     List<WebElement> _output;

	
// 	// Initializing the Page Objects:
// 	public TextBox() {
// 		PageFactory.initElements(driver, this);
// 	}

// 	public TextBox submitInformation(String fullName, String email, String currentAddress, String permanentAddress) throws Exception {
// 		driver.get("https://demoqa.com/text-box");

//         this.fullName = fullName;
//         this.email = email;
//         this.currentAddress = currentAddress;
//         this.permanentAddress = permanentAddress;
        
// 		_fullName.sendKeys(this.fullName);
// 		_email.sendKeys(email);
// 		_currentAddress.sendKeys(currentAddress);
// 		_permanentAddress.sendKeys(permanentAddress);
//         Thread.sleep(500);
        
//         js.executeScript("window.scrollBy(0,1000)");
        
//         _submit.click();
		
// 		return this;
// 	}

//     public List<String> processedInformation() {
        
//         String fname = "Name:" + this.fullName;
//         String email = "Email:" + this.email;
//         String currentAddress = "Current Address :" + this.currentAddress;
//         String permanentAddress = "Permananet Address :" + this.permanentAddress;

//         List<String> list = new ArrayList<String>();
//         list.add(fname);
//         list.add(email);
//         list.add(currentAddress);
//         list.add(permanentAddress);

//         return list;
//     }

// 	public List<String> submittedInformation() {
        
//         List<String> output = new ArrayList<String>();

//         for(WebElement element : _output){
//             String data = element.getText();
//             output.add(data);
//         }
//         System.out.println(output);

//         return output;
// 	}


// }