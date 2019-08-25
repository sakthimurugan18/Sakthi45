package org.demo.test.ExamGreens;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ExampleGreenSec {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\Selenium-workspace\\ExamGreens\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions action=new Actions(driver);
		WebElement jobOpen=driver.findElement(By.xpath("//h1[text()='RECENT JOB OPENINGS ']"));
		action.moveToElement(jobOpen).perform();
		TakesScreenshot scnShot=(TakesScreenshot)driver;
		File src=scnShot.getScreenshotAs(OutputType.FILE);
		File dec=new File("C:\\Users\\ELCOT\\Selenium-workspace\\ExamGreens\\ScreenShot\\Job.png");
		FileUtils.copyFile(src, dec);
		WebElement sclDown=	driver.findElement(By.xpath("//span[contains(text(),'Overall Reviews')]"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",sclDown);
		
		
		
		

	}

}
