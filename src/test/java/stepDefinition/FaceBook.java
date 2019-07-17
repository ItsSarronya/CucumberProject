package stepDefinition;

import static org.testng.AssertJUnit.assertTrue;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



import cucumber.annotation.After;
import cucumber.annotation.Before;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

import saro.fb.pageFactory.ForgotPassWordPage;
import saro.fb.pageFactory.IncorrectPassWordPage;
import saro.fb.pageFactory.LoginPage;
/*import saro.fb.utils.ExcelDataToDataTable;*/

/*import cucumber.api.DataTable;*/

/*
import cucumber.api.DataTable;
import cucumber.api.Transform;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;*/

import cucumber.table.DataTable;

public class FaceBook {

	WebDriver driver = null;
	LoginPage loginPage;
	ForgotPassWordPage forgotPage;
	IncorrectPassWordPage incorrectPage;

	@Before
	public void setUp() {
		System.out.println("-----------------Driver Setup----------------");
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chrome driver\\chromedriver.exe");
		
	}
	
	/*Example for tagged hooks, This method gets executed only for the scenario with tag - @BasicFunctionality*/
	@Before(value ="@BasicFunctionality")
    public void beforeScenarioStart(){
        System.out.println("-----------------Start of Scenario-----------------");
    } 
	
	@After
	public void cleanUp() {
		 System.out.println("-----------------Closing Driver----------------");
		/* driver.close();*/
	}
	
	@After
    public void afterScenarioEnds(){
        System.out.println("-----------------End of Scenario-----------------");
    } 

	@Given("^The browser is open$")
	public void openBrowser() {
		driver = new ChromeDriver();
		loginPage = new LoginPage(driver);
		forgotPage = new ForgotPassWordPage(driver);
		incorrectPage = new IncorrectPassWordPage(driver);
		
	}

	@When("^Facebook is launched$")
	public void goToFacebook() {
		driver.navigate().to("https://www.facebook.com/");
	}

	/*@Then("^Login button should be enabled$")
	public void loginButton() {
		assertTrue(driver.findElement(By.xpath("//input[@value='Log In']")).isEnabled());
		
		if (driver.findElement(By.xpath("//input[@value='Log In']")).isEnabled()) {
			System.out.println("FaceBook_Login Test - Pass");
		} else {
			System.out.println("FaceBook_Login Test - Fail");
		}
	}*/
	
	@Then("^Login button should be enabled$")
	public void loginButton() {
		assertTrue(loginPage.isLogInButtonEnabled());
		
		if (loginPage.isLogInButtonEnabled()) {
			System.out.println("FaceBook_Login Test - Pass");
		} else {
			System.out.println("FaceBook_Login Test - Fail");
		}
	}

	@When("^Click Forgot Password$")
	public void clickForgotPassword() {
		//driver.findElement(By.xpath("//*[@id='login_form']//a[contains(text(),'Forgotten account')]")).click();
		loginPage.clickForgottenAccountLink();
	}

	/*@When("^User enters \"(.*)\" and \"(.*)\"$")
	public void enterCredentialsAndLogin(String arg1, String arg2) {
		driver.findElement(By.id("email")).sendKeys(arg1);
		driver.findElement(By.id("pass")).sendKeys(arg2);
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
	}*/
	
	@When("^User enters \"(.*)\" and \"(.*)\"$")
	public void enterCredentialsAndLogin(String arg1, String arg2) {
		loginPage.inputEmail(arg1);
		loginPage.inputPassWord(arg2);
		loginPage.clickLogInButton();
	}

	@Then("^Forgot Password Page should open$")
	public void forgotPasswordPage() {
		assertTrue(forgotPage.isIdentityYourselfDisplayed());
		
		if(forgotPage.isIdentityYourselfDisplayed()) {
			System.out.println("Forgot_Password Test - Pass");
		} else {
			System.out.println("Forgot_Password Test - Fail");
		}
	}

	@Then("^Incorrect Password Page should open$")
	public void inCorrectPasswordPage() {
		/*assertTrue(driver.findElement(By.xpath("//*[contains(text(),'entered is incorrect')]")).isDisplayed());*/
		assertTrue(incorrectPage.incorrectMsgIsDisplayed());
				
		if (incorrectPage.incorrectMsgIsDisplayed()) {
			System.out.println("Incorrect_Password Test - Pass");
		} else {
			System.out.println("Incorrect_Password Test - Fail");
		}
	}

	@When("^User enters the data$")
	public void enterData(DataTable table) throws Exception {

		List<List<String>> data = table.raw();

		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(data.get(1).get(2));
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(data.get(2).get(2));
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(data.get(3).get(2));
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys(data.get(4).get(2));

		if (data.get(5).get(1).equalsIgnoreCase("F"))
			driver.findElement(By.xpath(" //label[contains(text(),'Female')]/parent::span/input")).click();
		else
			driver.findElement(By.xpath(" //label[contains(text(),'Male')]/parent::span/input")).click();

		driver.findElement(By.xpath("//button[@name='websubmit']")).click();

		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@id='facebook']//button[contains(text(),'Yes')]")));

		if (driver.findElement(By.xpath("//*[@id='facebook']//button[contains(text(),'Yes')]")).isDisplayed()) {
			driver.findElement(By.xpath("//*[@id='facebook']//button[contains(text(),'Yes')]")).click();
		}

	}

	@Then("^SMS confirmation page should open$")
	public void smsConfirmationPage() {
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//h2[contains(text(),'Enter the code from the SMS message')]")));
		
		
		if (driver.findElement(By.xpath("//h2[contains(text(),'Enter the code from the SMS message')]"))
				.isDisplayed()) {
			System.out.println("smsConfirmationPage Test - Pass");
		}else{
			System.out.println("smsConfirmationPage Test - Fail");
		}

	}
	
	/*@When("User login with the following username and password from testdata_excel at \"(.*)\"")
	public void enterCredentialsFromExcel(@Transform(ExcelDataToDataTable.class) DataTable table) throws Throwable {
			System.out.println(table.toString());
		
		List<String> dataList = table.asList(String.class);
		
		for(String str : dataList){
			System.out.println(str);
		}
	}*/
	
	/*@Then("^Account security page should open$")
	public void accountSecurityPage() {
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//div[contains(text(),'We want to make sure that your account is secure')]")));
		
				
		if (driver.findElement(By.xpath("//div[contains(text(),'We want to make sure that your account is secure')]"))
				.isDisplayed()) {
			System.out.println("accountSecurityPage Test - Pass");
		}else{
			System.out.println("accountSecurityPage Test - Fail");
		}
		
	}
	*/
	

}
