package aPOM_Classes;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility_package.Utility_class;

public class Distribution {
	
@FindBy(xpath="(//a[@data-toggle='collapse'])[3]") private WebElement Dis;

@FindBy(xpath="/html/body/app-root/app-private-layout/app-navbar/div/ul/li[4]/div/a[1]") private WebElement Dispatch;

@FindBy(xpath="//input[@placeholder ='Scan operator ID']") private WebElement scanop;

@FindBy(xpath="//input[@placeholder='Select/ Scan location']") private WebElement Scanloc;

@FindBy(xpath="//input[@placeholder='Scan cart ID/ Item(s) ID']") private WebElement ScanItem;








public  Distribution(WebDriver driver)
{
PageFactory.initElements(driver,this);
}


public void DispatchClick1()
{	Dis.click();     
}
	
public void DispatchClick()
{	Dispatch.click();     
}

public void ScanOperatorID() throws IOException
{	scanop.sendKeys(Utility_class.GetPropertyFileData("OperatorID"));     
}


public void ScanLocationID() throws IOException
{	Scanloc.sendKeys(Utility_class.GetPropertyFileData("LocationID"));     
}

public void ScanItemID() throws IOException
{	ScanItem.sendKeys(Utility_class.GetPropertyFileData("ItemIDs"));     
}










	
	

}
