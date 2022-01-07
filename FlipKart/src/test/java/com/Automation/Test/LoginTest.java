package com.Automation.Test;

import org.junit.Test;

import com.Automation.Generic.PropertyReader;
import com.Automation.Pages.BasePage;
import com.Automation.Pages.LoginPage;
import com.Automation.Pages.SearchIteam;
import com.Automation.Pages.SearchPage;

public class LoginTest extends BasePage
{
	LoginPage Lp=new LoginPage();
	SearchPage Sp=new SearchPage();
	SearchIteam Si=new SearchIteam();
	@Test
	public void verifyLogin() throws InterruptedException  
	{
		Lp.OpenUrl();
	/*	Lp.clicklogin();
		Lp.Mobno("9404892383");
		Lp.pass("****");
		Lp.clickLogin1();*/
		
		 PropertyReader.initProperty();
		// Lp.clicklogin();
		 Thread.sleep(1000);
		//Lp.Mobno(PropertyReader.getProperty ("login.username"));
		// Lp.pass(PropertyReader.getProperty ("login.password"));
		 Lp.Mobno(PropertyReader.username);
		 Lp.pass(PropertyReader.password);
		 Thread.sleep(1000);
		 Lp.clickLogin1();
		 Thread.sleep(3000);
		 Sp.enterProdclick(PropertyReader.getProperty("product"));			//for search product
		 Thread.sleep(1000);
		 Sp.clickSearch();
		 Sp.javascript1();
		 Thread.sleep(3000);
		Sp.Mob();
		Thread.sleep(3000);
		
		
		 Sp.anotherwebsite();
		 Thread.sleep(3000);
		 Sp.storage();
		 Thread.sleep(3000);
		 Sp.ram();
		 Thread.sleep(3000);
		 Sp.pincode(PropertyReader.getProperty("PINCODE"));
		 Thread.sleep(3000);
		 Sp.check();
		 Thread.sleep(3000);
		 Sp.addkart();
		 Thread.sleep(3000);
		 Sp.placeorder();
		 Thread.sleep(3000);
		 //Sp.address();
		 Sp.deliverhere();
		 Sp.conti();
		 Thread.sleep(1000);
		// Sp.payment();
		 
		//Sp.Cart();
		 Thread.sleep(1000);
		Si.FlipKart();
			 Thread.sleep(3000);
			 Sp.My_Account();					//for  my Account
			 Thread.sleep(3000);			
			 Sp.more();					// for more
			 Thread.sleep(3000);
			 Sp.mobile();
			 Thread.sleep(3000);
			 Sp.Scroll();
			 Thread.sleep(3000);
			 Si.cart();
			 Thread.sleep(3000);
			 Sp.javascript1();
			 Si.remove();
			 Thread.sleep(1000);
			 Si.removepop();
			 Thread.sleep(1000);
			 Si.FlipKart();
			 Sp.Scroll();
			 Sp.My_Account();
			 Thread.sleep(3000);
			 Lp.MyProfi();
			 Thread.sleep(1000);
			 Lp.Logout();	
	}
	}