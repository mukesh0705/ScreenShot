package googleTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooTest {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "I:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");

		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("sport shoe");
		List<WebElement> elements=driver.findElements(By.xpath("//span[contains(.,'shoe')]"));
		for(int i=0;i<=elements.size()-1;i++){
			String elem=elements.get(i).getText();
			System.out.println(elem);
		}
		Thread.sleep(5000);
		driver.close();

	}

}
