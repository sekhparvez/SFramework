package testFB;


import org.testng.annotations.Test;

import base.config;
import locators.Fb_Login_Loc;
import values.Fb_LoginValues;

public class TC_Loginwithinvalidcred extends config {
	
	Fb_Login_Loc loc = new Fb_Login_Loc();
	Fb_LoginValues val = new Fb_LoginValues();
	
	@Test
	public void logintest() {

		typeByXpath (loc.email,val.userName);
		typeByXpath (loc.pass,val.userPass);
		clickByXpath (loc.login);
	driver.quit();
	}
	
}
