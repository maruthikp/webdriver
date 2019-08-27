package stepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BookMyShow {
	public WebDriver driver=null;

	
	@Given("I launch the browser")
	public void i_launch_the_browser() {
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse\\git\\ChromeAuto\\src\\test\\resources\\drivers\\chromedriver.exe");
		driver= new ChromeDriver();
	  	}

	@Then("I navigate to paytm Website")
	public void i_navigate_to_Website() {
		driver.get("https:paytm.com");
		driver.findElement(By.xpath("//a/span[text()='Movies']")).click();	
	}

	@Then("I selected the city")
	public void i_selected_the_city() {
		driver.findElement(By.xpath("//a[@href='https://paytm.com/movies/vijayawada']")).click();
		//driver.findElement(By.xpath("//a[text()='Vijayawada']")).click();
				
	}
	
	@Then("I clicked on a movie")
	public void i_clicked_on_a_movie() {
		driver.findElement(By.xpath("//div[text()='evaru']")).click();//Thread.sleep(5000);
		
	}

	@Then("I selected the date")
	public void i_clicked_button() {
		driver.findElement(By.xpath("//div[text()='27']")).click();
		
	}

	@Then("I clicked on movie timings")
	public void i_clicked_on_movie_timings() {
		driver.findElement(By.xpath("//a[text()='10:40 AM']")).click();
		driver.findElement(By.className("a._11ST[12]")).click();
	}

	
}
