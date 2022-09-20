package com.OrangeHRM.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.OrangeHRM.pages.LoginPage;



public class BaseClass {
	public static WebDriver driver;
	public LoginPage loginPage;

	@BeforeMethod

	public void setup() {
		System.setProperty( "webdriver.chrome.driver","C:\\Users\\deepu\\eclipse-workspace\\Hello-World\\src\\test\\resources\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/");
loginPage=	new LoginPage();
	
	}
	
	
		
	@AfterMethod
public void tearDown() {
		driver.close();
}
}