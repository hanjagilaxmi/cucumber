package stepdef;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdef_Script 
{	 WebDriver driver;
	@Given("enter the url")
	public void enterTheUrl() {
	    System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.facebook.com");
	}
	@When("enter the valid un and pwd")
	public void enterTheValidUnAndPwd() {
	  driver.findElement(By.id("email")).sendKeys("Laxmi");
	  driver.findElement(By.id("pass")).sendKeys("laxmi123");
	}
	@Then("click on login button")
	public void clickOnLoginButton() {
		driver.findElement(By.name("login")).click();
	}
	@Then("home page should be displayed")
	public void homePageShouldBeDisplayed() {
	    System.out.println("Home page is displyed");
	}
}
