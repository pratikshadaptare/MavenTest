package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_Steps {
	public static WebDriver driver;
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		//System.setProperty("webdriver.gecko.driver", "src\\test\\java\\resources\\geckodriver.exe");
        //driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "src\\test\\java\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://newtours.demoaut.com/");
		}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
		driver.findElement(By.linkText("SIGN-ON")).click();
		}

	@And("^User enters UserName and Password$")
	public void user_enters_UserName_and_Password() throws Throwable {
		driver.findElement(By.name("userName")).sendKeys("invalidUN");
		  driver.findElement(By.name("password")).sendKeys("invalidPW");
	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
		System.out.println("Login Successfully");
	}
	
	/*@When("^User LogOut from the Application$")
	public void user_LogOut_from_the_Application() throws Throwable {
	//	driver.findElement (By.xpath(".//*[@id='account_logout']/a")).click();
		driver.findElement(By.linkText("SIGN-OFF")).click();
	}

	@Then("^Message displayed LogOut Successfully$")
	public void message_displayed_Logout_Successfully() throws Throwable {
		System.out.println("Browser Closed");
        System.out.println("LogOut Successfully");
		driver.close();
	}*/
	

}