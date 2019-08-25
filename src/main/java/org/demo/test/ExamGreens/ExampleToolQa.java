package org.demo.test.ExamGreens;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleToolQa {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\Selenium-workspace\\ExamGreens\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get(" http://toolsqa.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement sclDown=driver.findElement(By.xpath("//a[text()='SITEMAP']"));
		WebElement sclUp=driver.findElement(By.xpath("//span[text()='Automation Tools Tutorial']"));
		
		JavascriptExecutor jsscript=(JavascriptExecutor)driver;
	    jsscript.executeScript("arguments[0].scrollIntoView(true);",sclDown);
	    jsscript.executeScript("arguments[1].scrollIntoView(false);",sclDown,sclUp);
		
	}

}
