import static org.junit.Assert.*;

import java.util.List;
import java.util.Random;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class commonfloor {
	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		driver.get( "http://www.commonfloor.com/post-public-property-requirement");
		driver.manage().window().maximize();

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		List<WebElement> san = driver.findElement( By.className( "require_property")).findElements( By.className( "property_label"));
		System.out.println(san.size());
		
		Random rr = new Random();
		int i = rr.nextInt(san.size());
		san.get( i).click();
		System.out.println(san.get(i).getAttribute( "value"));
		
		driver.findElement( By.id( "req_contact_name")).sendKeys( "nani");
		driver.findElement( By.id( "req_email_id")).sendKeys( "sandeep8120@gmail.com");
		
		
		driver.findElement( By.id( "req_country_code")).click();
		
		List<WebElement> code = driver.findElement( By.id( "req_country_code")).findElements( By.tagName( "option"));
		System.out.println(code.size());
		
		Random cc = new Random();
		int j = cc.nextInt(code.size());
		code.get(j).click();
		System.out.println(code.get( i).getAttribute( "value"));
		
		driver.findElement( By.id( "req_contact_mobile")).sendKeys( "9000888281");
		
		driver.findElement( By.id( "req_city")).click();
		List<WebElement> city = driver.findElement( By.id( "req_city")).findElements( By.tagName( "option"));
		System.out.println(city.size());
		
		Random ci = new Random();
		int k = ci.nextInt(city.size());
		city.get( k).click();
		System.out.println(city.get( k).getAttribute( "value"));
		
		driver.findElement( By.id( "req_project_location_input")).sendKeys( "tnr");
		driver.findElement( By.id( "req_project_location_input")).sendKeys("Keys.TAB");
	   
		
		
		
		driver.findElement( By.id( "req_property_location_input")).sendKeys( "Nagole");
		
		List<WebElement> typeofprop = driver.findElement( By.className( "selectAll_wrap")).findElements( By.tagName( "label"));
		System.out.println(typeofprop.size());
		
		Random tp = new Random();
		int m = tp.nextInt(typeofprop.size());
		typeofprop.get( m).click();
		System.out.println(typeofprop.get( m).getAttribute( "value"));
		
		driver.findElement( By.linkText( "Min")).click();
		List<WebElement> min = driver.findElement( By.className( "chzn-results")).findElements( By.tagName( "li"));
		System.out.println(min .size());
		
		Random mini = new Random();
		int n = mini.nextInt(min .size());
		min .get( n).click();
		System.out.println(min.get( n).getAttribute( "value"));
		
		
		
		driver.findElement( By.linkText( "Max")).click();
		
		List<WebElement> maxi = driver.findElement( By.id( "req_max_inr_chzn")).findElements( By.tagName( "li"));
		System.out.println(maxi .size());
		Random max = new Random();
		int o = max.nextInt(maxi .size());
		maxi.get( o).click();
		System.out.println(maxi.get( o).getAttribute( "value"));
		
		driver.findElement( By.name( "want_within")).click();
		List<WebElement> time = driver.findElement( By.name( "want_within")).findElements( By.tagName( "option"));
		System.out.println(time.size());
		Random tm =  new Random();
		int p = tm.nextInt(time.size());
		time.get( p).click();
		System.out.println(time.get( p).getAttribute( "value"));
		
	}

}
