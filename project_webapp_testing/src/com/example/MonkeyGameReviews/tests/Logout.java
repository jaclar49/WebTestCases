package com.example.MonkeyGameReviews.tests;

import org.junit.*;
import org.openqa.selenium.*;

public class Logout extends SetUp {

	public Logout() {
		super();
	}

	@Test
	public void testLogout() throws Exception {
		super.initialLogin();
		driver.findElement(By.xpath("//button[@onclick=\"window.location.href='UserProfile'\"]")).click();
		driver.get("http://nrenard.ddns.net:8080/MonkeyGameReviews/UserProfile");
		driver.findElement(By.xpath("//input[@value='logout']")).click();

		String expected = "Log in to Monkey Game Reviews";
		String result = driver.findElement(By.xpath("//*[text()='Log in to Monkey Game Reviews']")).getText();

		Assert.assertEquals(expected, result);

	}

}
