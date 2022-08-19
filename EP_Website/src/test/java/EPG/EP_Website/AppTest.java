package EPG.EP_Website;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     * @throws InterruptedException 
     */
    @Test
    public void shouldAnswerWithTrue() throws InterruptedException
    {
  

    			//public static void main(String[] args) throws InterruptedException {


    			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sankari.devi\\EP_Website\\driver\\chromedriver.exe");

    			WebDriver driver = new ChromeDriver();


    		driver.get("https://emiratespost.ae/Portal/Home?locale=en-us");

    			System.out.println(driver.getTitle());

    			System.out.println(driver.getCurrentUrl());
    			
    			Thread.sleep(3000);
    			WebElement ads = driver.findElement(By.xpath("//a[@class='ThemeGrid_Width1']//img"));
    			ads.click();
    			Thread.sleep(3000);
    			WebElement coocking = driver.findElement(By.xpath("//button[@class='btn btn-primary OSFillParent']"));
    			coocking.click();
    			Thread.sleep(3000);
    			WebElement login = driver.findElement(By.xpath("//div[@class='LoginLink']"));
    			login.click();
    			//driver.close();

    			//driver.quit();



    			


    }
}
