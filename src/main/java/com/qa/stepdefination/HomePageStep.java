package com.qa.stepdefination;

import com.qa.page.HomePage;
import com.qa.page.LoginPapge;
import com.qa.util.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class HomePageStep extends BaseClass {

	LoginPapge loginPapge;
	HomePage homePage;

	@Given("user open browser")
	public void user_open_browser() {
		BaseClass.initialization();
	}

	@Then("user is on logi page")
	public void user_is_on_logi_page() {
		loginPapge  = new LoginPapge();
		String title =loginPapge .validateLogiPagetitle();
		//Assert.assertEquals("Free CRM - CRM software for customer relationshipmanagement, sales, and support", title);

	   System.out.println(title);

	}

	@Then("user logs into app")
	public void user_enter_username_and_password() {

		homePage = loginPapge.login(prop.getProperty("username"), prop.getProperty("password"));

	}

	@Then("validate home page title")
	public void validate_home_page_title() {

		String HomePageTitle = homePage.verifyHomePageTitle();
		//Assert.assertEquals("CRMPRO", HomePageTitle);
		System.out.println(HomePageTitle);
	}

 
}
