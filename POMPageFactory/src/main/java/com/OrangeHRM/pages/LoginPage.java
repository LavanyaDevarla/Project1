/**
 * 
 */
package com.OrangeHRM.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OrangeHRM.base.BaseClass;

/**
 * @author deepu
 *
 */
public class LoginPage extends BaseClass {
WebDriver driver;
	@FindBy(id="txtUsername")
	static
	WebElement userName;
	
	@FindBy(name="txtPassword")
	static
	WebElement password;

	@FindBy( xpath="//input[@id='btnLogin']")
	static
	WebElement loginBtn;
	
	@FindBy(xpath="//div[@id='divLogo']")
	static
	WebElement logo;
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	public static boolean validatelogo() {
		logo.isDisplayed();
		return true; }
	
	public static HomePage login(String uname,String pswd) {
		userName.sendKeys("uname");
		password.sendKeys("pswd");
		loginBtn.click();
		return new HomePage();
	}
	
	}

