package pageclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInpage {
  
	
	private WebElement logIn;
	private WebElement userName;
	private WebElement passWord;
	private WebElement logInButton;
	

	
	

	public LogInpage(WebDriver driver) {
		 logIn=driver.findElement(By.id("login2"));
		 userName=driver.findElement(By.id("loginusername"));
		 passWord=driver.findElement(By.id("loginpassword"));
		 logInButton=driver.findElement(By.xpath("//button[text()='Log in']"));
	}



	public WebElement logIn()
		{
			logIn.click();
			return logIn;
		}
		public void userName()
		{
			userName.sendKeys("arnav99");
		}
		public void passWord()
		{
			passWord.sendKeys("arnav123");
		}
		public void logInButton()
		{
			logInButton.click();
		}
} 	
	
		

		 
		 
		 
		 
		 
	
	 
	

