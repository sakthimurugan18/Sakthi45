package org.demo.test.ExamGreens;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base {

	static WebDriver driver;
	static Select select;

	public static WebDriver launchBrowser() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\Selenium-workspace\\ExamGreens\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}

	public static void loadUrl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static void waitElement() {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static void threadWait() throws InterruptedException {
		Thread.sleep(5000);

	}

	public static void btnEnbled(WebElement e) {

		boolean b = e.isEnabled();
		System.out.println(b);

	}

	public static void btnSelect(WebElement e) {

		boolean b = e.isSelected();
	
		if (b==true) {
			
			System.out.println(b);
			
		}else if(b==false) {
			
			e.click();
			
		}

	}

	public static void txtData(WebElement e, String name) {

		e.sendKeys(name);
	}

	public static void btnclick(WebElement e) {
		e.click();
	}

	public static void chkBox(WebElement e) {
		e.click();
	}

	public static void selByText(WebElement e, String name) {

		select = new Select(e);
		select.selectByVisibleText(name);
	}

	public static void multipleSelect(WebElement e, String name) {
		select = new Select(e);
		select.selectByVisibleText(name);
		select.selectByVisibleText(name);

	}

	public static void clearData(WebElement e) {

		e.clear();

	}

	public static void winClose() {
		driver.close();
	}

	public static void drvQuit() {

		driver.quit();
	}

}
