package com.example.MonkeyGameReviews.tests;

import org.junit.*;
import org.openqa.selenium.*;

public class RegisterAccount extends SetUp {

	private String userNumber = "06";
	private String userName = "user" + userNumber;
	private String userPass = "user" + userNumber + "in";

	public RegisterAccount() {
		super();

	}

	@Test
	public void testRegisterAccount() throws Exception {
		driver.get("http://nrenard.ddns.net:8080/MonkeyGameReviews/Login");
		driver.findElement(By.linkText("Create an account")).click();
		driver.get("http://nrenard.ddns.net:8080/MonkeyGameReviews/CreateAccount");
		driver.findElement(By.id("Uname")).click();
		driver.findElement(By.id("Uname")).clear();
		driver.findElement(By.id("Uname")).sendKeys(userName);
		driver.findElement(By.id("Pass")).click();
		driver.findElement(By.id("Pass")).clear();
		driver.findElement(By.id("Pass")).sendKeys(userPass);
		driver.findElement(By.id("log")).click();
		driver.findElement(By.xpath("//button[@onclick=\"window.location.href='UserProfile'\"]")).click();

		String expected = "Username - " + userName;
		String path = "//*[text()='Username - " + userName + "']";
		String result = driver.findElement(By.xpath(path)).getText();

		Assert.assertEquals(expected, result);

	}

}
