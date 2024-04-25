package screenshotFailTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListener.class)
public class TestITListenerConcept extends Base {
	
	
	@BeforeMethod
	public void setUp() {
		initialization();
		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	@Test
	public void takeScreenshotTest1() {
		Assert.assertEquals(false, true);
	}
	@Test
	public void takeScreenshotTest2() {
		Assert.assertEquals(false, true);
	}
	@Test
	public void takeScreenshotTestSuccess() {
		driver.findElement(By.xpath("//a[@class='mega-menu-link'][normalize-space()='Careers']")).click();
	}
	@Test
	public void takeScreenshotTest4() {
		Assert.assertEquals(false, true);
	}
	@Test
	public void takeScreenshotTest5() {
		Assert.assertEquals(false, true);
	}

}
