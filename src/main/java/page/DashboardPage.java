package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DashboardPage {
	
	WebDriver driver;
	
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//h2[text()=' Dashboard ']") WebElement DASHBOARD_LABEL_ELEMENT;
	
	public void validateDashboardPage() {
		Assert.assertEquals(DASHBOARD_LABEL_ELEMENT.getText(), "Dashboard", "WRONG PAGE");
	}
}
