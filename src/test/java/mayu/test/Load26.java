package mayu.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Load26 {
public static WebDriver driver;
	
	@BeforeMethod
public void launchDriver() {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\masi\\Desktop\\drivers\\geckodriver.exe");
		driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
		driver.navigate().to("https://automationtalks.com/");
		
	}
	
	@Test
	public void Test1() {
		driver.navigate().to("https://automationtalks.com/");
		System.out.println("Test1 Title is :"+driver.getTitle());
		System.out.println("**************");
	}
	@Test
	public void Test2() {
		driver.navigate().to("https://automationtalks.com/");
		System.out.println("Test2 Title is :"+driver.getTitle());
	}
	@Test
    public void Test3() {
    	driver.navigate().to("https://automationtalks.com/");
		System.out.println("Test3 Title is :"+driver.getTitle());
	}
	@AfterMethod
	public void quit() {
		driver.quit();
	}
	
}
