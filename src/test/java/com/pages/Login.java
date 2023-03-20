package com.pages;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class Login {
		
		public WebDriver driver;
		
		
		@FindBy(xpath="//input[@class='input_error form_input']")
		WebElement  username;

		@FindBy(xpath="//input[@placeholder='Password']")
		WebElement password;
		
		@FindBy(xpath="//input[@type='submit']")
		WebElement loginButton;
		
		@FindBy(xpath="//div[@class='app_logo']")
		WebElement logo;
		
		@FindBy(xpath="//h3[@data-test='error']")
		WebElement error;
		
		public Login(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		public void login(String user,String pass)
		{
			username.sendKeys(user);
			password.sendKeys(pass);
			loginButton.click();
			
		}
		/*public void click()
		{
			loginButton.click();
		}*/
		
		public Boolean logo()
		{
			return logo.isDisplayed();
		}
		
		public String checkError()
		{
			return error.getText();
		}
		
		
	}

