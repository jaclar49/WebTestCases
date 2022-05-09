package com.example.MonkeyGameReviews.tests;

import org.junit.*;
import org.openqa.selenium.*;

public class LogIn extends SetUp {

	public LogIn() {
		super();
	}

	@Test
	public void testLogIn() throws Exception {
		super.initialLogin();

		String expected = "Monkey Game Reviews - Home";
		String result = driver.findElement(By.xpath("//*[text()='Monkey Game Reviews - Home']")).getText();

		Assert.assertEquals(expected, result);

	}

}
