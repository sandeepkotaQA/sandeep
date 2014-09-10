import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class facebookprg {
	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		driver.findElement(By.id("email")).sendKeys("sandeep8120@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("naistam");
		driver.findElement(By.id("loginbutton")).click();
		driver.findElement(By.className("_55lr")).click();
		driver.findElement(By.xpath("html/body/div[1]/div[4]/div[1]/div/div/div[1]/div/div[2]/div/div/div[1]/div/div[4]/div[1]/textarea"))
.sendKeys("Hi This is the out put of the programm which i have return .msg vastay chaypu");
		//Robot robot= new Robot(); 
		//robot.keyPress(KeyEvent.VK_ENTER)
		Actions a = new Actions(driver);
		a.sendKeys(Keys.RETURN);
		a.perform();
	}

}
