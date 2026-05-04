package Com.CRM.TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Com.CRM.pages.Loginpage1;
import Com.CRM.pages.Homepages;


public class Loginpagetestcase extends Baseclass{
	
	@BeforeClass
	public void setuppage()
	{
		hp.clicklogin();
	}

	@Test
	
		public  void logincheck()
		{
			
			String act=lp.loginValidate("test@123","pwd");
			Assert.assertTrue(act.contains("customers"), "Fail");
			System.out.println("Pass");
		}
	}
