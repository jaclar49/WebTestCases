package com.example.MonkeyGameReviews.tests;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetUp {
	public WebDriver driver;

	public boolean acceptNextAlert = true;
	public StringBuffer verificationErrors = new StringBuffer();
	JavascriptExecutor js;

	public SetUp() {
		System.setProperty("webdriver.chrome.driver", //
				"lib\\win\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		js = (JavascriptExecutor) driver;
	}

	public void initialLogin() throws Exception {
		driver.get("http://nrenard.ddns.net:8080/MonkeyGameReviews/Login");
		driver.findElement(By.id("Uname")).click();
		driver.findElement(By.id("Uname")).clear();
		driver.findElement(By.id("Uname")).sendKeys("user01");
		driver.findElement(By.id("Pass")).click();
		driver.findElement(By.id("Pass")).clear();
		driver.findElement(By.id("Pass")).sendKeys("user01in");
		driver.findElement(By.id("login")).submit();
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

	public boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	public boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}

	public String closeAlertAndGetItsText() {
		try {
			Alert alert = driver.switchTo().alert();
			String alertText = alert.getText();

			if (acceptNextAlert) {
				alert.accept();
			} else {
				alert.dismiss();
			}
			return alertText;
		} finally {
			acceptNextAlert = true;
		}
	}

}
