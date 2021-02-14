package IBMSelenium.com.learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 *
 * @author Harmeet Basic WebDriver driver.*
 */

public class AppTest
{
	public static void main(String args[]) {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.google.com");

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());

		driver.get("https://youtube.com");

		System.out.println(driver.getTitle());
		driver.navigate().back();
		driver.navigate().forward();

		driver.close();// close current Browser

//		driver.quit();// Quit will quit the driver
	}
}
