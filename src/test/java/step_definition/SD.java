package step_definition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
public class SD 
{
	WebDriver driver;
	@Before
	public void launchchrome()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	
	@Given("user is  on {string} fb homepage")
	public void user_is_on_fb_homepage(String url) 
	{
	    driver.get(url);
	}

	@When("user enter {string} as a user name")
	public void user_enter_as_a_user_name(String uname) 
	{
	    driver.findElement(By.xpath("//*[@id='email']")).sendKeys(uname);
	}

	@When("user enter {string} as a password")
	public void user_enter_as_a_password(String pwd)
	{
	    driver.findElement(By.xpath("//*[@id='pass']")).sendKeys(pwd);

	}

	@Then("login must be successful")
	public void login_must_be_successful() 
	{
	    driver.findElement(By.xpath("//*[@name='login']")).click();
	}

	@After
	public void teardown() 
	{
	    driver.quit();
	}


}
