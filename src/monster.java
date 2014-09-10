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


public class monster {
	WebDriver driver;
	
	

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		driver.get( "http://www.monsterindia.com/");
		
		driver.manage().window().maximize();
		}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		List<WebElement> monster = driver.findElement(By.className( "mn_emplogo_main")).findElements( By.tagName( "a"));
		System.out.println("Size of container" + monster.size());
		System.out.println("=============================================================================================");
		
		List<String> arrlinks = new ArrayList<String>();
		for(int i=0;i<monster.size();i++)
			
		arrlinks.add(monster.get(i).getAttribute("href"));
		for(int j=0;j<monster.size();j++)
		{
	
			driver.get(arrlinks.get(j));
			//System.out.println(arrlinks.get( j));
			//System.out.println( arrlinks.get( j));
		if (driver.getTitle().contains( "Jobs in India")){
			String str = driver.getTitle();
			String st[] = str.split(":");
			//System.out.println(st[1]);
		   String a[] = st[1].split( ",");
			String st1[] = a[0].split( "Private");
			System.out.println(st1[0]);
		}else if ((driver.getTitle().contains( "Untitled Document"))||(driver.getCurrentUrl().contains( "polaris"))) {
			
			String b[] = driver.getCurrentUrl().split( "http://company.monsterindia.com/");
			String c[] = b[1].split( "in/");
			System.out.println(c[0]);
			
			
		}else{
		
				
				System.out.println("company name is "   +   driver.getTitle());
			}
		
		

	}
}


	}


