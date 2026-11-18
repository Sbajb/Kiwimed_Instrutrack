package aPOM_Classes;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utility_package.Utility_class;
  
public class Instrument {
	
WebDriver driver;

@FindBy(xpath="/html/body/app-root/app-private-layout/app-navbar/div/ul/li[9]/a")
private WebElement InstrumentModule;

@FindBy(xpath="/html/body/app-root/app-private-layout/div/div/div/app-instrumentslist/div[2]/div/form/div/div[1]/div/div[7]/a")
private WebElement CreateNewInstrument;
	//@FindBy(xpath="//a[@class='page_btn']") private WebElement CreateNew;
	
@FindBy(xpath="//input[@formcontrolname='Name']")
private WebElement InstrumentName;

@FindBy(xpath="//select[@formcontrolname='Inventoryid']")
private WebElement InventoryTypeDropdown;

@FindBy(xpath="//select[@formcontrolname='CategoryId']")
private WebElement DropdownInstrumentCategory; 

@FindBy(xpath=" //select[@formcontrolname='SubCategoryId']")
private WebElement  InstrumentSubcategory; 

@FindBy(xpath="//select[@formcontrolname='SterilizationId']")
private WebElement SterilizationID;  

@FindBy(xpath="(//input[@type='radio'])[2]")
private WebElement ExpiryRelated;  


@FindBy(xpath="//input[@formcontrolname='Vendor']")
private WebElement VendorName;  

@FindBy(xpath="(//div//typeahead-container//button)[2]")
private WebElement SelectVendorNmae;  

@FindBy(xpath="//input[@formcontrolname='Purchasedby']") 
private WebElement PurchaseBy; 

@FindBy(xpath="(// typeahead-container [@class ='dropdown open dropdown-menu']//button)[2]")
private WebElement PurchaseByValue;  

@FindBy(xpath="//input[@formcontrolname='Purchasedon']")
private WebElement DatepickerAccess;

@FindBy(xpath="//input[@formcontrolname='Purchasedon']")
private WebElement Datepicker;

@FindBy(xpath="//div[@class='bs-datepicker-container']//table//tbody//tr[4]//td[2]")
private WebElement ClickOnDate;

@FindBy(xpath="/html/body/modal-container/div/div/app-time-pick/div/div[2]/button")
private WebElement ClickOnTime;

@FindBy(xpath="//input[@formcontrolname='Noofinstrument']")
private WebElement SendInstrumetnNo;

@FindBy(xpath="//button[@type='submit']")
private WebElement SaveButton;

@FindBy(xpath="(//div[@class='table-responsive']//table//tr//td)[7]")
private WebElement InstrumentID;

@FindBy(xpath="/html/body/app-root/app-private-layout/div/div/div/app-instrumentadd/div[2]/div/form/div/div[5]/div/a")
private WebElement CancelButton;




@FindBy(xpath="/html/body/app-root/app-private-layout/app-navbar/div/ul/li[1]/a") private WebElement Decontamination;
@FindBy(xpath= "/html/body/app-root/app-private-layout/app-navbar/div/ul/li[1]/div/a[1]") private WebElement Receive; 
@FindBy(xpath= "//input[@typeaheadoptionfield='name']") private WebElement SendID;



public  Instrument(WebDriver driver)
	                {
	                  PageFactory.initElements(driver,this);
	                }
	
	
public void AcccessToInstrumentModule()
{
	InstrumentModule.click();
}

public void ClickCreateNewInstrumentButton()
{	CreateNewInstrument.click();     
}
	
	
public void dropdownInventoryType()
{
	Select drop =new Select(InventoryTypeDropdown);
	drop.selectByVisibleText("Individual");
}
	
public void CategoryDropDown()
{
	Select drop2 =new Select(DropdownInstrumentCategory);
	drop2.selectByVisibleText("scissor10x20");
}
	
public void Subcategory()
{           
	Select drop3=new Select(InstrumentSubcategory);
	drop3.selectByVisibleText("Dish kidney small");
}
	

public void SendInstrumentName() throws IOException
{	InstrumentName.sendKeys(Utility_class.GetPropertyFileData("InstrumentNamme"));     
}
	

public void SterilizationID()
{           
	Select drop3=new Select(SterilizationID);
	drop3.selectByVisibleText("Steam");
}
public void Expiry()
{
	ExpiryRelated.click();
}

public void VendorNmae()
{
	VendorName.click();
}

public void SelectVendorNames()
{
	SelectVendorNmae.click();
}

public void ClickPurchaseBy()         //
{
	PurchaseBy.click();
}

public void SelectPurchaseBy()          //
{
	PurchaseByValue.click();           //	driver.findelements=// typeahead-container [@class ='dropdown open dropdown-menu']//button
}

 

public void ClickOndatepicker()
{
	DatepickerAccess.click();
}
	

public void ClickOnDate()
{
	ClickOnDate.click();
}


//public void ScrollIntoview()
//{
//driver=new ChromeDriver();
//JavascriptExecutor JS=(JavascriptExecutor)driver;
//JS.executeScript(("argument[0].scrollIntoView();"),ClickOnTime);
//}
 
	
//public void ClickOnTime()
//{
//	ClickOnTime.click();
//}
	
	
//public void IframeTime()
//{
//	driver=new ChromeDriver();
//	driver.switchTo().frame()
//}

 public void ClickONCancelButton()
 {
	 CancelButton.click();
 }

	
 
 
 
 
 
 
 
 
 
 
 
 

 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

