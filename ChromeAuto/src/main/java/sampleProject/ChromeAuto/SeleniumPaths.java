package sampleProject.ChromeAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPaths {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse\\git\\ChromeAuto\\src\\test\\resources\\drivers\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("http:\\monsterindia.com");
		
		driver.findElement(By.className("btn")).click();
		driver.findElement(By.cssSelector(".btn.btn-orange.uprcse")).click();
		
		
		
		Thread.sleep(5000);
		driver.quit();
		

	}

}
