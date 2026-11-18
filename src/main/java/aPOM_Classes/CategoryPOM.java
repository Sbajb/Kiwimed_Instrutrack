package aPOM_Classes;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility_package.Utility_class;

public class CategoryPOM {
	
	
@FindBy(xpath="/html/body/app-root/app-private-layout/app-navbar/div/ul/li[5]/a") 
private WebElement CategoryModule;

@FindBy(xpath="//a[@class='page_btn']") 
private WebElement CreateNew;

@FindBy(xpath="//*[@id=\"category\"]") 
private WebElement categoryName;

@FindBy(xpath="//textarea[@formcontrolname='description']") 
private WebElement Description;

@FindBy(xpath="//input[@formcontrolname='subcategoryName']") 
private WebElement Subcategory;

@FindBy(xpath="/html/body/app-root/app-private-layout/div/div/div/app-categoryentry/div[1]/div/div/form/div[1]/div/div/div[2]/div[3]/div[2]/div[1]/i") 
private WebElement AddsubCattextBox;

@FindBy(xpath="//*[@id=\"subCatName-1\"]") 
private WebElement Subcategory2;

@FindBy(xpath="/html/body/app-root/app-private-layout/div/div/div/app-categoryentry/div[1]/div/div/form/div[2]/div/div[2]/button[2]\r\n"+ "") 
private WebElement Savecategory;

@FindBy(xpath="//*[@id=\"successmessage\"]/div/div/div[2]/button") 
private WebElement OK_POPupbutton;

@FindBy(xpath="/html/body/app-root/div[3]/div/div/div[2]/button") 
private WebElement Cancelbutton;

@FindBy(xpath="(//button[@type='button'])[3]") 
private WebElement CancelbuttonCategoryScreen;




 

public  CategoryPOM(WebDriver driver)
{
PageFactory.initElements(driver,this);
}


public void AccessToCategoryModule()
{
	CategoryModule.click();
}
public void Cretae_New()
{
	CreateNew.click();
}
public void CategoryName()
{
	categoryName.sendKeys("scissor10x20");
}
public void Descriptions()
{
Description.sendKeys("The description  of the category should be be of the length 4000 ");
	
}

public void SubcategoryName()
{
	Subcategory.sendKeys("CategoryName");
}
public void AddsubcatBOX()
{
	AddsubCattextBox.click();
}

public void SubcategoryName2() throws IOException
{
	Subcategory2.sendKeys(Utility_class.GetPropertyFileData("Subcategory"));
}


public void SavecategoryClick() {
Savecategory.click();
}

public void OKpopupClick() {
Savecategory.click();
}

public void CancelPOPclick() {
	Cancelbutton.click();
}
	
	public void CancelbuttonCategory()
	{
		CancelbuttonCategoryScreen.click();
	}
	
	
	
}






