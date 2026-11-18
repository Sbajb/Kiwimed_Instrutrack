package test_Class;

 

import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import aPOM_Classes.CategoryPOM;
import aPOM_Classes.Decontamination;
import aPOM_Classes.Distribution;
import aPOM_Classes.HomePage;
import aPOM_Classes.Instrument;
import aPOM_Classes.Login_PagePOM1;
import base_clases.Base_class1;
import utility_package.Utility_class;

public class Distribution_flow extends Base_class1 {
Login_PagePOM1 Loginage;
Distribution Dist;

String TCID;
 

@BeforeClass

public void LaunchBrowser() {

launchingBrowser(); // we can also dorecrly mention the method
//LoginValidation testobject =new  LoginValidation();//and also by using the inheritance principle
//testobject.LaunchBrowser();

Loginage = new Login_PagePOM1(driver);
Dist = new Distribution (driver);
 
	}

@BeforeMethod
public void LaunchingURL() throws IOException, InterruptedException {
	
URL_Access();

		// entering the User name
Loginage.SendUsername(Utility_class.GetPropertyFileData("Username"));
Thread.sleep(500);
 

		// Entering the password
Loginage.Passwords(Utility_class.GetPropertyFileData("Password"));
Thread.sleep(500);

		// driver.manage().timeouts().implicitlyWait(Duration.ofMillis(15000));

		//Loginage.ClickLoginButton();
		
Actions act9 = new Actions(driver);
WebElement Loggingbutton=Loginage.ClickLoginButtonByactionclass();
System.out.println(Loggingbutton);
act9.click(Loggingbutton).perform();

 

Thread.sleep(35000);
		// driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
Reporter.log("The user successfully logged in to the application"); 
}

@Test
public void Total_Flow_() throws IOException, InterruptedException {
TCID = "KIWIMED04";

Reporter.log("CLicking on Distribution");


Dist.DispatchClick1();
Thread.sleep(5000);
 
Dist.DispatchClick();
Thread.sleep(5000);

Dist.ScanOperatorID();

Actions act = new Actions(driver);
act.sendKeys(Keys.ENTER).perform();
Thread.sleep(500);


Dist.ScanLocationID();
Actions act2 = new Actions(driver);
act2.sendKeys(Keys.ENTER).perform();
Thread.sleep(500);

Dist.ScanItemID();
Actions act3 = new Actions(driver);
act3.sendKeys(Keys.ENTER).perform();
Thread.sleep(500);
 

 

 
}

@AfterMethod

	public void FailedTestCasescreenshot(ITestResult result) throws IOException {
		if (result.getStatus() == ITestResult.FAILURE) {
			Utility_class.takescreenshot(driver, TCID);
		}

		if (result.getStatus() == ITestResult.SUCCESS) {
			Utility_class.takescreenshot2(driver, TCID);
		}
		
		
		
		
}
	

}
