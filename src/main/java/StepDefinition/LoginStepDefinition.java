package StepDefinition;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinition {

	WebDriver driver;

    
	@Given("^User is already on login page$")
	public void user_is_already_on_login_page() {
	
		System.setProperty("webdriver.chrome.driver", "/Users/sumitsharma/MyStuff/BDD/chromedriver");
		driver =new ChromeDriver();
		driver.get("https://ui.cogmento.com/");
		driver.manage().window().maximize();
		
			}
	@When("^Title of login page is Free CRM$")
	public void title_of_login_page_is_Free_CRM() {
	    String s=driver.getTitle();
	    Assert.assertEquals("Cogmento CRM", s);
	    
	}
	
	//Reg Expression: \"(.*)\"
	
	@Then("^user enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_user_name_and_password(String username, String password) {
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(username);
	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
	    
	    
	}
	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() {
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();

	}
	
	@Then("^user is on home page$")
	public void user_is_on_home_page(){
		String s1=driver.getTitle();
		System.out.println("title of the home page is"+ s1);
		Assert.assertEquals("Cogmento CRM", s1);
		//driver.quit();
	    
	}
	@Then("^user navigate to contacts page$")
	public void user_navigate_to_contacts_page()  {
		
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[@class='item-text' and contains(text(),'Contacts')]")).click();
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//button[@class='ui linkedin button'])[3]")).click();
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
		//WebElement contacts=driver.findElement(By.xpath("//span[contains(text(),'Contacts')]"));
		//JavascriptExecutor js = (JavascriptExecutor)driver;	
		//js.executeAsyncScript("argument[0].click();", contacts);
	    
	} 
	
	@Then("^user enters contact details \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	public void user_enters_contact_details(String fname, String Lname, String Position) {
		//driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys(fname);
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys(Lname);
		driver.findElement(By.xpath("//input[@name='position']")).sendKeys(Position);
	}
	
	
	@Then ("^Close the browser$")
	public void Close_the_browser() {
		
		driver.quit();
	}












}
