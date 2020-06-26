//package StepDefinition;
//
//import cucumber.api.java.After;
//import cucumber.api.java.Before;
//import cucumber.api.java.en.Given;
//
//public class hooksStepDefinition {
//	
//	@Before()
//	public void setup() {
//		System.out.println("Launch GC");
//		System.out.println("Enter URL");
//	}
//	@After()
//	public void teardown() {
//		System.out.println("Close the browser");
//		System.out.println("Delete all cookies");
//	}
//	
//	@Before("@First")
//	public void beforefirst() {
//		System.out.println("Before First");
//		//System.out.println("Enter URL");
//	}
//	@After("@First")
//	public void afterfirst() {
//		System.out.println("After First");
//		//System.out.println("Delete all cookies");
//	}
//	
//	
//	@Given("^user login to CRM application$")
//	public void user_login_to_CRM_application() {
//		System.out.println("User is login to CRM application");
//	    
//	}
//
//	@Given("^user navigate to contacts$")
//	public void user_navigate_to_contacts() {
//		System.out.println("User is navigating to contacts page");
//	}
//
//	@Given("^user navigate to deals$")
//	public void user_navigate_to_deals() {
//		System.out.println("User is navigating to deals page");
//	    
//	}
//
//	@Given("^user navigate to home page$")
//	public void user_navigate_to_home_page(){
//		System.out.println("User is navigating to home page");
//	}
//
//	@Given("^user navigate to companies$")
//	public void user_navigate_to_companies() {
//		System.out.println("User is navigating to companies page");
//	}
//}
