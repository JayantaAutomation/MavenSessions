package TestNGListenerConcept;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
/*
 * Author: Jayanta Kumar Panda
 */
public class Base {

	public static WebDriver driver;

	public static void initialization() {

		//WebDriver driver = new ChromeDriver();
		driver = WebDriverManager.chromedriver().create();
		// WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}

	public void failed(String testMethodName) {
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, new File("C:\\Users\\Admin\\eclipse-workspace\\"
					+ "MavenSessions\\screenshots\\" + testMethodName + "_" + ".jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
