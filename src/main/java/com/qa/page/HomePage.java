package com.qa.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

 
import com.qa.util.BaseClass;

public class HomePage extends BaseClass{
	@FindBy(xpath="//td[contains(text(),'User: Abinash kumar ') ]")
	WebElement userNameLabel;
	@FindBy(xpath="//a[contains(text(),'Contacts')]")
    WebElement contactsLink;
	@FindBy(xpath="//a[contains(text(),'Deals')]")
	WebElement dealLink;
	@FindBy(xpath="//a[contains(text(),'Tasks')]")
	WebElement tasksLink;
	@FindBy(xpath="//a[contains(text(),'New Contact')]")
	WebElement contactslink;
	// Initializing the page object
	public HomePage() {
		PageFactory.initElements(driver, this);
		
	}
	
	public String verifyHomePageTitle() {
		return driver.getTitle();
}   
	public boolean verifyCorrectUserName() {
		return userNameLabel.isDisplayed(); 
	}
	
public void clickOnNewContactsLink() {
	Actions a= new Actions (driver);
	 a.moveToElement(contactsLink).build().perform();
	 contactslink.click();
	
}
	
}

