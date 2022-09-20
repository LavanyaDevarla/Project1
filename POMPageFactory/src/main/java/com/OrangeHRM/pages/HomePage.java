/**
 * 
 */
package com.OrangeHRM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OrangeHRM.base.BaseClass;

/**
 * @author deepu
 *
 */
public class HomePage extends BaseClass {
	@FindBy(xpath = "//*[@id=\"menu_admin_viewAdminModule\"]/b")
WebElement adminTab;
	public HomePage()
	{
		PageFactory.initElements(driver,this);
	}
public SystemUsersPage clickOnAdminTab() {
	adminTab.click();
	return new SystemUsersPage();
}
}
