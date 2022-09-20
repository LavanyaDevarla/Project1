package com.OrangeHRM.testcases;

import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import com.OrangeHRM.pages.HomePage;
import com.OrangeHRM.pages.LoginPage;

public class LoginPageTest {
	
WebDriver driver;

HomePage homePage;
@Test(priority = 1)
public void logoTest() {
	boolean flag = LoginPage.validatelogo();

Assert.assertTrue(flag);		
}
@Test(priority = 2)
	public void loginTest() {
	homePage=	LoginPage.login("admin", "admin123");
	String expectedURL="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
	String actualURL = driver.getCurrentUrl();
			Assert.assertEquals(actualURL, expectedURL);
		
}}
