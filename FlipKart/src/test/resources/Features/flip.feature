Feature: This Feature file is for  validating Login functionality

Author:Rushi
@regression
Scenario: Verify Login for flipkart
Given open url
When Enter valid Username and Password "login.username", "login.password"
Then login succesfully
Then Search Product
Then click on the product
Then select storage and Ram 
Then Enter Pincode & click on check
Then Click on addToCart
Then click PlaceOrder
Then Click Continue
Then payment
Then Flipkart
Then MyAccount
Then More
Then mobile
Then Scroll
Then cart
Then Logout