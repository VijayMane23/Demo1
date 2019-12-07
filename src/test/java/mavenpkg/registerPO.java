package mavenpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class registerPO extends baseclass{
	
	public registerPO(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, registerPO.class);;
	}
@FindBy(xpath="//*[text()='Email or phone']")
WebElement email;

@FindBy(xpath="/*[text()='Next']")
WebElement next;

@FindBy(xpath="//*[text()='Enter your password']")
WebElement pass;

@FindBy(xpath="/*[text()='Next']")
WebElement next1;

public void enterdetails(String mail,String password) {
	email.clear();
	email.sendKeys(mail);
	
	next.click();
	
	pass.clear();
	pass.sendKeys(password);
	
	next1.click();
}
}
