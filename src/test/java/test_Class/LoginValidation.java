package test_Class;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import aPOM_Classes.CategoryPOM;
import aPOM_Classes.HomePage;
import aPOM_Classes.Instrument;
import aPOM_Classes.Login_PagePOM1;
import base_clases.Base_class1;
import utility_package.Utility_class;

public class LoginValidation extends Base_class1 { 
	
	Login_PagePOM1 Loginage;
	HomePage homepageobj;
	String TCID;
	CategoryPOM category;
	Instrument instrumentPOM;
	
	
@BeforeClass
public void LaunchBrowser()
{
	
launchingBrowser();   // we can also dorecrly mention the method
//LoginValidation testobject =new  LoginValidation();//and also by using the inheritance principle
//testobject.LaunchBrowser();

Loginage = new Login_PagePOM1(driver);
homepageobj =new HomePage (driver);
category =new CategoryPOM (driver);
instrumentPOM =new Instrument(driver);
 

}

@BeforeMethod
public void LaunchingURL() throws IOException
{
	URL_Access();
	
	//entering the User name
	Loginage.SendUsername(Utility_class.GetPropertyFileData("Username"));
	
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	
	//Entering the password
	Loginage.Passwords(Utility_class.GetPropertyFileData("Password"));
	
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(15000));
	
	Loginage.ClickLoginButton(); 
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30000));
	
	
	
	
}
@Test
public void Loginvalidation() throws IOException
{
	 TCID="KIWI01";
			
	String ExpectedUsername=Utility_class.GetPropertyFileData("ExpectedUsernameAfterlogin");
	String ActualUsername= homepageobj.ActualUsernames();    //or we can direct call method as shown below
	System.out.println("Actual Username is :"+ActualUsername);
	
	 Assert.assertEquals(ExpectedUsername,ActualUsername,"Username is not matching"+"TCID"+"failed" );
	 
	 category.AccessToCategoryModule();
     category.Cretae_New();
     driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));

     category.CategoryName();
     driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
     category.Descriptions();
     driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
     
     category.SubcategoryName();
     driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
     
     category.AddsubcatBOX();
     driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
     
     category.SubcategoryName2();
     driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
     
     category.SavecategoryClick();
     driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
     
  // try
   
  //.OKpopupClick();
  // driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
  //  }
  // catch (Exception e)
   // {
 //  System.out.println("category same name not allowed");
   // }
 
   //finally{
    
     category.CancelPOPclick();
     driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
         
   
    category.CancelbuttonCategory();
    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
    
    instrumentPOM.AcccessToInstrumentModule();
    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
    
    instrumentPOM. ClickCreateNewInstrumentButton();
    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
    
    
   // instrumentPOM.DropdownClick();
    
    instrumentPOM.dropdownInventoryType();
    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));   
    
    instrumentPOM.CategoryDropDown();
    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
    
    instrumentPOM.Subcategory();
    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
    
    instrumentPOM.SendInstrumentName();
    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
    
    instrumentPOM.SterilizationID();
    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
    
    instrumentPOM.Expiry();
    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
    
    instrumentPOM.VendorNmae();
    
    instrumentPOM.SelectVendorNames();
    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
    
    instrumentPOM.ClickPurchaseBy();
    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
    
    
    instrumentPOM.SelectPurchaseBy();
    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
    
//    instrumentPOM.ClickOndatepicker();
//    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
//    
//    instrumentPOM.ClickOnDate();
//    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
    
    instrumentPOM.ClickONCancelButton();
    
   
    
    
 
    
    
   
   
   
}

 
 
	 
	


@AfterMethod

public void FailedTestCasescreenshot(ITestResult result) throws IOException
{
	if(result.getStatus()==ITestResult.FAILURE)
	{
		Utility_class.takescreenshot(driver, TCID);
	}
	
	if(result.getStatus()==ITestResult.SUCCESS)
	{
		Utility_class.takescreenshot2(driver, TCID);
	}
}





















	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
