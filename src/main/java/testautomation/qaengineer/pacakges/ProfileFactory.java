package testautomation.qaengineer.pacakges;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProfileFactory extends BasePageFactory {
	
	@FindBy(xpath = "//div[@id='flash']")
	private WebElement profileText;
	
	public ProfileFactory(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		PageFactory.initElements(driver.get(), this);
	}
	
	public String getProfileText() {
		return profileText.getText();
	}

}