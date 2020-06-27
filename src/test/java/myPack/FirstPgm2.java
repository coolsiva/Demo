package myPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstPgm2 {

	@Test
	public void test_1()
	{
		System.out.println("Hello");
		System.out.println("Siva");
		System.out.println("Kumar");
		System.out.println("Ram");
		System.out.println("Welocme");
		System.out.println("Hello");
		
		
	}

	@Test
	public void test_2()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/sivaram.parvathy/eclipse-workspace/MacProject/browser/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());	
		driver.quit();
	}
}
