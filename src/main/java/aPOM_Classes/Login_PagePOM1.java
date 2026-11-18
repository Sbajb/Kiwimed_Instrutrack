package aPOM_Classes;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Login_PagePOM1 {
	
	
	 
 
	
	
 
	 
	 
	@FindBy(xpath="//input[@placeholder='Username']") private WebElement Usernames;
	@FindBy(xpath="//input[@placeholder='Password']") private WebElement Password; 
	@FindBy(xpath=" //button[@class='blue_btn']") private WebElement Loginbutton;  

	 

public  Login_PagePOM1(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
	  




/*
 * public void highlight() throws InterruptedException { JavascriptExecutor js =
 * (JavascriptExecutor)driver;
 * js.executeScript("arguments[0].style.backgroundColor = 'yellow'", Usernames);
 * Thread.sleep(500);
 * js.executeScript("arguments[0].style.backgroundColor = ''", Usernames); }
 */
 


public WebElement usernameElement()
{
	return Usernames  ;
	
}

public void SendUsername(String Username)
{
	Usernames.sendKeys(Username);
}

public void Passwords(String Pass)
{
	Password.sendKeys(Pass);
}


  //public void ClickLoginButton() 
 // { Loginbutton.click(); }

 public WebElement ClickLoginButtonByactionclass()
  {
	 return Loginbutton;
  
  }
 






}