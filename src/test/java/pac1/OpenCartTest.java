package pac1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OpenCartTest {

	
	
	WebDriver driver;

	@Test
	public void fTest() {
		

		

		System.out.println(driver.getTitle());
		System.out.println(driver.getTitle());
		System.out.println(driver.getTitle());
		System.out.println(driver.getTitle());		
		System.out.println(driver.getTitle());
		
		
		
		System.out.println(driver.getCurrentUrl());
		
		
		
		
		System.out.println(driver.getCurrentUrl());
		
		
	
		
		System.out.println("passshhhh");
		
		
		System.out.println("16 dec");
		System.out.println("17 dec");
		

	}
	
	
	@Test
	public void f1Test() {

		List<WebElement> list = driver.findElements(By.tagName("a"));

		System.out.println(list.size());

	}

	
	@Test
	public void f2Test() {

		System.out.println(driver.getCurrentUrl());
		
		
	}


	@BeforeClass
	public void beforeClass() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}

	@AfterClass
	public void afterClass() {

		driver.close();

	}
}
