package aPOM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	
@FindBy(xpath="/html/body/app-root/app-private-layout/app-header/header/div/div[2]/ul/li[2]/strong") private WebElement ActualUsername;  
	
	
	
public  HomePage(WebDriver driver)
{
PageFactory.initElements(driver,this);
}

	
public String ActualUsernames()
	{
		String Username=ActualUsername.getText();
		return Username;
	}


}
