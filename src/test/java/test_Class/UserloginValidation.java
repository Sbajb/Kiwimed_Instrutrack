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
import aPOM_Classes.HomePage;
import aPOM_Classes.Instrument;
import aPOM_Classes.Login_PagePOM1;
import base_clases.Base_class1;
import utility_package.Utility_class;

public class UserloginValidation extends Base_class1 {
Login_PagePOM1 Loginage;
HomePage homepageobj;
String TCID;
CategoryPOM category;
Instrument instrumentPOM;
Decontamination Decon;
WebDriverWait wait;

@BeforeClass

public void LaunchBrowser() {

launchingBrowser(); // we can also dorecrly mention the method
//LoginValidation testobject =new  LoginValidation();//and also by using the inheritance principle
//testobject.LaunchBrowser();

Loginage = new Login_PagePOM1(driver);
homepageobj = new HomePage(driver);
category = new CategoryPOM(driver);
instrumentPOM = new Instrument(driver);
Decon = new Decontamination(driver);

	}

@BeforeMethod
public void LaunchingURL() throws IOException, InterruptedException {
	
URL_Access();

		// entering the User name
Loginage.SendUsername(Utility_class.GetPropertyFileData("Username"));
Thread.sleep(500);

		// driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30000));

		// driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30000));

		// Entering the password
Loginage.Passwords(Utility_class.GetPropertyFileData("Password"));
Thread.sleep(500);

		// driver.manage().timeouts().implicitlyWait(Duration.ofMillis(15000));

		//Loginage.ClickLoginButton();
		
Actions act9 = new Actions(driver);
WebElement Loggingbutton=Loginage.ClickLoginButtonByactionclass();
System.out.println(Loggingbutton);
act9.click(Loggingbutton).perform();

//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
//FluentWait<WebDriver> fluentWait = new FluentWait<>(driver)
//.withTimeout(Duration.ofSeconds(30))
//.pollingEvery(Duration.ofMillis(500))
//.ignoring(NoSuchElementException.class);


Thread.sleep(35000);
		// driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
Reporter.log("The user successfully logged in to the application"); 
}

@Test
public void Total_Flow_() throws IOException, InterruptedException {
TCID = "KIWIMED01";

String ExpectedUsername = Utility_class.GetPropertyFileData("ExpectedUsernameAfterlogin");
String ActualUsername = homepageobj.ActualUsernames(); // or we can direct call method as shown below
System.out.println("Actual Username is :" + ActualUsername);
Assert.assertEquals(ExpectedUsername, ActualUsername, "Username is not matching" + TCID + "failed");
Thread.sleep(1000);

Reporter.log("Expected user logged in to the application"); 

 
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
