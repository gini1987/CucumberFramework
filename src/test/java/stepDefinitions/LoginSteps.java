package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
public WebDriver driver;


@Given("^User is already on Login Page$")
public void user_is_already_on_login_page() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\piyas\\eclipse-workspace\\BDDCucumberFramework\\Driver\\chromedriver.exe");
    driver =new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    System.out.println("User is already on Login Page");
   
}
@When("Title of loginpage is Admin area demo")
public void title_of_loginpage_is_Admin_area_demo() {
	driver.get("https://facebook.com");
	System.out.println("User navigates to the URL");
	
}
    
@Then("User enters Ifraz in username field")
public void user_enters_ifraz_in_username_field() {
	driver.findElement(By.id("email")).sendKeys("Ifraz");
	
	System.out.println("User enters incorrect username");
	
    
}
@And("^User enters Ifz123 in password field$")
public void user_enters_ifz123_in_password_field()throws Throwable {
	driver.findElement(By.name("pass")).sendKeys("ifz123");
	System.out.println("User enter incorrect password");
	
	
}
    
@And("User clicks on login button")
public void user_clicks_on_login_button()throws Throwable {
	driver.findElement(By.name("login")).click();
	System.out.println("User clicks on login button");
    
}
@Then("User gets login faild error message")
public void user_gets_login_faild_error_message()throws Throwable {
	 //driver.findElements(By.xpath("//*[starts-with(@id,'mount')]")).click();
		System.out.println("Login unsuccessful");
	
    
}




	
	}





