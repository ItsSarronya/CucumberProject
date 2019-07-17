package saro.fb.pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IncorrectPassWordPage {

	WebDriver driver;
	
	@FindBy(xpath="By.xpath('//*[contains(text(),'entered is incorrect')]'")
    WebElement incorrectMsg;
	
	public IncorrectPassWordPage(WebDriver driver){
        this.driver = driver;
        
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }
	
	public boolean incorrectMsgIsDisplayed(){
        return incorrectMsg.isDisplayed();
    }
    
    
}
