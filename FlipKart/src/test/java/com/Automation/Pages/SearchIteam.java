package com.Automation.Pages;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchIteam extends BasePage
{

	@FindBy(xpath="//img[@alt='Flipkart']")
	private WebElement flipkart;
	public void FlipKart()
{
	flipkart.click();
}

	@FindBy(xpath="//span[.='Cart']")
	private WebElement Cart;
	public void cart()
	{
	Cart.click();
	}

	@FindBy(xpath="//div[.='Remove']")
	private WebElement Remove;
	public void remove()
	{
	Remove.click();
	}
	
	@FindBy(xpath="//div[@class='_3dsJAO _24d-qY FhkMJZ']")
	private WebElement RemovePop;
	public void removepop()
	{
	RemovePop.click();
	}
}
