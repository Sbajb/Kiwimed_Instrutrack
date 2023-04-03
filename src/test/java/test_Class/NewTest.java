package test_Class;


import base_clases.Base_class1;
import eCOMPOM.HOme_page;
import utility_package.Utility_class;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest extends Base_class1 {
	
String TCID;
HOme_page homepage;
 
	
	
@BeforeClass
public void LaunchBrowsers() {
	launchingBrowser(); 
	 homepage = new  HOme_page(driver);
 }

@BeforeMethod

public void launchingURL() throws IOException
{
  URL_Access();
	
}

@Test
public void categoryValidation() throws IOException
{
 TCID="TC01";
 String  Expected_Category=Utility_class.GetPropertyFileData("caregory");
 System.out.println("expected category is "+Expected_Category);
 
 String  Actual_Category=homepage.category();
 System.out.println("Actual category "+Actual_Category);
 
 Assert.assertEquals(Expected_Category, Actual_Category,"Category is not matching"+TCID+"faied");
   
}

@Test
public void product1validation() throws IOException
{
 TCID="TC02";
 String  Expected_Product1=Utility_class.GetPropertyFileData("product1");
 System.out.println("expected category is "+Expected_Product1);
 
 String  Actual_product1=homepage.product1();
 System.out.println("Actual category "+Actual_product1);
 
 Assert.assertEquals(Expected_Product1, Actual_product1,"Category is not matching"+TCID+"faied");
   
}

@AfterMethod

public void FailedTestCasescreenshot(ITestResult result) throws IOException
{
	if(result.getStatus()==ITestResult.FAILURE)
	{
		Utility_class.takescreenshot(driver, TCID);
	}
	
	else if(result.getStatus()==ITestResult.SUCCESS)
	{
		Utility_class.takescreenshot2(driver, TCID);
	}
}

  
  
 
	  
  

}
