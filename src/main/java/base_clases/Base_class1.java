package base_clases;

import java.io.IOException;

import java.time.Duration;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility_package.Utility_class;

public class Base_class1 {
	
	protected static WebDriver driver;
	
 
	
	public void launchingBrowser()
	{
		
//System.setProperty("webdriver.chrome.driver","C:\\chromedriverextension\\chromedriver.exe");
	   // System.setProperty("webdriver.http.factory", "jdk-http-client");
		
      // WebDriverManager.chromedriver().setup();
	   //System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		ChromeOptions options=new ChromeOptions();
		 
		driver = new ChromeDriver(options);
		
	  options.addArguments("--start-maximized");

		 
		
		
		
		//options.setExperimentalOption("debuggerAddress", "localhost:8866");
		

		
	   // driver = new ChromeDriver();
	    
	   // options.addArguments("user-data-dir=/path/to/your/custom/profile");
	    
	    
	    
	    
	    
	    
	    
//	    
//	            chrome_options1.add_argument("--incognito")
//	    	    chrome_options1.add_argument('--disable-popup-blocking')
//	    	    chrome_options1.add_argument("--force-device-scale-factor=0.8")
//	    	    driver = Chrome(options=chrome_options1, version_main=116)
//	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		//WebDriverManager.edgedriver().setup();
       // driver =new EdgeDriver();

	    
		
	
		
		
		
		
		
		
		
		//options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
     	//options.addArguments("--disable-features=NetworkService");
	    //options.addArguments("--dns-prefetch-disable");
	   // options.addArguments("--disable-extensions");
    	//options.setProxy(null);
		
		// driver=new ChromeDriver();
		
		 
	    // WebDriverManager.chromedriver().setup();
		// WebDriverManager.chromedriver().setup();
		
	}
	
	public void URL_Access() throws IOException
	{
		driver.get(Utility_class.GetPropertyFileData("URL"));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		driver.manage().window().maximize();
	}
	
	public void ClosingBrowser()
	{
		driver.quit();
	}

}


