package screenshotFailTest;
import java.io.File;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class B {
    static WebDriver driver;
    static WebDriverWait wait;
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		TakesScreenshot sc=(TakesScreenshot)driver;
		File screen=sc.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screen,new File("Path"));
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("")));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");
		//By action class
		Actions ac=new Actions(driver);
		ac.keyDown(Keys.PAGE_DOWN).build().perform();
		
	}

}
