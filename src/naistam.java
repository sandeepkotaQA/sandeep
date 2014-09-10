import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;


public class naistam {
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
		List<WebElement> container = driver.findElements(By.id("addlang1"));
		//if we give wrong tag it will display error .to do so we should createa a container
		
		if(container.size()==0){
			Assert.fail("google language container is missing");
				}else{
					System.out.println("google language container is available");
				}
		
				
		List<WebElement> links = driver.findElement(By.xpath("//html/body/div[1]/div[2]/div[2]/div[2]")).findElements(By.tagName("a"));
		// as we havecreated a container using driver.find element . we can replace driver.findelement by container.get(0) 0 is the index number
		//so the syntax will be as  List<WebElement> links = container.get(0).findElements(By.tagName("a"));
		System.out.println(links.size());
		

			if(links.size()==0){
			Assert.fail( "Google language links are missing");
		}else{
			System.out.println("google language links are available");
		}
		
		
		List<String> arrlinks = new ArrayList<String>();
		for(int i=0;i<links.size();i++){
			//driver.get(arrlinks.get(i));
			arrlinks.add(links.get(i).getAttribute("href"));
			System.out.println(links);
		}
		
			
		
		for(int j=0;j<links.size();j++){
			System.out.println("Clicking" + arrlinks.get(j));
			driver.get(arrlinks.get(j));
			if(driver.getTitle().contains("page not found"))
				Assert.fail("404error");
			else
				System.out.println("pass");
		}
			
			
			
		

	}


	
	}


