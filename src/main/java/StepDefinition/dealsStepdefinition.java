//package StepDefinition;
//
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.DataTable;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import junit.framework.Assert;
//
//public class dealsStepdefinition {
//
//	
//WebDriver driver;
//
//    
//	@Given("^User is already on login page$")
//	public void user_is_already_on_login_page() {
//	
//		System.setProperty("webdriver.chrome.driver", "/Users/sumitsharma/MyStuff/BDD/chromedriver");
//		driver =new ChromeDriver();
//		driver.get("https://ui.cogmento.com/");
//		driver.manage().window().maximize();
//		
//			}
//	@When("^Title of login page is Free CRM$")
//	public void title_of_login_page_is_Free_CRM() {
//	    String s=driver.getTitle();
//	    Assert.assertEquals("Cogmento CRM", s);
//	    
//	}
//	
//	@Then("^user enters username and password$")
//	public void user_enters_user_name_and_password(DataTable credentials ) {//DataTable is Class and Deal is its reference.
//		List<List<String>> data=credentials.raw();//Raw method gives you access to the data table written in feature file.
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(data.get(0).get(0));
//	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys(data.get(0).get(1));
//	    
//	    
//	}
//	@Then("^user clicks on login button$")
//	public void user_clicks_on_login_button() {
//		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
//
//	}
//	@Then("^user is on home page$")
//	public void user_is_on_home_page(){
//		String s1=driver.getTitle();
//		System.out.println("title of the home page is"+ s1);
//		Assert.assertEquals("Cogmento CRM", s1);
//		//driver.quit();
//	    
//	}
//	@Then("^user navigate to deal page$")
//	public void user_navigate_to_deal_page()  {
//		
//		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
//		driver.findElement(By.xpath("//span[@class='item-text' and contains(text(),'Deals')]")).click();
//		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
//		driver.findElement(By.xpath("(//button[@class='ui linkedin button'])[5]")).click();
//		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
//		//WebElement contacts=driver.findElement(By.xpath("//span[contains(text(),'Contacts')]"));
//		//JavascriptExecutor js = (JavascriptExecutor)driver;	
//		//js.executeAsyncScript("argument[0].click();", contacts);
//	    
//	} 
//	@Then("^user enters deal details$")
//	public void user_enters_deal_details(DataTable deal) { //DataTable is Class and Deal is its reference.
//		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
//		List<List<String>> data=deal.raw();//Raw method gives you access to the data table written in feature file.
//		driver.findElement(By.name("title")).sendKeys(data.get(0).get(0));
//		driver.findElement(By.name("amount")).sendKeys(data.get(0).get(1));
//		driver.findElement(By.name("commission")).sendKeys(data.get(0).get(2));
//		driver.findElement(By.name("probability")).sendKeys(data.get(0).get(3));
//		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
//		driver.findElement(By.xpath("//button[@class='ui linkedin button']")).click();
//		driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
//	
//	}
//	@Then ("^Close the browser$")
//	public void Close_the_browser() {
//		
//		//driver.quit();
//	}
//
//}
