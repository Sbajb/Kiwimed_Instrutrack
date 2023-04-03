package utility_package;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility_class {
	
	public static String GetPropertyFileData(String key) throws IOException
	
	{
		Properties prop=new Properties();
		
		FileInputStream file=new FileInputStream("C:\\Users\\sbambilke\\eclipse-workspace\\DD framework\\AID_Projectname\\K.properties");
		prop.load(file);
		String GetKeyValue =prop.getProperty(key);
		return GetKeyValue;
		
	}
	
	public static void takescreenshot (WebDriver driver,String TCID) throws IOException
	{
		File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest= new File("E:\\Failed\\"+TCID+"image.Png");
		FileHandler.copy(source, dest);
	}
	public static void takescreenshot2 (WebDriver driver,String TCID) throws IOException
	{
		File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest= new File("E:\\Passsed\\pass"+TCID+"images.Png");
		FileHandler.copy(source, dest);
	}
	
	

}
