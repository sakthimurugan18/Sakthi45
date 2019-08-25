package org.demo.test.ExamGreens;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleFirst {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\Selenium-workspace\\ExamGreens\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		TakesScreenshot scnShot=(TakesScreenshot)driver;
		File src=scnShot.getScreenshotAs(OutputType.FILE);
		File file=new File("C:\\Users\\ELCOT\\Selenium-workspace\\ExamGreens\\ScreenShot\\First.jpeg");
		FileUtils.copyFile(src, file);
		
		
	}

}
