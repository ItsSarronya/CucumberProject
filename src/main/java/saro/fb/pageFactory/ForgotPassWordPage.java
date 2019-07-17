package saro.fb.pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPassWordPage {

	WebDriver driver;
	
	@FindBy(id="identify_yourself_flow")
    WebElement identityYourself;
	
	public ForgotPassWordPage(WebDriver driver){
        this.driver = driver;
        
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }
	
	public boolean isIdentityYourselfDisplayed(){
        return identityYourself.isDisplayed();
    }
    
    
}
