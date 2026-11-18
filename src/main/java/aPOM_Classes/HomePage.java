package aPOM_Classes;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
	
	WebDriverWait wait;
	
@FindBy(xpath="(//strong[text()='Sam mark'])[1]") private WebElement ActualUsername;  
	
	
	
public  HomePage(WebDriver driver)
{
PageFactory.initElements(driver,this);

wait=new WebDriverWait(driver, Duration.ofSeconds(60));
}

	
public String ActualUsernames()
	{
	
	wait.until(ExpectedConditions.visibilityOf(ActualUsername));
	String Username=ActualUsername.getText();
	return Username;
	}




}
