package eCOMPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HOme_page {
	
@FindBy(xpath="//h2[text()='Gaming accessories']") private WebElement Homepage;
@FindBy(xpath="//span[text()='Headsets']") private WebElement product1;
@FindBy(xpath="//span[text()='Keyboards']") private WebElement product2;



	
	
	
	
	
	
	
	
public HOme_page(WebDriver driver)
	{
	PageFactory.initElements(driver,this);
	}

public String category() {
	String Item_category=Homepage.getText();
	return Item_category;
}

public String product1() {
	String Item_category=product1.getText();
	return Item_category;
}

public String product2()
{
	String productno2=product2.getText();
	return productno2; 
	
}

 

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

















