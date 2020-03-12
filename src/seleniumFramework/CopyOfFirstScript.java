package seleniumFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyOfFirstScript {

	public static void main(String[] args) {
		
		//System.setProperty(WebDriver.chrome.driver, chromedriver.exe);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://applitools.com");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//ul[@class='navbar-menu nav-right']//a[@class='btn btn-teal apc-hidden'][contains(text(),'Get Started')]")).click();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		String text = driver.findElement(By.xpath("//h1[@class='title']")).getText();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		System.out.println("Captured Text: "+ text);
		
		
		driver.quit();
		
		
		

	}

}
