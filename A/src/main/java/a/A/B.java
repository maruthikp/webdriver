package a.A;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Hello");

System.setProperty("webdriver.chrome.driver","D:\\Eclipse\\Projects\\chromedriver.exe");
WebDriver dr=new ChromeDriver();
dr.get("http:\\monster.com");
dr.quit();

	}

}
