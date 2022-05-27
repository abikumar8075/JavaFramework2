package com.qa.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.BaseClass;



public class LoginPapge extends BaseClass{
	
	@FindBy(name="username")
	WebElement username;
	@FindBy(name="password")
	WebElement password;
	@FindBy(xpath="//input[@type='submit']")
	WebElement btnlogin;
	@FindBy(xpath="//img[contains(@class,'img-responsive')]")
	WebElement logo;
	
  public LoginPapge() {
	
	PageFactory.initElements(driver, this);
	
}
public String validateLogiPagetitle() {
	return  driver.getTitle();
	
}
public boolean validateCrmLogo() {
	return logo.isDisplayed();
	
}

public HomePage login(String un, String pwd) {
	username.sendKeys(un);
	password.sendKeys(pwd);
	btnlogin.click();
	return new HomePage();
}
} 	


