package aPOM_Classes;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility_package.Utility_class;

public class Decontamination {
	 
	WebDriver driver;
 
	
	
@FindBy(xpath="/html/body/app-root/app-private-layout/app-navbar/div/ul/li[1]/a") private WebElement Decontamination;
@FindBy(xpath= "/html/body/app-root/app-private-layout/app-navbar/div/ul/li[1]/div/a[1]") private WebElement Receive; 
@FindBy(xpath= "//input[@typeaheadoptionfield='name']") private WebElement SendID;
@FindBy(xpath= " (//button[@type='button'])[4]") private WebElement Enter;
@FindBy(xpath= "/html/body/app-root/app-private-layout/app-navbar/div/ul/li[1]/div/a[3]") private WebElement Disinfection;
@FindBy(xpath= "(//input[@placeholder='Scan machine ID'])[1]") private WebElement MachineID;
@FindBy(xpath= "//input[@placeholder ='Scan item(s) ID/ Program cycle barcode/ Tray ID/ Machine ID (To complete the load)']")
private WebElement Scan;
@FindBy(xpath= "(//button[@type='button'])[10]") private WebElement Confirm;
@FindBy(xpath= "//a[@ng-reflect-router-link='/private/de-con/decon-unload-d']") private WebElement unload;
@FindBy(xpath= "//input[@type = 'text']") private WebElement ScanUnloading;
@FindBy(xpath= "(//button[@ type='button'])[3]") private WebElement Confm;
@FindBy(xpath= "//input[@type= 'file']") private WebElement upld;
@FindBy(xpath= "(//button[@type='button'])[5]") private WebElement proceed;
@FindBy(xpath= "//input[@typeaheadoptionfield='name']") private WebElement Scanmid;

@FindBy(xpath= "(//a[@data-toggle='collapse'])[2]") private WebElement cntrol;
@FindBy(xpath= "//a[@ng-reflect-router-link='/private/control-packing/load-']") private WebElement sterilizer;   //  click onload sterilizer
@FindBy(xpath= "//input[@placeholder='Scan machine ID']") private WebElement scanmd;  // scan machine ID to load then enter
@FindBy(xpath= "//input[@placeholder='Scan item ID/ Program cycle barcode/ Machine ID'] ") private WebElement scantosubmit; // san steri. machiner to submit
@FindBy(xpath= "(//button[@type='button'])[7]") private WebElement cnfrm;      //  confirmation yes click
@FindBy(xpath= "(//*[@id=\"sidebar-wrapper\"]//li)[7]") private WebElement eqpmnt;   //click on equipment loggging
@FindBy(xpath= "//h3[text()='Equipment Logging']") private WebElement text;      //get text from eqiupment loggging



public Decontamination(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}


public void Click_On_Decontamination()
{
	Decontamination.click();
}

public void Click_On_Receive()
{
	Receive.click();
}

public void Scan_InstrumentID() throws IOException
{
	//SendID.sendKeys("IS08230000423440501");
	 
	 SendID.sendKeys(Utility_class.GetPropertyFileData("InID"));
	
	
}

public void Enter_To_submit()
{
   Enter.click();
	
	
}



public void Disinfection_loading()
{
	Disinfection.click();
	
	
}


public void Scan_Machin_ID_To_Load() throws IOException
{
  MachineID.sendKeys(Utility_class.GetPropertyFileData("MID"));
  
}


public void Scan_Machin_ID_to_submit() throws IOException
{
	Scan.sendKeys(Utility_class.GetPropertyFileData("MID"));
  
}


public void Confirmationpopup() throws IOException
{
	Confirm.click();
  
}


public void Disinfection_Unload() throws IOException
{
	unload.click();
  
}


public void Scan_Machin_ID_AT_UnLoadingScreen() throws IOException
{
	ScanUnloading.sendKeys(Utility_class.GetPropertyFileData("MID"));
  
}

public void ConfirmationPopUPAtUnloading() throws IOException
{
	Confm.click();
  
}

public void UploadingFIleAtDisinfection() throws IOException
{
  upld.sendKeys("C:\\Users\\sbambilke\\Desktop\\ASDf.pdf");
  
}


public void ProceedToUnloadSCreen() throws IOException
{
	proceed.click();
  
}
 
 
public void Scan_Machin_ID_To_Unoad_Washer() throws IOException
{
	Scanmid.sendKeys(Utility_class.GetPropertyFileData("MID"));
  
}
  

//Stariliser


/*
 * public void ClickOnControlAndPacking() throws IOException { cntrol.click();
 * 
 * }
 */
public WebElement ClickOnControlAndPackingByACtionClass() 
{
	return cntrol  ;
	 
}




 


public void ClickOnLoadSterilizer() throws IOException
{
	sterilizer.click();
  
}

 

public void Scan_Machin_ID_At_SterilizerScreen() throws IOException
{
	scanmd.sendKeys(Utility_class.GetPropertyFileData("StMID"));
  
}

//enter



public void Scan_Sterilizer_Machin_ID_TO_Submit() throws IOException
{
	scantosubmit.sendKeys(Utility_class.GetPropertyFileData("StMID"));
  
}
//enter


  public WebElement ActionConfirmationPopUpSterilizer() throws IOException
  {
	return  cnfrm ;
  
 }
 


 

public void MovingToEquipmentLogging() throws IOException
{
	eqpmnt.click();
	 
  
}


public String GetTextFromEquipmentlogging()  
{
	String ExpectedText=text.getText();
	return ExpectedText;
	 
}

public void  ActionEnter()  
{
	Actions act6 = new Actions(driver);
    act6.sendKeys(Keys.ENTER).perform();
}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
