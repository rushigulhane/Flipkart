package com.Automation.Pages;

import java.io.File;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

//Declaration
public class LoginPage extends BasePage {
	/*@FindBy(xpath="//a[@class='_1_3w1N']")
	private WebElement Login;*/
	
	private static final String FileUtils = null;

	@FindBy(xpath="//input[@class='_2IX_2- VJZDxU']")
	private WebElement MobNo;
	
	@FindBy(xpath="//input[@class='_2IX_2- _3mctLh VJZDxU']")
	private WebElement Pass;
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	private WebElement Login1;
	@FindBy(xpath="//span[@class='_16v3bB']") 
	private WebElement Logout;
	
	@FindBy(xpath="//div[text()='My Profile']") 
	private WebElement MyProfile;
	public void MyProfile()
	{
		MyProfile.click();

	}
	
	
	

	/*@FindBy(xpath="//span[@class='crossIcon popupSprite popupCrossIcon']")
	private WebElement close1;*/
	
//initialization
	public void OpenUrl ()
	{
		driver.get("https://www.flipkart.com/");
	}
	/*public void  clicklogin()
	{
	Login.click();

	}*/
	public void  Mobno(String string)
	{
		MobNo.sendKeys(string);

	}
	public void pass(String u)
	{
		Pass.sendKeys(u);
	}
	public void clickLogin1()
	{
		Login1.click();
	}
	
	public void MyProfi()
	{
		MyProfile.click();

	}
	
	public void Logout()
	{
		Logout.click();

	}
	
	
	
	
	
	
	
	
}