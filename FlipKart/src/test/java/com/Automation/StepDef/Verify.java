package com.Automation.StepDef;

import com.Automation.Generic.PropertyReader;
import com.Automation.Pages.LoginPage;
import com.Automation.Pages.SearchIteam;
import com.Automation.Pages.SearchPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Verify  {
	LoginPage Lp=new LoginPage();
	SearchPage Sp=new SearchPage();
	SearchIteam Si=new SearchIteam();
	@Given("open url")
	public void open_url() {
		Lp.OpenUrl();
	}

	@When("Enter valid Username and Password {string}, {string}")
	public void enter_valid_username_and_password(String string, String string2) throws InterruptedException {
		Lp.Mobno(PropertyReader.getProperty (string));
		 Lp.pass(PropertyReader.getProperty (string2));
		 Thread.sleep(1000);
	  
	}

	@Then("login succesfully")
	public void login_succesfully() throws InterruptedException {
		 Lp.clickLogin1();
		 Thread.sleep(1000);
	    
	}
	@Then("Search Product")
	public void search_product() throws InterruptedException {
		 Sp.enterProdclick(PropertyReader.getProperty("product"));			//for search product
		 Thread.sleep(1000);
	   
	}

	@Then("click on the product")
	public void click_on_the_product() throws InterruptedException {
		 Sp.clickSearch();
		 Sp.javascript1();
		 Thread.sleep(1000);
			Sp.Mob();
	   
	}

	@Then("select storage and Ram")
	public void select_storage_and_ram() throws InterruptedException {
		 Sp.anotherwebsite();
		 Thread.sleep(3000);
		 Sp.storage();
		 Thread.sleep(3000);
		 Sp.ram();
		 Thread.sleep(3000);
	   
	}

	@Then("Enter Pincode & click on check")
	public void enter_pincode_click_on_check() throws InterruptedException {
		 Sp.pincode(PropertyReader.getProperty("PINCODE"));
		 Thread.sleep(3000);
		 Sp.check();
		 Thread.sleep(3000);
	  
	}

	@Then("Click on addToCart")
	public void click_on_add_to_cart() throws InterruptedException {
		
		 Sp.addkart();
		 Thread.sleep(3000);
	    
	}

	@Then("click PlaceOrder")
	public void click_place_order() throws InterruptedException {
		Sp.placeorder();
		 Thread.sleep(1000);
	   
	}

	@Then("Click Continue")
	public void click_continue() throws InterruptedException {
		
		Sp.conti();
		 Thread.sleep(3000);
	   
	}

	@Then("payment")
	public void payment() {
		Sp.payment();
	  
	}
	
	@Then("Flipkart")
	public void flipkart() throws InterruptedException {
		 Sp.My_Account();					
		 Thread.sleep(3000);
	  
	}

	@Then("MyAccount")
	public void my_account() throws InterruptedException {
		
		 Sp.more();					
		 Thread.sleep(3000);
	  
	}

	@Then("More")
	public void more() throws InterruptedException {
		 Sp.mobile();
		 Thread.sleep(3000);
	   
	}

	@Then("mobile")
	public void mobile() throws InterruptedException {
		Sp.Scroll();
		 Thread.sleep(3000);
		 Si.cart();
		 Thread.sleep(3000);
	   
	}

	@Then("Scroll")
	public void scroll() throws InterruptedException {
		 Sp.javascript1();
		 Si.remove();
		 Thread.sleep(1000);
		 Si.removepop();
		 Thread.sleep(1000);
	    
	}

	@Then("cart")
	public void cart() throws InterruptedException {
		 Si.FlipKart();
		 Sp.Scroll();
		 Sp.My_Account();
		 Thread.sleep(1000);
		 Lp.Logout();
	    }
	
	@Then("Logout")
	public void logout() throws InterruptedException {
		 Lp.MyProfi();
		 Thread.sleep(1000);
		 Lp.Logout();
	}

}
