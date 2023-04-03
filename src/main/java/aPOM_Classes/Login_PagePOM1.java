package aPOM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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



public void SendUsername(String Username)
{
	Usernames.sendKeys(Username);
}

public void Passwords(String Username)
{
	Password.sendKeys(Username);
}

public void ClickLoginButton()
{
	Loginbutton.click();
}



}