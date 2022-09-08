package testclass;

import org.testng.annotations.Test;

public class Logintest extends Baseclass {
	@Test
	public void verifyLogInTab()
	{
	
		lp.logIn();
		lp.userName();
		lp.passWord();
		lp.logInButton();

		
		
	}
	

	
	
	
	
	
	
	
	
	
	
	
}


