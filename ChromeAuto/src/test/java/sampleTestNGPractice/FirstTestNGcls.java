package sampleTestNGPractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class FirstTestNGcls {
	WebDriver driver=null;
	
	@BeforeSuite
	public void hello() {
		
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse\\git\\ChromeAuto\\src\\test\\resources\\drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http:\\monsterindia.com");
		}
	@BeforeMethod
	public void helloMethod()
	{
		//System.out.println("hello");
		driver.findElement(By.xpath("//select/option[text()='Vietnam']")).click();
	}
	@Test
	public void stest()
	{
		//System.out.println("hello");
		driver.findElement(By.xpath("//select/option[text()='India']")).click();
		
	}


@AfterMethod
public void SwithWindow() throws InterruptedException
{
	//String Parent = driver.getWindowHandle();
	Set<String> windows= driver.getWindowHandles();
	for(String eachwindow :windows) {
		driver.switchTo().window(eachwindow);
		Thread.sleep(2000);
		
	}
}

@AfterSuite
public void As1()
{
	driver.quit();
}
}
