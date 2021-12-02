package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class UserLoginStepDefinitions {
	
	public WebDriver driver;
	
	@Given("^I open browser$")
	public void i_open_browser() throws Throwable{
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\piyas\\eclipse-workspace\\BDDCucumberFramework\\Driver\\chromedriver.exe");
	     driver =new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     System.out.println("I open browser");
	}
	@When("I navigate to the URL")
	public void i_navigate_to_the_url() throws Throwable {
		driver.get("https://facebook.com");
		System.out.println("I navigate to the URL");
	}
	@And("^I enter correct username and password$")
	public void i_enter_correct_username_and_password() throws Throwable {
		driver.findElement(By.id("email")).sendKeys("ginichowdhury@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Parisa2307!");
		System.out.println("I enter correct username and password");
		
	}
	@And("^I click on login button$")
	public void i_click_on_login_button() throws Throwable {
		driver.findElement(By.name("login")).click();
		System.out.println("I click on login button");
	}
	@Then("^I must login to the facebook account successfully$")
	public void i_must_login_to_the_facebook_account_successfully() throws Throwable {
		if (driver.findElements(By.xpath("//*[starts-with(@id,'mount')]")).size()>0) {
			System.out.println("Login successful");
		}
		else {
			System.out.println("Login unsuccessful");
			
		}
		
		
	    
	    
	}
	@And("^I close the browser$")
	public void i_close_the_browser() throws Throwable {
	   driver.close(); 
	   System.out.println("I close the browser");
	}



	@And("^I enter incorrect username and password$")
	public void i_enter_incorrect_username_and_password() throws Throwable {
		driver.findElement(By.id("email")).sendKeys("ginichowdhury@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Parisa2307");
		System.out.println("I enter incorrect username and password");
		
	}
	@And("^I click on login button again$")
	public void i_click_on_login_button_again() throws Throwable {
		driver.findElement(By.name("login")).click();
		System.out.println("I click on login button");
	}
	@Then("^I must not login to the facebook account successfully$")
	public void i_must_not_login_to_the_facebook_account_successfully() throws Throwable {
		if (driver.findElements(By.xpath("//*[starts-with(@id,'mount')]")).size()>0) {
			System.out.println("Login successful");
		}
		else {
			System.out.println("Login unsuccessful");
			
		}
		
		
	    
	    
	}
	@And("^I close the browser again$")
	public void i_close_the_browser_again() throws Throwable {
	   driver.close(); 
	   System.out.println("I close the browser");
	}



		
	
	
	

}
