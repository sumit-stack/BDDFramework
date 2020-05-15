package StepDefinition;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class DealStepWithMapDefinition {

	
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
	
	@Then("^user enters username and password$")
	public void user_enters_user_name_and_password(DataTable credentials ) {
		for(Map<String,String> data : credentials.asMaps(String.class,String.class)) {//Map is the Interface-- Data is the object ref.--In mao we always store value in form of key and value
			
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys(data.get("username"));
		    driver.findElement(By.xpath("//input[@type='password']")).sendKeys(data.get("password"));
		}
	    
	    
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
	@Then("^user navigate to deal page$")
	public void user_navigate_to_deal_page()  {
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[@class='item-text' and contains(text(),'Deals')]")).click();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//button[@class='ui linkedin button'])[5]")).click();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		//WebElement contacts=driver.findElement(By.xpath("//span[contains(text(),'Contacts')]"));
		//JavascriptExecutor js = (JavascriptExecutor)driver;	
		//js.executeAsyncScript("argument[0].click();", contacts);
	    
	} 
	@Then("^user enters deal details$")
	public void user_enters_deal_details(DataTable deal) { 
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		for(Map<String, String> data1: deal.asMaps(String.class, String.class)) {
			
			driver.findElement(By.name("title")).sendKeys(data1.get("Title"));
			driver.findElement(By.name("amount")).sendKeys(data1.get("Amount"));
			driver.findElement(By.name("commission")).sendKeys(data1.get("Commission"));
			driver.findElement(By.name("probability")).sendKeys(data1.get("Probability"));
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//button[@class='ui linkedin button']")).click();
			//driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
			driver.findElement(By.xpath("(//span[@class='item-text'])[5]")).click();
			//driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
			driver.findElement(By.xpath("(//button[@class='ui linkedin button'])[5]")).click();
		}
		
		//driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
		
	}
	@Then ("^Close the browser$")
	public void Close_the_browser() {
		
		//driver.quit();
	}

}
