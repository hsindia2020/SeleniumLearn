package IBMSelenium.com.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ABtest {

	private static WebDriver driver = null;
  @Test
	public void funs() throws Exception {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[contains(text(),'A/B Testing')]")).click();

		driver.findElement(By.cssSelector(null));

		Thread.sleep(3000);

		driver.close();
  }
}
