package com.OrangeHRM.testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.OrangeHRM.base.BaseClass;
import com.OrangeHRM.pages.HomePage;
import com.OrangeHRM.pages.LoginPage;

public class HomePageTest extends BaseClass {
HomePage homePage;
	
	@Test(priority = 3)
public void clcikOnAdminTab()throws InterruptedException {
	
	homePage = 	loginPage.login("admin","admin123");
	homePage.clickOnAdminTab();
	
	//homePage.clcikOnAdminTab();
	Thread.sleep(0);
	String actualURL=	driver.getCurrentUrl();
	String expectedURL = "https://opensource-demo.orangehrmlive.com/index.php/dashboard";
	Assert.assertEquals(actualURL, expectedURL);
	//Assert.assertEquals(actualURL, expectedURL);
	}
}
