package EPG.EP_Website;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.Test;


public class AppTest 
{
	
	@Test
	public void shouldAnswerWithTrue() throws InterruptedException
	{
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions customChrome = new ChromeOptions();
		customChrome.setAcceptInsecureCerts(true);
		customChrome.getBrowserVersion();
		customChrome.getPlatformName();
		//customChrome.wait(3000);
		WebDriver driver = new ChromeDriver(customChrome);

		driver.get("https://emiratespost.ae/Portal/Home?locale=en-us");

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());

		Thread.sleep(3000);
		WebElement ads = driver.findElement(By.xpath("//a[@class='ThemeGrid_Width1']//img"));
		ads.click();
		Thread.sleep(3000);
		WebElement coocking = driver.findElement(By.xpath("//button[@class='btn btn-primary OSFillParent']"));
		coocking.click();
		
		WebElement login = driver.findElement(By.xpath("//div[@class='LoginLink']"));
		login.click();
		//driver.close();

		//driver.quit();

	}
	
}

	
