package sampleTestNGPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SecondTesNGCls {
	WebDriver driver=null;
	
	@Test
	public void Dropdownlist()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse\\git\\ChromeAuto\\src\\test\\resources\\drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http:\\amazon.in");
		
		
		//webelement element=
	System.out.println(driver.findElement(By.id("searchDropdownBox")).getText());	
	}

}
