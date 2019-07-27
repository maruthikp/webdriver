package sampleProject.ChromeAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocaters {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse\\git\\ChromeAuto\\src\\test\\resources\\drivers\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http://monsterindia.com");Thread.sleep(2000);
		
		dr.findElement(By.name("fts")).sendKeys("selenium");
		dr.findElement(By.className("btn")).click();
		
		
		
		
		
		
		Thread.sleep(2000);
		dr.quit();
		
		
	}

}
