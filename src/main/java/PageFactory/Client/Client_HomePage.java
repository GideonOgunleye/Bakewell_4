package PageFactory.Client;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import BaseUtilities.DriverLoad;

public class Client_HomePage extends DriverLoad{

	public Client_HomePage(WebDriver driver){
		
		this.driver = driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);
		//PageFactory.initElements(driver, this);
		
	}
	
	
	/*****Page Elements******/
	@FindBy(xpath = "")
	WebElement PageHeader;
	
	@FindBy(xpath = "")
	WebElement LoginLink;
	
	@FindBy(xpath = "")
	WebElement RegisterLink;
	

}
