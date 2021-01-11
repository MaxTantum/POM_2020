package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.ID, using = "username") WebElement EMAIL_FIELD_ELEMENT;
	@FindBy(how = How.ID, using = "password") WebElement PASSWORD_FIELD_ELEMENT;
	@FindBy(how = How.NAME, using = "login") WebElement SIGNIN_BUTTON_ELEMENT;

	public void enterEmail(String email) {
		EMAIL_FIELD_ELEMENT.sendKeys(email);
	}
	public void enterPassword(String password) {
		PASSWORD_FIELD_ELEMENT.sendKeys(password);
	}
	public void clickSingInButton() {
		SIGNIN_BUTTON_ELEMENT.click();
	}
}
