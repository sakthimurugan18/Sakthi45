package org.demo.test.ExamGreens;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExamSeven {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\Selenium-workspace\\ExamGreens\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement useDay=driver.findElement(By.xpath("//a[contains(text(),' DAY 6 ')]"));
		useDay.click();
		String handle=driver.getWindowHandle();
		Set<String> handles=driver.getWindowHandles();
		for (String x : handles) {
			
			driver.switchTo().window(x);
		}
		
		WebElement txt=driver.findElement(By.xpath("//pre[contains(text(),'SELENIUM')]"));
		TakesScreenshot tk=(TakesScreenshot)driver;
		File src=tk.getScreenshotAs(OutputType.FILE);
		File dse=new File("C:\\Users\\ELCOT\\Selenium-workspace\\ExamGreens\\ScreenShot\\txt.png");
		FileUtils.copyFile(src, dse);

	}

}
