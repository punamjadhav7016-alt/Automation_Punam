package Com.CRM.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepages {

	private  WebDriver driver;
	
	public Homepages(WebDriver driver) {

		this.driver=driver;
	}
		private By link=By.linkText("Sign In");
		
		public String AppUrl() {
			
			
			return driver.getCurrentUrl();
		}
public String getTitle() {
			
			
			return driver.getTitle();
		}
		
public String clicklogin() {
	
	driver.findElement(link).click();
	
	return driver.getCurrentUrl();
}
		
	}
	
	

