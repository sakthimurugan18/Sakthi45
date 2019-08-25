package org.demo.test.ExamGreens;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ExcelRead extends Base {

	static String path = "C:\\Users\\ELCOT\\Selenium-workspace\\ExamGreens\\InputData\\Data.xlsx";

	public static void main(String[] args) throws Throwable {

		launchBrowser();
		loadUrl("http://demo.automationtesting.in/Register.html");

		DataRead data = new DataRead(path);
		int rowCount = data.getRowCount("Sheet1");

		String firstName = data.getCellData("Sheet1", "FirstName", 2);
		String lastName = data.getCellData("Sheet1", "LastName", 2);
		String address = data.getCellData("Sheet1", "Address", 2);
		String emAdress = data.getCellData("Sheet1", "Email Address", 2);
		String phNo = data.getCellData("Sheet1", "Phone No", 2);
		String password = data.getCellData("Sheet1", "PassWord", 2);
		String cPassword = data.getCellData("Sheet1", "ConfirmPassword", 2);
		waitElement();
		WebElement e = driver.findElement(By.xpath("//input[@ng-model='FirstName']"));
		clearData(e);
		txtData(e, firstName);
		WebElement e1 = driver.findElement(By.xpath("//input[@ng-model='LastName']"));
		clearData(e1);
		txtData(e1, lastName);
		WebElement e2 = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		clearData(e2);
		txtData(e2, address);
		WebElement e3 = driver.findElement(By.xpath("//input[@ng-model='EmailAdress']"));
		clearData(e3);
		txtData(e3, emAdress);
		WebElement e4 = driver.findElement(By.xpath("//input[@ng-model='Phone']"));
		clearData(e4);
		txtData(e4, phNo);
		WebElement e7 = driver.findElement(By.xpath("//input[@value='Male']"));
		btnclick(e7);
		WebElement e8 = driver.findElement(By.xpath("//input[@id='checkbox1']"));
		btnSelect(e8);
		waitElement();
		WebElement e9 = driver.findElement(By.xpath("//*[@id='msdd']"));
		btnSelect(e9);
		WebElement e20 = driver.findElement(By.xpath("//a[text()='Arabic']"));
		btnSelect(e20);
		WebElement e21 = driver.findElement(By.xpath("//a[text()='Catalan']"));
		btnSelect(e21);
		WebElement e23 = driver.findElement(By.xpath("//body[@ng-app='Registerform']"));
		btnclick(e23);
		WebElement e10 = driver.findElement(By.xpath("//select[@id='Skills']"));
		btnSelect(e10);
		btnclick(e10);
		selByText(e10, "Java");
		WebElement e11 = driver.findElement(By.xpath("//select[@id='countries']"));
		btnclick(e11);
		selByText(e11, "India");
		WebElement e12 = driver.findElement(By.xpath("//select[@id='country']"));
		selByText(e12, "India");
		WebElement e13 = driver.findElement(By.xpath("//select[@id='yearbox']"));
		btnclick(e13);
		selByText(e13, "1991");
		WebElement e14 = driver.findElement(By.xpath("//select[@ng-model='monthbox']"));
		btnclick(e14);
		selByText(e14, "July");
		WebElement e15 = driver.findElement(By.xpath("//select[@id='daybox']"));
		btnclick(e15);
		selByText(e15, "10");
		WebElement e5 = driver.findElement(By.xpath("//input[@id='firstpassword']"));
		clearData(e5);
		txtData(e5, password);
		WebElement e6 = driver.findElement(By.xpath("//input[@id='secondpassword']"));
		clearData(e6);
		txtData(e6, cPassword);
		WebElement e16 = driver.findElement(By.xpath("//input[@id='imagesrc']"));
		btnclick(e16);
		WebElement e17 = driver.findElement(By.xpath("//input[@id='imagesrc']"));
		txtData(e17, "C:\\Users\\ELCOT\\Pictures\\Camera Roll\\sakthi.jpg");
		WebElement e18 = driver.findElement(By.xpath("//button[@id='submitbtn']"));
		btnclick(e18);
		winClose();

	}
}
