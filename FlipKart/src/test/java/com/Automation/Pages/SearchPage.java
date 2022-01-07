package com.Automation.Pages;

import java.util.Set;

import javax.swing.Action;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {
	//Declaration
	@FindBy(xpath="//input[@title='Search for products, brands and more']")
	private WebElement enterProd;
	
	@FindBy(xpath="//button[@class=\"L0Z3Pu\"]")
	private WebElement Search;
	
	@FindBy(xpath="//div[text()='realme Narzo 50i (Carbon Black, 32 GB)']")
	private WebElement mob;
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
	private WebElement cart;
	
	@FindBy(xpath="//div[text()='Rushi ']")      				// for My account
	private WebElement My;
	
	@FindBy(xpath="//div[text()='More']")							// for more 
	private WebElement More;
	
	@FindBy(xpath="//img[@alt='Mobiles']")							// for mobile
	private WebElement Mobile;
	
	
	
	
	
	//Initialization
	
	public void  enterProdclick(String string)
	{
		enterProd.sendKeys(string);

	}
	public void clickSearch() 
	{
		Search.click();
	}
	public void javascript1() throws InterruptedException
	{
		JavascriptExecutor j=(JavascriptExecutor)driver;
		String Scrolldown="window.scrollBy(0,800)";
		j.executeScript(Scrolldown);
	Thread.sleep(1000);
	}
	
	public void Mob() 
	{
		mob.click();
	}
	public void Cart() 
	{
		cart.click();
	}
	
	public void My_Account()
	{
		Actions act =new Actions (driver);
		act.moveToElement(My).perform();
		
	}
	public void more()
	{
		Actions act =new Actions (driver);
		act.moveToElement(More).perform();
		
	}
	public void mobile() {
	Mobile.click();
	}
	public void Scroll() throws InterruptedException
	{
		JavascriptExecutor j=(JavascriptExecutor)driver;
		Thread.sleep(1000);
		String Scrolldown="window.scrollBy(0,5000)";
		Thread.sleep(1000);
		j.executeScript(Scrolldown);
		String Scrollup="window.scrollBy(0,-2000)";
		Thread.sleep(1000);
		j.executeScript(Scrollup);
	}
	
	@FindBy(xpath="//a[text()='64 GB']")		//For Storage
	private WebElement Storage;
	public void storage() {
		Storage.click();
		}
	

	@FindBy(xpath="//a[text()='4 GB']")			//For Ram
	private WebElement Ram;
	public void ram() {
		Ram.click();
		}
	
	@FindBy(xpath="//input[@placeholder='Enter Delivery Pincode']")			//For Pincode
	private WebElement Pincode;
	public void pincode(String S) {
		Pincode.sendKeys(S);
		}
	
	@FindBy(xpath="//span[@class='_2P_LDn']")			//For  Check
	private WebElement Check;
	public void check() {
		Check.click();
		}
	
	
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")			//For AddKart
	private WebElement AddKart;
	public void addkart() {
		AddKart.click();
		}
	
	@FindBy(xpath="//span[text()='Rushikesh Gulhane']")			//For Address
	private WebElement Address;
	public void address() {
		Address.click();
		}
	
	@FindBy(xpath="//button[@class='_2KpZ6l RLM7ES _3AWRsL']")			//For Address
	private WebElement DeliveryHere;
	public void deliverhere() {
		DeliveryHere.click();
		}
	
	public void anotherwebsite() {
		Set<String> r = driver.getWindowHandles();
		int window = r.size();
		System.out.println(r);
		 java.util.Iterator<String> iterator = r.iterator();
		String parentWindow = iterator.next();
		String childWindow = iterator.next();
		driver.switchTo().window(childWindow);
			
		}
	
	@FindBy(xpath="//span[text()='Place Order']")			//For Place Order
	private WebElement Place_order;
	public void placeorder() {
		Place_order.click();
		}
	
	@FindBy(xpath="//button[text()='CONTINUE']")			//For Continue
	private WebElement Continue;
	public void conti() {
		Continue.click();
		}
	
	@FindBy(xpath="//div[text()='Cash on Delivery']")			//For Continue
	private WebElement Payment;
	public void payment() {
		Payment.click();
		}
}








