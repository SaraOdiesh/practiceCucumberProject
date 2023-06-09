package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class LogInPage {

	public LogInPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy (name = "email")
	public WebElement emailField;
	
	@FindBy (name = "password")
	public WebElement passwordField;
	
	@FindBy (xpath = "//button[text()='login']")
	public WebElement loginBtn;
	
	@FindBy (xpath = "//h6[text()='Account Setting']")
	public WebElement accountSettingsHeader;
}
