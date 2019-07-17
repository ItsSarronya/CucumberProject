package saro.fb.pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	
    @FindBy(xpath="//input[@value='Log In']")
    WebElement logInButton;

    @FindBy(xpath="//*[@id='login_form']//a[contains(text(),'Forgotten account')]")
    WebElement forgottenAccountLink;
    
    @FindBy(id="email")
    WebElement email;
    
    @FindBy(id="pass")
    WebElement passWord;
    
    
    public LoginPage(WebDriver driver){
        this.driver = driver;
        
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }
    

    public boolean isLogInButtonEnabled(){
        return logInButton.isEnabled(); 
    }
    
    public void clickForgottenAccountLink(){
        forgottenAccountLink.click();
    }
    
    public void clickLogInButton(){
    	logInButton.click();
    }
    
    public void inputEmail(String text){
    	email.sendKeys(text);
    }
    
    public void inputPassWord(String text){
    	passWord.sendKeys(text);
    }
}
