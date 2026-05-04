package Com.CRM.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import Com.CRM.pages.Homepages;
import Com.CRM.pages.Loginpage1;

public class Baseclass {

	public WebDriver driver;
	public Homepages hp;
	public Loginpage1 lp;

	@BeforeTest
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://automationplayground.com/crm/");
		  hp= new Homepages(driver);
		  lp=new Loginpage1(driver);
		
	}
}
