package TestNGListenerConcept;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListener.class)
public class ScreenshotTest extends Base {
	
	@BeforeMethod
	public void setUp() {
		initialization();
		
	}

	@Test
	public void LoginTest() {
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void HomePageTest() {
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void SearchPageTest() {
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void AddressPageTest() {
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void SettingsPageTest() {
		Assert.assertEquals(false, true);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
