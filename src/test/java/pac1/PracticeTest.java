package pac1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PracticeTest {

	WebDriver driver;

	@Test
	public void fTest() {
		
		//feature

		System.out.println(driver.getTitle());
		System.out.println(driver.getTitle());
		System.out.println(driver.getTitle());
		System.out.println(driver.getTitle());
		System.out.println(driver.getTitle());
		
		
		
		
		System.out.println("hello");
		System.out.println("hello1");
		
		
		
		
		
		System.out.println("welcome1");		
		System.out.println("welcome2");
		
		
		
		System.out.println("welness");
		System.out.println("welness1");
		
		
		
		
		System.out.println("happy2");			
		System.out.println("happy3");
		

		
		
		
	}

	@BeforeClass
	public void beforeClass() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://naveenautomationlabs.com/opencart/");
	}

	@AfterClass
	public void afterClass() {

		driver.close();

	}
}
