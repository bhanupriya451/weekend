package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	//declaration
	@FindBy(xpath="//a[class='\"ico-login\']")
	private WebElement loginLink;
	
	@FindBy(id="small-searchterms")
	private WebElement searchTF;
	
	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	//getters(right click-source-generate getters and setters-select getters-generate)
	public WebElement getLoginLink() {
		return loginLink;
	}
		
		public WebElement getsearchTF() {
			return searchTF;
	}
	
	
	
	}
