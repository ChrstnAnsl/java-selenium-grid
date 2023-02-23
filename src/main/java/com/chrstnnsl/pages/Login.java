package com.chrstnnsl.pages;

import com.chrstnnsl.Base.Base;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login extends Base {

	@FindBy(id="firstname")
	WebElement _firstName;
	
	@FindBy(id="lastname")
	WebElement _lastname;
	
	@FindBy(id="userName")
	WebElement _username;
	
	@FindBy(id="password")
	WebElement _password;

	@FindBy(id="register")
	WebElement _registerBtn;
	
	public Login() {
		PageFactory.initElements(driver, this);
	}

	public Login CreateNewUser(String firstnameValue, String lastnameValue, String usernameValue, String passwordValue) {
		driver.get("https://demoqa.com/register");
		_firstName.sendKeys(firstnameValue);
		_lastname.sendKeys(lastnameValue);
		_username.sendKeys(usernameValue);
		_password.sendKeys(passwordValue);
		
		return this;
	}

	public Login verifyAccount() {
		_registerBtn.click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
				By.xpath("//iframe[@title='reCAPTCHA']")));
	   
		 wait.until(ExpectedConditions.elementToBeClickable(
					By.xpath("//div[@class='recaptcha-checkbox-border']"))).click();
		return this;
	}


}