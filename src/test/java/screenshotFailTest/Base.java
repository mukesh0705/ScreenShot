package screenshotFailTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static WebDriver driver;
	
	public static void initialization() {
		System.setProperty("webdriver.chrome.driver", "I:/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://theoptimum.net/");	
	}
	public void failed(String testMethodName) {
		File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screen, new File("Screenshot/screenshot"+testMethodName+".jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

}
